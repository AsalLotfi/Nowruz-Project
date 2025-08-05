package com.geniuslyrics.Service;

import com.geniuslyrics.Account.Artist;
import com.geniuslyrics.Album.Album;
import com.geniuslyrics.Song.Song;

import java.util.List;
import java.util.Scanner;

public class ArtistService {
    // Create a new song and add it to the artist's song list
    public void createSong(Artist artist, Song song) {
        artist.getSongs().add(song);
        System.out.println("Song \"" + song.getTitle() + "\" created successfully.");
    }

    // Create a new album and add it to the artist's album list
    public void createAlbum(Artist artist, Album album) {
        artist.getAlbums().add(album);
        System.out.println("Album \"" + album.getTitle() + "\" created successfully.");
    }

    // Edit the lyrics of a song (only if the artist owns it)
    public void editLyrics(Artist artist, Song song, String newLyrics) {
        if (artist.getSongs().contains(song)) {
            song.setLyrics(newLyrics);
            System.out.println("Lyrics updated for song: " + song.getTitle());
        } else {
            System.out.println("You can only edit your own songs.");
        }
    }

    // Display profile info of the artist
    public void displayProfile(Artist artist, Scanner scanner) {
        System.out.println("=== Artist Profile ===");
        System.out.println("Name: " + artist.getName());
        System.out.println("Bio: " + artist.getBio());
        System.out.println("Followers: " + artist.getFollowers().size());

        while (true) {
            System.out.println("\nWhat would you like to see?");
            System.out.println("1. Most popular songs");
            System.out.println("2. All songs");
            System.out.println("3. Albums");
            System.out.println("4. Exit");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    List<Song> popularSongs = artist.getMostPopularSongs();
                    if (popularSongs.isEmpty()) {
                        System.out.println("No popular songs found.");
                    } else {
                        System.out.println("--- Most Popular Songs ---");
                        for (Song song : popularSongs) {
                            System.out.println("- " + song.getTitle() + " (" + song.getViewCount() + " views)");
                        }
                    }
                    break;

                case "2":
                    List<Song> allSongs = artist.getSongs();
                    if (allSongs.isEmpty()) {
                        System.out.println("This artist has no songs yet.");
                    } else {
                        System.out.println("--- All Songs ---");
                        for (Song song : allSongs) {
                            System.out.println("- " + song.getTitle());
                        }
                    }
                    break;

                case "3":
                    List<Album> albums = artist.getAlbums();
                    if (albums.isEmpty()) {
                        System.out.println("This artist has no albums yet.");
                    } else {
                        System.out.println("--- Albums ---");
                        for (Album album : albums) {
                            System.out.println("- " + album.getTitle());
                        }
                    }
                    break;

                case "4":
                    System.out.println("Exiting artist profile.");
                    return;

                default:
                    System.out.println("Invalid input. Please enter a number between 1 and 4.");
            }
        }
    }
}
