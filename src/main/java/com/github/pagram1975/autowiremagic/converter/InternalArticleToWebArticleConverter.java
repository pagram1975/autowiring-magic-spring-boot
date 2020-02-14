package com.github.pagram1975.autowiremagic.converter;

import com.github.pagram1975.autowiremagic.model.internal.Article;
import org.springframework.core.convert.converter.Converter;

public class InternalArticleToWebArticleConverter
        implements Converter<Article, com.github.pagram1975.autowiremagic.model.web.Article> {

    @Override
    public com.github.pagram1975.autowiremagic.model.web.Article convert(Article source) {
        return new com.github.pagram1975.autowiremagic.model.web.Article(source.getArticleId(),
                source.getTitle(),
                source.getCategory().toExternalForm());
    }
}
