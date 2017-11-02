package assetmanagement.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Asset {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String model;
    private Category category;
    @OneToOne
    private Specification specification;
    private Date purchaseDate;
    @OneToOne
    private Employee employee;
    private String location;
    private Date disposalDate;
}
