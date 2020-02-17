package com.github.pagram1975.autowiremagic.converter;

import com.github.pagram1975.autowiremagic.model.web.Genre;
import org.springframework.core.convert.converter.Converter;

public class AlbumIdToGenreConverter implements Converter<Integer, Genre> {

    @Override
    public Genre convert(Integer albumId) {
        if (albumId == 1) {
            return Genre.PUNK_POP;
        } else if (albumId == 2) {
            return Genre.RNB;
        } else if (albumId == 3) {
            return Genre.FOLK;
        } else {
            return Genre.POP;
        }
    }
}
