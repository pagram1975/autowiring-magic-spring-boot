package com.github.pagram1975.autowiremagic.converter;

import com.github.pagram1975.autowiremagic.model.web.Album;
import com.github.pagram1975.autowiremagic.model.web.Genre;
import org.springframework.core.convert.converter.Converter;

public class AlbumToGenreConverter implements Converter<Album, Genre> {

    @Override
    public Genre convert(Album album) {
        if (album.getTitle().equals("Worry")) {
            return Genre.PUNK_POP;
        } else if (album.getTitle().equals("Black Terry Cat")) {
            return Genre.RNB;
        } else if (album.getTitle().equals("Philharmonics")) {
            return Genre.FOLK;
        } else {
            return Genre.POP;
        }
    }
}
