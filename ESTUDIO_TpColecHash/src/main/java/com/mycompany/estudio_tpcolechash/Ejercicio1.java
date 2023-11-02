package com.mycompany.estudio_tpcolechash;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        HashMap<String, Long> agenda = new HashMap<String, Long>();
        int option, exit;
        
        do {
            showMenu(); //muestro el menú
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("**CARGAR AGENDA**");
                    do {
                        loadData(agenda);

                        System.out.println("¿Cargar otro contacto? 1.SÍ/2.NO");
                        exit = sc.nextInt();
                    } while (exit == 1);

                    break;
                case 2:
                    System.out.println("**BUSCAR TELÉFONO POR NOMBRE**");
                    searchPhone(agenda);
                    break;
                case 3:
                    System.out.println("**LISTAR AGENDA**");
                    showAgenda(agenda);
                    break;
                case 4:
                    break;
            }
        } while (option != 4);          
    }

    public static void showMenu(){
        System.out.println("--------MENÚ--------");
        System.out.println("1. Cargar datos en la Agenda");
        System.out.println("2. Buscar Teléfono por Nombre");
        System.out.println("3. Listar Agenda");
        System.out.println("4. Salir");
        System.out.println("--------------------");
    }

    public static void loadData(HashMap<String,Long> agenda){
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        
        String name;
        long phone;
        
        System.out.println("Nombre:");
        name = scStr.nextLine();
        System.out.println("Teléfono:");
        phone = sc.nextLong();
        
        if (agenda.containsKey(name)){
            System.out.println("*ERROR* ¡Ese contacto ya ha sido agregado!");
        } else {
            agenda.put(name, phone);
        }
    }
    
    public static void searchPhone(HashMap<String,Long> agenda){
        Scanner scStr = new Scanner(System.in);
        System.out.println("Nombre de la persona a buscar:");
        String name = scStr.nextLine();
        
        if (agenda.containsKey(name)){
            System.out.println("Teléfono: " + agenda.get(name));
        } else {
            System.out.println("La persona buscada no se encuentra en la agenda");
        }
    }
    
    public static void showAgenda(HashMap<String,Long> agenda){
        System.out.println("-------AGENDA-------");
        System.out.format("%1$-15s|%2$-20s\n", "Nombre", "Teléfono");
        
        for (String n : agenda.keySet()){
            System.out.format("%1$-20s|%2$-20s\n", n, agenda.get(n));
        }
    }
}
