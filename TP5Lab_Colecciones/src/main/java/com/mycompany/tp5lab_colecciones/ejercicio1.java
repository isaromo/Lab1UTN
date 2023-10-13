package com.mycompany.tp5lab_colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();  
        System.out.println("Ingrese valores. Para terminar ingrese un valor menor a 0");
        int num = sc.nextInt();
        
        while (num >= 0){
            numbers.add(num);
            num = sc.nextInt();
        }
        
        for (Integer n : numbers){
            System.out.print(n + " | ");
        }
    }
}
