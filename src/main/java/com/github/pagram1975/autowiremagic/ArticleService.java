package com.github.pagram1975.autowiremagic;
import com.github.pagram1975.autowiremagic.model.web.Article;

import java.util.ArrayList;
import java.util.List;

public class ArticleService {

    List<Article> list = new ArrayList<>();

    public ArticleService () {
        list.add(new Article(1, "Technical agility vs. business agility", "Delivery"));
        list.add(new Article(2, "Continuous Testing – Creating a testable CI/CD pipeline.", "Testing"));
        list.add(new Article(3, "Embrace your Obsessions!", "Tech"));
    }

    public List<Article> getAllArticles() {
        return list;
    }
}