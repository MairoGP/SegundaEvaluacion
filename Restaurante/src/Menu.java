import javax.swing.*;

public class Menu {

    public static void main(String[] args) {
        String titulo = "Bienvenido a Restaurante Emilio";
        String presentacion = "Elija entre nuestra variedad de consumiciones";
        String[] botones = {"Mostrar Menu","Sentarse en mesa","Cancelar"};
        int entrada;
        do {
            entrada = JOptionPane.showOptionDialog(null,
                    presentacion,
                    titulo,
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    botones,
                    botones[0]
            );

            switch (entrada) {
                case 0:
                    mostrarCarta();
                    break;
                case 1:
                    seleccionarMenu();
                    break;
                case 2:
                    break;
            }
        }while(entrada!=2);
    }

    private static void seleccionarMenu() {
        int continuar = 0;
        do{
            String salida = nuevaCuenta();
            if(salida == null){
                JOptionPane.showMessageDialog(null,"Salida inesperada del programa","Error",JOptionPane.ERROR_MESSAGE);
                break;
            } else {
                JOptionPane.showMessageDialog(null,salida,"Cuenta",JOptionPane.PLAIN_MESSAGE);
                continuar = JOptionPane.showConfirmDialog(null,"¿Desea Continuar?","Confirmar Salida",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            }
        }while(continuar!=1);
    }

    private static void mostrarCarta() {
        String carta="";
        for (int i = 0; i < Consumiciones.values().length; i++) {
            if(Consumiciones.values()[i] == Consumiciones.SALIR){
                break;
            }else{
                carta+= Consumiciones.values()[i].info()+"\n";
            }

        }
        JOptionPane.showMessageDialog(null,carta);
    }

    private static String nuevaCuenta() {
        Consumiciones[] cuenta = new Consumiciones[20];
        int contador=0;
        do {
            cuenta[contador] = (Consumiciones) JOptionPane.showInputDialog(
                    null,
                    "Selecciones entre nuestras consumiciones",
                    "Consumiciones",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    Consumiciones.values(),
                    Consumiciones.values()[0].toString());
            if(cuenta[contador] == null){
                return null;
            }
            System.out.println(cuenta[contador].info());
            contador++;
        }while(!cuenta[contador-1].equals(Consumiciones.SALIR));
        return cuentaFinal(cuenta);
    }

    private static String cuentaFinal(Consumiciones[] cuenta) {
        String salida = "";
        double total = 0;
        int porcentajeBebidas=0;
        int porcentajeComidas=0;
        for (int i = 0; i < cuenta.length; i++) {
            if(cuenta[i].equals(Consumiciones.SALIR)){
                break;
            } else  {
                salida += cuenta[i].info()+"\n";
                total += cuenta[i].getPrecio();
            }
        }
        salida+="-------------------------\n";
        salida+="Total:     "+total/100+"€";
        return salida;
    }
}
