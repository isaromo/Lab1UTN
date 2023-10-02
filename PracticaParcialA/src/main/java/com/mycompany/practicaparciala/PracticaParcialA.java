package com.mycompany.practicaparciala;

import java.util.Random;
import java.util.Scanner;

public class PracticaParcialA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        
        do {
            System.out.println("Ingrese la dimensión de la matriz. Debe ser un número impar entre 3 y 15");
            int n = sc.nextInt();

            while ((n < 3 || n > 15) || n % 2 == 0) {
                System.out.println("Ingrese una dimensión válida");
                n = sc.nextInt();
            }

            int matriz[][] = new int[n][n];

            rellenarMatriz(matriz, n);
            System.out.println("MATRIZ:");
            mostrarMatriz(matriz, n);
            int arreglo[] = obtenerValoresCentrales(matriz, n);
            System.out.println("\nARREGLO:");
            mostrarArreglo(arreglo);
            ordenarArreglo(arreglo);
            System.out.println("\nARREGLO DESCENDENTE:");
            mostrarArreglo(arreglo);
            System.out.println("\n");
            buscarValorCentralEnMatriz(matriz, matriz[n / 2][n / 2]);
            sc.nextLine();

            System.out.println("\nDesea iniciar nuevamente la ejecución? 1.SI / 2.NO");
            respuesta = sc.nextInt();
        } while (respuesta == 1);
    }
    
    public static void rellenarMatriz(int matriz[][], int n){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        for (int i = 0; i < 1; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Ingrese un entero para el valor [" + i + "][" + j + "]. Debe estar entre 10 y 99");
                matriz[i][j] = sc.nextInt();
                
                while (matriz[i][j] < 10 || matriz[i][j] > 99){
                    System.out.println("Ingrese un valor entre 10 y 99");
                    matriz[i][j] = sc.nextInt();
                }
            }
        }
        
        for (int i = 1; i < n; i++){
            for (int j = 0; j < n; j++){
                matriz[i][j] = (int)(random.nextDouble() * 90 + 10);
            }
        }
    }
    
    public static void mostrarMatriz(int matriz[][], int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
        
    }
    
    public static int[] obtenerValoresCentrales(int[][] matriz, int n){
        int arreglo[] = new int[9];
        int indiceCentral = (int)n/2;
        int ind = 0;
        
        for (int i = indiceCentral-1; i < indiceCentral+2; i++){
            for (int j = indiceCentral-1; j < indiceCentral+2; j++){
                arreglo[ind] = matriz[i][j];
                ++ind;
            }
        }
            
        return arreglo;
    }
    
   public static void mostrarArreglo(int arreglo[]){
       for (int i = 0; i < arreglo.length; i++){
           System.out.print(arreglo[i] + " | ");
       }
   }
   
   public static int[] ordenarArreglo(int arreglo[]){
       //ordeno en descendente
       for (int i = 1; i < arreglo.length; i++) {
                int valor = arreglo[i];
                int j = i - 1;

                while (j >= 0 && arreglo[j] < valor) {
                    arreglo[j + 1] = arreglo[j];
                    j--;
                }

                arreglo[j + 1] = valor;
            }
       return arreglo;
   }
   
   public static void buscarValorCentralEnMatriz(int matriz[][], int valorCentral){
        for (int i = 1; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                if (matriz[i][j] == valorCentral){
                    System.out.println("Valor central (" + valorCentral + ") encontrado en posición [" + i + "][" + j + "]");
                }
            }
        }
   }
}