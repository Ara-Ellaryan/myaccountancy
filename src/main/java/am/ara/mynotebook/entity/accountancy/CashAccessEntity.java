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
@Entity(name = "cash_access")
public class CashAccessEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accessID;

    private double amount;

    private int sourceID;

    private Timestamp accessDate;
}
