package com.github.pagram1975.autowiremagic;

import com.github.pagram1975.autowiremagic.model.web.Author;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AuthorService {

    private Map<Integer, Author> map = new HashMap<> ();

    public AuthorService () {
        Author zinat = new Author(1, "Zinat", "Wali");
        Author jeanSacha = new Author(2, "Jean-Sacha", "Melon");
        Author steven = new Author(3, "Steven", "Waterman") ;
        Author sam = new Author(4, "Sam", "Hogarth");
        Author callum = new Author(5, "Callum", "Akehurst-Ryan");
        Author james = new Author(6, "James", "Grant");

        map.put(zinat.getAuthorId(), zinat);
        map.put(jeanSacha.getAuthorId(), jeanSacha);
        map.put(steven.getAuthorId(), steven);
        map.put(sam.getAuthorId(), sam);
        map.put(callum.getAuthorId(), callum);
        map.put(james.getAuthorId(), james);
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
