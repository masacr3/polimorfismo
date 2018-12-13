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
public  abstract class Empleado {
    
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    
    //variable
    private int aniosAntiguedad;
    private int telefonoDeContacto;
    private double salario;
    private Empleado supervisor;
    
    public Empleado ( String nombre, String apellido, int dni, String direccion, int telefonoDeContacto, double salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefonoDeContacto = telefonoDeContacto;
        this.salario = salario;
        this.aniosAntiguedad = 0;
    }
    
    public void cambiarSupervisor( Empleado nuevoSupervisor ){
        this.setSupervisor(nuevoSupervisor);
    }
    
    public abstract void incremetarSalario();

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the aniosAntiguedad
     */
    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    /**
     * @param aniosAntiguedad the aniosAntiguedad to set
     */
    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the supervisor
     */
    public Empleado getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * @return the telefonoDeContacto
     */
    public int getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    /**
     * @param telefonoDeContacto the telefonoDeContacto to set
     */
    public void setTelefonoDeContacto(int telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }
}
