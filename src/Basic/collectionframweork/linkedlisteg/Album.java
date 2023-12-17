package Basic.collectionframweork.linkedlisteg;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }


    public boolean addsongs(String title, double duration) {

            if (findSong(title) == null) {
                this.songs.add(new Song(title, duration));
                return true;
            }

        return false;
    }

    public Song findSong(String title) {
        for (Song check : this.songs) {
            if (check.getTitle().equals(title)) {
                return check;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if (index >= 0 && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album doesnt have songs😔" + trackNumber);
        return false;
    }


    public boolean addToPlaylist(String title, LinkedList<Song> playList){
        Song check=findSong(title);
        if (check != null){
            playList.add(check);
            return true;
        }
        System.out.println("The songs not in album 😔 "+title);
        return false;
    }

}
