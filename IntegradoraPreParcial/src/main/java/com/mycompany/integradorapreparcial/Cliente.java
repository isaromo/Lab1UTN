package com.mycompany.integradorapreparcial;

public class Cliente {
    private String apellido;
    private String nombre;
    private int dni;
    private double sueldo;
    private int nroCliente;
    
    public Cliente(String apellido, String nombre, int dni, double sueldo, int nroCliente){
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.nroCliente = nroCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
    
    
}
