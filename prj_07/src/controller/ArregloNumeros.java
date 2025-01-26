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
public class ArregloNumeros {

    public static void main(String[] args) {

        // int n1[] = new int[5];
        int n1[]; // declaracion de una variable arreglo
        n1 = new int[5]; // construccion del objeto n1
        // reservacion de memoria (5 elem de)
        
        // con memoria reservada, usar la variable
        // Los indices van desde cero hasta el tamaño_arreglo-1
        
        n1 [0] = 10;  // que la posicion del indice 0 se asign
        n1 [1] = 15;
        n1 [2] = 18;
        n1 [3] = 7;
        n1 [4] = 11;
        
        // mostrar
        for ( int i = 0; i < n1.length; i++){
            System.out.println("n1["+i+"] es " + n1[i]);
        }
        
       
        Alumno alumno[], alum1;
        //Alumno[] alumnos, alum1;
        
        alum1 = null; // justo después declarado el objeto alumno
        
        // En alguna parte se ha inicializado alum1
        alum1 = new Alumno(1234, "ANA ABAD",2022);
        
        // muchas lineas adelante se comprobará        
        if (alum1 == null){
            System.out.println("alum1 sin memoria o no hay datos ingresados");
        } else{
            System.out.println(alum1);
        }
        
                

    }
}
