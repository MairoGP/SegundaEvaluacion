import javax.swing.*;

public class Boleto {
    private final Casilla[][] casillas;

    public Boleto() {
        this.casillas = new Casilla[3][5];
        for (int i = 0; i < casillas[i].length; i++) {
            for (int j = 0; j < casillas[j].length; j++) {
                System.out.println("ciuodad");
                this.casillas[i][j] = new Casilla(i+j*3);
            }
        }
    }

    public boolean tieneBingoBoleto(){
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                if(!casillas[i][j].estaCantada()){
                    return false;
                }
            }
        }
        return true;
    }


    public String boletoHTML(){
        String encabezado="<html><table style=\"border:2px solid black;border-collapse: collapse;\">";
        String pie="</table></html>";
        String inicioFila="<tr>";
        String finalFila="</tr>";

        String salida = "";
        salida+=encabezado;
        for (int i = 0; i < casillas.length; i++) {
            salida+=inicioFila;
            for (int j = 0; j < casillas[i].length; j++) {
                salida+=casillas[i][j].celdaHTML();
            }
            salida+=finalFila;
        }
        salida+=pie;
        return salida;
    }

    public static void main(String[] args) {
        Boleto bol = new Boleto();
        JOptionPane.showInputDialog(bol.boletoHTML());
    }
}
