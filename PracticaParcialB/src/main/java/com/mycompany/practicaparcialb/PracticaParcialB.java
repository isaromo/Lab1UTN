package com.mycompany.practicaparcialb;

import java.util.Random;
import java.util.Scanner;

public class PracticaParcialB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salida;
        
        do {
            System.out.println("Ingrese la dimensión de la matriz, debe ser impar y estar entre 5 y 21");
            int n = sc.nextInt();
            while (n < 5 || n > 21 || n % 2 == 0) {
                System.out.println("Ingrese una dimensión válida impar entre 5 y 21");
                n = sc.nextInt();
            }

            int matriz[][] = new int[n][n];

            rellenarMatriz(matriz);
            System.out.println("\nMATRIZ:");
            mostrarMatriz(matriz);
            int arreglo[] = obtenerValoresDiagonal(matriz);
            System.out.println("\n ARREGLO:");
            mostrarArreglo(arreglo);
            int promedio = promedioArreglo(arreglo);
            System.out.println("\n PROMEDIO: " + promedio);
            //clases
            BusquedaValor busqueda = new BusquedaValor();
            int cantidadEncontrada = busqueda.buscarValorPromedioEnMatriz(matriz, promedio);
            if (cantidadEncontrada == 0) {
                System.out.println("No se encontraron coincidencias");
            } else {
                System.out.println("El valor " + promedio + " fue encontrado " + cantidadEncontrada + " vez/veces en el arreglo.");
            }

            System.out.println("Desea iniciar nuevamente la ejecución del programa? 1. SI/ 2. NO");
            salida = sc.nextInt();
        } while (salida == 1);
            
    }
    
    public static void rellenarMatriz(int matriz[][]){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                if (i == j){
                    System.out.println("Ingrese el valor de [" + i + "][" + j + "]");
                    matriz[i][j] = sc.nextInt();
                } else {
                    matriz[i][j] = (int)(random.nextDouble() * 90 + 10);
                }
            }
        }
    }
    
    public static void mostrarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }    
    }
    
    public static int[] obtenerValoresDiagonal(int matriz[][]){
        int arreglo[] = new int[matriz.length];
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                if (i == j){
                    arreglo[i] = matriz[i][j];
                }
            }
        }
        
        return arreglo;
    }
    
    public static void mostrarArreglo(int arreglo[]){
        for (int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " | ");
        }    
    }
    
    public static int promedioArreglo(int arreglo[]){
        int promedio, suma = 0;
        
        for (int i = 0; i < arreglo.length; i++){
            suma += arreglo[i];
        }
        
        promedio = suma / arreglo.length;
        return promedio;
    }
}
