package com.example.mvc;

/**
 *
 * @author Sunny Ntini
 */
public class University {
    private String name;
    private String country;
    private String domain;

    public University(String name, String country, String domain) {
        this.name = name;
        this.country = country;
        this.domain = domain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    
}
