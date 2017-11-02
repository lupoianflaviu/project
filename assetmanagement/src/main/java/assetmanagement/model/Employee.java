package assetmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private int firstName;
    private int lastName;
    private String cnp;
    private Address address;
    private String phoneNumber;
}
