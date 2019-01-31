import javax.swing.*;

public class Casilla {
    private final int numero;
    private boolean cantada;

    public int getNumero() {
        return numero;
    }

    public void sale() {
        this.cantada = true;
    }

    public boolean estaCantada() {
        return cantada;
    }

    public Casilla(int numero) {
        this.numero = numero;
        this.cantada = false;
    }


    @Override
    public String toString() {
        return numero + "cantada= " + cantada;
    }

    public String  celdaHTML(){
        String salida="<td style=\"background-color:" +
                "width:60px; height:60px;text-align:center;" +
                "vertical-align: center;" +
                "border:2px solid black;border-collapse: collapse;\">" +
                "<span style=\"font-size:20px;\">";
        salida+=this.numero;
        salida+="</span></td>";
        return salida;
    }

    public static void main(String[] args) {
        Casilla c1 = new Casilla(8);
        Casilla c2 = new Casilla(10);
        Casilla c3 = new Casilla(56);
        Casilla c4 = new Casilla(73);
        Casilla c5 = new Casilla(2);
        Casilla c6 = new Casilla(0);

        String salida="";

        String encabezado="<html><table style=\"border:2px solid black;border-collapse: collapse;\">";
        String pie="</table></html>";
        String inicioFila="<tr>";
        String finalFila="</tr>";

        String inicioCelda="<td>";
        String finalCelda="</td>";

        salida+=encabezado;
        //Fila 1
        salida+=inicioFila;
        c1.celdaHTML();
        c2.celdaHTML();
        c3.celdaHTML();
        salida+=finalFila;
        //Fila 2
        salida+=inicioFila;
        c4.celdaHTML();
        c5.celdaHTML();
        c6.celdaHTML();

        salida+=finalFila;

        salida+= pie;
        JOptionPane.showInputDialog(salida);

/*
        String inicioCelda="<td style=\"background-color:#333333; color:#EEEEEE; " +
                "width:60px; height:60px;text-align:center;" +
                "vertical-align: center;" +
                "border:2px solid black;border-collapse: collapse;\">" +
                "<span style=\"font-size:20px;\">";
        String inicioCeldaMarcada="<td style=\"background-color:#777777; color:#EEEEEE; " +
                "width:60px; height:60px;text-align:center;" +
                "vertical-align: center;" +
                "border:2px solid black;border-collapse: collapse;\">" +
                "<span style=\"font-size:20px;\">";
        String finalCelda="</span></td>";
*/

    }
}
