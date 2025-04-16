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
}
