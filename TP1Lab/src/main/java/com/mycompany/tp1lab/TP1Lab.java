/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1lab;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author AyP Computacion
 */
public class TP1Lab {

    public static void main(String[] args) {
        
        ///////////////EJERCICIO 1 //////////////////////////////////////////////////////////////////////////
        //1) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
        //Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.
        ///////////////////////////////////////////////////////////////////////////////////////////        
        
//        String nombre = "Isabella";
//        System.out.println("Bienvenida " + nombre);
        
        ///////////////EJERCICIO 2 //////////////////////////////////////////////////////////////////////////
        //2) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (aplica Scanner y JOptionPane). 
        ///////////////////////////////////////////////////////////////////////////////////////////
        
//       ////scanner/////
//        System.out.println("Ingrese su nombre");
        Scanner sc = new Scanner(System.in);
//        String nombre = sc.nextLine();
//        System.out.println("Bienvenida " + nombre);
//        
//         ////joptionpane/////
//        String nombre;
//        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
//        JOptionPane.showMessageDialog(null , "Bienvenida " + nombre);
                
        ///////////////EJERCICIO 3 //////////////////////////////////////////////////////////////////////////
        //3) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta,
        //multiplicación, división y módulo (resto de la división).  
        ///////////////////////////////////////////////////////////////////////////////////////////
        
//        int a = 15, b = 3;
//        System.out.println("Suma: " + (a + b));
//        System.out.println("Resta: " + (a - b));
//        System.out.println("Mult: " + (a * b));
//        System.out.println("División: " + (a / b));
//        System.out.println("Módulo: " + (a % b));


        ///////////////EJERCICIO 4 //////////////////////////////////////////////////////////////////////////
        //4) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
        //Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.   
        ///////////////////////////////////////////////////////////////////////////////////////////
        
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       
//       if (a > b) {
//           System.out.println(a + " es mayor a " + b);
//       } else if (a < b) {
//           System.out.println(b + " es mayor a " + b);
//       }else{
//           System.out.println("Son iguales");
//       }
   
        ///////////////EJERCICIO 5 //////////////////////////////////////////////////////////////////////////
        //5) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.    
        ///////////////////////////////////////////////////////////////////////////////////////////
       
//      int num = sc.nextInt();
//      
//     if (num % 2 == 0) {
//          System.out.println(num + " es divisible por 2");
//        }else{
//          System.out.println(num + " no es divisible por 2");
//        }
       
        ///////////////EJERCICIO 6 //////////////////////////////////////////////////////////////////////////
        //6) Lee un número por teclado que pida el precio de un producto (puede tener decimales)
        // y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.     
        ///////////////////////////////////////////////////////////////////////////////////////////
        
//        System.out.println("Ingrese el precio del producto");
//        double precio = sc.nextDouble();
//        System.out.println("$" + precio + " + IVA serian $" + (precio + (precio*0.21)));
        
      
        ///////////////EJERCICIO 7 //////////////////////////////////////////////////////////////////////////
        //7) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.      
        ///////////////////////////////////////////////////////////////////////////////////////////
       
//        int i = 1;
//        
//        while (i <= 100){
//            System.out.println(i);
//            ++i;
//        }
                
        ///////////////EJERCICIO 8 //////////////////////////////////////////////////////////////////////////
        //8) Haz el mismo ejercicio anterior con un bucle for.      
        ///////////////////////////////////////////////////////////////////////////////////////////
        
//        for (int i = 1; i <= 100; i++){
//            System.out.println(i);
//        }
        
        ///////////////EJERCICIO 9 //////////////////////////////////////////////////////////////////////////
        //9) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.    
        ///////////////////////////////////////////////////////////////////////////////////////////

//        for (int i = 1; i <= 100; i++){
//            if (i % 2 == 0 || i % 3 == 0){
//                System.out.println(i);
//            }
//    }
        
        ///////////////EJERCICIO 10 //////////////////////////////////////////////////////////////////////////
        //10) Lee un número por teclado y comprueba que este número es mayor o igual que cero,
        //si no lo es lo volverá a pedir (do while), después muestra ese número por consola.     
        ///////////////////////////////////////////////////////////////////////////////////////////
        
//        System.out.println("Ingrese un núm");
//        int num;
//        
//        do{
//            num = sc.nextInt();
//            if (num < 0){
//               System.out.println("Invalido. Ingrese un núm");
//            }
//        }while (num < 0);
            

        ///////////////EJERCICIO 11 //////////////////////////////////////////////////////////////////////////
        //11) Escribe una aplicación con un String que contenga una contraseña cualquiera.
        //  Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá más la
        // contraseña y mostrara un mensaje diciendo “Acceso Correcto”. Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
        ///////////////////////////////////////////////////////////////////////////////////////////
        
//        String contra = "Password", ingreso;
//        System.out.println("Ingrese la contraseña");
//        int intentos = 0;
//        
//        do{
//            System.out.println("Intento " + ++intentos);
//            ingreso = sc.nextLine();
//            if (!(ingreso.equals(contra))){
//                System.out.println("INCORRECTO");
//            }else{
//                System.out.println("ACCESO CORRECTO");
//            }
//        }while(intentos <= 2 && (!ingreso.equals(contra)));
        
        
       ///////////////EJERCICIO 12 //////////////////////////////////////////////////////////////////////////
       //12) Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no
       //(siendo sábado y domingo no laborales). Usa un switch para ello. Valida que el número ingresado sea un valor entre 1 y 7,
       //caso contrario solicite el valor nuevamente.
       ///////////////////////////////////////////////////////////////////////////////////////////

//        System.out.println("Ingrese un día (N) de la semana");
//        int dia = sc.nextInt();
//
//        while (dia < 1 || dia > 7){
//            System.out.println("Ingrese un N válido");
//            dia = sc.nextInt();
//        }
//
//        switch(dia) {
//          case 1,2,3,4,5:
//              System.out.println("Día laboral");
//            break;
//          case 6,7:
//              System.out.println("Día no laboral");
//            break;
//        }
               
       ///////////////EJERCICIO 13 //////////////////////////////////////////////////////////////////////////
       //13) Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo
       //puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
       //17 si es primo. Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible
       //desde ese número hasta 1. NOTA: Si se introduce un número menor o igual que 1, directamente es no primo. 
       ///////////////////////////////////////////////////////////////////////////////////////////

//       int numero = sc.nextInt();
//       double raiz = Math.sqrt(numero);
//       
//       if (numero <= 1){
//           System.out.println("No es primo");
//       }else{
//           for (; raiz >=1; raiz--){
//               if (numero % raiz == 0){
//                   System.out.println("Divisible por " + raiz + ". No es primo");
//                   break;
//                   }else{
//                   System.out.println( "Es primo");
//                   break;
//               }
//           }
//       }
//    }

        ///////////////EJERCICIO 14 //////////////////////////////////////////////////////////////////////////
       //14) Codifique un programa de consola en Java que permita realizar las siguientes acciones:
       //Generar un número aleatorio entre 0 y 100, para ello use la siguiente función: 
       //   int x = new Double(Math.random() * 100).intValue(); 
       //Una vez generado el número codifique la lógica necesaria para encontrar el número aleatorio ayudando al
       //usuario informando al mismo si el número ingresado es mayor o menor al número aleatorio buscado.
       //Una vez encontrado el número muestre la cantidad de intentos necesarios para lograrlo.    
       ///////////////////////////////////////////////////////////////////////////////////////////
       
       int aleatorio = new Double(Math.random() * 100).intValue(), intentos = 0, ingreso;
       
        System.out.println("Adivine el número generado");
      
        do{
            ingreso = sc.nextInt();
            intentos++;
            if (ingreso > aleatorio){
                System.out.println("Más bajo");
                }else if (ingreso < aleatorio){
                    System.out.println("Más alto");
                }else{
                    System.out.println("CORRECTO! Le tomó " + intentos + " intentos.");
                }      
        } while(ingreso != aleatorio);
       
    }
}
