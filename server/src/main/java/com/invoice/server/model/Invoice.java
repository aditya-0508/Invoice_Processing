package com.invoice.server.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//this annotation will create a table on its own taking in consideration all the fields
@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//as this will be generated and wouldn't be coming from the frontend
    private long id;
    private String vendor;
    private int amount;
    private String date;
    private String action;

    public Invoice(){}

    public Invoice(String vendor, long id, int amount, String date, String action) {
        this.vendor = vendor;
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.action = action;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
