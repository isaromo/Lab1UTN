
package parcial2_romo;

import java.util.Scanner;

public class Ambiente {
    private String tipoAmbiente;
    private double metrosCuadrados;
    
        //GETTERS Y SETTERS

    public String getTipoAmbiente() {
        return tipoAmbiente;
    }

    public void setTipoAmbiente(String tipoAmbiente) {
        this.tipoAmbiente = tipoAmbiente;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        Scanner sc = new Scanner(System.in);
        
        if (metrosCuadrados <= 0){
            System.out.println("Los metros cuadrados deben ser mayor a 0. Ingreselos de nuevo");
            setMetrosCuadrados(sc.nextDouble());
        } else {
            this.metrosCuadrados = metrosCuadrados;
        }
    }
}
