package com.geniuslyrics.Comment;

import com.geniuslyrics.Account.User;
import com.geniuslyrics.Song.Song;

import java.time.LocalDateTime;

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

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getText() {
        return text;
    }

    public String display() {
        return user.getUsername() + " (" + timestamp + "): " + text;
    }
}
