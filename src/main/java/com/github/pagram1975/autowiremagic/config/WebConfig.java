package com.github.pagram1975.autowiremagic.config;

import com.github.pagram1975.autowiremagic.converter.AlbumToGenreConverter;
import com.github.pagram1975.autowiremagic.converter.InternalArticleToWebArticleConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    InternalArticleToWebArticleConverter internalArticleToWebArticleConverter;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new AlbumToGenreConverter());
        registry.addConverter(internalArticleToWebArticleConverter);
    }
}
