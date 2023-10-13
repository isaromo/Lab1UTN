package com.mycompany.tp7_colechash;

import java.util.HashSet;

public class Computadora {
    private String marca;
    private String modelo;
    HashSet<ComponenteCPU> listaComponentes = new HashSet<ComponenteCPU>();

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

    public HashSet<ComponenteCPU> getListaComponentes() {
        return listaComponentes;
    }

    public void setListaComponentes(HashSet<ComponenteCPU> listaComponentes) {
        this.listaComponentes = listaComponentes;
    }
}
