package com.geniuslyrics.Song;

import com.geniuslyrics.Account.Account;
import com.geniuslyrics.Account.Admin;
import com.geniuslyrics.Account.Artist;
import com.geniuslyrics.Account.User;
import com.geniuslyrics.Album.Album;
import com.geniuslyrics.Comment.Comment;
import com.geniuslyrics.Genre;
import com.geniuslyrics.Tag;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Song {
    private String title;
    private int viewCount;
    private String lyrics;
    private List<Artist> artists; // One or multiple artists
    private Album album; // can be null if song isn't part of an album
    private List<Tag> tags;
    private Genre genre;
    private LocalDate releaseDate;
    private List<Comment> comments;

    public Song(String title, List<Artist> artists, Album album, Genre genre, LocalDate releaseDate, List<Tag> tags) {
        this.title = title;
        this.artists = artists;
        this.album = album;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.tags = tags;
        this.viewCount = 0;
    }

    public void incrementViewCount() {
        this.viewCount++;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    // Getters
    public int getViewCount() {
        return viewCount;
    }

    public String getTitle () {
        return title;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Artist> getArtists() {
        return this.artists;
    }
}