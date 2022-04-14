import java.util.Scanner;

import adminOptions.OptionPlayList;
import adminPlayList.CreatePlayList;
import adminPlayList.OrderBy;
import adminPlayList.Search;

public class App {
    public static void main(String[] args) throws Exception {

        CreatePlayList createplaylist = new CreatePlayList();

        OptionPlayList optionplaylist;

        OrderBy orderby;

        Search search;

        Scanner read = new Scanner(System.in);

        int num = 0;

        String decision;

        int playListMax = 0;

        do {

            decision = "s";

            while (num == 0 || num < 0) {

                System.out.println("Bienvenid@");
                System.out.println("Que desea hacer:  ");
                System.out.println("Opción 1: Ver Todas las canciones de la biblioteca");
                System.out.println("Opción 2: Crear Lista de reproducción");
                System.out.println("Opción 3: Buscar canciones por Genero(ejemplo:salsa,reggeaton,vallenatos)");
                System.out.println("Opción 4: Buscar canciones por año de creación");
                System.out.println("Opción 5: ordenar las canciones por Tiempo de Duración");
                System.out.println("Opción 6: ordenar las canciones por fecha");
                System.out.println("Presione el numero segun el valor de la Opción");

                try {
                    num = createplaylist.validateNumberSongs(read.nextLine());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                if (num > 6) {
                    num = 0;
                }

            }

            switch (num) {
                case 1:
                    createplaylist.showSong();
                    break;
                case 2:
                    playListMax++;

                    if (playListMax <= 2) {
                        createplaylist.showSong();
                        optionplaylist = new OptionPlayList();
                        optionplaylist.OptionCreatePlayList();
                    } else {
                        System.out.println("Usted ya no puede crear mas lista de reproducción");
                    }
                    System.out.println("Recuerde que solo puede crear '2' lista de reproducción");
                    break;
                case 3:
                    num = 0;
                    String gender = "";
                    while (num == 0 || num < 0) {

                        System.out.println("Opción 1: Salsa");
                        System.out.println("Opción 2: Reggeaton");
                        System.out.println("Opción 3: Vallenatos");

                        num = createplaylist.validateNumberSongs(read.nextLine());

                        if (num > 3) {
                            num = 0;
                        }

                    }

                    if (num == 1) {
                        gender = "salsa";
                    } else if (num == 2) {
                        gender = "reggeaton";
                    } else {
                        gender = "vallenato";
                    }

                    search = new Search();
                    search.show(gender);

                    break;
                case 4:
                    num = 0;
                    while (num == 0 || num < 0) {

                        System.out.println("Por favor Elija el año de la canción a buscar");

                        num = createplaylist.validateNumberSongs(read.nextLine());

                        if (num < 0) {
                            num = 0;
                        }

                    }

                    search = new Search();
                    search.searchForYear(num);

                    break;
                case 5:
                    orderby = new OrderBy();
                    orderby.orderByDuration();
                    break;
                case 6:
                    orderby = new OrderBy();
                    orderby.show("");
                    break;
            }

            System.out.println("Desea continuar?");
            System.out.println("Presione la Tecla 'S' si desea continuar ó Cualquier tecla para salir");
            try {
                decision = read.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            num = 0;

        } while (decision.equals("s") || decision.equals("S"));
        System.out.println("GRACIAS! Hasta Pronto");
        read.close();
    }

}
