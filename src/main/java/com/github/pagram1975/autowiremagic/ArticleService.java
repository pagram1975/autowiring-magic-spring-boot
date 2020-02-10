package com.github.pagram1975.autowiremagic;
import com.github.pagram1975.autowiremagic.model.web.Album;
import com.github.pagram1975.autowiremagic.model.web.Article;

import java.util.ArrayList;
import java.util.List;

public class ArticleService {

    List<Article> list = new ArrayList<>();

    public ArticleService () {
        list.add(new Article(1, "Java Concurrency", "Java"));
        list.add(new Article(2, "Hibernate HQL", "Hibernate"));
        list.add(new Article(3, "Spring MVC with Hibernate", "Spring"));
    }

    public List<Article> getAllArticles() {
        return list;
    }
}