package com.mycompany.integradorapreparcial;

import java.util.Scanner;

public class Parte5_Arrays_EjA_TERMINAR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[] = new int[10];
        rellenarArreglo(arreglo);
    }

    public static void rellenarArreglo(int arreglo[]) {
        Scanner sc = new Scanner(System.in);
        boolean encontrado;
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Valor [" + i + "]");
            arreglo[i] = sc.nextInt();

            if (i >= 1) {
                encontrado = buscarRepetido(arreglo, i);

                while (encontrado) {
                    arreglo[i] = sc.nextInt();
                }
            }
        }
    }

    public static boolean buscarRepetido(int arreglo[], int i) {
        boolean encontrado = false;
        
        for (int j = 0; j < arreglo[i]; j++) {
            encontrado = false;
            if (arreglo[j] == arreglo[i]) {
                encontrado = true;
            }
        }

        if (encontrado == true) {
            System.out.println("El número que ingresó ya está en el arreglo");
        }
        return encontrado;
    }
}
