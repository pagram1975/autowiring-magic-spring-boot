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
        /* Create some albums, we don't know the genre at this point. */
        Album worry = new Album(1, "Worry", Genre.UNKNOWN, artistService.getAllArtists().get(0));
        Album blackTerryCat = new Album(2, "Black Terry Cat", Genre.UNKNOWN, artistService.getAllArtists().get(1));
        Album philharmonics = new Album(3, "Philharmonics", Genre.UNKNOWN, artistService.getAllArtists().get(2));
        /* Use another service to determine the album genre. */
        worry.setGenre(conversionService.convert(worry, Genre.class));
        blackTerryCat.setGenre(conversionService.convert(blackTerryCat, Genre.class));
        philharmonics.setGenre(conversionService.convert(philharmonics, Genre.class));
        /* Compile the list of albums to give to our controllers. */
        list.add(worry);
        list.add(blackTerryCat);
        list.add(philharmonics);
    }

    public List<Album> getAllAlbums() {
        return list;
    }
}
