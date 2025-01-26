/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class GenericoEjemplo <T>{
    private T dato;
    
    public GenericoEjemplo(T dato){
        this.dato = dato;
    }
    
    public T getDato(){
        return dato;
    }
}
