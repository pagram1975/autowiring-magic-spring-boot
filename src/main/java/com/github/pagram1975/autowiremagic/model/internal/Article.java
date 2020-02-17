package com.github.pagram1975.autowiremagic.model.internal;

public class Article {
    private int articleId;
    private String title;
    private Category category;
    private int authorId;
    public Article(int articleId, String title, Category category, int authorId) {
        this.articleId = articleId;
        this.title = title;
        this.category = category;
        this.authorId = authorId;
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
    public int getAuthorId() {
        return authorId;
    }
}
