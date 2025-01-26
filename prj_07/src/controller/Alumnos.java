/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Alumno;

/**
 *
 * @author user
 */
public class Alumnos {
    public static void main(String[] args) {
        
        //Alumno alumnos
        Alumno[] alumnos; //declaración
         
        alumnos = new Alumno[2]; //construccion de cada objeto
        
        // Creacion de valores para cada objeto
        alumnos[0] = new Alumno (456, "ANA ABAD",2024);
        alumnos[1] = new Alumno (888, "ABEL ABAD",2020);
                
        // Esta es una forma de recorrer los objetos de una colección        
        // Se declara una variable objeto del tipo de la clase[alumnos] que es el elemento
        // del arreglo:
        // for (clase_del_elemento variable: arreglo_coleccion_a_recorrer) {}
        for (Alumno a:alumnos){
            System.out.println("\nCodigo          :"+a.getCod_alum());
            System.out.println("Nombres         :"+a.getNombres());
            System.out.println("Año de ingreso  :"+a.getAño_ingreso());
            
        }
    
}
}
