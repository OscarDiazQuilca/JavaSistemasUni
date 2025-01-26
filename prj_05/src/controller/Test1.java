/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Medico;
/**
 *
 * @author user
 */
public class Test1 {
    public static void main(String[] args) {
        //Empleado e1 = new Empleado(); //No se puede hacer esto
        Medico m1 = new Medico(12345,"ABEL ABAD",2020,"ANESTESIOLOGO");
        m1.printFotoCheck();
        
        if(m1 instanceof Medico){
            System.out.println("m1 es una instancia de la clase medico");
        } else {
            System.out.println("m1 no es una instancia de la clase médico");
        }
}
}

