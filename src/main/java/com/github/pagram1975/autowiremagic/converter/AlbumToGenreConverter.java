package com.github.pagram1975.autowiremagic.converter;

import com.github.pagram1975.autowiremagic.model.web.Album;
import com.github.pagram1975.autowiremagic.model.web.Genre;
import org.springframework.core.convert.converter.Converter;

public class AlbumToGenreConverter implements Converter<Album, Genre> {

    @Override
    public Genre convert(Album album) {
        switch (album.getTitle()) {
            case "Worry":
                return Genre.PUNK_POP;
            case "Black Terry Cat":
                return Genre.RNB;
            case "Philharmonics":
                return Genre.FOLK;
            default:
                return Genre.POP;
        }
    }
}
