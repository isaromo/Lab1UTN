package com.mycompany.practicaparcialb;

public class BusquedaValor {
    int valorBuscado;
    int cantidadEncontrada;
    
    public int buscarValorPromedioEnMatriz(int matriz[][], int valorBuscado){
        this.valorBuscado = valorBuscado;
        this.cantidadEncontrada = cantidadEncontrada;
        cantidadEncontrada = 0;
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                if (valorBuscado == matriz[i][j]){
                    ++cantidadEncontrada;
                }
            }
        }
        
        return cantidadEncontrada;
    }
    
}
