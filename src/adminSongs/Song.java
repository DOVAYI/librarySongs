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
        this.tittle = tittle;
        this.id = id;
        this.duration = duration;
    }

    public Song(String tittle, String id, LocalDate date) {
        this.tittle = tittle;
        this.id = id;
        this.date = date;
    }

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


/**
 * [Detalle el objetivo de la clase.
 *
 * incorpore indicaciones de uso de la clase para facilitar su compresión.
 * ej.:
 *
 * EstaClase clase = new EstaClase(arg, arg1, ..., argN);
 * clase.setUnaPropiedad(valor);
 * ValorDeRespuesta valor = clase.execute();
 * ]
 *
 * @version [Ingrese el número de versión con el siguiente formato: VS.CM.cm
 *          AAAA-mm-dd
 *          "VS" indica la versión actual del sistema,
 *          "CM" indica un refactoring de la clase,
 *          "cm" indica un cambio menor en alguna sección de la misma
 *
 *          ej: 4.02.003 2011-08-01, La clase corresponde a la versión 4 del
 *          sistema,
 *          la misma a sufrido 2 refactorings durante la versión
 *          se realizaron 3 cambios menores luego del segundo refactoring
 *          el último cambio fue realizado el 1 de agosto de 2011]
 *
 * @author [Ingrese nombre, apellido y correo electrónico del autor.
 *         ej: Fulano DeTal – fulano.detal@swissmedical.com.ar]
 *
 * @since [Ingrese desde que versión del sistema está presente la clase]
 *
 */

/**
 * [Detalle el objetivo del método.
 *
 * incorpore indicaciones de uso del mismo para facilitar su compresión.
 * ej.:
 *
 * ...;
 * clase.unaLogicaDeNegocioDeterminada(valor1, valor2);
 * ValorDeRespuesta valor = clase.execute();
 * ]
 *
 * @param arg
 * @param arg2
 * @return
 * @throws Exception
 *
 * @author [Ingrese nombre, apellido y correo electrónico del autor.
 *         ej: Fulano DeTal – fulano.detal@swissmedical.com.ar]
 *
 * @since [Ingrese desde que versión del sistema está presente el método]
 *
 * @see [Indique si existe código que deba ser consultado como material de apoyo
 *      a este código
 *      Para consultar sobre el uso de este tag, visite la siguiente dirección
 *      <a href=
 *      "http://download.oracle.com/javase/1.5.0/docs/tooldocs/windows/javadoc.html#@see">javadoc
 *      - The Java API Documentation Generator</a>]
 *
 * @deprecated [Indique si el método es obsoleto, a partir de cuando será
 *             discontinuado
 *             y provea un link al, o los, método que lo reemplazará.
 *             ej: {@link #remove(int)} and {@link #removeAll()}
 *             Para consultar sobre el uso del tag link, visite la siguiente
 *             dirección
 *             <a href=
 *             "http://download.oracle.com/javase/1.5.0/docs/tooldocs/windows/javadoc.html#{@link}">javadoc
 *             - The Java API Documentation Generator</a>
 *             ATENCION!: BORRE ESTE TAG SI NO APLICA!!!!!.]
 *
 */
