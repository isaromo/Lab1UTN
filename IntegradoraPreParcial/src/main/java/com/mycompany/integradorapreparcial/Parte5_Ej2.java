package com.mycompany.integradorapreparcial;

import java.util.Scanner;

public class Parte5_Ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cant. de nums a ingresar:");
        int cant = sc.nextInt();
        double suma = 0;
        
        while (cant <= 0){
            System.out.println("Ingrese una cantidad valida");
            cant = sc.nextInt();
        }

        for (int i = 1; i <= cant; i++){
            System.out.println("Número " + i);
            suma += sc.nextInt();
        }
        
        System.out.println("Promedio: " + suma/cant);
    }
    
}
