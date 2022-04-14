/**
 * clase  donde se crean las lista de reproducción
 *
 * ej.:como usar
 * EstaClase clase = new EstaClase();
 *
 * @version 1.0.0 2022-04-14
 * 
 * 
 *
 * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
 *
 * @since 1.0.0 2022-04-14
 *
 */
package adminPlayList;

import java.util.ArrayList;
import adminSongs.Song;
import adminSongs.SongLibrary;

public class CreatePlayList extends SongLibrary {
    /**
     * este array almacenara las canciones elegidas por el usuario
     */
    private ArrayList<Song> songs = new ArrayList<Song>();

    public CreatePlayList() {
    }

    /**
     * Este metodo muestra todas las canciones al usuario
     * para que facilitar su elección
     */
    public void showSong() {
        for (int i = 0; i < list().size(); i++) {

            System.out.println("Numero de Canción: " + list().get(i).getId());
            System.out.println("Titulo: " + list().get(i).getTittle());
            System.out.println("Duración: " + list().get(i).getDuration() + " Minutos");
            System.out.println("Fecha: " + list().get(i).getDate());
            System.out.println("Genero: " + list().get(i).getGender());
            System.out.println("Caratula: " + list().get(i).getCover());
            System.out.println("Descripción: " + list().get(i).getDescription());
            System.out.println("---------------------------------------------------");

        }

        System.out.println("Total Canciones: " + list().size());

    }

    /**
     * este metodo permite validar si el usuario ingreso un numero
     * 
     * @param num recibe valor tipo String
     * @return retorna el valor ingresado por el usuario de tipo int si es numero
     *         y retorna cero 0 si no es numero:
     */
    public int validateNumberSongs(String num) {
        int resp = 0;
        boolean isNumeric = num.matches("[+-]?\\d*(\\.\\d+)?");
        if (isNumeric) {
            resp = Integer.parseInt(num);
        }
        return resp;
    }

    /**
     * este metodo recibe un vector con los identificador(numero de la canción) de
     * las anciones elegidas por el usuario y envia estos valores como argumento al
     * metodo PlayList()
     * 
     * @param num vector de valores ingresados por el usuario
     */
    public void idSongChosen(String num[]) {
        for (Object o : num) {

            PlayList(list().get(Integer.parseInt(String.valueOf(o)) - 1).getTittle(),
                    list().get(Integer.parseInt(String.valueOf(o)) - 1).getId(),
                    list().get(Integer.parseInt(String.valueOf(o)) - 1).getDuration());

        }

    }

    /**
     * este me lo utilzamos para crear objetos de tipo Song con las canciones
     * elegidas por el usuario
     * 
     * @param tittle   Titulo de la cancón
     * @param id       Identificador de la canción
     * @param duration El tiempo que tarda la canción tipo de dato double
     * @return un ArrayList de objetos
     */
    private ArrayList<Song> PlayList(String tittle, String id, double duration) {

        songs.add(new Song(tittle, id, duration));

        return songs;
    }

    /**
     * este metodo se utiliza mostrar la lista de reporduccion
     * 
     */
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
