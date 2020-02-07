package com.github.pagram1975.autowiremagic;

import java.util.ArrayList;
import java.util.List;

public class AlbumService {
    public List<Album> getAllAlbums(){
        List<Album> list = new ArrayList<>();
        list.add(new Album(1, "Worry", "Punk Pop", new Artist ("Jeff", "Rosenstock")));
        list.add(new Album(2, "Black Terry Cat", "R&B", new Artist ("Xenia", "Robinos")));
        list.add(new Album(3, "Philharmonics", "Folk", new Artist ("Agnes", "Obel")));
        return list;
    }
}
