package com.github.pagram1975.autowiremagic.model.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.pagram1975.autowiremagic.model.Person;

public class Artist extends Person {
    public Artist(int artistId, String firstname, String lastname) {
        super(artistId, firstname, lastname);
    }
    @JsonIgnore
    public int getArtistId() {
        return super.getPersonId();
    }
}
