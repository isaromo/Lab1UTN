package com.mycompany.tp2lab;

import java.util.Date;

public class FuncionesPrograma {
         ////// EJERCICIO 17 /////////////////////////////////////////////////////////////
         // Cree una clase FuncionesPrograma y codifique una función estática que reciba como parámetro
         // una fecha de tipo Date y retorne la fecha como una cadena.
         // public static String getFechaString(Date fecha){
         // ……….
         // }
         // Cree una clase Principal que contenga un método main y haga uso de la función getFechaString.
         ///////////////////////////////////////////////////////////////////////////////
    
    public static String getFechaString(Date fecha){
        String fechaString = String.valueOf(fecha);
        return fechaString;
    }
    
         ////// EJERCICIO 18 /////////////////////////////////////////////////////////////
         // En la clase FuncionesPrograma codifique una función estática que reciba como parámetro
         // 3 valores enteros, día, mes, anio y retorne la fecha de tipo Date correspondiente.
         // public static Date getFechaDate(int día, int mes, int anio){
         // ……….
         // }
         // En la clase Principal creada en el punto anterior haga uso de la función getFechaDate.
         ///////////////////////////////////////////////////////////////////////////////
    
    public static Date getFechaDate(int dia, int mes, int anio){
        anio = anio - 1900;
        Date fechaParametros = new Date(anio, mes, dia);
        return fechaParametros;
    }
    
    
}
