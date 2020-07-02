package am.ara.myaccountancy.dto.accountancy;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class CashAccessDto {

    private int accessID;

    @NotNull
    @Digits(integer = 7,fraction = 2, message = "Amount must have money format.")
    private double amount;

    @NotNull
    @NotBlank
    private int sourceID;

    @Null
    private Timestamp accessDate;
}
