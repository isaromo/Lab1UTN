package com.mycompany.tp5lab_colecciones;

import java.util.ArrayList;
import java.lang.Math;

public class ejercicio3 {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int num, sum = 0, average, likeAvrg = 0, lowerAvrg = 0, higherAvrg = 0;

        for (int i = 0; i < 20; i++) {
            do {
                num = (int) (Math.random() * (100 - 1) + 1); // random * (max-min) + min
            } while (num % 2 != 0);

            array.add(num);
            sum += num;
        }
        
        for (Integer n : array){
            System.out.print(n + " | ");
        }
        
        average = sum / 20;
        
        for (Integer n : array){
           if (n == average){
               ++likeAvrg;
           } else if (n < average){
               ++lowerAvrg;
           } else {
               ++higherAvrg;
           }
        }
        
        System.out.println("\nPROMEDIO: " + average);
        System.out.println("Iguales al promedio: " + likeAvrg);
        System.out.println("Mayores al promedio: " + higherAvrg);
        System.out.println("Menores al promedio: " + lowerAvrg);
    }

}
