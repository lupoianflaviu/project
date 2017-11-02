package assetmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Specification {

    @Id
    @GeneratedValue
    private int id;
    private String proccessor;
    private String memory;
    private String software;
    private String generalInfo;
}
