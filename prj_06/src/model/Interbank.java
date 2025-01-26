/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Interbank extends Banco implements CreditoAutomotriz, CreditoPersonal{
    
  
    public Interbank (double tasa){
        super(tasa);
        super.nombre ="Interbank";
    }

    @Override
    public void mensajeCA() {
        //throw new UnsupportedOperationException("Este banco no tiene Credito Hipotecario"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Este banco tiene Credito Automotriz");
    }

    @Override
    public void mensajeCP() {
        //throw new UnsupportedOperationException("Este banco tiene Credito Personal"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Este banco no tiene Credito Personal");
    }
}
