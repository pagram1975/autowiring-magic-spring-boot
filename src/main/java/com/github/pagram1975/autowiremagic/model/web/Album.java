package com.github.pagram1975.autowiremagic.model.web;

public class Album {
    private int albumId;
    private String title;
    private Genre genre;
    private Artist artist;
    public Album(int albumId, String title, Genre genre, Artist artist) {
        this.albumId = albumId;
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
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre.toExternalForm();
    }
    public Artist getArtist() {
        return artist;
    }
}
