package com.github.pagram1975.autowiremagic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Person {
    private int personId;
    private String firstname;
    private String lastname;
    public Person (int personId, String firstname, String lastname) {
        this.personId = personId;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    @JsonIgnore
    public int getPersonId () {
        return personId;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
}
