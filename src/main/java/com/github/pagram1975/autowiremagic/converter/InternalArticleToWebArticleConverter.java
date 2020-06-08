package com.github.pagram1975.autowiremagic.converter;

import com.github.pagram1975.autowiremagic.AuthorService;
import com.github.pagram1975.autowiremagic.model.internal.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

// Component annotation is required so that Spring Boot constructs this object
// and satisfies the dependency on the AuthorService.
@Component
public class InternalArticleToWebArticleConverter
        implements Converter<Article, com.github.pagram1975.autowiremagic.model.web.Article> {

    @Autowired
    private AuthorService authorService;

    @Override
    public com.github.pagram1975.autowiremagic.model.web.Article convert(Article source) {
        return new com.github.pagram1975.autowiremagic.model.web.Article(source.getArticleId(),
                source.getTitle(),
                source.getCategory().toExternalForm(),
                authorService.getAuthorForAuthorId(source.getAuthorId()).toString());
    }
}
