package am.ara.myaccountancy.entity.accountancy;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "partition_purpose")
public class PartitionPurposeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int purposeTypeID;

    private String purposeType;
}
