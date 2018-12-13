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
    private int numeroFax;
    
    
    public Secretario( String nombre, String apellido, int dni, String direccion, int telefono, double salario, int numeroFax, String despacho ){
        super(nombre,apellido,dni,direccion,telefono,salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }
    
    @Override
    public void incremetarSalario() {
        double nuevoSalario = (this.getSalario() * 5 / 100) + this.getSalario() ;
        this.setSalario(nuevoSalario);
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

    /**
     * @return the numeroFax
     */
    public int getNumeroFax() {
        return numeroFax;
    }

    /**
     * @param numeroFax the numeroFax to set
     */
    public void setNumeroFax(int numeroFax) {
        this.numeroFax = numeroFax;
    }
    
}
