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
public class Address {

    @Id
    @GeneratedValue
    private int id;
    private String street;
    private String city;
    private String country;
}
