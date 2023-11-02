package com.mycompany.estudio_tpcolecciones;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class ESTUDIO_TpColecciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int numero;
        
        //EJERCICIO 1
        /*
        System.out.println("Ingrese valores numéricos. Para salir ingrese un número negativo");
        
        do{
            numero = sc.nextInt();
            if (numero >= 0){
                numeros.add(numero);
            }
        } while (numero >= 0);
        
        for (Integer n : numeros){
            System.out.print(n);
            System.out.print(" | ");
        }
        */ 
        
        //EJERCICIO 2
        
        /*
        int counter = 0;
        double highest = 0, lowest = 0;
        System.out.println("Ingrese valores decimales.");
        
        while (counter < 9){
            numero = sc.nextDouble();
            numeros.add(numero);
            
            if (counter == 0){
                highest = numero;
                lowest = numero;
            } else {
                if (numero > highest){
                    highest = numero;
                }
                
                if (numero < lowest){
                    lowest = numero;
                }
            }
            
            counter ++;
        }
        
        System.out.println("MAYOR: " + highest + "\nMENOR: " + lowest + "\nRANGO DE DIFERENCIA: " + (highest-lowest));
        */
        
        //EJERCICIO 3
        /*
        int summation = 0, average;
        int equal = 0, higher = 0, lower = 0;
        
        for (int i = 0; i < 20; i++){
            int random = (int) Math.floor(Math.random() * (100 - 1) + 1);
            numeros.add(random);
            
            summation += random;
        }
        
        average = summation / 20;
        
        System.out.println("PROMEDIO: " + average);
        
        for (Integer n : numeros){
            if (n > average){
                higher++;
            } else if (n < average){
                lower++;
            } else {
                equal++;
            }
        }
        
        System.out.println("IGUAL AL PROMEDIO: " + equal);
        System.out.println("MAYOR AL PROMEDIO: " + higher);
        System.out.println("MENOR AL PROMEDIO: " + lower);
        */
        
        //EJERCICIO 4
        /*
        Random r = new Random();
        int num;
        boolean found = false;
        
        for (int i = 0; i < 50; i++){
            int random = r.nextInt(100);
            numeros.add(random);
        }
        
        for (Integer n : numeros){
            System.out.print(n + " | ");
        }
        
        System.out.println("Valor a buscar: ");
        num = sc.nextInt();
        
        for (int i = 0; i<50; i++){
            if (numeros.get(i) == num){
                System.out.println(num + " encontrado en la posición " + i + "!");
                found = true;
                break;
            }
        }
        
        if (found == false){
            System.out.println(num + " no encontrado :(");
        }
        */
        
        //EJERCICIO 5
        /*
        int counter = 0;
        System.out.println("Ingrese valores");
        
        while (counter < 9){
            numeros.add(sc.nextInt());
            counter++;
        }
        
        ArrayList<Integer> nAsc = new ArrayList<Integer>();
        ArrayList<Integer> nDesc = new ArrayList<Integer>();
        Comparator<Integer> comparador = Collections.reverseOrder();
        nAsc.addAll(numeros);
        nDesc.addAll(numeros);
        
        
        //ASCENDENTE:
        Collections.sort(nAsc);
        //DESCENDENTE:
        Collections.sort(nDesc, comparador);
        
        for (Integer n : numeros){
            System.out.print(n + " | ");
        }
        System.out.println("\nASCENDENTE:");
        for (Integer n : nAsc){
            System.out.print(n + " | ");
        }
        
        System.out.println("\nDESCENDENTE:");        
        for (Integer n : nDesc){
            System.out.print(n + " | ");
        }
        */
        
        //EJERCICIO 6
        ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
        Scanner scStr = new Scanner(System.in);
        
        while (true){
            Celda celda = new Celda();
            System.out.println("Valor para la celda: ");
            celda.setValor(scStr.nextLine().toUpperCase());
            
            if (celda.getValor().equals("FIN")){
                break;
            }
            
            System.out.println("Fila: ");
            celda.setFila(sc.nextInt());
            System.out.println("Columna: ");
            celda.setColumna(sc.nextInt());

            matrizCuadrada.add(celda);
        }
        
        for (Celda c : matrizCuadrada){
            System.out.print("[" + c.getFila() + "][" + c.getColumna() + "] = " + c.getValor());
            System.out.println("\n");
        }
        
        System.out.println("Fila a buscar: ");
        int findFila = sc.nextInt();
        System.out.println("Columna a buscar: ");
        int findColumna = sc.nextInt();
        findValue(matrizCuadrada, findFila, findColumna);
    }
    
    public static void findValue(ArrayList<Celda> matrizCuadrada, int fila, int columna){
        boolean found = false;
        
        for (Celda c : matrizCuadrada){
            if (c.getFila() == fila && c.getColumna() == columna){
                found = true;
                System.out.println("El valor asignado es: " + c.getValor());
            }
        }   
        
        if (found == false){
            System.out.println("La fila y columna indicada no han sido asignadas");
        }
        
    } 
}
