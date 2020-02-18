package com.github.pagram1975.autowiremagic.autoconstructor;

import com.github.pagram1975.autowiremagic.model.web.Article;
import com.github.pagram1975.autowiremagic.ArticleService;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("articleswithconstructor")
public class ArticleControllerWithConstructor {

    /* Note - No autowired annotation needed. */
    private ArticleService articleService;

    /* Note - No autowired annotation needed. */
    private ConversionService conversionService;

    /* This is the only constructor available to Spring Boot, so this is the one Spring Boot will use. */
    public ArticleControllerWithConstructor (ArticleService articleService, ConversionService conversionService) {
        this.articleService = articleService;
        this.conversionService = conversionService;
    }

    @GetMapping("/")
    public List<Article> getAllArticles() {
        List<com.github.pagram1975.autowiremagic.model.internal.Article> list = articleService.getAllArticles();
        List<Article> response = new ArrayList<>();
        for(com.github.pagram1975.autowiremagic.model.internal.Article article : list) {
            response.add(conversionService.convert(article, Article.class));
        }
        return response;
    }
}