package com.mycompany.integradorapreparcial;

public class Parte6_Ej1 {

    public static void main(String[] args) {
       Cliente cliente1 = new Cliente("Alonso", "Eugenia", 27456987, 2698.85, 13654);
       Cliente cliente2 = new Cliente("Pereira", "Victor", 26987456, 3695.45, 125852);
       
       System.out.println(cliente1.getNombre());
       System.out.println(cliente1.getApellido());
       System.out.println(cliente1.getDni());
    }
    
}
