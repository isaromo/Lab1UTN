package com.mycompany.tp3lab;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TP3Lab_Unid {
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número del ejercicio para correrlo.");
        int numEjercicio = sc.nextInt();
        
        switch (numEjercicio){
            case 1:
                Ejercicio1();
                break;
            case 2:
                Ejercicio2();
                break;
            case 3:
                Ejercicio3();
                break;
            case 4:
                Ejercicio4();
                break;
            case 5:
                Ejercicio5();
                break;
            case 6:
                Ejercicio6();
                break;
            case 7:
                Ejercicio7();
                break;
            case 8:
                Ejercicio8();
                break;
            case 9:
                Ejercicio9();
                break;
            case 10:
                Ejercicio10();
                break;
            default:
                System.out.println("Ese ejercicio no existe :/");
                break;
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void Ejercicio1(){
        System.out.println("¿Qué sucede si tratamos de acceder un elemento fuera del tamaño del array?");
        System.out.println("Sucede una excepción llamada \"ArrayIndexOutOfBoundsException\"."); 
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    public static void Ejercicio2(){
/* Crea un array o arreglo unidimensional con un tamaño de 5, asignale los valores numéricos manualmente
(los que tú quieras) y muestralos por pantalla. Solicite los números mediante un bucle.*/
    
        Scanner sc = new Scanner(System.in);
        int [] arreglo = new int[5];
         //solicito nums
        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese el valor " + i);
            arreglo[i] = sc.nextInt();
        }
         //muestro nums
        for (int i = 0; i < 5; i++){
            if (i < 4){
                System.out.print(arreglo[i] + " | ");
            }else{
                System.out.println(arreglo[i]);
            }
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     public static void Ejercicio3(){
/*Crea un array o arreglo unidimensional donde tú le indiques el tamaño por teclado y crear una función que rellene el
array o arreglo con los múltiplos de un numero pedido por teclado. Por ejemplo, si defino un array de tamaño 5 y elijo
un 3 en la función, el array contendrá 3, 6, 9, 12, 15. Muéstralos por pantalla usando otra función distinta.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo");
        int tamaño = sc.nextInt();
        int arreglo[] = new int[tamaño];
        
        RellenarArregloEj3(arreglo, tamaño);
        MostrarArregloEj3(arreglo, tamaño);
     }
    
    public static void RellenarArregloEj3(int arreglo[], int tamaño){
        System.out.println("Ingrese un número");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for (int i = 0; i < tamaño; i++){
            arreglo[i] = num * (i+1);
        }
    }

    public static void MostrarArregloEj3(int arreglo[], int tamaño){
         for (int i = 0; i < tamaño; i++){
            if (i < tamaño-1){
                System.out.print(arreglo[i] + " | ");
            }else{
                System.out.println(arreglo[i]);
            }
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    public static void Ejercicio4(){
/*Escriba una aplicación que:
a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un arreglo unidimensional.
b) determine y muestre el mayor de los números en el arreglo
c) determine y muestre el menor de los números del arreglo calcule y muestre el rango (diferencia entre el mayor y el menor) de los elementos en el arreglo*/
        double arreglo[] = new double[20];
        RellenarArregloEj4(arreglo);
        CalculosEj4(arreglo);

    }
    
    public static void RellenarArregloEj4(double arreglo[]){
        System.out.println("Ingrese 20 números decimales");
        Scanner sc = new Scanner(System.in);
       
         for (int i = 0; i < 20; i++){
            arreglo[i] = sc.nextDouble();
        }
    }
    
     public static void CalculosEj4(double arreglo[]){
        double mayor = 0.0;
        double menor = arreglo[0];
        
        for (int i = 0; i < 20; i++){
            if (arreglo[i] > mayor){
                mayor = arreglo[i];
            }
            
            if (arreglo[i] < menor){
                menor = arreglo[i];
            }
        }
        System.out.println("El mayor es: " + mayor + "\nEl menor es: " + menor + "\nDiferencia de " + (mayor-menor));
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
     public static void Ejercicio5(){
/* Escriba una aplicación para almacenar aleatoriamente 20 números enteros positivos pares del 1 al 100, de los cuales se desea saber:
a) su promedio aritmético
b) cuántos de los números son iguales al promedio aritmético
c) cuántos de los números son mayores que el promedio aritmético
d) cuántos de los números son menores que el promedio aritmético */
        
        int arreglo[] = new int[20];
        RellenarArregloEj5(arreglo);

     }

    public static void RellenarArregloEj5(int arreglo[]){
            int numRandom, suma = 0;
            
         for (int i = 0; i < 20; i++){
            do{
                numRandom = (int) Math.floor(Math.random() * 100) + 1;
            }while(numRandom % 2 != 0);
            
            arreglo[i] = numRandom;
            suma += arreglo[i];
        }
         
         MostrarArregloEj3(arreglo, 20);
         CalculosArregloEj5(arreglo, suma);
    }

    public static void CalculosArregloEj5(int arreglo[], int suma){
        int promedio = suma/20;
        int contadorIguales = 0, contadorMayores = 0, contadorMenores = 0;
             
        for (int i = 0; i < 20; i++){
            if(arreglo[i] == promedio){
                contadorIguales++;
            }else if (arreglo[i] > promedio){
                contadorMayores++;
            }else{
                contadorMenores++;
                }
            } 
        System.out.println("PROMEDIO: " + promedio + "\nIguales al promedio: " + contadorIguales + "\nMayores al promedio: " + contadorMayores + "\nMenores al promedio: " + contadorMenores);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
    public static void Ejercicio6(){
/* Realice una búsqueda secuencial en un arreglo unidimensional de tamaño 50 generado aleatoriamente mediante la función java random.
Realice una búsqueda secuencial de la siguiente forma:
- se lee el valor que se desea buscar,
- se compara la primera posición;
- si son iguales,
- fin de la búsqueda.
- De lo contrario, compararlo con la segunda posición, y así sucesivamente.
- Si se llega al final del arreglo y no se encontró el valor, debe indicarlo con un mensaje apropiado.
- Si se encuentra, se debe especificar la posición que ese valor ocupa en el arreglo por primera vez.*/
        int arreglo[] = new int[50];
        RellenarArregloEj6(arreglo);
        BusquedaSecuencialEj6(arreglo);
    }
      
    public static void RellenarArregloEj6(int arreglo[]){
        Random random = new Random();
        
        for (int i = 0; i < 50; i++){
            arreglo[i] = random.nextInt(101);
        }
        
        MostrarArregloEj3(arreglo, 50);
    }
    
    public static void BusquedaSecuencialEj6(int arreglo[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué número entero desea buscar?");
        int numero = sc.nextInt();
        boolean condicion = false;
        
        for (int i = 0; i < 50; i++){
            if (arreglo[i] == numero){
                condicion = true;
                System.out.println("ENCONTRADO! Posición arreglo[" + i + "]");
                break;
            }
        }
        if (condicion == false){
                System.out.println(numero + " no está en el arreglo :(");
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
    public static void Ejercicio7(){
/*Escriba una aplicación que solicite y cargue en un arreglo 10 dígitos enteros, luego cree dos nuevos arreglos y asigne
al primero los números ingresados por el usuario de forma ascendente y en el segundo de forma descendente. Muestre los 2 arreglos por pantalla.*/
    
        int arreglo[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 10 dígitos enteros");
        //relleno arreglo//
        for (int i = 0; i < 10; i++){
            arreglo[i] = sc.nextInt();
        }
       
        RellenarArreglosEj7(arreglo);
    }
    
    public static void RellenarArreglosEj7(int arreglo[]){
        int arregloAsc[] = Arrays.copyOf(arreglo, 10);
        Arrays.sort(arregloAsc);
        // ↑ ordeno el array ascendente con la función y lo muestro ↓ //
        System.out.println("ASCENDENTE:");
        MostrarArregloEj3(arregloAsc, 10);
        
        int arregloDesc[] = Arrays.copyOf(arregloAsc, 10);
        // ↑ copio el array ascendente en el descendente y doy vuelta los valores ↓ //
        for (int i = 0; i < 10; i++){
            arregloDesc[i] = arregloAsc[(arregloAsc.length - 1) - i]; 
        }
        // lo muestro //
        System.out.println("DESCENDENTE:");
        MostrarArregloEj3(arregloDesc, 10);
        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
    public static void Ejercicio8(){
/*Solicite al usuario el ingreso de una cadena de números separadas por guiones medio, por ejemplo:
45-9-8-6-45-23-21-74-96-32-45-25
Posteriormente aplique el método SPLIT de los String de Java para convertir la cadena en un arreglo,
y calcular la suma total de los elementos y el valor promedio calculado.*/ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese números separados por guiones medio");
        String cadenaNumeros = sc.nextLine();
        String arreglo[] = cadenaNumeros.split("-");
        //muestro arreglo//
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
        }
        
        calculosEj8(arreglo);
    }
    
    public static void calculosEj8(String arreglo[]){
        int arregloConvertido[] = new int[arreglo.length];
        int suma = 0;
        //convierto el arreglo String en arreglo int//
        for (int i = 0; i < arreglo.length; i++){
            arregloConvertido[i] = Integer.parseInt(arreglo[i]);
            suma += arregloConvertido[i];
        }
       
        System.out.println("Suma total de los elementos: " + suma + "\nPromedio: " + suma/arreglo.length);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
     public static void Ejercicio9(){
/*En Argentina cada persona está identificada con un Documento Nacional de Identidad (DNI) en el que figura un número y una letra, por ejemplo 56999545W
La letra que sigue al número se calcula siguiendo la metodología que vamos a indicar. Crea un programa que calcule la letra de un DNI
a partir del número de DNI que introduzca el usuario. Es decir, se debe pedir el DNI sin la letra por teclado y el programa nos devolverá el DNI completo (con la letra).
Para calcular la letra, se debe tomar el resto de dividir nuestro número de DNI entre 23. El resultado debe estar por tanto entre 0 y 22.
Crea un método obtenerLetra(int numeroDNI) donde según el resultado de la anterior fórmula busque en un array de caracteres
la posición que corresponda a la letra. Esta es la tabla de caracteres:
Posición     0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
Letra        T R W A G M Y F P D X  B  N  J  Z   S  Q  V  H  L C  K  E
Por ejemplo, si introducimos el DNI 20267079, el resto de dividirlo por 23 sería 8, luego la letra sería la P, que es la que ocupa esa posicion en la matriz de caracteres.*/   
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su DNI sin puntos");
        int dni = sc.nextInt();
        
       obtenerLetra(dni);
     }
    
    public static void obtenerLetra(int dni){
       int posicionLetra = dni % 23;
       char arregloLetras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
       String letra = "";
       
       for (int i = 0; i < 23; i++){
           if (i == posicionLetra){
               letra = String.valueOf(arregloLetras[i]);
           }
        }
       
        System.out.println("DNI completo:");
        System.out.println(dni + letra);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
     public static void Ejercicio10(){
/*Dado 2 array de enteros, el primero de tamaño 5 y el segundo de tamaño 10, pedir los valores numéricos enteros para cargar cada uno de los arreglos,
cree un tercer arreglo de tamaño 5 que contenga en casa posición la suma de la multiplicación de cada elemento del array uno por cada elemento del array 2
ARRAY3 = (posición 0 del arreglo 1 * posición 0 del arreglo 2) + (posición 0 del arreglo 1 * posición 1 del arreglo 2) + (posición 0 del arreglo 1 * posición 2 del arreglo 2) + ………….+ (posición 4 del arreglo 1 * posición 9 del arreglo 2)
Use 2 estructuras iterativas anidadas para realizar el cálculo y asignación de los valores en el 3 array.*/
        int arreglo5[] = new int[5];
        int arreglo10[] = new int[10];
        int arregloSumas[] = new int[10];
        
        RellenarArreglosEj10(arreglo5, 5);
        RellenarArreglosEj10(arreglo10, 10);
        CalculosArreglosEj10(arreglo5, arreglo10, arregloSumas);
        
        for (int i = 0; i < 5; i++){
            System.out.print(arregloSumas[i] + " ");
        }

    }

     public static void RellenarArreglosEj10(int arreglo[], int tamaño){
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese los valores del arreglo de tamaño " + tamaño);
         
         for (int i = 0; i < tamaño; i++){
           arreglo[i] = sc.nextInt();
        }
     }
     
     public static void CalculosArreglosEj10(int arreglo5[], int arreglo10[], int arregloSumas[]){
         int suma;
         
         for (int i = 0; i < 5; i++){
             suma = 0;
             for (int j = 0; j < 10; j++){
                 suma += (arreglo5[i] * arreglo10[j]);
             }
             arregloSumas[i] = suma;
         }
    }
}