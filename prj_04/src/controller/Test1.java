package controller;

import model.Alumno;
import model.Persona;

/**
 *
 * @author JHERENCIA
 */
public class Test1 {

    public static void main(String[] args) {
        Persona p1 = new Persona("12345678", "ABAD ABAD", "ANA", 2000, "anaabad@gmail.com");
        //p1.mostrar();
        System.out.println(p1); // p1 se representa por p1.toString() internamente

        // Crear el objeto a1
        Alumno a1 = new Alumno("10203040", "QUISPE", "ABEL", 57890, "ING. DE SISTEMAS",
                2022, "INGENIERIA DE SISTEMAS", "abelquispe@miuniversidad.edu.pe");
        System.out.println(a1);

        Alumno a2 = new Alumno(p1.getDNI(), p1.getApellidos(), p1.getNombres(), 78965,
                "ING. TELECOMUNICACIONES", 2024, "EIEE", "anaabad@tuuniversidad.edu.pe");
        System.out.println(a2);
        
        // Con creacion dinámica de objeto persona
        Alumno a3 =new Alumno(new Persona("10002000","PEREZ","ROSA"), 55442, "MEDICINA GENERAL", 2020, "FACULTAD DE MEDICINA", "rosa.perez@unxx.edu.pe");
        System.out.println(a3);
        
    }
}
