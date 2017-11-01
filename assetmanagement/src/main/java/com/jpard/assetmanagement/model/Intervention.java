package com.jpard.assetmanagement.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author flaviu.lupoian@jpard.com
 *
 * date 2017.11.01
 */
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
