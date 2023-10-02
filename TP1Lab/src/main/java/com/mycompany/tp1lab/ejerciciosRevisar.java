package com.mycompany.tp1lab;

import java.util.Scanner;

public class ejerciciosRevisar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un monto:");
        
        double plata = sc.nextDouble();
        cantMonedas(plata, 200);
        cantMonedas(plata, 100);
        /*
        cantMonedas(plata, 50);
        cantMonedas(plata, 20);
        cantMonedas(plata, 10);
        cantMonedas(plata, 5);
        cantMonedas(plata, 2);
        cantMonedas(plata, 1);
        cantMonedas(plata, 0.5);
        cantMonedas(plata, 0.25);
        cantMonedas(plata, 0.10);
        cantMonedas(plata, 0.04);*/

    }

    public static void cantMonedas(double plata, double valorMoneda) {
        int cantidad = 0;
        if (plata > valorMoneda){
            cantidad = (int)(plata / valorMoneda);
            plata = plata - cantidad * valorMoneda;
        }
        
        System.out.println("Billetes de $" + valorMoneda + ": " + cantidad);
        System.out.println("Plata: " + plata);
        
    }
    
}
