import javax.swing.*;

public class RESTAURANTE {
    public static void main(String[] args) {

        int numeroDeConsumiciones;
        int totalcomidas = 0;
        int totalbebidas = 0;

        double preciototal = 0;

        String [] opcionesDeLaCarta = {"Refresco", "Cerveza", "Agua Mineral", "Ensalada", "Salchichas", "Bocadillo", "Sopa", "pastel"};
        String productosPedidios = "";


        numeroDeConsumiciones = Integer.parseInt( JOptionPane.showInputDialog( "numero de consumiciones"));

        for (int i = 0; i < numeroDeConsumiciones; i++) {


            int seleccionDeOperacion = JOptionPane.showOptionDialog( null,
                    "Seleccione una opcion", "Genero disponible",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesDeLaCarta, opcionesDeLaCarta[0] );


            if (seleccionDeOperacion == 0) {
                //Refresco

                productosPedidios += "1 Refresco \n";
                preciototal += 2.00;
                totalbebidas +=1;

            } else if (seleccionDeOperacion == 1) {
                //Cerveza

                productosPedidios += "1 cerveza \n";
                preciototal += 1.50;
                totalbebidas +=1;

            } else if (seleccionDeOperacion == 2) {
                //Agua Mineral

                productosPedidios += "1 Agua mineral \n";
                preciototal += 1.75;
                totalbebidas +=1;

            } else if (seleccionDeOperacion == 3) {
                //Ensalada

                productosPedidios += "1 Ensalada \n";
                preciototal += 2.00;
                totalcomidas +=1;

            } else if (seleccionDeOperacion == 4) {
                //Salchichas

                productosPedidios += "1 Salchichas \n";
                preciototal += 2.75;
                totalcomidas +=1;

            } else if (seleccionDeOperacion == 5) {
                //Bocadillo

                productosPedidios += "1 Bocadillo \n";
                preciototal += 2.00;
                totalcomidas +=1;

            } else if (seleccionDeOperacion == 6) {
                //Sopa

                productosPedidios += "1 Sopa \n";
                preciototal += 2.60;
                totalcomidas +=1;

            } else if (seleccionDeOperacion == 7) {
                //Pastel

                productosPedidios += "1 Pastel \n";
                preciototal += 3.00;
                totalcomidas +=1;

            }
        }
        JOptionPane.showMessageDialog( null, productosPedidios + "\nEl total de bebidas pedidias es de:"+ totalbebidas + "\nEl total de comidas pedidas es de:"+ totalcomidas + "\n\nEl total de la cuenta es: " + preciototal +"" );

    }
}