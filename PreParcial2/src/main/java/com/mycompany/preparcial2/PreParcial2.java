package com.mycompany.preparcial2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PreParcial2 {
                                //codigo //denominación  //porcentaje o valor
    static String [][] haberes = {{"100", "Presentismo", "9"},
                                 {"101", "Titulo Profesional", "9"},
                                 {"102", "Horas Extraordinarias", "M"},
                                 {"103","Horas Nocturnas", "M"} ,
                                 {"104", "Otros Haberes", "M"}};
    
    static String [][] deducciones = {{"200", "Obra Social", "3"},
                                     {"201", "Jubilacion", "11"},
                                     {"202", "Sindicato", "2"} ,
                                     {"203", "Seguro", "1.5"},
                                     {"204", "Otros", "M"}};
    
    static List<Integer> codigosIngresados = new ArrayList<Integer>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        int salida;

        //  SETTEAR EMPLEADO    //
        Empleado empleado = new Empleado();
        System.out.println("------EMPLEADO-----");
        System.out.println("NOMBRE:");
        empleado.setNombreEmpleado(scStr.nextLine());
        System.out.println("CUIL:");
        empleado.setCuil(sc.nextLong());
        System.out.println("AÑO DE INGRESO:");
        empleado.setAnioIngreso(sc.nextInt());
        System.out.println("MES DE LIQUIDACIÓN:");
        int mesLiq = sc.nextInt();
        System.out.println("AÑO DE LIQUIDACIÓN:");
        int anioLiq = sc.nextInt();
        System.out.println("SUELDO BÁSICO:");
        empleado.setSueldoBasico(sc.nextDouble());
        empleado.setMontoAntiguedad();
        ///////////////////////////
        
        do {
            //  SETTEAR BONO SUELDO   //
            BonoSueldo bonoSueldo = new BonoSueldo();
            
            bonoSueldo.setEmpleado(empleado);
            bonoSueldo.setMesLiquidacion(mesLiq);
            bonoSueldo.setAnioLiquidacion(anioLiq);
            
            String[][] bonoCalculado = new String[10][4];

            //  HABERES //
            System.out.println("-----HABERES-----");
            System.out.println("**Ingrese los haberes del empleado [" + empleado.getNombreEmpleado() + "]**");
            System.out.println("Para salir ingrese 000");

            
            int fila = 0;
            int contH = 0;
            while (fila < 10) {
                System.out.println("Ingrese el código del item " + (fila + 1));
                int codigo = sc.nextInt();

                if (codigo == 000 && contH == 0) {     //no se ingresa nada
                    System.out.println("Debe ingresar al menos 1 haber");
                    
                } else if (codigo == 000) { //el codigo es 000 se rompe el programa
                    break;
                    
                } else {    // el codigo no es 000
                    if (codigoYaIngresado(codigo) == false) {    //el código NO ha sido ingresado
                        String[] filaBono = haberesEncontrados(codigo, empleado);
                            
                        if (filaBono == null){  //el código NO se encuentra en haberes
                           System.out.println("El código ingresado es incorrecto");
                        } else {
                            bonoCalculado[fila][0] = filaBono[0];
                            bonoCalculado[fila][1] = filaBono[1];
                            bonoCalculado[fila][2] = filaBono[2];
                            bonoCalculado[fila][3] = filaBono[3];
                            fila++;
                            contH++;
                            codigosIngresados.add(codigo);
                        }
                        
                    } else {    // el código ya fue ingresado
                        System.out.println("El código ya fue ingresado");
                    }
                }
            }
            

            //  DEDUCCIONES //
            int contD = 0;
            System.out.println("**Ingrese las deducciones del empleado [" + empleado.getNombreEmpleado() + "]**");
            while (fila < 10) {
                System.out.println("Ingrese el código del item " + (fila + 1));
                int codigo = sc.nextInt();

                if (codigo == 000 && contD == 0) {     //no se ingresa nada
                    System.out.println("Debe ingresar al menos 1 haber");
                
                } else if (codigo == 000) { //el codigo es 000 se rompe el programa
                    break;
                    
                } else {    // el codigo no es 000
                    if (codigoYaIngresado(codigo) == false) {    //el código NO ha sido ingresado
                        String[] filaBono = deduccionesEncontradas(codigo, empleado);
                            
                        if (filaBono == null){  //el código NO se encuentra en deducciones
                           System.out.println("El código ingresado es incorrecto");
                        } else {
                            bonoCalculado[fila][0] = filaBono[0];
                            bonoCalculado[fila][1] = filaBono[1];
                            bonoCalculado[fila][2] = filaBono[2];
                            bonoCalculado[fila][3] = filaBono[3];
                            fila++;
                            contD++;
                            codigosIngresados.add(codigo);
                        }
                        
                    } else {    // el código ya fue ingresado
                        System.out.println("El código ya fue ingresado");
                    }
                }
            }
            
            rellenarVacios(bonoCalculado);
            
            //  SUMA HABERES    //
            double sumaHaberes = 0;
            for (int i = 0; i < bonoCalculado.length; i++) {
                sumaHaberes += Double.parseDouble(bonoCalculado[i][2]);
            }

            //  SUMA DEDUCCIONES    //
            double sumaDeduc = 0;
            for (int i = 0; i < bonoCalculado.length; i++) {
                sumaDeduc += Double.parseDouble(bonoCalculado[i][3]);
            }

            //  MONTO A LIQUIDAR    //
            double montoLiq = (empleado.getSueldoBasico() + empleado.getMontoAntiguedad() + sumaHaberes) - sumaDeduc;
            bonoSueldo.setMontoLiquidacion(montoLiq);

            // SETTEO EL BONO CALCULADO A LA CLASE BonoSueldo   //
            bonoSueldo.setBonoCalculado(bonoCalculado);
            //  AGREGO OBJ. BONO SUELDO AL ARRAYLIST DE BONOS DE CLASE Empleado  //
            empleado.getBonos().add(bonoSueldo);

            //  SALIDA  //
            System.out.println("¿Desea generar un nuevo bono de sueldo? 1.SÍ/2.NO");
            salida = sc.nextInt();
        } while (salida == 1);

        //  MOSTRAR BONOS   //
        mostrarBonos(empleado);
    }
    
    /////////////
    public static void mostrarBonos(Empleado empleado){
        for (BonoSueldo bono : empleado.getBonos()){
            System.out.println("EL BONO DE SUELDO A LIQUIDAR ES:");
            
            String format1 = "%1$-20s|%2$-20s\n";
            System.out.format(format1, "Nombre", empleado.getNombreEmpleado());
            System.out.format(format1, "CUIL", empleado.getCuil());
            
            String format2 = "%1$-20s|%2$-20s|%3$-20s|%4$-20s\n";
            System.out.format(format2, "Mes Liq", bono.getMesLiquidacion(), "Año Liq", bono.getAnioLiquidacion());
            System.out.format(format2, "Sueldo Básico", empleado.getSueldoBasico(), "Año ingreso", empleado.getAnioIngreso());
            System.out.format(format2, "Código Item", "Denominación", "Haberes", "Deducciones");
            
            String format3 = "%1$-20s|";
            
            for (int i = 0; i < bono.getBonoCalculado().length; i++){
                for (int j = 0; j < bono.getBonoCalculado()[0].length; j++){
                    System.out.format(format3, bono.getBonoCalculado()[i][j]);
                }
                System.out.println("");
            }
            
            System.out.format(format1, "NETO", bono.getMontoLiquidacion());
        }
        
        System.out.println("\n");
    } 
    //////////////
    public static boolean codigoYaIngresado(int codigo){
        if (!(codigosIngresados.isEmpty()) && codigosIngresados.contains(codigo)){
            return true;
        } else {
            return false;
        }
    }
    ///////////////
    public static String[] haberesEncontrados(int codigo, Empleado empleado){
        Scanner sc = new Scanner(System.in);
        
        String[] filaBono = new String[4];
        
        for (int i = 0; i < haberes.length; i++){
            if (String.valueOf(codigo).equals(haberes[i][0])){
                filaBono[0] = haberes[i][0];    //código item
                filaBono[1] = haberes[i][1];    //denominación
                filaBono[3] = "0";
                
                if (haberes[i][2].equals("M")){     //valor de item debe ser asignado por el usuario
                    System.out.println("*Haber valor M* Ingrese el valor del item: ");
                    double porcentaje = sc.nextDouble();
                    filaBono[2] = String.valueOf(porcentaje);
                    
                } else {    //haberes ya tiene porcentaje
                    filaBono[2] = String.valueOf((Integer.parseInt(haberes[i][2]) * empleado.getSueldoBasico()) / 100);
                }
                
                return filaBono;
            }
        }
        
        return null;
    }
    ///////////////
    public static String[] deduccionesEncontradas(int codigo, Empleado empleado){
        Scanner sc = new Scanner(System.in);
        
        String[] filaBono = new String[4];
        
        for (int i = 0; i < deducciones.length; i++){
            if (String.valueOf(codigo).equals(deducciones[i][0])){
                filaBono[0] = deducciones[i][0];
                filaBono[1] = deducciones[i][1];
                filaBono[2] = "0";
                
                if (deducciones[i][2].equals("M")){ //deducciones tiene valor asignado por el usuario
                    System.out.println("*Deducción valor M* Ingrese el valor del item: ");
                    double porcentaje = sc.nextDouble();
                    filaBono[3] = String.valueOf(porcentaje);
                    
                } else {    //deducciones tiene porcentaje
                    filaBono[3] = String.valueOf((Double.parseDouble(deducciones[i][2]) * empleado.getSueldoBasico()) / 100);
                }
                
                return filaBono;
            }
        }
        
        return null;
    }
    
    public static void rellenarVacios(String[][] bonoCalculado){
        for (int i = 0; i < bonoCalculado.length; i++){
            for (int j = 0; j < bonoCalculado[0].length; j++){
                if (bonoCalculado[i][j] == null){
                    bonoCalculado[i][j] = "0";
                }
            }
        }
    }

/*    
    public static void mostrar(String[][] bonoCalculado){
        for (int i = 0; i < bonoCalculado.length; i++){
            for (int j = 0; j < bonoCalculado[0].length; j++){
                System.out.print(bonoCalculado[i][j] + " ");
            }
            System.out.println("");
        }
    }
*/
}
