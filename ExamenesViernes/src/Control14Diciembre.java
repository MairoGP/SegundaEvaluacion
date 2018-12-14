import javax.swing.*;

public class Control14Diciembre {
    public static void main(String[] args) {

        Aeropuerto[] nuevosAeropuertos = new Aeropuerto[4];

        nuevosAeropuertos[0] = new Aeropuerto("Madrid","Barajas",30000);
        nuevosAeropuertos[1] = new Aeropuerto("Barcelona","FamiliaSagrada",25000);
        nuevosAeropuertos[2] = new Aeropuerto("Baleares","Palma",12000);
        nuevosAeropuertos[3] = new Aeropuerto("Sevilla","Ole",1500);
        System.out.println("La cantidad de pasajeros de 2017 es: " + cantidadPasajeros(nuevosAeropuertos));
        JOptionPane.showMessageDialog(null,"El aeropuerto con menos pasajeros es: "+ aeropuertoMenor(nuevosAeropuertos));
    }

    public static int cantidadPasajeros(Aeropuerto[] lista){
        int suma=0;
        for (Aeropuerto a:
             lista) {
            suma+=a.getPasajeros2017();
        }
        return suma;
    }

    public static Aeropuerto aeropuertoMenor(Aeropuerto[] lista){
        Aeropuerto minimo=lista[0];
        int minimoPasajeros=Integer.MAX_VALUE;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i].getPasajeros2017() < minimo.getPasajeros2017()){
                minimo=lista[i];
                minimoPasajeros=lista[i].getPasajeros2017();
            }
        }
        return minimo;
    }

    public static int empiezaPor(Aeropuerto[] lista, char caracter){
        int contador=0;
        for (Aeropuerto a:
             lista) {
            if(a.getNombre().equals(caracter)){
                contador++;
            }
        }
        return contador;
    }
}


