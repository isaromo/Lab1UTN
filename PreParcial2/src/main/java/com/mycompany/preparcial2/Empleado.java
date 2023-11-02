package com.mycompany.preparcial2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Empleado {
    private String nombreEmpleado;
    private long cuil;
    private int anioIngreso;
    private double montoAntiguedad;
    private double sueldoBasico;
    List<BonoSueldo> bonos = new ArrayList<BonoSueldo>();
    
    //GETTERS Y SETTERS
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public long getCuil() {
        return cuil;
    }

    public void setCuil(long cuil) {
        this.cuil = cuil;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        Scanner sc = new Scanner(System.in);
        
        if (anioIngreso <= (new Date().getYear() + 1900)){
            this.anioIngreso = anioIngreso;
        } else {
            System.out.println("Año inválido. Vuelva a ingresarlo:");
            setAnioIngreso(sc.nextInt());
        }   
    }

    public double getMontoAntiguedad() {
        return montoAntiguedad;
    }

    public void setMontoAntiguedad() {
        int antiguedad = (new Date().getYear() + 1900) - this.anioIngreso;
        
        this.montoAntiguedad = this.sueldoBasico * ((2 * antiguedad) / 100);
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public List<BonoSueldo> getBonos() {
        return bonos;
    }

    public void setBonos(List<BonoSueldo> bonos) {
        this.bonos = bonos;
    }
}
