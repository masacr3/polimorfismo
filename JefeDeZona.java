/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author masacr3
 */
public class JefeDeZona extends Empleado {
    private String despacho;
    private List<Vendedor> listaVendedores = new ArrayList<>();
    private Secretario secretario;
    private String matricula;
    private String marca;
    private String modelo;

    public JefeDeZona(String nombre, String apellido, int dni, String direccion, int telefonoDeContacto, double salario, String despacho, Secretario secretario, String matricula, String modelo, String marca) {
        super(nombre, apellido, dni, direccion, telefonoDeContacto, salario);
        this.despacho = despacho;
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.secretario = secretario;
    }
    

    @Override
    public void incremetarSalario() {
        double nuevoSalario = (this.getSalario() * 20 / 100) + this.getSalario();
        this.setSalario(nuevoSalario);
        this.setAniosAntiguedad( this.getAniosAntiguedad() + 1);
    }
    
    public void cambiarSecretario( Secretario nuevoSecretario){
        this.setSecretario(nuevoSecretario);
    }
    
    public void cambiarCoche( String matricula, String marca, String modelo ){
        this.setMatricula(matricula);
        this.setMarca(marca);
        this.setModelo(modelo);
    }
    
    public boolean darAlta(Vendedor nuevoVendedor){
        if ( ! this.listaVendedores.contains(nuevoVendedor)){
            this.listaVendedores.add(nuevoVendedor);
            return true;
        }
        return false;
    }
    
    public boolean darBaja(Vendedor vendedor){
        if ( this.listaVendedores.contains(vendedor)){
            this.listaVendedores.remove(vendedor);
            return true;
        }
        return false;
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
     * @return the listaVendedores
     */
    public List<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    /**
     * @param listaVendedores the listaVendedores to set
     */
    public void setListaVendedores(List<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
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
     * @return the secretario
     */
    public Secretario getSecretario() {
        return secretario;
    }

    /**
     * @param secretario the secretario to set
     */
    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }
    
    @Override
    public String toString(){
        return this.mostrarDatos()+"Despacho : "+this.getDespacho()+"\n"+"auto : "+this.getMarca()+","+this.getModelo()+","+this.getMatricula()+"\n"+"Puesto : Jefe de zona";
    }
}
