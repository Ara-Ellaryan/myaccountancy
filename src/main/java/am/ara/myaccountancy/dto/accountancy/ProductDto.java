package am.ara.myaccountancy.dto.accountancy;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class ProductDto {

    private int productID;

    @NotNull
    @NotBlank
    private String productName;

    @NotNull
    @NotBlank
    private int productCategoryID;

    @Null
    private String definition;
}
