import javax.swing.*;

public class JUEGO {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        tablero.escaques[0][0] = new Pieza(Tipo.PEON,Color.NEGRO);
        mostrarTablero(tablero);
    }

    private static void mostrarTablero(Tablero tablero) {
        String salida = "";/*
        for (int i = 0; i < tablero.escaques.length; i++) {
            for (int j = 0; j < tablero.escaques[i].length; j++) {
            }
        }*/
        salida+=" "+ tablero.escaques[0][0].toString();
        JOptionPane.showMessageDialog(null,salida);
    }
}
