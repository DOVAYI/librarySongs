/**
 * clase  permite Buscar canciones segun:
 * 1)año de creación
 * 2)genero de la cancion (baladas,salsa,etc)
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

public class Search extends SongLibrary {

    public Search() {
    }

    /**
     * este metodo muestra las canciones segun su genero
     * @param gender recibe el genero de la cancion como argumento
     */
    private void searchGender(String gender) {

        for (int i = 0; i < list().size(); i++) {
            if (list().get(i).getGender().equals(gender)) {
                System.out.println(list().get(i).getGender());
                System.out.println("-------------------------------");
                System.out.println(list().get(i).getTittle());
                System.out.println(list().get(i).getDuration());
                System.out.println(list().get(i).getDescription());
                System.out.println(list().get(i).getCover());
                System.out.println("-------------------------------");
                System.out.println("-------------------------------");
                System.out.println("-------------------------------");

            }
        }
    }

    /**
     * este metodo muestra las canciones segun su genero
     * @param year recibe el año de creación como argumentos:
     */
    public void searchForYear(int year) {
        int cont = 0;
        for (int i = 0; i < list().size(); i++) {

            if (list().get(i).getDate().getYear() == year) {
                System.out.println(list().get(i).getDate().getYear());
                System.out.println("-------------------------------");
                System.out.println(list().get(i).getGender());
                System.out.println(list().get(i).getTittle());
                System.out.println(list().get(i).getDuration());
                System.out.println(list().get(i).getDescription());
                System.out.println(list().get(i).getCover());
                System.out.println("-------------------------------");
                System.out.println("-------------------------------");
                System.out.println("-------------------------------");
                cont++;

            }

        }
        System.out.println("Cantidad de canciones encontradas del año: " + year + " son " + cont);
    }

    /**
     * permite el acceso al metodo privado searchGender(gender);
     */
    @Override
    public void show(String gender) {
        searchGender(gender);

    }

}
