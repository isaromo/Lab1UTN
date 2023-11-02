package com.mycompany.estudio_tpcolecyasc;

import java.util.ArrayList;
import java.util.Scanner;

public class BMenuRestaurante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        
        ArrayList<BPlato> platos = new ArrayList<BPlato>();
        int exit;
        int bebida;
        
        System.out.println("----------MENÚ-----------");
        do{
            BPlato plato = new BPlato();
            do {
                System.out.println("¿ES BEBIDA? 1. SÍ / 2.NO");
                bebida = sc.nextInt();

                if (bebida == 1) {       //SI EL PLATO ES BEBIDA:
                    plato.setEsBebida(true);
                    isDrink(plato);

                } else if (bebida == 2) {    //SI EL PLATO NO ES BEBIDA:
                    plato.setEsBebida(false);
                    isNotDrink(plato);

                } else {
                    System.out.println("Esa opción es incorrecta");
                }
            } while (bebida > 2);

            platos.add(plato);
            
            System.out.println("¿Quiere agregar otro plato? 1.SÍ/2.NO");
            exit = sc.nextInt();
        }while (exit == 1);
        
        showAll(platos);
    }

    public static void showAll(ArrayList<BPlato> platos){
        System.out.println("----------MENÚ RESTAURANTE----------");
        
        for (BPlato p : platos){
            System.out.println(p.getNombreCompleto().toUpperCase());
            System.out.println("Precio: $" + p.getPrecio());
            
            if (!p.isEsBebida()){
                System.out.println("INGREDIENTES:");
                
                System.out.format("%1$-20s|%2$-20s|%3$-20s\n", "Nombre", "Cantidad", "Unidad de Medida");
                for (BIngrediente i : p.getListaIngredientes()){
                    System.out.format("%1$-20s|%2$-20s|%3$-20s\n", i.getNombre(), i.getCantidad(), i.getUnidadMedida());
                }
            }
            System.out.println("-----------------------------------");
        }
    }
    
    public static void isDrink(BPlato plato){
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        
        System.out.println("NOMBRE:");
        plato.setNombreCompleto(scStr.nextLine());
        System.out.println("PRECIO:");
        plato.setPrecio(sc.nextDouble());
    }

    public static void isNotDrink(BPlato plato) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        int exit;

        System.out.println("NOMBRE:");
        plato.setNombreCompleto(scStr.nextLine());
        System.out.println("PRECIO:");
        plato.setPrecio(sc.nextDouble());

        //SETEO DE INGREDIENTES
        System.out.println("***INGREDIENTES [" + plato.getNombreCompleto() + "]***");
        do {
            BIngrediente ing = new BIngrediente();

            System.out.println("INGREDIENTE:");
            ing.setNombre(scStr.nextLine());
            System.out.println("CANTIDAD:");
            ing.setCantidad(sc.nextDouble());
            System.out.println("UNIDAD DE MEDIDA:");
            ing.setUnidadMedida(scStr.nextLine());

            plato.getListaIngredientes().add(ing);

            System.out.println("¿Quiere agregar otro ingrediente? 1.SÍ/2.NO");
            exit = sc.nextInt();
        } while (exit == 1);
    }
}
