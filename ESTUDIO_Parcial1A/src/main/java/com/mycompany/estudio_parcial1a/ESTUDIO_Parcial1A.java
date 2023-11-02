package com.mycompany.estudio_parcial1a;

import java.util.Scanner;

public class ESTUDIO_Parcial1A {

    static String [][] articulos = {{"100","Azucar", "20", "U"} , {"101","Leche" , "30" , "U"} , {"102","Aceite", "50" , "U"} , {"103","Sal", "45" , "U"} , {"104"," Fideos", "15" , "U"} , {"105"," Arroz", "28" , "U"} , {"106","Galletas", "26" , "U"} , {"107","Carne Molida", "220" , "Kg"} , {"108","Shampoo", "42" , "U"} , {"109","Queso Mantecoso", "178" , "Kg"} , {"110","Jamon Cocido", "320" , "Kg"} , {"111","Naranjas", "80" , "Kg"}};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        
        Factura factura = new Factura();
        
        //setteo los main atributos de factura
        System.out.println("FECHA DE LA FACTURA:");
        factura.setFecha(scStr.nextLine());
        System.out.println("NÚMERO DE FACTURA:");
        factura.setNroFactura(sc.nextLong());
        System.out.println("**CLIENTE**");
        System.out.println("NOMBRE:");
        factura.setNombre(scStr.nextLine());
        System.out.println("RAZON SOCIAL:");
        factura.setRazonSocial(scStr.nextLine());
        System.out.println("CUIT:");
        factura.setCuitCliente(sc.nextLong());
        System.out.println("----------------");
        System.out.println("TIPO DE PAGO (C-TC-TD):");
        factura.setTipoPago(scStr.nextLine());
        //
        
        System.out.println("---------------------------------------");
        System.out.println("Cantidad de artículos a facturar:");
        int cantArticulos = 0;
        
        while (true){
            cantArticulos = sc.nextInt();
            
            if (cantArticulos > 0 && cantArticulos <= 12){
                break;
            } else {
                System.out.println("Cantidad inválida. Ingresela de nuevo:");
            }
        }
        
        //asigno el tamaño de la matriz
        factura.asignarTamañoMatriz(cantArticulos);
        //
        
        System.out.println("****ARTÍCULOS A FACTURAR****");
        
        for (int i = 0; i < cantArticulos; i++) {
            System.out.println("ARTÍCULO " + (i+1));
            while (true) {
                System.out.println("Ingrese el código del artículo:");
                int codigo = sc.nextInt();

                String articuloEncontrado[] = buscarEnArticulos(codigo);

                if (articuloEncontrado == null) {
                    System.out.println("El código ingresado es incorrecto.");
                } else {
                    factura.asignarFilaArticulo(articuloEncontrado, i); //asigno la fila hasta la columna 3
                    
                    //setteo cantidad y subtotal
                    System.out.println("CANTIDAD:");
                    double cantidad = sc.nextDouble();
                    factura.asignarCantidadYSubtotal(i, cantidad);
                    //
                    break;
                }
            }
        }
        
        factura.asignarMontoTotal();
        factura.asignarRecargo();
        factura.asignarMontoFinal();
        
        mostrarFactura(factura);
    }
    
    public static String[] buscarEnArticulos(int codigo){
        String articuloFila[] = new String[3];
        
        for (int i = 0; i < articulos.length; i++){
            if (Integer.parseInt(articulos[i][0]) == codigo){ //CODIGO ENCONTRADO
               
               articuloFila[0] = articulos[i][0]; 
               articuloFila[1] = articulos[i][1]; 
               articuloFila[2] = articulos[i][2]; 
               
               return articuloFila;
            }
        }
        
        return null;    //CODIGO NO ENCONTRADO
    }
    
    public static void mostrarFactura(Factura f){
        System.out.println("\nEl ticket a pagar es...");
        
        String format1 = "%1$-20s|%2$-20s\n";
        System.out.format(format1, "Cliente", f.getNombre());
        System.out.format(format1, "Fecha", f.getFecha());
        System.out.format(format1, "Factura Nº", f.getNroFactura());
        System.out.format(format1, "Tipo Pago", f.getTipoPago());
        
        String format2 = "%1$-20s|%2$-20s|%3$-20s|%4$-20s|%5$-20s\n";
        String format3 = "%1$-20s";
        
        System.out.format(format2, "Código Item", "Denominación", "Precio", "Cantidad", "Subtotal");
        for (int i = 0; i < f.getItemsFactura().length; i++){
            for (int j = 0; j < f.getItemsFactura()[i].length; j++){
                System.out.format(format3, f.getItemsFactura()[i][j]);     
            }
            System.out.println("\n");
        }
        
        System.out.format(format1, "Total Items", f.getMontoTotalItems());
        System.out.format(format1, "Recargo", f.getRecargo());
        System.out.format(format1, "Total Final", f.getMontoFinal());
    }
}
