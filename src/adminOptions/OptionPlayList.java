/**
 * clase  permite validar datos ingresados por el usuario
 * ej:
 * ....el numero de canciones que elegira para su lista de reproduccion.
 * ....que no repita canciones.
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

package adminOptions;

import java.util.Arrays;
import java.util.Scanner;
import adminPlayList.CreatePlayList;

public class OptionPlayList {

    private Scanner read2 = new Scanner(System.in);

    public OptionPlayList() {

    }

    /**
     * este metodo permite hacer todas las validaciones para crear 
     * lista de reproduccción
     */
    public void OptionCreatePlayList() {
        /**
         * esta variable guarda la opcion ingresada por usuario
         */
        int numSong = 0;
        CreatePlayList createplaylist = new CreatePlayList();

        while (numSong == 0) {

            System.out.println("Por favor elija una opción valida");
            System.out.println("Por favor elija el numero de canciones que desea" +
                    "agregar a lista de reproducción");
            System.out.println("Escriba 1: para agregar  1 canción");
            System.out.println("Escriba 2: para agregar 2 canciónes");
            System.out.println("Escriba 3: para agregar 3 canción");
            System.out.println("Escriba 4: para agregar 4 canciónes");
            System.out.println("Escriba 5: para agregar 5 canciónes");

            try {
                numSong = createplaylist.validateNumberSongs(read2.nextLine());

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        if (numSong > 5 || numSong < 0) {
            System.out.println("ya que ingreso un numero fuera de rango por defecto podra registrar 5 canciones");
            numSong = 5;
        }
        String[] arrayIdSong = new String[numSong];

        int i = 0;

        while (i < numSong) {

            System.out.println("ingrese el numero de la canción: ");
            System.out.println("Por Ejemplo el numero de la canción 'Hola beba es:' 6 ");
            String valor = read2.nextLine();

            int resp = createplaylist.validateNumberSongs(valor);

            if (resp == 0) {
                System.out.println("escoja una opcion valida");
            } else if ((resp < 12) && (resp > 0)) {
                if (i > 0) {
                    boolean aux = Arrays.asList(arrayIdSong).contains(valor);
                    if (!aux) {
                        arrayIdSong[i] = valor;
                        i++;
                    } else {
                        System.out.println("Esta canción ya esta agregada en la lista de reproducción");
                    }

                } else {
                    arrayIdSong[i] = valor;
                    i++;
                }
            } else {
                System.out.println("las opciones validas estan entre 1 y 11");
            }
        }
        createplaylist.idSongChosen(arrayIdSong);
        createplaylist.show("");

    }

}
