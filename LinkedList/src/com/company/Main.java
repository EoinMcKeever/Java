package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Song> playlist = new LinkedList<Song>();

        Album first = new Album("first");
        first.addSong("Wonderwall", "3.44");
        first.addSong("Slide away","3.14");

        Album second = new Album("seconds");
        second.addSong("Rap God","3.54");
        second.addSong("Mockingbird", "3.22");

        ArrayList<Album> albumList = new ArrayList<Album>();
        albumList.add(first);
        albumList.add(second);


        for(Album album : albumList){
            for(Song song : album.getSongs()) {
                playlist.addLast(song);
            }
        }

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int currentIndex = 0;
        ListIterator<Song> listIterator = playlist.listIterator();
        boolean forward = true;
        System.out.println("Playing: " + playlist.get(currentIndex).getTitle());
        while(!quit) {
            menu();
            int choice = scanner.nextInt();
            switch(choice) {

                case 1:
                    quit = true;
                    break;

                case 2:
                    nextSong(listIterator,forward);
                    currentIndex = listIterator.nextIndex()-1;
                    System.out.println("Playing: " + playlist.get(currentIndex).getTitle());
                    break;

                case 3:
                    if (currentIndex <= 0) {
                        System.out.println("Playing: " + playlist.get(0).getTitle());
                    } else {
                        previousSong(listIterator,forward);
                        currentIndex = listIterator.nextIndex()-1;
                        System.out.println("Playing: " + playlist.get(currentIndex).getTitle());
                    }
                    break;

                case 4:
                    if (currentIndex == -1) {
                        System.out.println("No song playing. Press next song to start");
                    } else {
                        System.out.println("Replaying: " + playlist.get(currentIndex).getTitle());
                    }
                    break;

                case 5:
                    displayPlaylist(playlist);
                    break;
            }

        }

    }



    private static void menu() {
        System.out.println("1: Quit");
        System.out.println("2: Next song");
        System.out.println("3: Previous song");
        System.out.println("4: Replay current song");
        System.out.println("5: List songs");
        System.out.println("PLease enter one of the above options");
    }

    private static void displayPlaylist(LinkedList playList) {
        Iterator song = playList.iterator();
        while(song.hasNext()) {
            Song x = (Song) song.next();
            System.out.println(x.getTitle());
            System.out.println("");
        }
    }

    private static void nextSong(ListIterator<Song> iterator, boolean forward) {
        if (!forward && iterator.hasNext()) {
            iterator.next();
            forward = true;
        }
        if (iterator.hasNext()) {
            iterator.next();
        }
    }

    private static void previousSong(ListIterator<Song> iterator, boolean forward) {
        if(forward && iterator.hasPrevious()) {
            iterator.previous();
            forward = false;
        }
        if (iterator.hasPrevious()) {
            iterator.previous();
        }
    }
}
