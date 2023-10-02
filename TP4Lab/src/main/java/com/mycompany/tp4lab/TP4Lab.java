package com.mycompany.tp4lab;
import java.util.Random;
import java.util.Scanner;

public class TP4Lab {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio a correr");
        System.out.println("A. Ejercicios 2 y 3 en uno");
        System.out.println("B. Ejercicio 4");
        System.out.println("C. Ejercicio 5");
        
        String eleccEjerc = sc.nextLine();
                
        switch (eleccEjerc){
            case "A", "a":
                ejercicio2y3();
                break;
            case "B", "b":
                ejercicio4();
                break;               
            case "C", "c":
                ejercicio5();
                break;
            default:
                System.out.println("Ese ejercicio no existe");
                break;
        }
    }

//    public static void ejercicio1(){
/* ##### ALGORITMOS DE ORDENACIÓN #####
    - ORDENAMIENTO POR INSERCIÓN: Este algoritmo empieza desde el segundo elemento del arreglo (considerando el primero como ordenado desde un principio),
       y al ir avanzando en los índices (i+1), compara el valor con los elementos ya ordenados a su izquierda;
       si es mayor, se coloca a la derecha de aquellos elementos menores, si es menor, se coloca a la izquierda de aquellos mayores.

    - ALGORITMO DE LA BURBUJA: En este algoritmo los valores se van comparando de a pares, comparando los elementos en indice [i] e [i+1].
        Si el orden es correcto, no se cambia; si el orden es incorrecto, se intercambian sus posiciones. Al ciclo que recorre el arreglo
        se le pone una condición que hace que no pare hasta que todos los elementos estén correctamente ordenados.

    - ORDENAMIENTO POR SELECCIÓN: En este algoritmo se recorre todo el arreglo, se busca el menor elemento y se coloca al inicio de la lista, intercambiandolo
        por el elemento en el índice [i]. En la siguiente iteración, el arreglo se corre desde el segundo elemento, se busca el menor elemento en el arreglo
        y se intercambia con el elemento en el índice [i] (en este momento [1]). Así se sigue iterando hasta que el arreglo termine. Una desventaja de este
        algoritmo es que siempre el ciclo recorre todos los elementos del arreglo, incluso aunque el primero ya sea el menor.

    - ALGORITMO QUICK-SORT: En este algoritmo se selecciona un elemento del arreglo como pivote. Se comparan el resto de los elementos con dicho pivote
        y se colocan aquellos menores a la izquierda del pivote y aquellos mayores a la derecha (los elementos iguales pueden ubicarse tanto a la izquierda
        como a la derecha). Se coloca el pivote donde tiene que ir, por ejemplo, reemplazandolo con el elemento a la derecha del último elemento pequeño
        del grupo que queda a la izquierda del pivote. Así, quedan dos subarreglos: uno a la izquierda del pivote y el otro a la derecha. Se repite el mismo proceso
        de forma recursiva con cada subarreglo, mientras tengan más de un elemento.

    ##### ALGORITMOS DE BÚSQUEDA #####
    - BÚSQUEDA SECUENCIAL: Se usa en arreglos no ordenados. Simplemente con un ciclo for se busca en cada índice si el elemento es el elemento deseado.
        Si lo es, se rompe el ciclo; sino, se continúa sin encontrar el elemento hasta que el ciclo termine.

    - BÚSQUEDA BINARIA: Se usa en arreglos ordenados. Al tener un arreglo ordenado, ya sabemos más o menos en que sector del arreglo puede estar el elemento.
        Entonces, se busca el valor central del arreglo, si justo en esta posición esta el elemento deseado el ciclo termina, de lo contrario, se valida si es
        mayor o menor al elemento deseado. Dependiendo de este resultado, sabemos en que mitad del arreglo enfocarnos. Con este subarreglo se realiza el mismo proceso,
        buscando cada vez el valor central, comparando con el elemento deseado, y enfocandonos en la mitad que más cerca del elemento está, hasta que queda un subarreglo
        de 2 o 1 elemento.

    ##### ALGORITMOS DE RECORRIDO #####
    - RECORRIDO EN PROFUNDIDAD: En este recorrido de árbol, se empieza desde la raíz y se visitan todos los hijos descendientes antes de visitar los otros hijos.
        Es decir, si existen dos hijos (A) y (B) y de (A) salen dos hijos (C) y (D), (C) y (D) van a ser visitados antes que (B).
     
    - RECORRIDO EN ANCHURA: En este recorrido, se empieza desde la raíz y se recorre cada nivel de hijos completamente antes de pasar al descendiente.
    Es decir, si existen dos hijos (A) y (B), de (A) salen (C) y (D), y de (B) sale (E), (A) y (B) van a ser recorridos antes que (C), (D) y (E). */
//    }
    
    public static  void ejercicio2y3(){
        Scanner sc = new Scanner(System.in);
        int arreglo[] = new int[10];
        
        
        rellenarArreglo(arreglo);
        mostrarArreglo(arreglo);
        
        System.out.println("¿De qué forma ordenar? ASC o DESC");
        String orden = sc.nextLine();

        while (!(orden.equalsIgnoreCase("ASC")) && !(orden.equalsIgnoreCase("DESC"))){
            System.out.println("Opción inválida");
            orden = sc.nextLine();
        }
        
        System.out.println("\nORDENAMIENTO POR INSERCIÓN:");
        ordenPorInsercion(arreglo, orden);
        System.out.println("\nALGORITMO DE LA BURBUJA:");
        ordenAlgBurbuja(arreglo, orden);
        System.out.println("\nORDENAMIENTO POR SELECCIÓN:");
        ordenPorSeleccion(arreglo, orden);
        System.out.println("\nBÚSQUEDA SECUENCIAL:");
        busquedaSecuencial(arreglo); 
    }
    
    public static void rellenarArreglo(int arreglo[]){
        Random random = new Random();
        
        for (int i = 0; i < arreglo.length; i++){
            arreglo[i] = random.nextInt(51);
        } 
    }
    
    public static  void mostrarArreglo(int arreglo[]){
        for (int i = 0; i < arreglo.length; i++){
            if (i == 0){
                System.out.print("| " + arreglo[i] + " | ");
            } else {
                System.out.print(arreglo[i] + " | ");
            }           
        }
        
        System.out.println("");
    }
    
    public static  void ordenPorInsercion(int arreglo[], String orden){
        if (orden.equalsIgnoreCase("ASC")) {
            for (int i = 1; i < arreglo.length; i++) {
                int valor = arreglo[i];
                int j = i - 1;

                while (j >= 0 && arreglo[j] > valor) {
                    arreglo[j + 1] = arreglo[j];
                    j--;
                }

                arreglo[j + 1] = valor;
            }
        } else {
            for (int i = 1; i < arreglo.length; i++) {
                int valor = arreglo[i];
                int j = i - 1;

                while (j >= 0 && arreglo[j] < valor) {
                    arreglo[j + 1] = arreglo[j];
                    j--;
                }

                arreglo[j + 1] = valor;
            }
        }
        
        mostrarArreglo(arreglo);
    }
    
    public static void ordenAlgBurbuja(int arreglo[], String orden) {
        int longitud = arreglo.length;
        boolean intercambiado;

        if (orden.equalsIgnoreCase("ASC")) {
            do {
                intercambiado = false;

                for (int i = 1; i < longitud; i++) {
                    //si esta par no está ordenado
                    if (arreglo[i - 1] > arreglo[i]) {
                        //los intercambiamos y recordamos que algo ha cambiado
                        int aux = arreglo[i - 1];
                        arreglo[i - 1] = arreglo[i];
                        arreglo[i] = aux;

                        intercambiado = true;
                    }
                }
            } while (intercambiado == true);
        } else {
            do {
                intercambiado = false;

                for (int i = 1; i < longitud; i++) {
                    if (arreglo[i - 1] < arreglo[i]) {
                        int aux = arreglo[i - 1];
                        arreglo[i - 1] = arreglo[i];
                        arreglo[i] = aux;

                        intercambiado = true;
                    }
                }
            } while (intercambiado == true);
        }
        
        mostrarArreglo(arreglo);
    }

    public static void ordenPorSeleccion(int arreglo[], String orden) {
        int longitud = arreglo.length;

        if (orden.equalsIgnoreCase("ASC")) {
            for (int i = 0; i < longitud - 1; i++) {
                int minimo = i;

                for (int j = i + 1; j < longitud; j++) {
                    //si este par no está ordenado
                    if (arreglo[j] < arreglo[minimo]) {
                        //encontramos un nuevo mínimo
                        minimo = j;
                    }

                }
                //intercambiamos el actual con el mínimo encontrado
                if (i != minimo) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[minimo];
                    arreglo[minimo] = aux;
                }
            }
        } else {
            for (int i = 0; i < longitud - 1; i++) {
                int maximo = i;

                for (int j = i + 1; j < longitud; j++) {
                    //si este par no está ordenado
                    if (arreglo[j] > arreglo[maximo]) {
                        //encontramos un nuevo máximo
                        maximo = j;
                    }

                }
                //intercambiamos el actual con el máximo encontrado
                if (i != maximo) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[maximo];
                    arreglo[maximo] = aux;
                }
            }
        }
        
        mostrarArreglo(arreglo);
    }    
    
    public static void busquedaSecuencial(int arreglo[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número a buscar:");
        int num = sc.nextInt();
        int longitud = arreglo.length;
        boolean seEncontro = false;

        //recorremos la lista, revisando cada elemento, para ver si es el num
        for (int i = 0; i < longitud; i++) {
            //comparamos el num en la posición actual con el num a buscar
            if (arreglo[i] == num) {
                //encontramos el num buscado
                System.out.println(num + " está en la posición [" + i + "]");
                seEncontro = true;
                break;
            }
        }
        if (seEncontro == false) {
            System.out.println(num + " no está en el arreglo");
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    public static void ejercicio4(){
        Scanner sc = new Scanner(System.in);
        int arreglo[] = new int[20];
        rellenarArreglo(arreglo);
        mostrarArreglo(arreglo);
        
        System.out.println("¿De qué forma ordenar? ASC o DESC");
        String orden = sc.nextLine();
        while (!(orden.equalsIgnoreCase("ASC")) && !(orden.equalsIgnoreCase("DESC"))){
            System.out.println("Opción inválida");
            orden = sc.nextLine();
        }
        
        System.out.println("¿Con qué método?\n1. Por inserción\n2. Algoritmo de Burbuja\n3. Por selección");
        int metodo = sc.nextInt();
        
        switch (metodo){
            case 1:
                ordenPorInsercion(arreglo, orden);
                break;
            case 2:
                ordenAlgBurbuja(arreglo, orden);
                break;
            case 3:
                ordenPorSeleccion(arreglo, orden);
                break;
            default:
                break;
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////
    public static void ejercicio5(){
        Scanner sc = new Scanner(System.in);
        int filas, colum;
        System.out.println("Ingrese dos enteros mayores o iguales a 2");
        filas = sc.nextInt();
        while (filas < 2){
            System.out.println("Inválido");
            filas = sc.nextInt();
        }
        colum = sc.nextInt();
        while (colum < 2){
            System.out.println("Inválido");
            colum = sc.nextInt();
        }
        
        int matriz[][] = new int[filas][colum];
        int promedio = rellenarMatriz(matriz, filas, colum) / (filas*colum);
        mostrarMatriz(matriz, filas, colum);
        System.out.println("Promedio: " + promedio);
        encontrarPromedio(matriz, filas, colum, promedio);
        
    }

    public static int rellenarMatriz(int matriz[][], int filas, int colum){
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < colum; j++) {
                System.out.println("Ingrese el valor " + i + "," + j);
                matriz[i][j] = sc.nextInt();
                
                suma += matriz[i][j];
            }
        }
        return suma;
    }
    
    public static void mostrarMatriz(int matriz[][], int filas, int colum){
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < colum; j++) {
                if (j == 0){
                    System.out.print("| " + matriz[i][j] + " | ");
                } else {
                     System.out.print(matriz[i][j] + " | ");
                }
            }
            System.out.println("");
        }
    }
    
    public static void encontrarPromedio(int matriz[][], int filas, int colum, int promedio){
        boolean encontrado = false;
        
         for (int i = 0; i < filas; i++){
             for (int j = 0; j < colum; j++) {
                 if (matriz[i][j] == promedio){
                     System.out.println("El valor " + promedio + " se encuentra en la posición [" + i + "][" + j + "], o Fila " + (i+1) + ", Columna " + (j+1));
                     encontrado = true;
                     break;
                 }
             }
         }
            
         if (encontrado == false){
             System.out.println("El valor " + promedio + " no se encuentra en la matriz");
         }
    }
}




