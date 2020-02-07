package com.github.pagram1975.autowiremagic.autowired;

import com.github.pagram1975.autowiremagic.AlbumService;
import com.github.pagram1975.autowiremagic.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("albums")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @GetMapping("/")
    public List<Album> getAllAlbums() {
        List<Album> list = albumService.getAllAlbums();
        return list;
    }
}