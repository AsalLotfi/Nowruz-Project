package com.geniuslyrics.Service;

import com.geniuslyrics.Account.Artist;
import com.geniuslyrics.Account.User;

public class UserService {

    public void followArtist(User user, Artist artist) {
        if (!user.getFollowedArtists().contains(artist)) {
            user.getFollowedArtists().add(artist);
            artist.getFollowers().add(user);
            System.out.println("You are now following " + artist.getUsername());
        } else {
            System.out.println("You already follow this artist.");
        }
    }

    public void unfollowArtist(User user, Artist artist) {
        if (user.getFollowedArtists().contains(artist)) {
            user.getFollowedArtists().remove(artist);
            artist.getFollowers().remove(user);
            System.out.println("You have unfollowed " + artist.getUsername());
        } else {
            System.out.println("You are not following this artist.");
        }
    }
}
