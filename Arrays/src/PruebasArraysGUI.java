import sun.plugin2.message.JavaObjectOpMessage;

import javax.swing.*;

public class PruebasArraysGUI {
    public static void main(String[] args) {
    /*    String nombre=JOptionPane.showInputDialog("Nombre?: ");
        System.out.println("Hola, " + nombre);
        JOptionPane.showInputDialog("Nacionalidad","Escriba su nacionalidad");
*/
/*
        String[] niveles = {"A1","A2","B1","B2","C1","C2","Shakespeare"};
        String salida="";
        String respuesta="";

        do {
            Icon miIcono = new ImageIcon("uk.png");
            respuesta = (String) JOptionPane.showInputDialog(null,
                    "Elija Nivel de Ingles",
                    "Nivel de ingles",
                    JOptionPane.YES_OPTION,
                    miIcono,
                    niveles,
                    niveles[0]
            );
            if(salida==null){
                JOptionPane.showInputDialog(null,"Debes introducir un nivel");
            }
        }while(salida==null);

        System.out.println(respuesta);
        */

        String[] direccion = {"Norte","Sur","Este","Oeste"};
        int respuesta=JOptionPane.showOptionDialog(null,
                "Introduce direccion",
                "Direccion",
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.WARNING_MESSAGE,
                null,
                direccion,
                direccion[0]
        );
        System.out.println(respuesta);
    }
}
