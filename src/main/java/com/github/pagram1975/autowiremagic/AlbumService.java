package com.github.pagram1975.autowiremagic;

import com.github.pagram1975.autowiremagic.model.web.Album;
import com.github.pagram1975.autowiremagic.model.web.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class AlbumService {

    @Autowired
    ArtistService artistService;

    @Autowired
    ConversionService conversionService;

    List<Album> list = new ArrayList<>();

    /**
     * The @PostConstruct annotation
     */
    @PostConstruct
    public void initialiseService () {
        /* Create some albums, use the artistService to look up the
         * artist. We don't know the genre at this point. */
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
