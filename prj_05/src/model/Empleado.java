
package model;

public abstract class Empleado {
    private int cod_emp;
    private String ap_nombres;
    private int año_ingreso;
    private String perfil;
    
    public Empleado (int cod_emp, String ap_nombres, int año_ingreso, String perfil){
        this.cod_emp = cod_emp;
        this.ap_nombres = ap_nombres;
        this.año_ingreso = año_ingreso;
        this.perfil = perfil;

    }
    
    
    public int getAñosServicio(){
        return 2025-año_ingreso;
    }
    
    public abstract void printFotoCheck();
}
