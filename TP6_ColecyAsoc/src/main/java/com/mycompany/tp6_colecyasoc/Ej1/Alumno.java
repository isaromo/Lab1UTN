package com.mycompany.tp6_colecyasoc.Ej1;
import java.util.ArrayList;

public class Alumno {
    private String nombreCompleto;
    private long legajo;
    
    ArrayList<Nota> arrayNotas = new ArrayList<Nota>();

    public double calculoPromedio(ArrayList<Nota> notas) {
        double suma = 0;
        
        for (Nota nota : notas){
            suma += nota.getNotaExamen();
        }
        
        double promedio = suma / notas.size();
        return promedio;
    }
    
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

    public ArrayList<Nota> getArrayNotas() {
        return arrayNotas;
    }

    public void setArrayNotas(ArrayList<Nota> arrayNotas) {
        this.arrayNotas = arrayNotas;
    }
}
