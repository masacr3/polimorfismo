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
public class Vendedor extends Empleado {

    private String matricula;
    private String marca;
    private String modelo;
    private String areaVenta;
    private double porcentaje;
    
    public Vendedor( String nombre, String apellido, int dni, String direccion, int telefonoMovil, double salario, String matricula, String marca, String modelo, String areaVenta, double porcentaje ){
        super(nombre,apellido,dni,direccion,telefonoMovil,salario);
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.areaVenta = areaVenta;
        this.porcentaje = porcentaje;
    }
    
    @Override
    public void incremetarSalario() {
        double nuevoSalario = (this.getSalario() * 10 / 100) + this.getSalario();
        this.setSalario(nuevoSalario);
        this.setAniosAntiguedad( this.getAniosAntiguedad() + 1);
    }
    
    public void cambiarCoche( String matricula, String marca, String modelo ){
        this.setMatricula(matricula);
        this.setMarca(marca);
        this.setModelo(modelo);
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the areaVenta
     */
    public String getAreaVenta() {
        return areaVenta;
    }

    /**
     * @param areaVenta the areaVenta to set
     */
    public void setAreaVenta(String areaVenta) {
        this.areaVenta = areaVenta;
    }

    /**
     * @return the porcentaje
     */
    public double getPorcentaje() {
        return porcentaje;
    }

    /**
     * @param porcentaje the porcentaje to set
     */
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    @Override
    public String toString(){
        return this.mostrarDatos()+"Area de ventas : "+this.getAreaVenta()+"\n"+"Porcentaje Comision : "+this.getPorcentaje()+"\n"+"auto : "+this.getMarca()+","+this.getModelo()+","+this.getMatricula()+"\n"+"Puesto : Vendedor";
    }
    
}
