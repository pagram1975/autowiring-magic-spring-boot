package com.github.pagram1975.autowiremagic;
import com.github.pagram1975.autowiremagic.model.internal.Article;
import com.github.pagram1975.autowiremagic.model.internal.Category;

import java.util.ArrayList;
import java.util.List;

public class ArticleService {

    List<Article> list = new ArrayList<>();

    public ArticleService () {
        list.add(new Article(1, "Technical agility vs. business agility", Category.DELIVERY, 2));
        list.add(new Article(2, "Continuous Testing – Creating a testable CI/CD pipeline.", Category.TESTING, 5));
        list.add(new Article(3, "Embrace your Obsessions!", Category.TECH, 3));
        list.add(new Article(4, "Sprint Goals!", Category.DELIVERY, 4));
        list.add(new Article(5, "OK Google, what do you see? - Labelling images in Google Cloud", Category.TECH, 6));
        list.add(new Article(6, "Elasticsearch - clustering on AWS with optional auto-scaling", Category.DATA_ENGINEERING, 1));
    }

    public List<Article> getAllArticles() {
        return list;
    }
}