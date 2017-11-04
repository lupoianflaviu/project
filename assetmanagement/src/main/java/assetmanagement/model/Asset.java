package assetmanagement.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
    @Enumerated(EnumType.STRING)
    private Category category;
    @OneToOne
    private Specification specification;
    private Date purchaseDate;
    @OneToOne
    private Employee employee;
    private String location;
    private Date disposalDate;
    @OneToOne
    private Intervention intervention;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDisposalDate() {
        return disposalDate;
    }

    public void setDisposalDate(Date disposalDate) {
        this.disposalDate = disposalDate;
    }

    public Intervention getIntervention() {
        return intervention;
    }

    public void setIntervention(Intervention intervention) {
        this.intervention = intervention;
    }

    @Override
    public String toString() {
        return "Asset{" + "id=" + id + ", name='" + name + '\'' + ", model='" + model + '\'' + ", category=" + category + ", specification=" + specification
                + ", purchaseDate=" + purchaseDate + ", employee=" + employee + ", location='" + location + '\'' + ", disposalDate=" + disposalDate
                + ", intervention=" + intervention + '}';
    }
}
