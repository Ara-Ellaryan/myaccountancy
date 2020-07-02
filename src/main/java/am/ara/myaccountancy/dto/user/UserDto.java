package am.ara.myaccountancy.dto.user;

import am.ara.myaccountancy.validator.annotation.PasswordValid;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class UserDto {

    private int id;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    private String surname;

    @NotNull
    @Email
    private String mainMail;

    @Null
    @Email
    private String additionalMail;

    @NotNull
    @Pattern(regexp = "")
    private String mainPhone;

    @Null
    @Pattern(regexp = "")
    private String additionalPhone;

    @PasswordValid
    private String password;

    @Null
    private String imageUrl;
}