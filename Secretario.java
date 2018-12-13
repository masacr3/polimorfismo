/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author masacr3
 */
public class Secretario extends Empleado {
    
    private String despacho;
    
    
    public Secretario( String nombre, String apellido, int dni, String direccion, int numeroFax, double salario, String despacho ){
        super(nombre,apellido,dni,direccion,numeroFax,salario);
        this.despacho = despacho;
    }
    
    @Override
    public void incremetarSalario() {
        double nuevoSalario = (this.getSalario() * 5 / 100) + this.getSalario() ;
        this.setSalario(nuevoSalario);
        this.setAniosAntiguedad( this.getAniosAntiguedad() + 1);
    }

    /**
     * @return the despacho
     */
    public String getDespacho() {
        return despacho;
    }

    /**
     * @param despacho the despacho to set
     */
    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }
    
}
