package am.ara.mynotebook.validator.annotation;

import am.ara.mynotebook.validator.constraint.MyPasswordValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = MyPasswordValidator.class)
public @interface PasswordValid {
    String  message() default "Password must be greater than 10 character and less 16, must contains minimum 1 uppercase, 1 digit and 1 spacial character.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
