package com.geniuslyrics.Account;

import com.geniuslyrics.Album.Album;
import com.geniuslyrics.Genre;
import com.geniuslyrics.Song.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Artist extends Account {
    private List<Song> songs;
    private List<Album> albums;
    private Genre genre;
    private String biography;
    private List<User> followers;

    public Artist(String username, String password, String name, int age, String email, Genre genre, String biography) {
        super(username, password, name, age, email);
        this.genre = genre;
        this.biography = biography;
        followers = new ArrayList<>();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public void addAlbum(Album album) {
        this.albums.add(album);
    }

    // Getters
    public List<Song> getSongs() {
        return songs;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getBio() {
        return biography;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public List<Song> getMostPopularSongs() {
        return songs.stream()
                .sorted(Comparator.comparingInt(Song::getViewCount).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}
