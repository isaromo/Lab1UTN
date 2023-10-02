package com.mycompany.integradorapreparcial;

import java.util.Scanner;

public class Parte5_Ej3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena");
        String cadena = sc.nextLine();
        int contador = 0;
        mostrarCaracteres(cadena, contador);
    }
    public static void mostrarCaracteres(String cadena, int contador){
        if (contador == cadena.length()-1){
            System.out.println(cadena.charAt(contador));
        } else {
            System.out.println(cadena.charAt(contador));
            mostrarCaracteres(cadena, ++contador);
        }
    }
}
