package com.github.pagram1975.autowiremagic.model.internal;

public class Article {
    private int articleId;
    private String title;
    private Category category;
    private Author author;
    public Article(int articleId, String title, Category category) {
        this.articleId = articleId;
        this.title = title;
        this.category = category;
    }
    public int getArticleId() {
        return articleId;
    }
    public String getTitle() {
        return title;
    }
    public Category getCategory() {
        return category;
    }
}
