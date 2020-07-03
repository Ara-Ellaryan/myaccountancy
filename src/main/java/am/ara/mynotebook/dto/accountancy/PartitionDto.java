package am.ara.mynotebook.dto.accountancy;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class PartitionDto {

    private int partitionID;

    @NotNull
    @NotBlank
    private String partitionName;

    @NotNull
    @NotBlank
    private int purposeTypeID;
}
