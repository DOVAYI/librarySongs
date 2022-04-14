package adminPlayList;

import adminSongs.SongLibrary;

import java.time.LocalDate;
import java.util.Arrays;

public class OrderBy extends SongLibrary {

    public void orderByDuration() {

        double songDuration[] = new double[list().size()];
        for (int i = 0; i < list().size(); i++) {

            songDuration[i] = list().get(i).getDuration();

        }

        Arrays.sort(songDuration);

        for (int i = 0; i < songDuration.length; i++) {
            for (int j = 0; j < songDuration.length; j++) {

                if (songDuration[i] == list().get(j).getDuration()) {

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

    private void orderByDate() {
        LocalDate songDate[] = new LocalDate[list().size()];
        for (int i = 0; i < list().size(); i++) {

            songDate[i] = list().get(i).getDate();

        }

        Arrays.sort(songDate);

        for (int i = 0; i < songDate.length; i++) {
            for (int j = 0; j < songDate.length; j++) {

                if (songDate[i].equals(list().get(j).getDate())) {

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

    @Override
    public void show(String optional) {
        orderByDate();

    }

}
