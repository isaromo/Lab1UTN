package com.mycompany.tpmutantes_opcional;

import java.util.Scanner;

public class TPMutantes_Opcional {

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        
        String[] dna = new String[6];
        String[][] dnaMatrix = new String[6][6];
        
        System.out.println("-----------TEST MUTANTE-----------");
        System.out.println("Ingrese su ADN letra por letra....");
        
        for (int i = 0; i < 6; i++){
            System.out.println("**" + (i+1) + "as 6 letras**");
            
            String sixLetters = "";
            for (int j = 0; j < 6; j++){
                String letter;
                
                while (true){   //verifico que las letras ingresadas sean A, T, C o G
                    letter = scStr.nextLine().toUpperCase();
                    
                    if (isATCG(letter)){
                        break;
                    }
                }
                sixLetters += letter;   //agrego letra por letra al string de cada fila
            }
            
            dna[i] = sixLetters;    //le instancio a dna[] el string de cada fila donde corresponde
        }
        
        System.out.println("--- SU ADN ES: ---");
        showMatrix(dnaMatrix);
        System.out.println("Realizando test...");
        waitTwoSeconds();
        
    }
    
    public static boolean isATCG(String letter) {
        if (letter.equals("A") || letter.equals("T") || letter.equals("C") || letter.equals("G")) {
            return true;
        } else {
            System.out.println("**ERROR** Letra inválida. Ingresela de nuevo");
            return false;
        }
    }
    
    public static boolean isMutant(String[] dna){
        String[][] dnaMatrix = new String[6][6];
        dnaMatrix = convertToMatrix(dna);
        
        int amountSequences = 0;
        
        
        return true; //CAMBIAAAAAAAAAAAAAAAAAAAR
    }
    
    public static int horizontalTest(String[][] dnaMatrix) {
        int horizontalSeq = 0; //contador de secuencias horizontales

        for (int i = 0; i < dnaMatrix.length; i++) {
            int amountLetters = 0;

            for (int j = 0; j < dnaMatrix[i].length; j++) {

                if (j < 4) {
                    if (dnaMatrix[i][j] == dnaMatrix[i][j + 1]) {   //ej: columna 1 es igual a columna 2?
                        amountLetters++;
                    }
                } else {    // si la j está en la última columna
                    if (dnaMatrix[i][j - 1] == dnaMatrix[i][j]) {   //columna 5 es igual a columna 6?
                        amountLetters++;
                    }
                }
            }
            
            if (amountLetters >= 3) { //3 coincidencias, es decir 4 letras
                    horizontalSeq++;
                }
        }
        
        return horizontalSeq;
    }
    
    public static int verticalTest(String[][] dnaMatrix){
        int verticalSeq = 0;    //contador de secuencias verticales
        
        for (int j = 0; j < dnaMatrix.length; j++) {
            int amountLetters = 0;

            for (int i = 0; i < dnaMatrix[j].length; i++) {

                if (i < 4) {
                    if (dnaMatrix[i][j] == dnaMatrix[i + 1][j]) {   //ej: fila 1 es igual a fila 2?
                        amountLetters++;
                    }
                } else {    // si la i está en la última fila
                    if (dnaMatrix[i - 1][j] == dnaMatrix[i][j]) {   //fila 5 es igual a fila 6?
                        amountLetters++;
                    }
                }
            }
            
            if (amountLetters >= 3) {
                    verticalSeq++;
                }
        }
        
        return verticalSeq;
    }
    
    public static int principalObliques(String[][] dnaMatrix){
        int pObliques = 0;    //contador de oblicuas de izq a derecha
        
        //diagonal principal
        for (int i = 0; i < dnaMatrix.length; i++) {
            int amountLetters = 0;
            int j = i;
            
            if (i <= 4) {
                if (dnaMatrix[i][j] == dnaMatrix[i + 1][j + 1]) {
                    amountLetters++;
                }
            } else {    //i y j están en la última posición de la matriz
                if (dnaMatrix[i-1][j-1] == dnaMatrix[i][j]){
                    amountLetters++;
                }
            }
            
            if (amountLetters >= 3) {
                    pObliques++;
                }
        }
        
        //oblicuas superiores a la diagonal principal
        for (int i = 0; i < dnaMatrix.length - 1; i++){
            for (int j = (i+1); j < (5-(i+1)); j++){
                
            }
        }
        
    }
    
    public static String[][] convertToMatrix(String[] dna){
        String[][] dnaMatrix = new String[6][6];
        
        for (int i = 0; i < dnaMatrix.length; i++){
            for (int j = 0; j < dnaMatrix[i].length; j++){
                dnaMatrix[i][j] = String.valueOf(dna[i].charAt(j));
            }
        }
        
        return dnaMatrix;
    }
    
    public static void showMatrix(String[][] dnaMatrix){
        for (int i = 0; i < dnaMatrix.length; i++){
            for (int j = 0; j < dnaMatrix[i].length; j++){
                System.out.print(dnaMatrix[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
    public static void waitTwoSeconds(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
}
