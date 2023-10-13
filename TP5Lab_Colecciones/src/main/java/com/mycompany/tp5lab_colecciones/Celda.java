package com.mycompany.tp5lab_colecciones;

public class Celda {
    private int row;
    private int column;
    private String value;
    
    public void Celda(int row, int column, String value){
        this.row = row;
        this.column = column;
        this.value = value;
    }

    public int getRow() {
        return row;
    }
//se crean setters igual por si en algun momento se quiere modificar el valor de un objeto ya construido 
    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
