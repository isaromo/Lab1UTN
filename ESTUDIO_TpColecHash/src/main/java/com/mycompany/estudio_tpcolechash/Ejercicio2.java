package com.mycompany.estudio_tpcolechash;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        int salida;
        
        do {
            System.out.println("----COMPUTADORA----");
            
            Computadora compu = new Computadora();
            cargarCompu(compu);

            System.out.println("***COMPONENTES COMPUTADORA [" + compu.getMarca() + " " + compu.getModelo() + "]***");
            do {
                ComponenteCPU componente = new ComponenteCPU();
                
                cargarComponente(componente);
                compu.getListaComponentes().add(componente);

                System.out.println("¿Quiere agregar otro componente? 1.SÍ / 2.NO");
                salida = sc.nextInt();
            } while (salida == 1);

            mostrarCompu(compu);
            double total = precioTotal(compu);
            double sugerido;
            System.out.println("PRECIO TOTAL: $" + total);

            if (total < 50000) {
                sugerido = total + total * 0.40;
            } else {
                sugerido = total + total * 0.30;
            }

            System.out.println("PRECIO SUGERIDO: $" + sugerido);

            System.out.println("--------------\n¿Desea cotizar otra computadora? 1.SÍ / 2.NO");
            salida = sc.nextInt();
        } while (salida == 1);
    }
    
    public static void cargarCompu(Computadora compu){
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        
        System.out.println("Marca:");
        compu.setMarca(scStr.nextLine());
        System.out.println("Modelo:");
        compu.setModelo(scStr.nextLine());
    }
    
    public static void cargarComponente(ComponenteCPU componente){
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        
        System.out.println("Componente:");
        componente.setComponente(scStr.nextLine());
        System.out.println("Marca:");
        componente.setMarca(scStr.nextLine());
        System.out.println("Cantidad:");
        componente.setCantidad(sc.nextInt());
        System.out.println("Precio:");
        componente.setPrecio(sc.nextDouble());
    }
    
    public static void mostrarCompu(Computadora compu){
        System.out.println("-----Computadora-----");
        System.out.println("Marca: " + compu.getMarca());
        System.out.println("Modelo: " + compu.getModelo());
        System.out.println("-----Componentes-----\n");
        
        System.out.format("%1$-20s %2$-20s %3$-20s %4$-20s %5$-20s\n", "Componente", "Marca", "Cantidad", "Precio x Unidad", "Subtotal");
        for (ComponenteCPU c : compu.getListaComponentes()){
            System.out.format("%1$-20s %2$-20s %3$-20s %4$-20s %5$-20s\n", c.getComponente(), c.getMarca(), c.getCantidad(), c.getPrecio(), (c.getPrecio() * c.getCantidad()));
        }
    }
    
    public static double precioTotal(Computadora compu){
        double total = 0;
        
        for (ComponenteCPU c : compu.getListaComponentes()){
            total += (c.getPrecio() * c.getCantidad());
        }
        
        return total;
    }
}
