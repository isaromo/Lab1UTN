package com.mycompany.tp5lab_colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        System.out.println("Ingrese 20 números decimales");
        double num;
        int highest = 0, lowest = 0;
        
        for (int i = 0; i < 20; i++){
            num = sc.nextDouble();
            array.add((int)num);
            
            if (num > highest){
                highest = (int)num;
            }
            
            if (i == 0){        //en la primer recorrida del ciclo se asigna el primer valor como el menor.
                lowest = (int)num;
            } else {
                if (num < lowest){  // si en las siguientes recorridas un num es menor al menor, se reasigna.
                    lowest = (int)num;
                }
            }
        }
        
        for (Integer n : array){
            System.out.print(n + " | ");
        }
        System.out.println("");
        System.out.println("MAYOR: " + highest + "\nMENOR: " + lowest + "\nRANGO: " + (highest-lowest));
    }
}
