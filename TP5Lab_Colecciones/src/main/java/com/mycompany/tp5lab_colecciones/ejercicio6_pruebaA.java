//package com.mycompany.tp5lab_colecciones;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ejercicio6 {
//    
//    public void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String value;
//        do {
//            System.out.println("Ingrese un valor para la celda (para salir ingrese 'FIN'):");
//            value = sc.nextLine();
//            
//            if (!value.equals("FIN")) { //if para que no pida la posición si se quiere salir del bucle
//                System.out.println("Posición donde se desea almacenar el valor:");
//                System.out.println("Fila:");
//                int row = sc.nextInt();
//                System.out.println("Columna:");
//                int column = sc.nextInt();
//
//                Celda celda = new Celda();
//                celda.Celda(row, column, value);
//                
//                matrizCuadrada.add(celda);
//            }
//            
//            
//            sc.nextLine(); //limpio el buffer
//        } while (!value.equals("FIN"));
//        
//        
//        
//    }
//
//}
