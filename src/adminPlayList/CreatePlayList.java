
package adminPlayList;

import java.util.ArrayList;

import adminSongs.Song;
import adminSongs.SongLibrary;
import adminSongs.ViewSong;



public class CreatePlayList extends SongLibrary {

    private ViewSong song = new ViewSong();

    private ArrayList<Song> songs = new ArrayList<Song>();

    public CreatePlayList() {
    }

    public void showSong() {
        song.show("");

    }

    public int validateNumberSongs(String num) {

        boolean isNumeric = num.matches("[+-]?\\d*(\\.\\d+)?");
        if (isNumeric) {
            return Integer.parseInt(num);
        } else {

            return 0;
        }

    }

    /**
     * este metod recibe un vector con los identificador(numero de la canción) de
     * las
     * canciones elegidas por el usuario
     */
    public void idSongChosen(String num[]) {
        for (Object o : num) {

            PlayList(list().get(Integer.parseInt(String.valueOf(o)) - 1).getTittle(),
                    list().get(Integer.parseInt(String.valueOf(o)) - 1).getId(),
                    list().get(Integer.parseInt(String.valueOf(o)) - 1).getDuration());

        }

    }

    public ArrayList<Song> PlayList(String tittle, String id, double duration) {

        songs.add(new Song(tittle, id, duration));

        return songs;
    }

    @Override
    public void show(String Optional) {
        System.out.println("lista de reproduccion");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < songs.size(); i++) {
            System.out.println("Identificador: " + songs.get(i).getId());
            System.out.println("Nombre: " + songs.get(i).getTittle());
            System.out.println("Duración: " + songs.get(i).getDuration() + " Minutos");
            System.out.println(" ");
            System.out.println(" ");
        }

    }

}
