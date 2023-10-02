package com.mycompany.parcial1lab;

import java.util.Date;
import java.util.Scanner;

public class Computadora {
    String marca;
    String modelo;
    int anioFabricacion;
    long codigoBarras;
    double precioTotal;
    double porcentajeAumento;
    double montoFinal;
    String[][] componentes;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
        Date fecha = new Date();
        
//        while (anioFabricacion > fecha){
//            
//        }
    }

    public long getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(long codigoBarras) {
        Scanner sc = new Scanner(System.in);
        this.codigoBarras = codigoBarras;
        
        String codigoAString = String.valueOf(codigoBarras);
//        System.out.println(codigoAString);
        int longitudCodigo = codigoAString.length();
        
        while (longitudCodigo < 7 || longitudCodigo > 15){
            System.out.println("Ingrese un código de barras válido (entre 7 y 15 caracteres)");
            codigoBarras = sc.nextLong();
        }
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getPorcentajeAumento() {
        return porcentajeAumento;
    }

    public void setPorcentajeAumento(double porcentajeAumento) {
        this.porcentajeAumento = porcentajeAumento;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public String[][] getComponentes() {
        return componentes;
    }

    public void setComponentes(String[][] componentes) {
        this.componentes = componentes;
    }
    
    
}
