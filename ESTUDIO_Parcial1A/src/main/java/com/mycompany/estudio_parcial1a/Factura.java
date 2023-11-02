package com.mycompany.estudio_parcial1a;

import java.util.Scanner;

public class Factura {
    
    private String nombre;
    private String fecha;
    private long nroFactura;
    private String razonSocial; //cliente
    private long cuitCliente; //cliente
    private String tipoPago;
    
    //secondary items
    private double montoTotalItems;
    private double recargo;
    private double montoFinal;
    String[][] itemsFactura;

    public void asignarTamañoMatriz(int filas){
        this.itemsFactura = new String[filas][5];
    }
    
    public void asignarFilaArticulo(String[] articuloEncontrado, int fila){
        this.itemsFactura[fila][0] = articuloEncontrado[0];
        this.itemsFactura[fila][1] = articuloEncontrado[1];
        this.itemsFactura[fila][2] = articuloEncontrado[2]; //solo hasta precio unitario
    }
    
    public void asignarCantidadYSubtotal(int fila, double cantidad){
        this.itemsFactura[fila][3] = String.valueOf(cantidad);
        this.itemsFactura[fila][4] = String.valueOf(cantidad * Integer.parseInt(this.itemsFactura[fila][2]));
    }
    
    public void asignarMontoTotal(){
        double montoTotal = 0;
        for (int i = 0; i < this.itemsFactura.length; i++){
            montoTotal += Double.parseDouble(this.itemsFactura[i][4]);
        }
        
        this.montoTotalItems = montoTotal;
    }
    
    public void asignarRecargo(){
        if (this.tipoPago.equals("C")){
            this.recargo = 0;
        } else if (this.tipoPago.equals("TD")){
            this.recargo = this.montoTotalItems * 0.5;
        } else {
            this.recargo = this.montoTotalItems * 0.10;
        }
    }
    
    public void asignarMontoFinal(){
        this.montoFinal = this.montoTotalItems + this.recargo;
    }
    
    ///GETTERS AND SETTERS
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public long getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(long nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public long getCuitCliente() {
        return cuitCliente;
    }

    public void setCuitCliente(long cuitCliente) {
        this.cuitCliente = cuitCliente;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        Scanner scStr = new Scanner(System.in);
        
        if (tipoPago.equals("C") || tipoPago.equals("TC") || tipoPago.equals("TD")){
            this.tipoPago = tipoPago;
        } else {
            System.out.println("**ERROR** Tipo de pago inválido. Ingréselo de nuevo:");
            setTipoPago(scStr.nextLine());
        }
    }

    public double getMontoTotalItems() {
        return montoTotalItems;
    }

    public void setMontoTotalItems(double montoTotalItems) {
        this.montoTotalItems = montoTotalItems;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public String[][] getItemsFactura() {
        return itemsFactura;
    }

    public void setItemsFactura(String[][] itemsFactura) {
        this.itemsFactura = itemsFactura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
