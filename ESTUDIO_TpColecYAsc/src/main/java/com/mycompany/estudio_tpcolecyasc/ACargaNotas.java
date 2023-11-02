package com.mycompany.estudio_tpcolecyasc;

import java.util.ArrayList;
import java.util.Scanner;

public class ACargaNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        
        ArrayList<AAlumno> alumnos = new ArrayList<AAlumno>();
        int exit;
        
        do {
            AAlumno alumno = new AAlumno();

            System.out.println("NOMBRE:");
            alumno.setNombreCompleto(scStr.nextLine());
            System.out.println("LEGAJO:");
            alumno.setLegajo(sc.nextLong());
            
            System.out.println("****CARGA DE NOTAS****");
            do {
                ANota nota = new ANota();

                System.out.println("CÁTEDRA:");
                nota.setCatedra(scStr.nextLine());
                
                while (nota.getCatedra() == ""){
                    System.out.println("Ingresar al menos una nota");
                    System.out.println("CÁTEDRA:");
                    nota.setCatedra(scStr.nextLine());
                }
                
                System.out.println("NOTA:");
                nota.setNotaExamen(sc.nextDouble());
                
                alumno.getListaNotas().add(nota);

                System.out.println("¿Cargar otra nota?  1.SÍ / 2.NO");
                exit = sc.nextInt();
            } while (exit == 1);
            
            alumnos.add(alumno);

            System.out.println("¿Cargar otro alumno? 1.SÍ / 2.NO");
            exit = sc.nextInt();
        } while (exit == 1);
        
        showAll(alumnos);
    }
    
    public static void showAll(ArrayList<AAlumno> alumnos){
        for (AAlumno a : alumnos){
            System.out.println("----- ALUMN@ "+ a.getNombreCompleto() + " -----");
            System.out.println("LEGAJO: " + a.getLegajo());
            
            for (ANota n : a.getListaNotas()){
                System.out.println("*** " + n.getCatedra() + " ***");
                System.out.println("Nota: " + n.getNotaExamen());
            }
            
            a.average();
            System.out.println("\n");
        }
    }
}
