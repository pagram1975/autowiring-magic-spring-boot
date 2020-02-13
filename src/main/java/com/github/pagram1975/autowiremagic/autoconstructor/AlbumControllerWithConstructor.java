package com.github.pagram1975.autowiremagic.autoconstructor;

import com.github.pagram1975.autowiremagic.model.web.Album;
import com.github.pagram1975.autowiremagic.AlbumService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("albumswithconstructor")
public class AlbumControllerWithConstructor {

    /* Note - No autowired annotation needed. */
    private AlbumService albumService;

    /* This is the only constructor available to Spring Boot, so this is the one Spring Boot will use. */
    public AlbumControllerWithConstructor (AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/")
    public List<Album> getAllAlbums() {
        List<Album> list = albumService.getAllAlbums();
        return list;
    }
}
