package com.github.pagram1975.autowiremagic;

import com.github.pagram1975.autowiremagic.model.web.Author;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class AuthorService {

    HashMap<Integer, Author> map = new HashMap<> ();

    public AuthorService () {
        List<Author> list = new ArrayList<>();
        list.add(new Author(1, "Zinat", "Wali"));
        list.add(new Author(2, "Jean-Sacha", "Melon"));
        list.add(new Author(3, "Steven", "Waterman"));
        list.add(new Author(4, "Sam", "Hogarth"));
        list.add(new Author(5, "Callum", "Akehurst-Ryan"));
        list.add(new Author(6, "James", "Grant"));

        for(Author author : list) {
            map.put(author.getAuthorId(), author);
        }
    }

    public Collection<Author> getAllAuthors() {
        return map.values();
    }

    public Author getAuthorForAuthorId(int authorId) {
        Author result = map.get(authorId);
        if (result == null) {
            return Author.UNKNOWN_AUTHOR;
        }
        return result;
    }
}
