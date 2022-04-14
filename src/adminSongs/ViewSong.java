package adminSongs;

public class ViewSong extends SongLibrary {
    
    public ViewSong() {
    }

    @Override
    public void show(String Optional) {
        for (int i = 0; i < list().size(); i++) {
            
            System.out.println("Numero de Canción: "+list().get(i).getId());
            System.out.println("Titulo: "+list().get(i).getTittle());
            System.out.println("Duración: "+list().get(i).getDuration()+" Minutos");
            System.out.println("Fecha: "+list().get(i).getDate());
            System.out.println("Genero: "+list().get(i).getGender());
            System.out.println("Caratula: "+list().get(i).getCover());
            System.out.println("Descripción: "+list().get(i).getDescription());
            System.out.println("---------------------------------------------------");
            
           
            
        }

        System.out.println("Total Canciones: "+list().size());
        
    }
    
}
