package com.github.pagram1975.autowiremagic;

import com.github.pagram1975.autowiremagic.model.web.Artist;

import java.util.ArrayList;
import java.util.List;

public class ArtistService {

    List<Artist> list = new ArrayList<>();

    public ArtistService () {
        list.add(new Artist("Jeff", "Rosenstock"));
        list.add(new Artist("Xenia", "Robinos"));
        list.add(new Artist("Agnes", "Obel"));
    }

    public List<Artist> getAllArtists() {
        return list;
    }
}
