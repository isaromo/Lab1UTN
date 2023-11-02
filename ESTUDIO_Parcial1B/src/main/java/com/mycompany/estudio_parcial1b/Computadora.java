package com.mycompany.estudio_parcial1b;

import java.util.Date;
import java.util.Scanner;

public class Computadora {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private long codigoBarras;
    
    //secundarios
    private double precioTotal;
    private double porcentajeAumento;
    private double montoFinal;
    String [][] componentes;

    public void inicializarTamañoMatriz(int filas){
        this.componentes = new String[filas][4];
    }
    
    public void inicializarFila(int fila, String[] filaEncontrada){
        this.componentes[fila][0] = filaEncontrada[0];
        this.componentes[fila][1] = filaEncontrada[1];
        this.componentes[fila][2] = filaEncontrada[2];
        this.componentes[fila][3] = filaEncontrada[3];
    }
    
    public void calcularPrecioTotal(){
        precioTotal = 0;
        
        for (int i = 0; i < this.componentes.length; i++){
            precioTotal += Double.parseDouble(this.componentes[i][2]);
        }
        
        this.precioTotal = precioTotal;
    }
    
    public void calcularRecargo(boolean sinRecargo){
        if (sinRecargo == false){
            this.porcentajeAumento = this.precioTotal * 0.20;
        }
    }
    
    public void calcularMontoFinal(){
        this.montoFinal = this.precioTotal + this.porcentajeAumento;
    }
    
    ///GETTERS Y SETTERS////
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
        Scanner sc = new Scanner(System.in);
        
        if (anioFabricacion <= (new Date().getYear() + 1900)){
            this.anioFabricacion = anioFabricacion;
        } else {
            System.out.println("Año inválido. Ingreselo de nuevo:");
            setAnioFabricacion(sc.nextInt());
        }
    }

    public long getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(long codigoBarras) {
        Scanner sc = new Scanner(System.in);
        
        if (String.valueOf(codigoBarras).length() < 7 || String.valueOf(codigoBarras).length() > 15){
            System.out.println("Código invalido. Ingreselo de nuevo:");
            setCodigoBarras(sc.nextLong());
        } else {
            this.codigoBarras = codigoBarras;
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
