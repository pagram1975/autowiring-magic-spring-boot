package com.github.pagram1975.autowiremagic;

public class Album {
    private int albumId;
    private String title;
    private String genre;
    private Artist artist;
    public Album(int articleId, String title, String genre, Artist artist) {
        this.albumId = articleId;
        this.title = title;
        this.genre = genre;
        this.artist = artist;
    }
    public int getAlbumId() {
        return albumId;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public Artist getArtist() {
        return artist;
    }
}
