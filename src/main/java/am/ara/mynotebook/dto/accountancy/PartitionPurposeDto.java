package am.ara.mynotebook.dto.accountancy;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class PartitionPurposeDto {

    private int purposeTypeID;

    @NotNull
    @NotBlank
    private String purposeType;
}
