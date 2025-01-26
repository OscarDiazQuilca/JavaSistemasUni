package model;
import model.Persona;
/**
 *
 * @author JHERENCIA
 */
// Alumno se extenderá de la clase Persona
public class Alumno extends Persona{
    private int cod_alum;
    private String especialidad;
    private int año_ingreso;
    private String facultad;
    private String email_institucional;

    public Alumno(String DNI, String apellidos, String nombres, // información como persona
            // información como alumno
            int cod_alum, String especialidad, int año_ingreso, String facultad, String email_institucional) {
        super(DNI, apellidos, nombres); // la llamada al constructor de la clase Persona
        this.cod_alum = cod_alum;       // A partir de aquí se inicializa los valores de atributos de Alumno
        this.especialidad = especialidad;
        this.año_ingreso = año_ingreso;
        this.facultad = facultad;
        this.email_institucional = email_institucional;
    }
    
    // sobreescritura de constructor
    public Alumno( Persona p, // información como persona
            // información como alumno
            int cod_alum, String especialidad, int año_ingreso, String facultad, String email_institucional) {
        super(p.getDNI(), p.getApellidos(), p.getNombres()); // la llamada al constructor de la clase Persona
        this.cod_alum = cod_alum;       // A partir de aquí se inicializa los valores de atributos de Alumno
        this.especialidad = especialidad;
        this.año_ingreso = año_ingreso;
        this.facultad = facultad;
        this.email_institucional = email_institucional;
    }

    @Override
    public String toString() {
        return  super.toString()+ "\nAlumno{" + "cod_alum=" + cod_alum + ", especialidad=" + especialidad + ", a\u00f1o_ingreso=" + 
                año_ingreso + ", facultad=" + facultad + ", email_institucional=" + email_institucional + '}';
    }
    
    
    
}
