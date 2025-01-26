/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.*;

public class Test1 {

    public static void main(String[] args) {
        Banco b1; // la declaracion de b1 del tipo 

        b1 = new BCP(5.0 / 100); // se crea un objeto referenciado a la clase hija
        System.out.println("BCP ofrece en 5 meses * 1000 soles:     " + b1.ganancia(1000, 5));

        b1 = new Scotiabank(3.8 / 100);
        System.out.println("Scotiabank ofrece en 5 meses * 1000 soles:     " + b1.ganancia(1000, 5));

        b1 = new Interbank(4.7 / 100);
        System.out.println("Interbank ofrece en 5 meses * 1000 soles:     " + b1.ganancia(1000, 5));

        Banco b2 = new BCP(5.0 / 100);
        System.out.println("Este Banco es " + ((Banco) b2).getNombre());

        
        // Interfaces
        BCP b3 = new BCP(5.0 / 100);
        System.out.println("\n"+"Prueba de las interfaces");
        System.out.println(b3.getNombre() + "  Ofrece los siguientes créditos: ");
        b3.mensajeCH();
        b3.mensajeCP();
        
        Interbank b5 = new Interbank(4.7 / 100);
        System.out.println("Prueba de las interfaces");
        System.out.println(b5.getNombre() + "  Ofrece los siguientes créditos: ");
        b5.mensajeCA();
        b5.mensajeCP();
        
        Scotiabank b4 = new Scotiabank(3.8 / 100);
        System.out.println("Prueba de las interfaces");
        System.out.println(b4.getNombre() + "  Ofrece los siguientes créditos: ");
        b4.mensajeCP();
        
        // Polimorfismo
        Banco bancos[] = {new BCP(0.05), new Interbank(0.047)};
        
        System.out.println("Presentacion de bancos y sus paquetes de creditos");
        for (Banco bco: bancos){
            System.out.println("Este banco es:  " + bco.getNombre());            
            if (bco instanceof BCP){
                ((BCP ) bco).mensajeCP();
            }
            
        }
        
        
        
        
        
        
        

    }
}
