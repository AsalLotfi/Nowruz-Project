package com.geniuslyrics.Account;

import com.geniuslyrics.Comment.Comment;
import com.geniuslyrics.Song.Song;

import java.util.List;
import java.util.Objects;

public class User extends Account {
    private List<Comment> comments;
    private List<Song> favoriteSongs;
    private List<Artist> followedArtists;

    public User(String username, String password, String name, int age, String email) {
        super(username, password, name, age, email);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        User other = (User) obj;
        return Objects.equals(getUsername(), other.getUsername()) &&
                Objects.equals(getEmail(), other.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getEmail());
    }
}
