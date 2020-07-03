package am.ara.mynotebook.dto.accountancy;

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
public class TradeDto {

    private int tradeID;

    @NotNull
    @NotBlank
    private int productCategoryID;

    @NotNull
    @NotBlank
    private String productName;

    @NotNull
    @Digits(integer = 7, fraction = 2, message = "Amount must have money format.")
    private double amount;

    @NotBlank
    @NotNull
    private int partitionID;

    @Null
    private Timestamp tradeDate;
}
