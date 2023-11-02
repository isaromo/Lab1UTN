package com.mycompany.preparcial2;

import java.util.Date;
import java.util.Scanner;

public class BonoSueldo {
    private Empleado empleado;
    private int mesLiquidacion;
    private int anioLiquidacion;
    private double montoLiquidacion;
    
    String[][] bonoCalculado = new String[10][4];
    
    //GETTERS Y SETTERS
    public String[][] getBonoCalculado() {
        return bonoCalculado;
    }

    public void setBonoCalculado(String[][] bonoSueldo) {
        this.bonoCalculado = bonoSueldo;
    }
    
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public int getMesLiquidacion() {
        return mesLiquidacion;
    }

    public void setMesLiquidacion(int mesLiquidacion) {
        this.mesLiquidacion = mesLiquidacion;
    }

    public int getAnioLiquidacion() {
        return anioLiquidacion;
    }

    public void setAnioLiquidacion(int anioLiquidacion) {
        Scanner sc = new Scanner(System.in);
        
        if (anioLiquidacion <= (new Date().getYear() + 1900)){
            this.anioLiquidacion = anioLiquidacion;
        } else {
            System.out.println("Año de liquidación inválido. Vuelva a ingresarlo:");
            setAnioLiquidacion(sc.nextInt());
        }   
    }

    public double getMontoLiquidacion() {
        return montoLiquidacion;
    }

    public void setMontoLiquidacion(double montoLiquidacion) {
        this.montoLiquidacion = montoLiquidacion;
    }
}
