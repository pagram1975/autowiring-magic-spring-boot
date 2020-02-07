package com.github.pagram1975.autowiremagic.autoconstructor;

import com.github.pagram1975.autowiremagic.Album;
import com.github.pagram1975.autowiremagic.AlbumService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("albumswithconstructor")
public class AlbumControllerWithConstructor {

    /* Note - No autowired annotation needed. */
    private AlbumService articleService;

    public AlbumControllerWithConstructor (AlbumService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/")
    public List<Album> getAllAlbums() {
        List<Album> list = articleService.getAllAlbums();
        return list;
    }
}
