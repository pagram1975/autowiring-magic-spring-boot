package com.github.pagram1975.autowiremagic.model.web;

public class Artist {
    private String firstname;
    private String lastname;
    public Artist(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
}
