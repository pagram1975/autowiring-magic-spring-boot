package com.github.pagram1975.autowiremagic.model.web;

public class Article {
    private int articleId;
    private String title;
    private String category;
    private String authorName;
    public Article(int articleId, String title, String category, String authorName) {
        this.articleId = articleId;
        this.title = title;
        this.category = category;
        this.authorName = authorName;
    }
    public int getArticleId() {
        return articleId;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getAuthorName() {
        return authorName;
    }
}