/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Scotiabank extends Banco implements CreditoPersonal{
    
    
    
    public Scotiabank (double tasa){
        super(tasa);
        super.nombre ="Interbank";
    }

    @Override
    public void mensajeCP() {
        System.out.println("Este banco tiene Credito Personal");
    }
}
