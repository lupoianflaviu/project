package com.jpard.assetmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author flaviu.lupoian@jpard.com
 *
 * date 2017.11.01
 */
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
