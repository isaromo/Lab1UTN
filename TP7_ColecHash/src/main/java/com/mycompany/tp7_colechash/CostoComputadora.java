package com.mycompany.tp7_colechash;

import java.util.HashSet;
import java.util.Scanner;

public class CostoComputadora {

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String exit;

        do {
            Computadora compu = new Computadora();
            double totalPrice = 0;
                    
            System.out.println("**COMPUTADORA**");
            System.out.println("Marca:");
            compu.setMarca(scStr.nextLine());
            System.out.println("Modelo:");
            compu.setModelo(scStr.nextLine());

            System.out.println("**COMPONENTES COMPUTADORA " + compu.getMarca() + "**");
            HashSet<ComponenteCPU> listaCompLocal = new HashSet<ComponenteCPU>();
            do {
                ComponenteCPU componente = new ComponenteCPU();
                System.out.println("Componente:");
                componente.setComponente(scStr.nextLine());
                System.out.println("Marca:");
                componente.setMarca(scStr.nextLine());
                System.out.println("Cantidad:");
                componente.setCantidad(sc.nextInt());
                System.out.println("Precio:");
                componente.setPrecio(sc.nextDouble());

                listaCompLocal.add(componente);     //le agrego a la lista local cada componente

                System.out.println("¿Agregar otro componente? S/N");
                exit = scStr.nextLine();
            } while (exit.equals("S"));
            compu.setListaComponentes(listaCompLocal); //una vez terminado el ciclo, le seteo toda la lista de componentes al atributo de Computadora

            //MOSTRAR COMPUTADORA
            String format = "|%1$-20s|%2$-20s|%3$-20s|%4$-20s|%5$-20s|\n";   //creo el formato para reutilizarlo
            System.out.println("---------COMPUTADORA---------");
            System.out.println("Marca: " + compu.getMarca());
            System.out.println("Modelo: " + compu.getModelo());
            System.out.println("COMPONENTES:");
            System.out.format(format, "Componente", "Marca", "Cantidad", "Precio x Unidad", "Subtotal");
            for (ComponenteCPU componentes : compu.getListaComponentes()) {
                System.out.format(format, componentes.getComponente(), componentes.getMarca(), componentes.getCantidad(), componentes.getPrecio(), (componentes.getPrecio() * componentes.getCantidad()));
                totalPrice += componentes.getPrecio() * componentes.getCantidad();
            }
            System.out.println("------------------------------------");
            System.out.println("Costo total: " + totalPrice);
            System.out.println("------------------------------------");
            System.out.println("El precio sugerido de venta es " + totalPrice + " + " + precioSugerido(totalPrice));
            System.out.println("------------------------------------");

            System.out.println("\n¿Desea cotizar una nueva computadora? S/N");
            exit = scStr.nextLine().toUpperCase();
        } while (exit.equals("S"));
    }
    
    public static String precioSugerido(double totalPrice){
        double surcharge;
        
        if (totalPrice < 50000){    //si el precio total es menor a 50mil...
            surcharge = (totalPrice * 0.40);    // se saca el 40% del precio...
            totalPrice += surcharge;    // y se le suma al total
        } else {    //si es mayor a 50mil
            surcharge = (totalPrice * 0.30);    //se saca el 30%    
            totalPrice += surcharge;
        }
        
        return surcharge + " = " + totalPrice;
    }
}
