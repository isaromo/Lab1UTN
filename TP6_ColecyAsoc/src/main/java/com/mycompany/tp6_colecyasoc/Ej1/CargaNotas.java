package com.mycompany.tp6_colecyasoc.Ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        String salida;
        int contadorAlumnos = 1;

        System.out.println("*****CARGA DE ALUMNOS*****");

        do {
            Alumno alumno = new Alumno();
            
            System.out.println("Alumno " + contadorAlumnos++);
            System.out.println("Nombre:");
            alumno.setNombreCompleto(sc.nextLine());
            System.out.println("Legajo:");
            alumno.setLegajo(sc.nextLong());
            sc.nextLine(); //limpio buffer

            System.out.println("*****CARGA DE NOTAS*****");
            ArrayList<Nota> notasLoc = new ArrayList<Nota>();
            int contadorNotas = 1;
            do {
                Nota nota = new Nota();
                
                System.out.println("NOTA " + (contadorNotas++) + ":");
                System.out.println("Catedra:");
                nota.setCatedra(sc.nextLine());
                System.out.println("Nota:");
                nota.setNotaExamen(sc.nextDouble());
                sc.nextLine(); //limpio buffer
                notasLoc.add(nota);   // al array local de notas le agrego el objeto nota
                
                System.out.println("¿Desea agregar otra nota? S/N");
                salida = sc.nextLine();
            } while (salida.toUpperCase().equals("S"));
            alumno.setArrayNotas(notasLoc);
            
            alumnos.add(alumno);
            
            System.out.println("¿Desea agregar otro alumno? S/N");
            salida = sc.nextLine();
        } while (salida.toUpperCase().equals("S"));
        
        mostrarTodo(alumnos);
    }
    
    public static void mostrarTodo(ArrayList<Alumno> alumnos) {
        for (Alumno alum : alumnos) {
            System.out.println("**ALUMNO " + alum.getNombreCompleto() + "**");
            System.out.println("**LEGAJO  " + alum.getLegajo() + "**");
            System.out.println("---------------------NOTAS---------------------");
            for (Nota n : alum.getArrayNotas()) {
                System.out.println("CÁTEDRA: " + n.getCatedra());
                System.out.println("NOTA EXÁMEN: " + n.getNotaExamen());
            }
            System.out.println("PROMEDIO DE TODAS LAS NOTAS: " + alum.calculoPromedio(alum.getArrayNotas()));
            System.out.println("\n");
            System.out.println("***************************************************");
        }
    }
}
