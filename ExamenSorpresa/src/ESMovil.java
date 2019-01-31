import javax.swing.*;

public class ESMovil {

    public static Movil leerMovil() {
        String marca = JOptionPane.showInputDialog("Introduce la marca del móvil: ");
        String modelo = JOptionPane.showInputDialog("Introduce el modelo del móvil: ");

        int precio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio: "));
        int camaraTrasera = Integer.parseInt(JOptionPane.showInputDialog("Introduce los megapixeles de la cámara trasera: "));
        int memoria = Integer.parseInt(JOptionPane.showInputDialog("Introduce la capacidad de la memoria en GB: "));

        Movil nuevo = new Movil(marca,modelo,precio,camaraTrasera,memoria);
        JOptionPane.showMessageDialog(null,ventanaMovil(nuevo));
        return nuevo;
    }


    public static String ventanaMovil(Movil movil){
        String salida = "<html>";

        salida += "<body>"+
                    "<div style=\" text-align: center; border: solid;\">"+

                        "<h2 style=\"margin: 2px\">Movil</h2>"+
                        "<p style=\"margin: 2px; background-color: aqua;\">"+

                        "<span style=\""+
                        "font-size: 30px;" +
                        "margin: 10px;\">"+movil.getMarca()+" </span>"+

                        "<span style=\""+
                        "font-size: 20px;\">"+movil.getModelo()+"</span>"+
                        "<br>"+
                        "</p>"+
                    "</div>";
        salida +=
    "<div style=\"text-align: center; border: solid\">"+
        "<table style=\"width:100%\">"+
            "<tr style=\"background-color: #555554; color: #ecf1f3\">"+
             "<th><strong>Camara Trasera</strong></th>"+
             "<th><strong>Memoria Interna</strong></th>"+
             "<th><strong>Precio</strong></th>"+
          "</tr>"+
          "<tr style=\"text-align: center\"" +
              "<td>"+movil.getMegaPixels() +" MP</td>"+
             "<td>"+movil.getGigasMemoria()+" GB</td>"+
             "<td>"+movil.getPrecio()+" €</td>"+
          "</tr>"+
         "</table>"+
    "</div>"+
    "</body>";

        salida+="</html>";
        return salida;
    }
}
