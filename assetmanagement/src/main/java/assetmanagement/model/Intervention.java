package assetmanagement.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Intervention {

    @Id
    @GeneratedValue
    private int id;
    private Date date;
    private boolean isRepaired;
    private boolean isReplaced;
    private String details;
}
