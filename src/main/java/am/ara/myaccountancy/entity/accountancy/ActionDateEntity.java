package am.ara.myaccountancy.entity.accountancy;

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
@Entity(name = "action_date")
public class ActionDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dateID;

    private int actionNameID;

    private Timestamp actionDate;
}
