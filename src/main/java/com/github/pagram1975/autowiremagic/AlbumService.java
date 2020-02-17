package com.github.pagram1975.autowiremagic;

import com.github.pagram1975.autowiremagic.model.web.Album;
import com.github.pagram1975.autowiremagic.model.web.Genre;
import org.springframework.core.convert.ConversionService;

import java.util.ArrayList;
import java.util.List;

public class AlbumService {

    ArtistService artistService;

    ConversionService conversionService;

    List<Album> list = new ArrayList<>();

    public AlbumService (ArtistService artistService, ConversionService conversionService) {
        this.artistService = artistService;
        this.conversionService = conversionService;
        list.add(new Album(1, "Worry", conversionService.convert(1, Genre.class), artistService.getAllArtists().get(0)));
        list.add(new Album(2, "Black Terry Cat", conversionService.convert(2, Genre.class), artistService.getAllArtists().get(1)));
        list.add(new Album(3, "Philharmonics", conversionService.convert(3, Genre.class), artistService.getAllArtists().get(2)));
    }

    public List<Album> getAllAlbums() {
        return list;
    }
}
