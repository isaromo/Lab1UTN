package com.mycompany.tp2lab;


public class Fraccion {
    private int numerador, denominador;
    
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
   
    /*getters para imprimir la fracción final*/

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    
    /*cuentas*/
    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
        int resulDenominador = f1.denominador * f2.denominador;
        int resulNumerador = (resulDenominador / f1.denominador * f1.numerador) + (resulDenominador / f2.denominador * f2.numerador);
        
        return new Fraccion(resulNumerador, resulDenominador);
    }
    
    public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
        int resulDenominador = f1.denominador * f2.denominador;
        int resulNumerador = (resulDenominador / f1.denominador * f1.numerador) - (resulDenominador / f2.denominador * f2.numerador);
        
        return new Fraccion(resulNumerador, resulDenominador);
    }

    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
        int resulDenominador = f1.denominador * f2.denominador;
        int resulNumerador = f1.numerador * f2.numerador;
        
        return new Fraccion(resulNumerador, resulDenominador);
    }
    
    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
        int resulDenominador = f1.denominador * f2.numerador;
        int resulNumerador = f1.numerador * f2.denominador;
        
        return new Fraccion(resulNumerador, resulDenominador);
    }
}