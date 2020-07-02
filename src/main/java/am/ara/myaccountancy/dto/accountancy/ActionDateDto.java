package am.ara.myaccountancy.dto.accountancy;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class ActionDateDto {

    private int dateID;

    @NotNull
    @NotBlank
    private int actionNameID;

    @Null
    private Timestamp actionDate;
}
