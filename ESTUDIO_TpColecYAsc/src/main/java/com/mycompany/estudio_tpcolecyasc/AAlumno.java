package com.mycompany.estudio_tpcolecyasc;

import java.util.ArrayList;
import java.util.List;

public class AAlumno {
    private String nombreCompleto;
    private long legajo;
    List<ANota> listaNotas = new ArrayList<ANota>();

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public List<ANota> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(List<ANota> listaNotas) {
        this.listaNotas = listaNotas;
    }
    
    public void average(){
        double summation = 0;
        
        for (ANota nota : listaNotas){
            summation += nota.getNotaExamen();
        }
        
        System.out.println("PROMEDIO: " + summation / listaNotas.size());
    }
}
