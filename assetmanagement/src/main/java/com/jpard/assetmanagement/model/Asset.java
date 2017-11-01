package com.jpard.assetmanagement.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author flaviu.lupoian@jpard.com
 *
 * date 2017.11.01
 */
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
