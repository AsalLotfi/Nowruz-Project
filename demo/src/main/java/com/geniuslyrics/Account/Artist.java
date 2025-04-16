package com.geniuslyrics.Account;

import com.geniuslyrics.Album.Album;
import com.geniuslyrics.Genre;
import com.geniuslyrics.Song.Song;

import java.util.List;

public class Artist extends Account {
    private List<Song> songs;
    private List<Album> albums;
    private Genre genre;

    public Artist(String username, int password, String name, int age, String email) {
        super(username, password, name, age, email);
    }
}
