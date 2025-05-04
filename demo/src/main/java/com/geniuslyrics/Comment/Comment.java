package com.geniuslyrics.Comment;

import com.geniuslyrics.Account.User;
import com.geniuslyrics.Song.Song;

import java.time.LocalDateTime;
import java.util.Objects;

public class Comment {
    private String text;
    private User user;
    private Song song;
    private LocalDateTime timestamp;

    public Comment(String text, User user, Song song, LocalDateTime timestamp) {
        this.text = text;
        this.user = user;
        this.song = song;
        this.timestamp = timestamp;
    }

    public String display() {
        return user.getUsername() + " (" + timestamp + "): " + text;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Comment other = (Comment) obj;
        return Objects.equals(user, other.user) &&
                Objects.equals(text, other.text) &&
                Objects.equals(timestamp, other.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, text, timestamp);
    }

    // Getters+
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public User getUser() {
        return user;
    }

    public String getText() {
        return text;
    }
}
