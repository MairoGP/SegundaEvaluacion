import javax.swing.*;

public class Steam {
    public static void main(String[] args) {

        String menu = "Bienvenido a la Biblioteca de Steam\n"+
                "1. Mostrar Biblioteca\n"+
                "2. Añadir Juego\n"+
                "3. Borrar u Juego\n"+
                "4. Buscar un Juego\n"+
                "5. Ordenar Alfabeticamente\n"+
                "Introduce opción: ";
        String respuesta="";
        respuesta= JOptionPane.showInputDialog(null,menu);

        switch (respuesta){
            case 1: mostrarBiblioteca;
            break;
        }


        System.out.println(respuesta);


    }
}
