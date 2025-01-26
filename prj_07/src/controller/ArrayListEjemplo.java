/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Alumno;
import java.util.List;

public class ArrayListEjemplo {

    public static void main(String[] args) {

        // Un ArrayList sirve para almacenar objetos de cualquier tipo
        //ArrayList lista = new ArrayList();        
        ArrayList lista; //declarar un arreglo dinamico
        lista = new ArrayList(); // Dar el espacio inicial de memoria
        
        Alumno alu = new Alumno(5555, "ABEL ABAD", 2022);
        
        lista.add("Mensaje 1"); // Se ingresa String
        lista.add("Mensaje 2");
        lista.add("Mensaje 3");
        lista.add("Mensaje 4");
        lista.add("Saludos");       
        
        
        // Se ingresa otro tipo de dato
        lista.add(alu);
        
        System.out.println("El indice 2 contiene:  " + lista.get(2)); // mostrar el elemento de indice 2
        // Eliminar Alumno
        
        lista.remove(new Alumno(5555, "ABEL ABAD", 2022));
        
        System.out.println("La lista con un elemento eleminado tiene"+lista.get(2));
        
        // Muestra de lo guardado
        for (Object e : lista) { // la lista almacena OBJETOS
            if (e instanceof Alumno) { // Se verifica si el objeto es una instancia de alumno
                System.out.println((Alumno) e); // si es instancia de Alumno, imprimir
            } else {
                System.out.println((String) e); // el OBJETO se transforma a String
            }

        }

    }
}
