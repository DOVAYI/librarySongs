package adminPlayList;

import adminSongs.SongLibrary;

public class Search extends SongLibrary {

    public Search() {
    }

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

    @Override
    public void show(String gender) {
        searchGender(gender);

    }

}
