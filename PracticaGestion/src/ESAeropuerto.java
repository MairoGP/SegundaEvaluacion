import javax.swing.*;

public class ESAeropuerto {
    public static Aeropuerto leeAeropuerto() {
        String nombre = prompt(
                "Introduzca el nombre del Aeropuerto",
                "Nombre del Aeropuerto");
        if(nombre==null){
            return null;
        }
        String sobrenombre = prompt(
                "Introduzca el sobrenombre de "+nombre,
                "Sobrenombre de "+nombre);
        if(sobrenombre==null){
            return null;
        }
        boolean entradaCorrecta=false;
        int pasajeros=0;
        while(!entradaCorrecta){
            try{
                String pasajerosCadena=prompt(
                        "Numero de pasajeros en 2017",
                        "Aeropuerto de "+ nombre
                );
                if(pasajerosCadena==null){
                    return null;
                }
                pasajeros = Integer.parseInt(pasajerosCadena);
                entradaCorrecta=true;
            } catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(
                        null,
                        "Error en la entrada de los pasajeros",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        String tipo=(String)JOptionPane.showInputDialog(
                null,
                "Introduzca el tipo de Aeropuerto",
                "Aeropuerto de "+nombre,
                JOptionPane.QUESTION_MESSAGE,
                Aeropuerto.ICONO,
                Aeropuerto.VALORESTIPO,
                Aeropuerto.VALORESTIPO[0]);
        if(tipo==null){
            return null;
        }

        return new Aeropuerto(nombre,sobrenombre,pasajeros,tipo);
    }

    private static String prompt(String info, String titulo){
         return JOptionPane.showInputDialog(
                null,
                info,
                titulo,
                JOptionPane.QUESTION_MESSAGE);
    }
}
