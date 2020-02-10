package com.github.pagram1975.autowiremagic.autoconstructor;

import com.github.pagram1975.autowiremagic.model.web.Article;
import com.github.pagram1975.autowiremagic.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("articleswithconstructor")
public class ArticleControllerWithConstructor {

    /* Note - No autowired annotation needed. */
    private ArticleService articleService;

    /* This is the only constructor available to Spring Boot, so this is the one Spring Boot will use. */
    public ArticleControllerWithConstructor (ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/")
    public List<Article> getAllArticles() {
        List<Article> list = articleService.getAllArticles();
        return list;
    }
}