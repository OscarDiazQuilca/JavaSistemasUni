/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Alumno {
    private int cod_alum;
    private String nombres;
    private int año_ingreso;
    
    public Alumno(){
        
    }
    
    
    
    

    public Alumno(int cod_alum, String nombres, int año_ingreso) {
        this.cod_alum = cod_alum;
        this.nombres = nombres;
        this.año_ingreso = año_ingreso;
    }

    public int getCod_alum() {
        return cod_alum;
    }

    public void setCod_alum(int cod_alum) {
        this.cod_alum = cod_alum;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getAño_ingreso() {
        return año_ingreso;
    }

    public void setAño_ingreso(int año_ingreso) {
        this.año_ingreso = año_ingreso;
    }

    @Override
    public String toString() {
        return "Alumno{" + "cod_alum=" + cod_alum + ", nombres=" + nombres + ", a\u00f1o_ingreso=" + año_ingreso + '}';
    }
    
    
}
