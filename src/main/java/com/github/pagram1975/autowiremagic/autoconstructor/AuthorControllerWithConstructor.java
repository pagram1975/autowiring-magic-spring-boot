package com.github.pagram1975.autowiremagic.autoconstructor;

import com.github.pagram1975.autowiremagic.AuthorService;
import com.github.pagram1975.autowiremagic.model.web.Author;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("authorswithconstructor")
public class AuthorControllerWithConstructor {

    /* Note - No autowired annotation needed. */
    private AuthorService authorService;

    /* This is the only constructor available to Spring Boot, so this is the one Spring Boot will use. */
    public AuthorControllerWithConstructor(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/")
    public List<Author> getAllAuthors() {
        List<Author> list = new ArrayList<>(authorService.getAllAuthors());
        return list;
    }
}
