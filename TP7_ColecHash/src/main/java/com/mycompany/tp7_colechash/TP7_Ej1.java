package com.mycompany.tp7_colechash;

import java.util.HashMap;
import java.util.Scanner;

public class TP7_Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        HashMap<String,Long> agendaTel = new HashMap<String,Long>();
        int input;
        String fullName, exit;
        long phoneNum;
        
        do {
            mostrarMenu();
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("**CARGAR DATOS**");
                    do {
                        System.out.println("Nombre completo:");
                        fullName = scStr.nextLine();
                        System.out.println("Teléfono:");
                        phoneNum = sc.nextLong();
                        if (agendaTel.containsKey(fullName)){
                            System.out.println("\n**ERROR** Ese contacto ya ha sido agregado");
                            break;
                        } else {
                            agendaTel.put(fullName, phoneNum);
                        }

                        System.out.println("¿Desea agregar otro contacto? S/N");
                        exit = scStr.nextLine().toUpperCase();
                    } while (exit.equals("S"));
                    break;
                    
                case 2:
                    System.out.println("**BUSCAR TELÉFONO POR NOMBRE**");
                    System.out.println("Nombre a buscar:");
                    fullName = scStr.nextLine();
                    
                    if (agendaTel.containsKey(fullName)){
                        System.out.println("Teléfono: " + agendaTel.get(fullName));
                    } else {
                        System.out.println("La persona buscada no se encuentra en la agenda");
                    }
                    break;
                
                case 3:
                    System.out.println("**AGENDA**");
                    
                    for (String clave : agendaTel.keySet()){
                        System.out.println("Nombre: " + clave + "\nTeléfono: " + agendaTel.get(clave));
                        System.out.println("------------------------------------");
                    }
                    break;
            }
            System.out.println("\n");
        } while (input < 4);
    }
    
    public static void mostrarMenu(){
        System.out.println("-----------MENÚ-----------");
        System.out.println("1. Cargar Datos en la Agenda");
        System.out.println("2. Buscar Teléfono por Nombre");
        System.out.println("3. Listar Agenda");
        System.out.println("4. Salir");
        System.out.println("--------------------------");
    }
}
