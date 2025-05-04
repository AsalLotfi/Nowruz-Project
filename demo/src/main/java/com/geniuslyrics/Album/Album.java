package com.geniuslyrics.Album;

import com.geniuslyrics.Account.Artist;
import com.geniuslyrics.Song.Song;

import java.time.LocalDate;
import java.util.List;

public class Album {
    private String title;
    private Artist artist;
    private List<Song> songs;
    private LocalDate releaseDate;

    public Album(String title, Artist artist, List<Song> songs, LocalDate releaseDate) {
        this.title = title;
        this.artist = artist;
        this.songs = songs;
        this.releaseDate = releaseDate;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
}
