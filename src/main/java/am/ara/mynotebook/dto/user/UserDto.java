package am.ara.mynotebook.dto.user;

import am.ara.mynotebook.validator.annotation.PasswordValid;
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
    @Pattern(regexp = "^[+]?[(]?[0-9]{1,4}[)]?[- 0-9]*$")
    private String mainPhone;

    @Null
    @Pattern(regexp = "^[+]?[(]?[0-9]{1,4}[)]?[- 0-9]*$")
    private String additionalPhone;

    @PasswordValid
    private String password;

    @Null
    private String imageUrl;
}
