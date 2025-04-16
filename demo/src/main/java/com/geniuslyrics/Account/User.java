package com.geniuslyrics.Account;

import com.geniuslyrics.Comment.Comment;
import com.geniuslyrics.Song.Song;

import java.util.List;

public class User extends Account {
    private List<Comment> comments;
    private List<Song> favoriteSongs;
    private List<Artist> followedArtists;

    public User(String username, int password, String name, int age, String email) {
        super(username, password, name, age, email);
    }
}
