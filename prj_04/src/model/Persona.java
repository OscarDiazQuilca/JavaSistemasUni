package model;

/**
 *
 * @author JHERENCIA
 */
public class Persona {
    private String DNI;
    private String apellidos;
    private String nombres;
    private int año_nacim;
    private String email_personal;

    public Persona(String DNI, String apellidos, String nombres, int año_nacim, String email_personal) {
        this.DNI = DNI;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.año_nacim = año_nacim;
        this.email_personal = email_personal;
    }
    
    // Recarga de constructor
    public Persona(String DNI, String apellidos, String nombres) {
        this.DNI = DNI;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.año_nacim = -1;
        this.email_personal = "";
    }

    // El DNI será de solo lectura
    public String getDNI() {
        return DNI;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getAño_nacim() {
        return año_nacim;
    }

    public void setAño_nacim(int año_nacim) {
        this.año_nacim = año_nacim;
    }

    public String getEmail_personal() {
        return email_personal;
    }

    public void setEmail_personal(String email_personal) {
        this.email_personal = email_personal;
    }
    
    public void mostrar() {
        System.out.println("---- Datos de Persona " + DNI + " ----");
        System.out.println("Apellidos         : " + apellidos);
        System.out.println("Nombres           : " + nombres);
        System.out.println("Año de nacimiento : " + año_nacim);
        System.out.println("Email personal    : " + email_personal);
    }

    // Se ha sobre cargado el método toString
    @Override
    public String toString() {
        String txt = "---- Datos de Persona " + DNI + " ----" + '\n' +
        "Apellidos         : " + apellidos + '\n' +
        "Nombres           : " + nombres + '\n' +
        "Año de nacimiento : " + año_nacim + '\n' +
        "Email personal    : " + email_personal;
        return txt;
        //return "Persona{" + "DNI=" + DNI + ", apellidos=" + apellidos + ", nombres=" + nombres + ", a\u00f1o_nacim=" + año_nacim + ", email_personal=" + email_personal + '}';
    }
    
    
}
