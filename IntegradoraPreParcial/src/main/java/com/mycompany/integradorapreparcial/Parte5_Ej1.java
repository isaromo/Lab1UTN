package com.mycompany.integradorapreparcial;

import java.util.Scanner;

public class Parte5_Ej1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primer cadena");
        String cadena1 = sc.nextLine();
        System.out.println("Ingrese la segunda cadena");
        String cadena2 = sc.nextLine();
        
        if (cadena2.length() > cadena1.length()){
            System.out.println("La segunda cadena es más grande");
        } else {
            if (cadena1.contains(cadena2)){
                System.out.println("ENCONTRADO");
            } else {
                System.out.println("NO ENCONTRADO");
            }
        }
    }
    
}
