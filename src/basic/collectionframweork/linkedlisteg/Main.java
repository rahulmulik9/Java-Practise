package basic.collectionframweork.linkedlisteg;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()


import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {


        Album album = new Album("Rahul", "favorite");
        album.addsongs("Song1", 4.5);
        album.addsongs("Song2", 5.5);
        album.addsongs("Song3", 6.5);
        album.addsongs("Song4", 3.5);
        album.addsongs("Song5", 5.2);
        album.addsongs("Song6", 4.7);
        album.addsongs("Song7", 8.5);
        albums.add(album);


        Album album1 = new Album("Rahul1", "GymSongs");
        album1.addsongs("Songs11", 3.5);
        album1.addsongs("Songs12", 5.5);
        album1.addsongs("Songs13", 2.5);
        album1.addsongs("Songs14", 3.5);
        album1.addsongs("Songs15", 6.5);
        album1.addsongs("Songs16", 5.5);
        album1.addsongs("Songs17", 4.2);
        albums.add(album1);

        LinkedList<Song> plaList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Song4", plaList);  //sending by names
        albums.get(0).addToPlaylist("Song7", plaList);
        albums.get(0).addToPlaylist("Song5", plaList);
        albums.get(0).addToPlaylist(3, plaList);   //sending by index
        albums.get(0).addToPlaylist(1, plaList);
        albums.get(0).addToPlaylist(2, plaList);
        //from second album
        albums.get(1).addToPlaylist("Songs13", plaList);
        albums.get(1).addToPlaylist("Songs15", plaList);
        albums.get(1).addToPlaylist("Song1689", plaList);
        albums.get(1).addToPlaylist(4, plaList);
        albums.get(1).addToPlaylist(1, plaList);
        albums.get(1).addToPlaylist(6, plaList);

    }

    private static void play(LinkedList<Song> playList) {

        Scanner sc = new Scanner(System.in);
        boolean quite = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs");
        } else {
            System.out.println("now playing" + listIterator.next().toString());
        }

        while (!quite) {

            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case (0): {
                    System.out.println("playlist completed");
                    quite = true;
                    break;
                }
                case (1): {
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("now Playing" + listIterator.next().toString());
                    } else {
                        System.out.println("We reached at end");
                        forward = false;
                    }
                    break;
                }
                case (2): {
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We reached at start");
                        forward = true;
                    }
                    break;
                }
                case (3): {
                    printList(playList);
                    break;
                }
                case (4): {
                    printMenu();
                    break;
                }
                case (5): {
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("now playng" + listIterator.next().toString());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("now playing" + listIterator.previous().toString());
                        }
                    }
                    break;
                }
            }
        }
    }


    private static void printMenu() {
        System.out.println("Press");
        System.out.println("0-To Quite\n" +
                "1-next songs\n" +
                "2-previous song\n" +
                "3-replay song\n" +
                "4-list song in this playlist\n" +
                "5-print available action\n" +
                "6-to delet this songs");
    }


    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("*****************************");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------------");

    }

}
