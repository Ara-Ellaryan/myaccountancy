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
public class MoneyDistributionDto {

    private int distributionID;

    @NotNull
    @NotBlank
    private int partitionID;

    @NotNull
    @Digits(integer = 7, fraction = 2, message = "Amount must have money format.")
    private double amount;

    @Null
    private Timestamp distributionDate;
}
