package com.geniuslyrics.Service;

import com.geniuslyrics.Account.Account;
import com.geniuslyrics.Account.Admin;
import com.geniuslyrics.Account.Artist;
import com.geniuslyrics.Account.User;
import com.geniuslyrics.Comment.Comment;
import com.geniuslyrics.Song.Song;

import java.util.Comparator;
import java.util.List;

public class commentService {

    // Add a comment to a song
    public void addComment(Song song, Comment comment) {
        song.getComments().add(comment);
    }

    // Delete a comment from a song with access control
    public boolean deleteComment(Song song, Comment comment, Account requester) {
        // Check if the requester is the comment author
        if (requester instanceof User && comment.getUser().equals(requester)) {
            return song.getComments().remove(comment);
        }

        // Admin can delete anything
        if (requester instanceof Admin) {
            return song.getComments().remove(comment);
        }

        // Artist can delete comments on their songs
        if (requester instanceof Artist) {
            Artist artist = (Artist) requester;
            if (song.getArtists().contains(artist)) {
                return song.getComments().remove(comment);
            }
        }

        return false; // Not allowed
    }

    // Get comments sorted from newest to oldest
    public List<Comment> getCommentsSortedByDate(Song song) {
        return song.getComments().stream()
                .sorted(Comparator.comparing(Comment::getTimestamp).reversed())
                .toList();
    }
}
