package com.github.pagram1975.autowiremagic.autowired;
import java.util.ArrayList;
import java.util.List;

import com.github.pagram1975.autowiremagic.model.web.Article;
import com.github.pagram1975.autowiremagic.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private ConversionService conversionService;

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