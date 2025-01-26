/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Banco {

    private double tasa_interes; // tasa de interes mensual
    protected String nombre;

    public Banco(){
        tasa_interes=0;
    }
    
    public Banco(double tasa_interes) {
        this.tasa_interes = tasa_interes;
    }

    public double ganancia(double deposito, int tiempo) {
        // interes simple
        return (tiempo * tasa_interes + 1)*deposito;
    }
    
     public String getNombre(){
        return nombre;
    }
    

}
