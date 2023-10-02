package com.mycompany.integradorapreparcial;

import java.util.Scanner;

public class Parte5_Arrays_EjB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*******RESTAURANTE LA TRANQUERA*******");
        System.out.println("Ingrese la cantidad de comensales");
        int customers = sc.nextInt();
        while (customers < 1 || customers > 6) { //valido que los comensales esten entre 1 y 6
            System.out.println("Ingrese una cantidad válida de comensales");
            customers = sc.nextInt();
        }

        int menus[] = new int[customers];
        int price = 0;
        int total = 0;

        for (int i = 0; i < customers; i++) { //pregunto que menú pidió cada comensal y se lo introduzco al arreglo
            System.out.println("Menú ordenado por el comensal " + (i + 1) + " (1, 2 ó 3)");
            menus[i] = sc.nextInt();
        }

        for (int i = 0; i < customers; i++) {
            switch (menus[i]) {
                case 1:
                    price = 2500;
                    break;
                case 2:
                    price = 3200;
                    break;
                case 3:
                    price = 4500;
                    break;
            }

            System.out.println("Comensal " + (i + 1) + " va a pedir el menú " + menus[i] + " con precio $" + price);
            total += price;
        }

        System.out.println("El costo total de la mesa es de $" + total);
    }

}
