package com.github.pagram1975.autowiremagic.model.web;

import com.github.pagram1975.autowiremagic.model.Person;

public class Author extends Person {
    public static Author UNKNOWN_AUTHOR = new Author(0, "Unknown", "Author");
    public Author(int authorId, String firstname, String lastname) {
        super(authorId, firstname, lastname);
    }
    @Override
    public String toString() {
        return getFirstname() + " " + getLastname();
    }
}
