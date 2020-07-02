package am.ara.myaccountancy.dto.accountancy;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class ActionDto {

    private int actionID;

    @NotNull
    @NotBlank
    private String actionName;
}
