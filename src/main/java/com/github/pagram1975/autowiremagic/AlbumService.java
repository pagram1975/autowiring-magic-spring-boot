package com.github.pagram1975.autowiremagic;

import com.github.pagram1975.autowiremagic.model.web.Album;
import com.github.pagram1975.autowiremagic.model.web.Artist;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class AlbumService {

    ArtistService artistService;

    List<Album> list = new ArrayList<>();

    public AlbumService (ArtistService artistService) {
        this.artistService = artistService;
        list.add(new Album(1, "Worry", "Punk Pop", artistService.getAllArtists().get(0)));
        list.add(new Album(2, "Black Terry Cat", "R&B", artistService.getAllArtists().get(1)));
        list.add(new Album(3, "Philharmonics", "Folk", artistService.getAllArtists().get(2)));
    }

    public List<Album> getAllAlbums() {
        return list;
    }
}
