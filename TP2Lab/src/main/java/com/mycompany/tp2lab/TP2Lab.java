package com.mycompany.tp2lab;

import java.util.Scanner;
import java.util.Date;

public class TP2Lab {
    
    public static void main(String[] args) {
        
        ////// EJERCICIO 1 ////////////////////////////////////////////////////////
        //CASTEO: Codifique un programa que solicite el ingreso de un numero decimal
        //y asigne el mismo a una variable valorDecimal de tipo double, aplique las
        //operaciones de CASTING para convertir la variable a los siguientes tipos de
        //datos, short, int, long, String, float investigue las diferentes formas
        //de lograr la conversión. Muestre por pantalla el resultado de las conversiones.
        ///////////////////////////////////////////////////////////////////////// 
        
         Scanner sc = new Scanner(System.in);  /* dejar descomentada */
         
//       System.out.println("Ingrese un núm decimal");
//       double valorDecimal = sc.nextDouble();
//       
//       short decimalAShort = (short)valorDecimal;
//       int decimalAInt = (int)valorDecimal;
//       long decimalALong = (long)valorDecimal;
//       String decimalAString = String.valueOf(valorDecimal);
//        
//       System.out.println("SHORT: " + decimalAShort + "\nINT: " + decimalAInt + "\nLONG: " + decimalALong + "\nSTRING: " + decimalAString);


        ////// EJERCICIO 2 ////////////////////////////////////////////////////////
        //Si se asigna un valor a una variable fuera de rango (mayor de lo establecido)
        // ¿Qué ocurre? ¿Existe alguna forma de resolverlo? Ejemplifique.
        ///////////////////////////////////////////////////////////////////////// 
        // Ocurre un error/excepción llamada InputMismatchException. La forma de resolverlo sería
        // incluyendo un condicional para terminar el programa si el valor es incorrecto o un
        // iterativo para continuar pidiendole al usuario que ingrese el valor hasta que sea válido.
        
     
        
        ////// EJERCICIO 3 ////////////////////////////////////////////////////////
        //Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 - 999)
        //y por medio del uso de las operaciones matemáticas módulo 10 y división por 10
        //efectué la suma de los 3 dígitos del número. Ejemplo ingreso 563, salida del algoritmo 14.
        ///////////////////////////////////////////////////////////////////////// 
        
        
//       int num = sc.nextInt();
//       
//       while(num < 100 || num > 999){
//           System.out.println("Num invalido. Ingreselo de nuevo");
//           num = sc.nextInt();
//       }
//
//         System.out.println(sumaDigitos(num));
//    }
//    
//    public static int sumaDigitos(int num){
//        int suma = 0;
//        
//        do{
//           suma = suma + num%10;
//           num = (int) num/10;
//        }while(num > 0);
//      
//        return suma;   
//    }


        ////// EJERCICIO 4 ////////////////////////////////////////////////////////
        // Desarrolle un programa que ayude a una cajera a determinar el número de billetes
        // y monedas que se necesitan de cada una de las siguientes denominaciones 200, 100, 50, 20, 10, 5, 2 y 1,
        // y monedas de 0.50, 0.25, 0.10 y 0.05 centavos para una cantidad de dinero dada. Ejemplo si la cantidad
        // es 1390,55 se necesitan 6 billetes de 200, 1 billete de 100, 1 billete de 50, 2 billetes de 20, 1 moneda de 0.50
        // y una moneda de 0.05 centavos.
        /////////////////////////////////////////////////////////////////////////
        
//        System.out.println("Ingrese el monto del vuelto");
//        double vuelto = sc.nextDouble();
//        
//        int contador200 = 0, contador100 = 0, contador50 = 0, contador20 = 0, contador10 = 0, contador5 = 0, contador2 = 0, contador1 = 0, contador050 = 0, contador025 = 0, contador010 = 0, contador005 = 0;
//        
//        while (vuelto >= 200) {
//            vuelto = vuelto - 200;
//            contador200++;
//        }
//
//        while (vuelto >= 100) {
//            vuelto = vuelto - 100;
//            contador100++;
//        }
//
//        while (vuelto >= 50) {
//            vuelto = vuelto - 50;
//            contador50++;
//        }
//        while (vuelto >= 20) {
//            vuelto = vuelto - 20;
//            contador20++;
//        }
//        while (vuelto >= 10) {
//            vuelto = vuelto - 10;
//            contador10++;
//        }
//        while (vuelto >= 5) {
//            vuelto = vuelto - 5;
//            contador5++;
//        }
//        while (vuelto >= 2) {
//            vuelto = vuelto - 2;
//            contador2++;
//        }
//        while (vuelto >= 1) {
//            vuelto = vuelto - 1;
//            contador1++;
//        }
//        while (vuelto >= 0.50) {
//            vuelto = vuelto - 0.50;
//            contador050++;
//        }
//        while (vuelto >= 0.25) {
//            vuelto = vuelto - 0.25;
//            contador025++;
//        }
//        while (vuelto >= 0.10) {
//            vuelto = vuelto - 0.10;
//            contador010++;
//        }
//
//        while (vuelto >= 0.04) {
//            vuelto = vuelto - 0.04;
//            contador005++;
//        }
//        
//        System.out.println("Necesitará:\n" + contador200 + " x $200\n" + contador100 + " x $100\n" + contador50 + " x $50\n" + contador20 + " x $20");
//        System.out.println(contador10 + " x $10\n" + contador5 + " x $5\n" + contador2 + " x $2\n" + contador1 + " x $1\n" + contador050 + " x $0.50");
//        System.out.println(contador025 + " x $0.25\n" + contador010 + " x $0.10\n" + contador005 + " x $0.05");
//        
        
       

        ////// EJERCICIO 5 /////////////////////////////////////////////////////////////
        // Solicite el ingreso de un número y conviértalo a un String mediante String.valueOf
        ///////////////////////////////////////////////////////////////////////////////
        
//        System.out.println("Ingrese un num");
//        int num = sc.nextInt();
//        String numString = String.valueOf(num);
//        System.out.println("STRING: " + numString);
        
        ////// EJERCICIO 6 /////////////////////////////////////////////////////////////
        // Del siguiente String “La lluvia en Mendoza es escasa” indique cual es el tamaño de la cadena es decir su número de caracteres.
        ///////////////////////////////////////////////////////////////////////////////
        
//        String frase = "La lluvia en Mendoza es escasa";
//        int tamaño = frase.length();
//        System.out.println("La frase \"La lluvia en Mendoza es escasa\" tiene " + tamaño + " carácteres.");
    

        ////// EJERCICIO 7 /////////////////////////////////////////////////////////////
        // Solicite el ingreso de una cadena y determine el tamaño de la misma y cuantas vocales tiene en total (recorre el String con charAt)
        ///////////////////////////////////////////////////////////////////////////////
        
//        System.out.println("Ingrese una palabra/frase");
//        String cadena = sc.nextLine();
//        cadena = cadena.toUpperCase();
//        int tamaño = cadena.length(), contador = 0;
//                
//        for (int i = 0; i <= tamaño-1; i++){
//            switch(cadena.charAt(i)){
//                case 'A','E','I','O','U':{
//                    contador++;
//                    break;
//                }   
//            }
//        }
//        
//        System.out.println(tamaño + " carácteres\n" + contador + " vocales.");

        ////// EJERCICIO 8 /////////////////////////////////////////////////////////////
        // Reemplaza todas las a del String anterior por una e. (aplique replace)
        ///////////////////////////////////////////////////////////////////////////////

//        System.out.println("Ingrese una palabra/frase");
//        String cadena = sc.nextLine();
//        cadena = cadena.replace('a', 'e');
//        System.out.println(cadena);


        ////// EJERCICIO 9 /////////////////////////////////////////////////////////////
        // Recorre el String del ejercicio 6 y transforma cada carácter a su código ASCII.
        // Muéstralos en línea recta, separados por un espacio entre cada carácter.
        ///////////////////////////////////////////////////////////////////////////////
        
//        String frase = "La lluvia en Mendoza es escasa";
//        int tamaño = frase.length();
//        
//        for (int i = 0; i <= tamaño-1; i++){
//            int caracter = frase.charAt(i);
//            System.out.print(caracter + " ");
//        }


        ////// EJERCICIO 10 /////////////////////////////////////////////////////////////
        // Convertir una frase a mayúsculas o minúsculas, que daremos opción
        // a que el usuario lo pida y mostraremos el resultado por pantalla.
        ///////////////////////////////////////////////////////////////////////////////
        
//        System.out.println("Ingrese una frase");
//        String frase = sc.nextLine();
//        System.out.println("¿Convertir a mayúsculas (1) o minúsculas (2)?");
//        int eleccion = sc.nextInt();
//        
//         while(eleccion != 1 && eleccion != 2){
//            System.out.println("Elija una opción valida.");
//            eleccion = sc.nextInt();
//         }
//        
//        if (eleccion == 1){
//            frase = frase.toUpperCase();
//        }else{
//            frase = frase.toLowerCase();
//        }
//        
//        System.out.println(frase);

        ////// EJERCICIO 11 /////////////////////////////////////////////////////////////
        // Pedir dos palabras por teclado, indicar si son iguales. (equals, compareTo,
        // compareToIgnoreCase)
        ///////////////////////////////////////////////////////////////////////////////

//        System.out.println("Ingrese dos palabras");
//        String palabra1 = sc.nextLine();
//        String palabra2 = sc.nextLine();
//
//        
//        if (palabra1.equalsIgnoreCase(palabra2)){
//            System.out.println("Son la misma palabra!");
//        }else{
//            System.out.println("No son la misma palabra");
//        }

        
//        ////// EJERCICIO 12 /////////////////////////////////////////////////////////////
//        // Dada una cadena, extraer la cuarta y quinta letra usando el método substring.
//        ///////////////////////////////////////////////////////////////////////////////
       
//        System.out.println("Ingrese una cadena");
//        String cadena = sc.nextLine();
//        String subcadena = cadena.substring(3,5);
//        System.out.println(subcadena);

         ////// EJERCICIO 13 /////////////////////////////////////////////////////////////
         // Pedir el ingreso de dos cadenas por teclado, indicar si la segunda cadena se
         // encuentra dentro de la primera (usar indexOf o contains).
         ///////////////////////////////////////////////////////////////////////////////

//         System.out.println("Ingrese dos cadenas");
//         String cadena1 = sc.nextLine();
//         String cadena2 = sc.nextLine();
//         
//         if (cadena1.contains(cadena2)){
//             System.out.println("La 2da cadena está dentro de la 1ra");
//         }else{
//             System.out.println("La 2da cadena NO está dentro de la 1ra");
//         }

         ////// EJERCICIO 14 /////////////////////////////////////////////////////////////
         // Indique cual es la diferencia entre los datos primitivos (por valor) ejemplo el int
         // y su contraparte por referencia ejemplo Integer.
         /////////////////////////////////////////////////////////////////////////////// 
         
         //La diferencia entre estos tipos de datos es que los datos por valor utilizan, justamente, aquel valor que se les haya asignado
         // en el espacio de memoria, mientras que los datos por referencia utilizan la dirección de ese espacio de memoria.
         // Los datos por referencia pueden ser un conjunto de variables y utilizan métodos, mientras que los primitivos no.
         
         
         ////// EJERCICIO 15 /////////////////////////////////////////////////////////////
         // Indique que sucede si realizo la siguiente declaración de variable:
         // int numero = null;
         // ¿Qué debo modificar para poder asignar null a la variable?
         /////////////////////////////////////////////////////////////////////////////// 
         
         //Ocurre un error por tipos incompatibles, el null no puede ser convertido a int.
         //Para solucionarlo se tiene que asignarle el tipo por referencia Integer a la variable numero.
         
         ////// EJERCICIO 16 /////////////////////////////////////////////////////////////
         // Como transformo una variable tipo Double a una variable tipo double.
         /////////////////////////////////////////////////////////////////////////////// 
         
         //Si no me equivoco, simplemente se le ingresa la variable referencial a otra primitiva:
//        Double num = 10.8;
//        double numConvertido = num;
//        System.out.println("Double: " + num + "\ndouble: " + numConvertido);
     

         ////// EJERCICIO 17 /////////////////////////////////////////////////////////////
         // Cree una clase FuncionesPrograma y codifique una función estática que reciba como parámetro
         // una fecha de tipo Date y retorne la fecha como una cadena.
         // public static String getFechaString(Date fecha){
         // ……….
         // }
         // Cree una clase Principal que contenga un método main y haga uso de la función getFechaString.
         ///////////////////////////////////////////////////////////////////////////////     

//         Date fecha = new Date();
//         FuncionesPrograma conversion = new FuncionesPrograma();
//     
//         System.out.println("FECHA DE HOY:\n" + fecha + "\t" + fecha.getClass());
//         String fechaString = conversion.getFechaString(fecha);
//         System.out.println("FECHA STRING:\n" + fechaString + "\t" + fechaString.getClass());
         
         
         ////// EJERCICIO 18 /////////////////////////////////////////////////////////////
         // En la clase FuncionesPrograma codifique una función estática que reciba como parámetro
         // 3 valores enteros, día, mes, anio y retorne la fecha de tipo Date correspondiente.
         // public static Date getFechaDate(int día, int mes, int anio){
         // ……….
         // }
         // En la clase Principal creada en el punto anterior haga uso de la función getFechaDate.
         ///////////////////////////////////////////////////////////////////////////////
         
//         int dia = 26, mes = 7, anio = 2023;
//         FuncionesPrograma conversion = new FuncionesPrograma();
//         Date fecha = conversion.getFechaDate(dia, mes, anio);
//         System.out.println("FECHA:\n" + fecha);

         ////// EJERCICIO 19 /////////////////////////////////////////////////////////////
         // Cree una clase OperacionMatematica con dos atributos numéricos decimales, valor1 y valor2
         // y un atributo String de nombre operación. Cree los correspondientes métodos get/set.
         //
         // Cree una clase Calculo que contenga un método main, donde cree una instancia de la clase
         // OperacionMatematica, asigne 2 valores para las variables de la instancia y ejecute la función
         // aplicarOperacion, pasando como parámetro primero “+”, después “-”, a continuación “*” y finalmente
         // “/”. Muestre por pantalla el resultado de las operaciones.
         ///////////////////////////////////////////////////////////////////////////////
         
//         OperacionMatematica operacionMatematica = new OperacionMatematica();
//         double suma, resta, mult, division;
//         
//         operacionMatematica.setValor1(35.4);
//         operacionMatematica.setValor2(10.2);
//         
//         suma = operacionMatematica.aplicarOperacion("+");
//         resta = operacionMatematica.aplicarOperacion("-");
//         mult = operacionMatematica.aplicarOperacion("*");
//         division = operacionMatematica.aplicarOperacion("/");
//         
//         System.out.println("SUMA: " + suma + "\nRESTA: " + resta + "\nMULTIPLICACIÓN: " + mult + "\nDIVISION: " + division);

         ////// EJERCICIO 20 /////////////////////////////////////////////////////////////
         // Cree una clase Fracción con dos atributos numéricos enteros, numerador y denominador. Agregue un constructor sobrecargado
         // (debe contener como parámetros el numerador y el denominador) que cree el objeto Fracción correspondiente.
         // 
         // Cree una clase OperacionesFraccion que contenga un método main donde se solicite al usuario el ingreso de
         // 4 valores numéricos enteros con los cuales se crearan 2 objetos Fracción y finalizada la creación de los
         // mismos se ejecutaran los 4 métodos implementados anteriormente asignando el resultado a una nueva variable
         // de tipo Fracción y mostrando por pantalla el resultado de las operaciones realizadas.
         ///////////////////////////////////////////////////////////////////////////////
         
//         int num1, denom1, num2, denom2;
//         /*lectura de nums y denoms */
//         System.out.println("Ingrese los valores de la primera fracción:");
//         num1 = sc.nextInt();
//         System.out.println("--");
//         denom1 = sc.nextInt();
//         System.out.println("Segunda fracción:");
//         num2 = sc.nextInt();
//         System.out.println("--");
//         denom2 = sc.nextInt();
//         /*creo objetos*/
//         Fraccion f1 = new Fraccion(num1,denom1);
//         Fraccion f2 = new Fraccion(num2,denom2);
//
//         Fraccion suma = f1.sumarFracciones(f1, f2);
//         Fraccion resta = f1.restarFracciones(f1, f2);
//         Fraccion mult = f1.multiplicarFracciones(f1, f2);
//         Fraccion div = f1.dividirFracciones(f1, f2);
//         
//         System.out.println("SUMA: " + suma.getNumerador() + "/" + suma.getDenominador());
//         System.out.println("RESTA: " + resta.getNumerador() + "/" + resta.getDenominador());
//         System.out.println("MULTIPLICACIÓN: " + mult.getNumerador() + "/" + mult.getDenominador());
//         System.out.println("DIVISÓN: " + div.getNumerador() + "/" + div.getDenominador());


         ////// EJERCICIO 21 /////////////////////////////////////////////////////////////
         // Codifique un programa que solicite un número entero mayor a cero y que mediante recursión sume
         // todos los números números naturales desde el número ingresado hasta 1.
         // Ejemplo: Ingreso 10
         // El programa debe sumar 10 + 9 + 8 +7 +6 + 5 + 4 + 3 + 2 + 1
         ///////////////////////////////////////////////////////////////////////////////    

//         System.out.println("Ingrese un número mayor a cero");
//         int num = sc.nextInt();
//         
//         while (num <= 0){
//             System.out.println("Inválido. Ingrese un número mayor a cero");
//             num = sc.nextInt();
//         }
//         
//         System.out.println("La suma desde " + num + " hasta 1 da: " + recursionSumaNaturales(num));


         ////// EJERCICIO 22 /////////////////////////////////////////////////////////////
         // Suma los dígitos de un número ingresado por el usuario de forma recursiva.
         // Ejemplo: el usuario ingresa 1596
         // El programa debe sumar 1 + 5 + 9 + 6
         ///////////////////////////////////////////////////////////////////////////////  

//         System.out.println("Ingrese un número positivo");
//         int num = sc.nextInt();
//         
//          while (num < 0){
//             System.out.println("Inválido. Ingrese un número positivo");
//             num = sc.nextInt();
//         }
//         
//         System.out.println("La suma de los dígitos de " + num + " da: " + recursionSumaDigitos22(num));
         

        ////// EJERCICIO 23 /////////////////////////////////////////////////////////////
         // Crea un programa donde se pida el ingreso de una cadena y por medio de recursión mostrar la cadena de forma inversa.
         // Ejemplo: Ingreso “computadora de escritorio”
         // Invertir cadena “oirotircse ed arodatupmoc”
         ///////////////////////////////////////////////////////////////////////////////

//         System.out.println("Ingrese una cadena");
//         String cadena = sc.nextLine();
//         
//         System.out.println(recursionCadena23(cadena, cadena.length()-1));
         
    }
    
    /*METODOS RECURSIVOS*/
    
//    public static int recursionSumaNaturales21(int num){
//        int suma = 0;
//        
//        if (num == 1){
//            suma = 1;
//        }else{
//            suma = num + recursionSumaNaturales21(num-1);
//        }
//        return suma;
//    }
    
//     public static int recursionSumaDigitos22(int num){
//        int suma = 0;
//        
//        if (num < 10){
//            suma = num;
//        }else{
//            suma = num%10 + recursionSumaDigitos22(num/10);
//        }
//        return suma;
//    }
    
//    public static String recursionCadena23(String cadena, int tamaño){
//        String retorno = "";
//        
//        if (tamaño == 0){
//            retorno = cadena.charAt(tamaño) + "";
//        }else{
//            retorno = cadena.charAt(tamaño) + recursionCadena23(cadena, tamaño-1);
//        }
//        return retorno;
//    }
}
       