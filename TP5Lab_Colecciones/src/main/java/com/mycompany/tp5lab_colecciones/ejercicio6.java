package com.mycompany.tp5lab_colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio6 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value;
        int row, column;
        
        do {
            System.out.println("Ingrese un valor para la celda (para salir ingrese 'FIN'):");
            value = sc.nextLine();
            
            if (!value.equals("FIN")) { //if para que no pida la posición si se quiere salir del bucle
                System.out.println("Posición donde se desea almacenar el valor:");
                System.out.println("Fila:");
                row = sc.nextInt();
                System.out.println("Columna:");
                column = sc.nextInt();
                sc.nextLine(); //limpio el buffer
                Celda celda = new Celda();
                celda.Celda(row, column, value);
                Matriz.matriz.add(celda);
                
            }
        } while (!value.equals("FIN"));
        
        showMatriz(Matriz.matriz);
        /////método para retornar valor específico:
        System.out.println("");
        System.out.println("**BUSCAR VALOR ALMACENADO**\nIngrese fila:");
        row = sc.nextInt();
        System.out.println("Ingrese columna:");
        column = sc.nextInt();
        returnValue(row, column);
    }
    
    public static void showMatriz(ArrayList<Celda> matriz){
        for (Celda c: matriz){
            System.out.println("Valor: " + c.getValue() + "| Fila: " + c.getRow() + "| Columna: " + c.getColumn() + "\n");
        }
    }
    
    public static void returnValue(int row, int column){
        boolean found = false;
        
        for (Celda c: Matriz.matriz){
            if (c.getRow() == row && c.getColumn() == column){
                System.out.println("El valor almacenado es: " + c.getValue());
                found = true;
                break;
            }
        }
        
        if (found == false){
            System.out.println("Fila y columna no corresponden a la matriz");
        }
    }
}
