/**
 * Esta clase permite crear canciones.
 *
 * Tiene sobrecarga de constructores para aplicar en diferentes
 * contextos:
 * ej.:
 * 
 * Opcion 1:esta forma no es recomendable, la utilizaremos para facilitar la creacion de canciones 
 * EstaClase clase = new EstaClase(arg, arg1, ..., arg7);
 * todos los atributos se inicializan en el constructor;
 * los getters para tomar los valores
 * 
 * Opcion 2: 
 * EstaClase clase = new EstaClase(arg, arg1, arg3);
 * todos los atributos se inicializan en el constructor;
 * los getters para tomar los valores
 * 
 * Opcion 3: 
 * EstaClase clase = new EstaClase();
 * todos los atributos se inicializan con los setters;
 * los getters para tomar los valores
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

public class Song {

    private String tittle = "";
    private String id = "";
    private LocalDate date = null;
    private double duration = 0;
    private String gender = ""; 
    private String cover = "";
    private String description = "";

    public Song() {
    }
    /*  
        este comentario esta dirjido al instructor
        este constructor NO cumple las buenas practicas,
        en este caso inicializa 7 atributos,se utiliza por motivos
        practicos, es utilizado en clase SongLibrary 
        metodo: public ArrayList<Song> list()
    */
    public Song(String tittle, String id, LocalDate date, double duration,
            String gender, String cover, String description) {
        this.tittle = tittle;
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.gender = gender;
        this.cover = cover;
        this.description = description;
    }
    
    public Song(String tittle, String id, double duration) {
        this(tittle,id,null,duration,"","","");
    }

    

    /**
     * setter para inicializar y/o modificar valores de atributos
     */

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setCover(String cover) {
        this.cover = cover;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Getters para capturar valores de atributos
     */
    public String getTittle() {
        return tittle;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getDuration() {
        return duration;
    }

    public String getGender() {
        return gender;
    }

    public String getCover() {
        return cover;
    }

    public String getDescription() {
        return description;
    }

}


