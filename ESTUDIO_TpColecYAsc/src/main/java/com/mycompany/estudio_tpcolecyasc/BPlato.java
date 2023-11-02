package com.mycompany.estudio_tpcolecyasc;

import java.util.ArrayList;

public class BPlato {
    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    ArrayList<BIngrediente> listaIngredientes = new ArrayList<BIngrediente>();

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEsBebida() {
        return esBebida;
    }

    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }

    public ArrayList<BIngrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<BIngrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
}
