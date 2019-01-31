import javax.swing.*;

public class ConcatenarArrays {
    public static void main(String[] args) {
        int tamanyoPrimero=leerEntero();
        int[] primero;
        int[] segundo;
        //int[] union = concatenar(primero,segundo);
    }

    private static int leerEntero() {
        while(true) {
            String entrada = JOptionPane.showInputDialog(null, "Tamaño");
            if (entrada == null || "".equals(entrada)) {
                continue;
            }
            try{
                int entero=Integer.parseInt(entrada);
                return entero;
            } catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Entero no reconocido");
            }
        }
    }
}
