package com.github.pagram1975.autowiremagic;

import com.github.pagram1975.autowiremagic.model.web.Artist;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistService {

    List<Artist> list = new ArrayList<>();

    public ArtistService () {
        list.add(new Artist(1, "Jeff", "Rosenstock"));
        list.add(new Artist(2, "Xenia", "Robinos"));
        list.add(new Artist(3, "Agnes", "Obel"));
    }

    public List<Artist> getAllArtists() {
        return list;
    }
}
