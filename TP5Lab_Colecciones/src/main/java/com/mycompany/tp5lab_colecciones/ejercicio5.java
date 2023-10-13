package com.mycompany.tp5lab_colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Comparator<Integer> comparator = Collections.reverseOrder();
        ArrayList<Integer> array = new ArrayList<Integer>();  
        System.out.println("Ingrese 10 valores");
        
        for (int i = 0; i < 10; i++){
            array.add(sc.nextInt());
        }
        
        ArrayList<Integer> arrayAsc = new ArrayList<Integer>();
        ArrayList<Integer> arrayDesc = new ArrayList<Integer>();
        arrayAsc.addAll(array);
        arrayDesc.addAll(array);
        
        Collections.sort(arrayAsc);
        Collections.sort(arrayDesc, comparator);
        
        System.out.println("ASCENDENTE:");
        for (Integer n : arrayAsc){
            System.out.print(n + " | ");
        }
        System.out.println("\nDESCENDENTE:");
        for (Integer n : arrayDesc){
            System.out.print(n + " | ");
        }
    }
}
