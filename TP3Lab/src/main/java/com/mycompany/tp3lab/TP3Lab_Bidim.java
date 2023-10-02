package com.mycompany.tp3lab;

import java.util.Scanner;

public class TP3Lab_Bidim {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número del ejercicio para correrlo.");
        int numEjercicio = sc.nextInt();
        
        switch (numEjercicio){
            case 1:
                EjercicioM1();
                break;
            case 2:
                EjercicioM2();
                break;
            case 3:
                EjercicioM3();
                break;
            case 4:
                EjercicioM4();
                break;
            case 5:
                EjercicioM5();
                break;
            default:
                System.out.println("Ese ejercicio no existe :/");
                break;
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
    public static void EjercicioM1(){
/* Crea un programa que pida por pantalla cuatro países y a continuación tres ciudades de cada uno de estos países.
Los nombres de ciudades deben almacenarse en un array multidimensional cuyo primer índice sea el número asignado a cada país
y el segundo índice el número asignado a cada ciudad. Es decir el array deberá tener un tamaño de 4x4
Ejemplo de resultados que debe mostrar el programa:
País: Argentina Ciudades: Buenos Aires Cordoba La Plata
País: España Ciudades: Madrid Lugo Sevilla
País: Francia Ciudades: Paris Niza Lyon
País: Italia Ciudades: Roma Napoles Sicilia */
        Scanner sc = new Scanner(System.in);
        String paisesCiudades[][] = new String[4][4];
        System.out.println("Ingrese cuatro países:");
        //relleno la primer columna de filas con los países//
        for (int i = 0; i < 4; i++){
                paisesCiudades[i][0] = sc.nextLine();
        }
        
        System.out.println("\nIngrese tres ciudades por cada país:");
        //relleno el resto de la matriz con las ciudades//
        for (int i = 0; i < 4; i++){
            System.out.println(paisesCiudades[i][0] + ": ");
            for (int j = 1; j < 4; j++){
                paisesCiudades[i][j] = sc.nextLine();
            }
            System.out.println("");
        }
        //muestro la matriz//
        System.out.println("/////////////////////////////////////");
        for (int i = 0; i < 4; i++){
            System.out.print("País: ");
            for (int j = 0; j < 4; j++){
                if (j == 1){
                    System.out.print(" Ciudades: ");
                }
                System.out.print(paisesCiudades[i][j] + " ");
            }
            System.out.println("");
        }  
    }    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
    
    public static void EjercicioM2(){
/* Crea un programa que pida por pantalla 2 valores numéricos enteros X e Y. Cree un primer array de tamaño [X,Y] de tipo entero
y almacene en cada posición un valor entero que deberá ser ingresado por el usuario. A continuación cree un segundo array de tamaño [Y,X]
y almacene en cada posición un valor entero que deberá ser ingresado por el usuario. Finalmente cree un tercer array de tamaño [X,Y]
que será el resultante de multiplicar cada una de las posiciones de las filas del array uno por cada una de las posiciones de las columnas del array 2.
Muestre por pantalla cada uno de los arrays con sus valores.*/
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese dos enteros:");
       int x = sc.nextInt();
       int y = sc.nextInt();
        
       int matriz1[][] = new int[x][y];
       RellenarMatrizEj2(matriz1, x, y);
       
       int matriz2[][] = new int[y][x];
       RellenarMatrizEj2(matriz2, y, x);
       
       int matrizResultados[][] = new int[x][y];
       for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                matrizResultados[i][j] = matriz1[i][j] * matriz2[j][i];
            }
        } 
        
        System.out.println("MATRIZ 1");
        MostrarMatrizEj2(matriz1, x, y);
        System.out.println("\nMATRIZ 2");
        MostrarMatrizEj2(matriz2, y, x);
        System.out.println("\nMATRIZ 3");
        MostrarMatrizEj2(matrizResultados, x, y);
    }
    
    public static void RellenarMatrizEj2(int matriz[][], int filas, int columnas){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese valores para la matriz [" + filas + "] x [" + columnas + "]");
        
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                matriz[i][j] = sc.nextInt();
            }
        }    
    }
    
    public static void MostrarMatrizEj2(int matriz[][], int filas, int columnas){
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                if (j == 0){
                    System.out.print("| ");
                }
                
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }    
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void EjercicioM3(){
/*Codifique un programa que solicite un valor entero X mayor o igual a 3 y menor o igual a 10. Cree un arreglo de tamaño [X,X] de tipo int.
Posteriormente solicite los valores necesarios para cargar cada una de las celdas de la matriz. Muestre por pantalla la matriz resultante.
Al finalizar la carga sume cada una de las columnas del array y asigne los resultados en una nueva matriz de una dimensión,
finalmente sume los valores de esta última matriz y muestre el resultado por pantalla.*/
        Scanner sc = new Scanner(System.in);        
        System.out.println("Ingrese un valor mayor o igual a 3 y menor o igual a 10");
        int num = sc.nextInt();
        while(num < 3 || num > 10){
            System.out.println("Invalido. Ingrese de nuevo:");
            num = sc.nextInt();
        }
        
        int matriz[][] = new int[num][num];
        RellenarMatrizEj2(matriz, num, num);
        MostrarMatrizEj2(matriz, num, num);

        int suma, sumaVector = 0;
        int vector[] = new int[num];
        for (int j = 0; j < num; j++){
            suma = 0;
            for (int i = 0; i < num; i++){
                suma += matriz[i][j];
            }
            vector[j] = suma;
            sumaVector += vector[j];
        }
        
        System.out.println("");
        
        for (int i = 0; i < num; i++){
            if (i == 0){
                    System.out.print("| ");
                }
                System.out.print(vector[i] + " | ");
        }
        
        System.out.println("\nTotal: " + sumaVector);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    public static void EjercicioM4(){
/* Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o igual a 10. Cree un arreglo de tamaño [X,X]
de tipo int, nos piden hacer un menú con estas opciones:
a) Rellenar TODA la matriz de números, debes pedírselo al usuario.
b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
c) Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
d) Sumar la diagonal principal
e) Sumar la diagonal inversa
f) La media de todos los valores de la matriz
IMPORTANTE: hasta que no se haga la primera opción a, el resto de opciones no se deberán de ejecutar, simplemente mostrar un mensaje
que diga que debes rellenar la matriz. Mostrar por pantalla el resultado de la ejecución de cada una de las opciones del menú.*/
        Scanner sc = new Scanner(System.in); 
        int num = PeticionInicialEj4();
        int matriz[][] = new int[num][num];
        String eleccion;
        MenuEj4();
        
        eleccion = sc.nextLine();
        while(!(eleccion.equalsIgnoreCase("A"))){
            System.out.println("Debes rellenar la matriz primero.");
            eleccion = sc.nextLine();
        }
        
        EleccionMenuEj4(eleccion, matriz, num);
    }
        
    public static int PeticionInicialEj4(){
        Scanner sc = new Scanner(System.in);        
        System.out.println("Ingrese un valor mayor o igual a 4 y menor o igual a 10");
        int num = sc.nextInt();
        while(num < 4 || num > 10){
            System.out.println("Invalido. Ingrese de nuevo:");
            num = sc.nextInt();
        }
        return num;
    }
    
    public static void MenuEj4(){
        System.out.println("--------------MENÚ------------------------------------");
        System.out.println("A) Rellenar la matriz de números.");
        System.out.println("B) Suma de fila específica");
        System.out.println("C) Suma de columna específica.");
        System.out.println("D) Sumar la diagonal principal.");
        System.out.println("E) Sumar la diagonal inversa.");
        System.out.println("F) Mostrar la media de todos los valores de la matriz.");
        System.out.println("Para salir ingrese Z");
        System.out.println("------------------------------------------------------");
    }
    
    public static void EleccionMenuEj4(String eleccion, int matriz[][], int num){
        Scanner sc = new Scanner(System.in);
        if (eleccion.equalsIgnoreCase("Z")){
            System.out.println("Adiós!");
        }else{
            do{
                switch (eleccion){
                    case "A", "a":
                        RellenarAEj4(matriz, num);
                        MenuEj4();
                        eleccion = sc.nextLine();
                        break;
                    case "B", "b":
                        SumaBEj4(matriz, num);
                        MenuEj4();
                        eleccion = sc.nextLine();
                        break;
                    case "C", "c":
                        SumaCEj4(matriz,num);
                        MenuEj4();
                        eleccion = sc.nextLine();
                        break;
                    case "D", "d":
                        SumaDEj4(matriz,num);
                        MenuEj4();
                        eleccion = sc.nextLine();
                        break;
                    case "E", "e":
                        SumaEEj4(matriz,num);
                        MenuEj4();
                        eleccion = sc.nextLine();
                        break;
                    case "F", "f":
                        MediaFEj4(matriz,num);
                        MenuEj4();
                        eleccion = sc.nextLine();
                        break;
                    default:
                        System.out.println("Esa opción no existe. Ingrese de nuevo:");
                        eleccion = sc.nextLine();
                    }
                }while(!(eleccion.equalsIgnoreCase("Z")));
            
            if (eleccion.equalsIgnoreCase("Z")){
                System.out.println("Adiós!");
            }
        }
    }
    
    public static void RellenarAEj4(int matriz[][], int num){
        Scanner sc = new Scanner(System.in);    
        
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++){
                System.out.println("Ingrese el valor " + i + "," + j);
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    
     public static void SumaBEj4(int matriz[][], int num){
         Scanner sc = new Scanner(System.in);    
         System.out.println("¿Qué fila desea sumar? ([0] a [" + (num-1) + "])");
         int fila = sc.nextInt();
         
         while (fila >= num){
             System.out.println("Esa fila no existe en la matriz. Recuerde que tiene " + (num-1) + " filas");
             fila = sc.nextInt();
         }
         
         int suma = 0;
         for (int i = fila; i <= fila; i++){
            for (int j = 0; j < num; j++){
                suma += matriz[i][j];
            }
        }
         
         //muestro la fila//
         for (int i = fila; i <= fila; i++){
            for (int j = 0; j < num; j++){
                if (j == 0){
                    System.out.print("| " + matriz[i][j] + " | ");
                }else{
                    System.out.print(matriz[i][j] + " | ");
                }
            }
        }
         System.out.println("\nResultado = " + suma);
     }
     
      public static void SumaCEj4(int matriz[][], int num){
         Scanner sc = new Scanner(System.in);    
         System.out.println("¿Qué columna desea sumar? ([0] a [" + (num-1) + "])");
         int columna = sc.nextInt();
         
         while (columna >= num){
             System.out.println("Esa columna no existe en la matriz. Recuerde que tiene " + (num-1) + " columnas");
             columna = sc.nextInt();
         }
         
         int suma = 0;
         for (int i = columna; i <= columna; i++){
            for (int j = 0; j < num; j++){
                suma += matriz[j][i];
            }
        }
         
         //muestro la columna//
         for (int i = columna; i <= columna; i++){
            for (int j = 0; j < num; j++){
                System.out.println("| " + matriz[j][i] + " |");

            }
        }
         System.out.println("\nResultado = " + suma);
    }
      
    public static void SumaDEj4(int matriz[][], int num){
        int suma = 0;
       
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++){
                if (i == j){
                    System.out.print(" " + matriz[i][j] + " ");
                    suma += matriz[i][j];
                }else{
                    System.out.print("|  |");
                }
            }
            System.out.println("");
        }
        
        System.out.println("Resultado = " + suma);
    }
    
    public static void SumaEEj4(int matriz[][], int num){
        int suma = 0;
       
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++){
                if ((i+j) == (num-1)){
                     System.out.print(" " + matriz[i][j] + " ");
                     suma += matriz[i][j];
                }else{
                    System.out.print("|  |");
                }
            }
            System.out.println("");
        }
        
        System.out.println("Resultado = " + suma);
    }
    
    public static void MediaFEj4(int matriz[][], int num){
        int suma = 0;
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++){
                if (j == 0){
                    System.out.print("| " + matriz[i][j] + " | ");
            }else{
                    System.out.print(matriz[i][j] + " | ");
                }
                suma += matriz[i][j];
            }
            System.out.println("");
        }
        
        System.out.println("Resultado = " + suma / (num*num));
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void EjercicioM5(){
        // tamaño filas(12), columnas(3) = [11][2]
        int[][] maquinaGolosinas = {{1, 32, 10}, {2, 2, 50}, {3, 2, 50},
            {4, 25, 10}, {5, 30, 10}, {6, 26, 10}, {7, 35, 10}, {8, 40, 20}, 
            {9, 30, 10}, {10, 20, 15}, {11, 50, 20}, {12, 45, 10}};
    
        Scanner sc = new Scanner(System.in);
        MenuEj5();
        String eleccion = sc.nextLine();
        EleccionMenuEj5(eleccion, maquinaGolosinas);
    }
    
    public static void MenuEj5(){
        System.out.println("------------MENÚ------------");
        System.out.println("A) Pedir golosina");
        System.out.println("B) Mostrar golosinas");
        System.out.println("C) Rellenar golosinas");
        System.out.println("D) Apagar máquina");
        System.out.println("-----------------------------");
    }
    
    public static void EleccionMenuEj5(String eleccion, int[][] maquinaGolosinas){
        Scanner sc = new Scanner(System.in);
        Integer ventasTotales = 0;
        boolean repetir = true;
        
        while(repetir){
            
            switch (eleccion) {
                case "A", "a":
                    ventasTotales += APedirEj5(maquinaGolosinas);
                    MenuEj5();
                    eleccion = sc.nextLine();
                    break;
                case "B", "b":
                    BMostrarEj5(maquinaGolosinas);
                    MenuEj5();
                    eleccion = sc.nextLine();
                    break;
                case "C", "c":
                    CRellenarEj5(maquinaGolosinas);
                    MenuEj5();
                    eleccion = sc.nextLine();
                    break;
                case "D", "d":
                    DVentasEj5(ventasTotales);
                    repetir = false;
                    break;
                default:
                    System.out.println("Opción Inválida");
                    MenuEj5();
                    eleccion = sc.nextLine();
            }
        } 
    }
    
    public static String GolosinasAString(int num){
        switch(num){
            case 0:
                return "KitKat";
            case 1:
                return "Chicles";
            case 2:
                return "Caram. Menta";
            case 3:
                return "Huevo Kinder";
            case 4:
                return "Chetoos";
            case 5:
                return "Twix";
            case 6:
                return "M&M'S";
            case 7:
                return "Papas Lays";
            case 8:
                return "Milkybar";
            case 9:
                return "Alfajor Tofi ";
            case 10:
                return "Lata Coca";
            case 11:
                return "Chitos";
            default:
                return null;
        }
    }
    
    public static Integer APedirEj5(int[][] maquinaGolosinas){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique la posición de la golosina que quiere");
        int posicion = sc.nextInt();
        //valido que el usuario no ingrese nums negativos o mayores a 12
        while (posicion <= 0 || posicion > 12){ 
            System.out.println("Opción Inválida. Indique una golosina existente");
            posicion = sc.nextInt();
        }
  
        //si el stock de la golosina es 0, se sale del método y vuelve al menú para que el usuario seleccione de nuevo una opción//
        if (maquinaGolosinas[posicion-1][2] == 0){
            System.out.println("No hay stock disponible. Elija otra golosina o llame a un técnico para que rellene la máquina.");
            return 0;
        } else {
            System.out.println("Indique la cantidad deseada");
            int cantidad = sc.nextInt();
            //valido que el usuario no ingrese nums negativos para la cantidad//
            while (cantidad < 0){
                System.out.println("Opción Inválida. Indique la cantidad deseada");
                cantidad = sc.nextInt();
            }
            
            //valido que la cantidad no sea mayor al stock disponible//
            while (cantidad > maquinaGolosinas[posicion-1][2]){
            System.out.println("No hay stock suficiente. Stock: " + maquinaGolosinas[posicion-1][2]);
            System.out.println("Indique la cantidad deseada o presione 0 para salir");
            cantidad = sc.nextInt();
            }

            // si la cantidad es 0, se sale del programa, retorno $0 para las ventas totales //
            if (cantidad == 0){
                return 0;
            } else { // si no, retorno el precio de la golosina multiplicado por la cantidad pedida//
                System.out.println("Ha pedido (" + cantidad + ") **" + GolosinasAString((posicion-1)) + "**");
                maquinaGolosinas[posicion-1][2] = (maquinaGolosinas[posicion-1][2]) - cantidad;
                System.out.println("Stock: " + maquinaGolosinas[posicion-1][2]);

                //devuelvo el precio a la Elección de menú para que se vaya sumando en la variable ventasTotales//
                return (maquinaGolosinas[posicion-1][1] * cantidad);
            }
        }
    }
    
    public static void BMostrarEj5(int[][] maquinaGolosinas){
        System.out.println("GOLOSINA     PRECIO     STOCK");
        
         for (int i = 0; i < 12; i++){
             for (int j = 0; j < 3; j++){
                 if (j == 0){
                     System.out.print(GolosinasAString(i) + " |\t");
                 }else if (j == 1){
                     System.out.print("$" + maquinaGolosinas[i][j] + " |\t");
                 }else{
                    System.out.print(maquinaGolosinas[i][j] + " | \t");
                 }
            }
             System.out.println("");
         }
    }
    
    public static void CRellenarEj5(int[][] maquinaGolosinas){
        Scanner sc = new Scanner(System.in);
        String contraseña = "AdminXYZ";
        System.out.println("**EXCLUSIVO PARA TÉCNICOS**");
        System.out.println("Contraseña:");
        String ingreso = sc.nextLine();
        
        if (ingreso.equals(contraseña)){
            System.out.println("**Contraseña correcta**");
            System.out.println("Posición de la golosina a recargar:");
            int posicion = sc.nextInt();
            System.out.println("Cantidad de recarga:");
            int cantidad = sc.nextInt();
            
           maquinaGolosinas[posicion-1][2] = (maquinaGolosinas[posicion-1][2]) + cantidad;
           System.out.println("**GOLOSINA RECARGADA**");
        }else{
            System.out.println("**Contraseña incorrecta. Acceso denegado.**");
        }
    }
    
    public static void DVentasEj5(int ventas){
        System.out.println("**VENTAS TOTALES DEL DÍA**");
        System.out.println("\t$" + ventas);        
        
        System.out.println("\nApagando máquina...");
    }
}
    