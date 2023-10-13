package com.mycompany.tp5lab_colecciones;

import java.util.ArrayList;

public class Matriz {
    public static ArrayList<Celda> matriz = new ArrayList<Celda>();

    public static ArrayList<Celda> getMatriz() {
        return matriz;
    }

    public static void setMatriz(ArrayList<Celda> matriz) {
        Matriz.matriz = matriz;
    }
}
