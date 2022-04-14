/**
 * clase abstracta donde se crean las canciones
 *
 * Esta clase no se puede instanciar, solo se puede usar por Herencia
 * La clase que reciba por Herencia a songLibrary,podra hacer uso de su metodo list(),
 * y debera sobreescribir metodo show();
 * ej.:como usar
 *
 * public class nombre_clase extends SongLibrary
 * 
 * ]
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

package adminSongs;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public abstract class SongLibrary {
/**
 * Este metodo permite crear la lista de canciones,en este caso las canciones esta ingresadas
 * de forma predetermina
 *
 * 
 * ejemplo de como usar.:
 * public class nombre_clase extends SongLibrary{
 *      nombre_clase.list();
 * }
 * 
 * ]
 *
 * 
 * @return retorna Array de obtjetos tipo Song con todas las canciones
 * 
 * @author Luis Alfredo Romero Cuello - exadom21@gmail.com
 *
 * @since 1.0.0 2022-04-14
 *
 
 *
 */
        public ArrayList<Song> list() {

                ArrayList<Song> song = new ArrayList<Song>();

                song.add(new Song("te amare", "1", LocalDate.of(2008, Month.FEBRUARY, 23), 4.15, "baladas", "foto.png",
                                " musica romantica"));
                song.add(new Song("Dile a Ella", "2", LocalDate.of(2013, Month.JANUARY, 12), 4.28, "reggeaton",
                                "foto2.png",
                                " reggeaton don omar"));
                song.add(new Song("LLuvias", "3", LocalDate.of(2017, Month.DECEMBER, 25), 5.08, "salsa", "foto3.png",
                                " salsa romantica"));
                song.add(new Song("tu pirata", "4", LocalDate.of(2008, Month.JULY, 2), 3.48, "baladas", "foto4.png",
                                " musica romantica"));
                song.add(new Song("AL natural", "5", LocalDate.of(2010, Month.OCTOBER, 23), 3.24, "reggeaton",
                                "foto5.png",
                                "tego calderon y yandel"));
                song.add(new Song("Hola Beba", "6", LocalDate.of(2013, Month.MARCH, 14), 3.45, "reggeaton", "foto6.png",
                                "J.Alvarez y Farruko "));
                song.add(new Song("tal para cual", "7", LocalDate.of(2017, Month.APRIL, 7), 5.15, "salsa", "foto7.png",
                                " Joe Arroyo"));
                song.add(new Song("Pueden pasar 3000 años", "8", LocalDate.of(2010, Month.NOVEMBER, 13), 4.12,
                                "baladas",
                                "foto8.png", "Enrique Iglesias"));
                song.add(new Song("La falla fue tuya", "9", LocalDate.of(2013, Month.FEBRUARY, 4), 4.35, "vallenato",
                                "foto9.png", "Diomedes Diaz"));
                song.add(new Song("El perdedor", "10", LocalDate.of(2010, Month.JUNE, 19), 4.23, "salsa", "foto10.png",
                                "Chichi boys"));
                song.add(new Song("La boigrafia", "11", LocalDate.of(2008, Month.MAY, 15), 4.46, "vallenato",
                                "foto11.png",
                                " Diomez Diaz"));

                return song;
        }

        public abstract void show(String optional);

}
