package am.ara.mynotebook.dto.accountancy;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class ProductCategoryDto {

    private int categoryID;

    @NotNull
    @NotBlank
    private String categoryName;
}
