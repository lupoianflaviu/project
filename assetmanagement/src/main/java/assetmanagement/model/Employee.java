package assetmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private int firstName;
    private int lastName;
    private String cnp;
    @OneToOne
    private Address address;
    private String phoneNumber;
}
