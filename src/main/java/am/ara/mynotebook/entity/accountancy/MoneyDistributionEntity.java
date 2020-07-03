package am.ara.mynotebook.entity.accountancy;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "money_distribution")
public class MoneyDistributionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int distributionID;

    private int partitionID;

    private double amount;

    private Timestamp distributionDate;
}
