package am.ara.mynotebook.validator.constraint;

import am.ara.mynotebook.validator.annotation.PasswordValid;
import com.google.common.base.Joiner;
import org.passay.*;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class MyPasswordValidator implements ConstraintValidator<PasswordValid, String> {

    @Override
    public boolean isValid(String password, ConstraintValidatorContext constraintValidatorContext) {
        PasswordValidator passwordValidator = new PasswordValidator(Arrays.asList(
           new LengthRule(10, 16),
           new CharacterRule(EnglishCharacterData.Digit),
           new CharacterRule(EnglishCharacterData.UpperCase),
           new CharacterRule(EnglishCharacterData.Special)
        ));

        RuleResult result = passwordValidator.validate(new PasswordData(password));

        if(result.isValid()){
            return true;
        }

        constraintValidatorContext.disableDefaultConstraintViolation();
        constraintValidatorContext.buildConstraintViolationWithTemplate(
                Joiner.on(",").join(passwordValidator.getMessages(result)))
        .addConstraintViolation();
        return false;
    }
}
