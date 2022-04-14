/**
 * clase  permite ordenar las canciones segun tiempo de duración
 * ó fecha de creación
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
import adminSongs.SongLibrary;
import java.time.LocalDate;
import java.util.Arrays;

public class OrderBy extends SongLibrary {

    /**
     * este metodo tomar todos los tiempos de duracion de las 
     * canciones y ordenarlas de menor a mayor
     * @return vector de tiempos de duracion de las canciones ordenados
     */
    private double[] loadDurationSongs() {

        double songDuration[] = new double[list().size()];
        for (int i = 0; i < list().size(); i++) {
            songDuration[i] = list().get(i).getDuration();
        }
        Arrays.sort(songDuration);

        return songDuration;
    }

    /**
     * este metodo tomar todas fechas de las 
     * canciones y ordenarlas de la mas vieja a la mas nueva
     * @return vector de fechas de creación las canciones ordenados
     */
    private LocalDate[] loadDateSongs() {

        LocalDate songDate[] = new LocalDate[list().size()];
        for (int i = 0; i < list().size(); i++) {
            songDate[i] = list().get(i).getDate();
        }

        Arrays.sort(songDate);

        return songDate;
    }

    /**
     * este metodo muestra las canciones ordenadas por tiempo
     * de duración
     */
    public void orderByDuration() {

        double loadDuration[] = loadDurationSongs();
        for (int i = 0; i < loadDuration.length; i++) {
            for (int j = 0; j < loadDuration.length; j++) {
                if (loadDuration[i] == list().get(j).getDuration()) {

                    System.out.println("Duración: " + list().get(j).getDuration() + " Minutos");
                    System.out.println("Titulo: " + list().get(j).getTittle());
                    System.out.println("Genero: " + list().get(j).getGender());
                    System.out.println("Caratula: " + list().get(j).getCover());
                    System.out.println("Descripción: " + list().get(j).getDescription());
                    System.out.println("----------------------------");
                    break;

                }

            }
        }

    }

    /**
     * Este metodo muestra las canciones ordenas por fecha de cración
     */
    private void orderByDate() {
        LocalDate loaDate[]=loadDateSongs();
        for (int i = 0; i < loaDate.length; i++) {
            for (int j = 0; j < loaDate.length; j++) {

                if (loaDate[i].equals(list().get(j).getDate())) {

                    System.out.println("Fecha Lanzamiento: " + list().get(j).getDate());
                    System.out.println("Titulo: " + list().get(j).getTittle());
                    System.out.println("Duración: " + list().get(j).getDuration());
                    System.out.println("Genero: " + list().get(j).getGender());
                    System.out.println("Caratula: " + list().get(j).getCover());
                    System.out.println("Descripción: " + list().get(j).getDescription());
                    System.out.println("----------------------------");
                    break;
                }

            }
        }
    }

    /**
     * este metodo permite acceder al metodo, que muestra las canciones ordenas 
     * por fecha
     */
    @Override
    public void show(String optional) {
        orderByDate();

    }

}
