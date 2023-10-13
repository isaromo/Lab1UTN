package com.mycompany.tp6_colecyasoc.Ej1.Ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        ArrayList<Plato> platosMenu = new ArrayList<Plato>();

        int salida;
        int esBebida;

        System.out.println("****INGRESO DE PLATOS DEL MENÚ****");
        do {     //ciclo while para agregar todos los platos que yo quiera
            Plato plato = new Plato();
            System.out.println("¿Es bebida? 1.SÍ/2.NO");
            esBebida = sc.nextInt();
            while (esBebida < 1 || esBebida > 2) {   //valido que se ingrese 1 o 2 como respuesta
                System.out.println("Opción inválida");
                esBebida = sc.nextInt();
            }

            if (esBebida == 1) {     //dependiendo de la respuesta en int isntancio el valor esBebida del plato
                plato.setEsBebida(true);
            } else {
                plato.setEsBebida(false);
            }

            if (plato.isEsBebida()) { //hago el get de esBebida, si es true entonces se realiza el if
                System.out.println("Nombre de la bebida: ");
                plato.setNombreCompleto(scStr.nextLine());
                System.out.println("Precio: ");
                plato.setPrecio(sc.nextDouble());
                platosMenu.add(plato);
            } else {    // el plato no es bebida
                System.out.println("Nombre del plato: ");
                plato.setNombreCompleto(scStr.nextLine());
                System.out.println("Precio: ");
                plato.setPrecio(sc.nextDouble());

                ArrayList<Ingrediente> listaIngredientesLocal = new ArrayList<Ingrediente>();   //creo el array local de ingredientes acá para que dentro de cada plato se reinicie
                int contadorIngredientes = 1;
                System.out.println("****INGREDIENTES DE [" + plato.getNombreCompleto() + "]****");
                do {    //ciclo while para agregar todos los ingredientes que yo quiera
                    Ingrediente ingrediente = new Ingrediente();

                    System.out.println("INGREDIENTE " + contadorIngredientes + ":");
                    ingrediente.setNombre(scStr.nextLine());
                    while (contadorIngredientes == 1 && (ingrediente.getNombre() == null || ingrediente.getNombre().equals(""))) {
                        System.out.println("Debe ingresar al menos 1 ingrediente");
                        System.out.println("INGREDIENTE " + contadorIngredientes + ":");
                        ingrediente.setNombre(scStr.nextLine());
                    }
                    contadorIngredientes++;

                    System.out.println("Cantidad " + ingrediente.getNombre() + ":");
                    ingrediente.setCantidad(sc.nextDouble());
                    System.out.println("Unidad de medida:");
                    ingrediente.setUnidadMedida(scStr.nextLine());

                    listaIngredientesLocal.add(ingrediente);
                    System.out.println("¿Agregar otro ingrediente? 1. SÍ / 2.NO");
                    salida = sc.nextInt();
                } while (salida == 1);

                plato.setListaIngredientes(listaIngredientesLocal);
                platosMenu.add(plato);
            }

            System.out.println("¿Agregar otro plato? 1. SÍ / 2.NO");
            salida = sc.nextInt();
        } while (salida == 1);

        System.out.println("----------------MENÚ----------------");
        for (Plato plato : platosMenu) {
            System.out.println(plato.getNombreCompleto());
            System.out.println("Precio: $" + plato.getPrecio());
            if (!plato.isEsBebida()) {    //si el plato no es bebida, muestro la lista de los ingredientes
                System.out.println("Ingredientes:");
                System.out.println("Nombre" + completarEspacios("Cantidad") + completarEspacios("Unidad de Medida"));
                for (Ingrediente ingr : plato.getListaIngredientes()) {
                    System.out.println(ingr.getNombre() + completarEspacios(Double.toString(ingr.getCantidad())) + completarEspacios(ingr.getUnidadMedida()));
                }
            }
            System.out.println("------------------------------------");
        }
    }

    public static String completarEspacios(String palabra) {
        int espacios = 10;

        while (espacios > 0) {
            palabra = " " + palabra;
            espacios--;
        }
        return palabra;
    }
}
