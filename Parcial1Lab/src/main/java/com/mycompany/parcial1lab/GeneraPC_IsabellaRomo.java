package com.mycompany.parcial1lab;

import java.util.Scanner;

public class GeneraPC_IsabellaRomo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computadora computadora = new Computadora();
        String componentesPc[][] = {{"AAA", "Placa Madre", "20000", "S"}, {"BBB", "Procesador",
            "25000", "S"}, {"CCC", "Memoria RAM", "5000", "S"}, {"DDD", "Placa de Red", "3000", "N"},
         {"EEE", "Disco Rigido SSD", "22000", "S"}, {"FFF", " Placa de Video", "42000", "N"}, {"GGG",
            "Monitor Led 21", "32000", "N"}, {"HHH", "Monitor Led 25", "41000", "N"}, {"JJJ","Kit Teclado - Mouse", "9000" , "N"} ,
            {"KKK","Gabinete", "6500" , "S"}, {"LLL","Fuente Alimentación", "6500" , "S"}, {"MMM","Placa de Sonido", "16500" , "N"}};
        
        System.out.println("COMPUTADORA");
        System.out.println("Marca:");
        computadora.setMarca(sc.nextLine());
        System.out.println("Modelo:");
        computadora.setModelo(sc.nextLine());
        System.out.println("Año de fabricación:");
        computadora.setAnioFabricacion(sc.nextInt());
         System.out.println("Código de barras:");
        computadora.setCodigoBarras(sc.nextLong());
        
        System.out.println("Cantidad de componentes que tendrá la computadora:");
        int cantComp = sc.nextInt();
        while (cantComp < 5 || cantComp > 12){
            System.out.println("Ingrese una cantidad válida de componentes (entre 5 y 12)");
            cantComp = sc.nextInt();
        }
        
        String nuevaPc[][] = new String[cantComp][5];
        computadora.setComponentes(nuevaPc);
        
        System.out.println("**Componentes de la computadora**");
        int posicion;
        
        for (int i = 0; i < cantComp; i++) {
            System.out.println("Ingrese el código del componente " + (i+1));
            sc.nextLine(); //limpio el buffer
            String codigoComponente = sc.nextLine();
            posicion = busquedaComponente(codigoComponente, componentesPc); // pasado este apunto el codigo del comp es correcto, entonces lo agrego o chequeo si ya fue agregado
            componenteAgregadoONo(codigoComponente, nuevaPc);
            
            for (int j = 0; j < 4; j++){ //finalmente agrego el componente correcto
                nuevaPc[i][j] = componentesPc[posicion][j];
            }
        }
        
        verificoCompObligatorios(nuevaPc, componentesPc);
        
        
        System.out.println("********* LA COMPUTADORA ESPECIFICADA ES: **********");
        mostrarMatriz(nuevaPc);
        montoFinal(nuevaPc);
        
        
    }
    
    public static int busquedaComponente(String codigoComponente, String componentesPc[][]){
        int contador = 0;
        int posicion = 0;
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < componentesPc.length; i++){
            if (codigoComponente.equals(componentesPc[i][0])){
                contador++;
                posicion = i;
            }
        }
        
        if (contador == 0){
            System.out.println("El código ingresado es incorrecto. Ingreselo de nuevo");
            codigoComponente = sc.nextLine();
            busquedaComponente(codigoComponente, componentesPc);
        } else if (contador > 0){
            System.out.println("Componente agregado");
        }
        
        return posicion;
    }
    
    public static String componenteAgregadoONo(String codigoComponente, String nuevaPc[][]){
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        
        for (int i = 0; i < nuevaPc.length; i++){
            if (codigoComponente.equals(nuevaPc[i][0])){
                ++contador;
            }
        }
        
        if (contador > 0){
            System.out.println("Ese componente ya fue agregado. Ingrese otro");
            codigoComponente = sc.nextLine();
            return codigoComponente;
        } else {
            return codigoComponente;
        }
    }
    
    public static void mostrarMatriz(String nuevaPc[][]){
       
        for (int i = 0; i < nuevaPc.length; i++){
            for (int j = 0; j < nuevaPc[0].length; j++){
                System.out.println(nuevaPc[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
    public static void verificoCompObligatorios(String nuevaPc[][], String componentesPc[][]) {
        int contador = 0;

        for (int i = 0; i < nuevaPc.length; i++) {
            for (int j = 0; j < nuevaPc[0].length; j++) {
                if (nuevaPc[i][j].equals("AAA")) {
                    contador++;
                } else if (nuevaPc[i][j].equals("BBB")) {
                    contador++;
                } else if (nuevaPc[i][j].equals("CCC")) {
                    contador++;
                } else if (nuevaPc[i][j].equals("KKK")) {
                    contador++;
                } else if (nuevaPc[i][j].equals("LLL")) {
                    contador++;
                }
            }
            if (contador < 5) {
                System.out.println("\nCuidado, 1 o más de los componentes obligatorios no fueron agregados, se cobrara un recargo del 20%");
            }
        }
    }
    
    public static void montoFinal(String nuevaPc[][]){
        int suma = 0;
        
        for (int i = 0; i < nuevaPc.length; i++){
            suma += Integer.parseInt(nuevaPc[i][2]);
        }
        
        System.out.println("Monto final: $" + suma);
    }
}