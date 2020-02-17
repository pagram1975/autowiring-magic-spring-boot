package com.github.pagram1975.autowiremagic.converter;

import com.github.pagram1975.autowiremagic.AuthorService;
import com.github.pagram1975.autowiremagic.model.internal.Article;
import org.springframework.core.convert.converter.Converter;

public class InternalArticleToWebArticleConverter
        implements Converter<Article, com.github.pagram1975.autowiremagic.model.web.Article> {

    /* Note - This could be autowired by annotation if preferred. */
    private AuthorService authorService;

    /* This is the only constructor available to Spring Boot, so this is the one Spring Boot will use. */
    public InternalArticleToWebArticleConverter(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Override
    public com.github.pagram1975.autowiremagic.model.web.Article convert(Article source) {
        return new com.github.pagram1975.autowiremagic.model.web.Article(source.getArticleId(),
                source.getTitle(),
                source.getCategory().toExternalForm(),
                authorService.getAuthorForAuthorId(source.getAuthorId()).toString());
    }
}
