package assetmanagement.model;

import org.hibernate.annotations.Type;

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
    @Type(type = "yes_no")
    private Boolean isRepaired;
    @Type(type = "yes_no")
    private Boolean isReplaced;
    private String details;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean isRepaired() {
        return isRepaired;
    }

    public void setRepaired(Boolean repaired) {
        isRepaired = repaired;
    }

    public Boolean isReplaced() {
        return isReplaced;
    }

    public void setReplaced(Boolean replaced) {
        isReplaced = replaced;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "date=" + date + ", isRepaired=" + isRepaired + ", isReplaced=" + isReplaced + ", details='" + details + '\'';
    }
}
