package org.superbiz.moviefun.albums;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumsRestController {

    private final AlbumsRepository albumsRepository;

    public AlbumsRestController(AlbumsRepository albumsRepository) {
        this.albumsRepository = albumsRepository;
    }

    @GetMapping("/{id}")
    public Album find(@PathVariable Long id) {
        return albumsRepository.find(id);
    }

    @GetMapping
    public List<Album> getAlbums() {
        return albumsRepository.getAlbums();
    }

    @PostMapping
    public void addAlbum(@RequestBody Album album) {
        albumsRepository.addAlbum(album);
    }

}
