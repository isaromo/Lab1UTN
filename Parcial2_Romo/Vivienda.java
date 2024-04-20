package parcial2_romo;

import java.util.ArrayList;
import java.util.Scanner;

public class Vivienda {
    private String calle;
    private int nroCalle;
    private String provincia;
    private ArrayList<Ambiente> ambientes = new ArrayList<Ambiente>();

    public boolean validarBaño(){
        for (Ambiente amb : this.ambientes){
            if (amb.getTipoAmbiente().equals("Baño")){
                return true;
            }
        }
        
        return false;
    }
    
    public boolean validarDosAmbientes(){
        if (this.ambientes.size() >= 2){
            return true;
        } else {
            return false;
        }
    }
    
    public double totalMetrosCuadrados (){
        double sumaMetros = 0;
        
        for (Ambiente amb : this.ambientes){
            sumaMetros += amb.getMetrosCuadrados();
        }
        
        return sumaMetros;
    }

    
    //GETTERS Y SETTERS
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        Scanner scStr = new Scanner(System.in);
        
        if (calle.equals("")){
            System.out.println("Debe ingresar una calle. Ingresela de nuevo:");
            setCalle(scStr.nextLine());
        } else {
            this.calle = calle;
        }
    }

    public Integer getNroCalle() {
        return nroCalle;
    }

    public void setNroCalle(Integer nroCalle) {
        this.nroCalle = nroCalle;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        Scanner scStr = new Scanner(System.in);
        
        if (provincia.equals("")){
            System.out.println("Debe ingresar una provincia. Ingresela de nuevo:");
            setProvincia(scStr.nextLine());
        } else {
            this.provincia = provincia;
        }
    }

    public ArrayList<Ambiente> getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(ArrayList<Ambiente> ambientes) {
        this.ambientes = ambientes;
    }
}
