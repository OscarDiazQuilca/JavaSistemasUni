/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Empleado;

public class Medico extends Empleado{
    
    public Medico(int cod_emp, String ap_nombres, int año_ingreso, String perfil ){
        super(cod_emp,ap_nombres,año_ingreso,perfil);
    }
    public void printFotoCheck(){
        //throw new UnsupportedOperationException("Not asda");
        System.out.println("Todavia no ha sido implementado el metodo");
    }
}
