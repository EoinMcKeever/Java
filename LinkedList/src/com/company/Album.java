package com.company;

import java.util.ArrayList;

public class Album {

    private String albumName;
    private ArrayList<Song> songs;

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new ArrayList<Song>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public Song findSongs(String name) {
        for (Song song : songs) {
            if (song.getTitle().equals(name)) {
                return song;
            }
        }
        return null;
    }

    public void addSong(String name, String duration) {
        this.songs.add(new Song(name,duration));
    }


}
