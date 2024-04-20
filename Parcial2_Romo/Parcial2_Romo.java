package parcial2_romo;

import java.util.HashMap;
import java.util.Scanner;

public class Parcial2_Romo {
    
    static String [][] tiposAmbiente = {{"P","Pieza"},
                                        {"B","Baño"},
                                        {"C","Cocina"},
                                        {"PA","Patio"},
                                        {"L","Lavanderia"}};

    static HashMap<String, String> provinciasMap = new HashMap<>();
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        provinciasMap.put("1", "Buenos Aires");
        provinciasMap.put("2", "Catamarca");
        provinciasMap.put("3", "Chaco");
        provinciasMap.put("4", "Chubut");
        provinciasMap.put("5", "Córdoba");
        provinciasMap.put("6", "Corrientes");
        provinciasMap.put("7", "Entre Ríos");
        provinciasMap.put("8", "Formosa");
        provinciasMap.put("9", "Jujuy");
        provinciasMap.put("10", "La Pampa");
        provinciasMap.put("11", "La Rioja");
        provinciasMap.put("12", "Mendoza");
        provinciasMap.put("13", "Misiones");
        provinciasMap.put("14", "Neuquén");
        provinciasMap.put("15", "Río Negro");
        provinciasMap.put("16", "Salta");
        provinciasMap.put("17", "San Juan");
        provinciasMap.put("18", "San Luis");
        provinciasMap.put("19", "Santa Cruz");
        provinciasMap.put("20", "Santa Fe");
        provinciasMap.put("21", "Santiago del Estero");
        provinciasMap.put("22", "Tierra del Fuego");
        provinciasMap.put("23", "Tucumán");
        
        
        
        System.out.println("----- VIVIENDA -----");
        Vivienda vivienda = new Vivienda();
        System.out.println("CALLE:");
        vivienda.setCalle(scStr.nextLine());
        System.out.println("NRO VIVIENDA:");
        vivienda.setNroCalle(sc.nextInt());
        System.out.println("PROVINCIA (1 a 23):");
        String provCodigo = scStr.nextLine();
        
        while (Integer.parseInt(provCodigo) < 1 || Integer.parseInt(provCodigo) > 23){
            System.out.println("El N° de provincia debe estar entre 1 y 23. Vuelva a ingresarlo");
            provCodigo = scStr.nextLine();
        }
        
        String provincia = provinciasMap.get(provCodigo);
        vivienda.setProvincia(provincia);
        
        int salida = 0;
        
        System.out.println("----- AMBIENTES VIVIENDA " + vivienda.getCalle() + " " + vivienda.getNroCalle() + ", " + vivienda.getProvincia() + " -----");
        System.out.println("P - PIEZA");
        System.out.println("B - BAÑO");
        System.out.println("C - COCINA");
        System.out.println("PA - PATIO");
        System.out.println("L - LAVANDERÍA");
        System.out.println("---------------------------");
        
        while (true) {
            Ambiente ambiente = new Ambiente();
            System.out.println("TIPO DE AMBIENTE:");
            String ambienteLetra = scStr.nextLine();
            String ambPalabra = obtenerAmbiente(ambienteLetra);
            
            while (true){
                if (ambPalabra == null){
                    System.out.println("El ambiente es incorrecto o está vacío. Ingreselo de nuevo");
                    ambienteLetra = scStr.nextLine();
                    ambPalabra = obtenerAmbiente(ambienteLetra);
                } else {
                    break;
                }
            }


            ambiente.setTipoAmbiente(ambPalabra);
            
            System.out.println("METROS CUADRADOS DE [" + ambiente.getTipoAmbiente() + "]");
            ambiente.setMetrosCuadrados(sc.nextDouble());

            vivienda.getAmbientes().add(ambiente);  //agrego el ambiente al arraylist de ambientes de la clase Vivienda
            
            System.out.println("¿Desea cargar otro ambiente? 1. SÍ / 2. NO");
            salida = sc.nextInt();
            
            boolean dosAmbientes;
            if (vivienda.validarDosAmbientes()){
                dosAmbientes = true;
            } else {
                dosAmbientes = false;
            }
            
            if (salida == 2){
                if (vivienda.validarBaño() == false){
                    System.out.println("La vivienda debe tener un baño sí o sí. Ingreselo");
                    continue;
                } else if (dosAmbientes == false){
                    System.out.println("La vivienda debe tener al menos 2 ambientes. Ingrese más");
                    continue;
                }
                break;
            } else if (salida == 1){
                continue;
            }
        }
         
        System.out.println("\n");
         mostrarVivienda(vivienda);
    }
    
    public static String obtenerAmbiente(String ambienteLetra){
        for (int i = 0; i < tiposAmbiente.length; i++){
            if (ambienteLetra.equals(tiposAmbiente[i][0])){
                return tiposAmbiente[i][1];
            }
        }
        
        return null;
    }
    
    public static void mostrarVivienda(Vivienda vivienda){
        System.out.println("VIVIENDA FAMILIAR");
        
        System.out.println("Calle: " + vivienda.getCalle() + "\tNro: " + vivienda.getNroCalle() + "\tProvincia: " + vivienda.getProvincia() + "\n");
        
        System.out.println("----- Ambientes de la vivienda ------");
        
        for (Ambiente amb : vivienda.getAmbientes()){
            System.out.println("Tipo Ambiente:  " + amb.getTipoAmbiente());
            System.out.println("Metros cuadrados:  " + amb.getMetrosCuadrados());
            System.out.println("---------------------------------------------");
        }
        
        System.out.println("Total Metros Cuadrados:  " + vivienda.totalMetrosCuadrados());
        
    }
}