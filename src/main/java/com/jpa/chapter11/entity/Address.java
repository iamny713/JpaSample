package com.jpa.chapter11.entity;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Address {
    private String city;
    private String street;
    private String zipzode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipzode() {
        return zipzode;
    }

    public void setZipzode(String zipzode) {
        this.zipzode = zipzode;
    }
}
