package com.mycompany.tp5lab_colecciones;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random random = new Random();
        
        int rand;
        boolean found = false;
        
        for (int i = 0; i < 50; i++) {
            rand = random.nextInt(101);            
            array.add(rand);
        }
        
        System.out.println("Ingrese el número a buscar");
        int num = sc.nextInt();
        
        for (Integer n : array){
            System.out.print(n + " | ");
        }
        
        System.out.println("");
        for (int i = 0; i < 50; i++) {
            if (num == array.get(i).intValue()) {
                System.out.println("(" + num + ") encontrado en posición [" + i + "]");
                found = true;
                break;
            }
        }
        
        if (found == false){
            System.out.println("(" + num + ") no fue encontrado en el array");
        }
    }

}
