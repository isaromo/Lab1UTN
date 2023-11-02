package com.mycompany.estudio_parcial1b;

import java.util.ArrayList;
import java.util.Scanner;


public class GeneraPC {

    static String [][] componentesPc = {{"AAA","Placa Madre", "20000", "S"} , {"BBB","Procesador" , "25000" , "S"} , {"CCC","Memoria RAM", "5000" , "S"} , {"DDD","Placa de Red", "3000" , "N"} , {"EEE","Disco Rigido SSD", "22000" , "S"} , {"FFF"," Placa de Video", "42000" , "N"} , {"GGG", "Monitor Led 21", "32000" , "N"} , {"HHH","Monitor Led 25", "41000" , "N"} , {"JJJ","Kit Teclado - Mouse", "9000" , "N"} , {"KKK","Gabinete", "6500" , "S"}, {"LLL","Fuente Alimentación", "6500" , "S"}, {"MMM","Placa de Sonido", "16500" , "N"}};
    static ArrayList<String> codigosAgregados = new ArrayList<String>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        
        Computadora compu = new Computadora();
        
        //instancio los atributos principales
        System.out.println("-------- COMPUTADORA --------");
        System.out.println("MARCA:");
        compu.setMarca(scStr.nextLine());
        System.out.println("MODELO:");
        compu.setModelo(scStr.nextLine());
        System.out.println("AÑO DE FABRICACIÓN:");
        compu.setAnioFabricacion(sc.nextInt());
        System.out.println("CÓDIGO DE BARRAS:");
        compu.setCodigoBarras(sc.nextLong());
        ////
        System.out.println("---------------------------------");
        System.out.println("Cantidad de componentes de la computadora:");
        int cantComponentes = 0;
        
        while (true) {
            cantComponentes = sc.nextInt();
            
            if (cantComponentes >= 5 && cantComponentes <= 12){
                break;
            } else {
                System.out.println("Cantidad inválida. Ingresela de nuevo");
            }
        }
        ////
        //inicializo tamaño matriz
        compu.inicializarTamañoMatriz(cantComponentes);
        //
        
        //inicializo componentes
        System.out.println("-------- COMPONENTES COMPUTADORA [" + compu.getMarca() + " " + compu.getModelo() + "]--------");
        
        for (int i = 0; i < cantComponentes; i++){
            while (true) {
                System.out.println("Ingrese el código del componente " + (i + 1));
                String codigo = scStr.nextLine();
                
                String[] filaEncontrada = new String[4];
                filaEncontrada = encontrarCodigo(codigo);

                if (filaEncontrada != null) {
                    compu.inicializarFila(i, filaEncontrada);
                    break;
                }
            }  
        }
        //
        
        //setteo el precio final
        compu.calcularPrecioTotal();
        //setteo el recargo
        boolean sinRecargo = verificarObligatorios(compu);
        compu.calcularRecargo(sinRecargo);
        //setteo el monto final
        compu.calcularMontoFinal();
        //muestro todo
        mostrarCompu(compu);
    }
    
    public static String[] encontrarCodigo(String codigo) {
        boolean encontrado = false;
        int fila = 0;

        for (int i = 0; i < componentesPc.length; i++) {
            if (codigo.equals(componentesPc[i][0])) {
                encontrado = true;
                fila = i;
                break;
            }
        }

        if (encontrado == false) {
            System.out.println("El código ingresado es incorrecto");
            return null;
        } else {
            if (!(codigosAgregados.isEmpty()) && codigosAgregados.contains(codigo)) {
                System.out.println("El componente ya fue agregado anteriormente");
                return null;

            } else {
                codigosAgregados.add(codigo);
                String[] filaEncontrada = new String[4];

                filaEncontrada[0] = componentesPc[fila][0];
                filaEncontrada[1] = componentesPc[fila][1];
                filaEncontrada[2] = componentesPc[fila][2];
                filaEncontrada[3] = componentesPc[fila][3];

                return filaEncontrada;
            }
        }
    }
    
    public static boolean verificarObligatorios(Computadora compu){
        int contador = 0;
        
        for (int i = 0; i < compu.getComponentes().length; i++){
            if (compu.getComponentes()[i][3].equals("S")){
                contador++;
            }
        }
        
        if (contador == 5){
            return true;
        } else {
            System.out.println("Cuidado, 1 o más de los componentes obligatorios no fueron agregados, se cobrara un recargo del 20%");
            return false;
        }
    }
    
    public static void mostrarCompu(Computadora compu){
        System.out.println("-----------------------------------------------");
        String format1 = "%1$-20s|%2$-20s\n";
        
        System.out.format(format1, "Marca", compu.getMarca());
        System.out.format(format1, "Modelo", compu.getModelo());
        System.out.format(format1, "Código de barras", compu.getCodigoBarras());
        System.out.format(format1, "Año", compu.getAnioFabricacion());
        
        System.out.println("-----------------------------------------------");
        String format2 = "%1$-20s|%2$-20s|%3$-20s\n";
        String format3 = "%1$-20s";
        System.out.format(format2, "Código Item", "Denominación", "Precio");
        
        for (int i = 0; i < compu.getComponentes().length; i++) {
            for (int j = 0; j < compu.getComponentes()[i].length; j++) {
                System.out.format(format3, compu.getComponentes()[i][j]);
            }
            System.out.println("\n");
        }
        
        System.out.println("-----------------------------------------------");
        System.out.format(format1,"Total Componentes", compu.getPrecioTotal());
        System.out.format(format1,"Recargo", compu.getPorcentajeAumento());
        System.out.format(format1,"Monto Final", compu.getMontoFinal());
    }
}
