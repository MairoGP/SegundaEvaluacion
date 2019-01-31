import javax.swing.*;

public class PruebaIngles {
    public static void main(String[] args) {
        NivelIngles[] opciones = NivelIngles.values();
        /*
        String[] opciones ={
                "B1",
                "B2","C1","C2"
        };
        */
        NivelIngles entrada = (NivelIngles) JOptionPane.showInputDialog(
                null,"Introduce tu nivel de incles",
                "Inglés",0,null,opciones,opciones[0]
        );
        /*
        String entrada =(String) JOptionPane.showInputDialog(
                null,"Introduce tu nivel de incles",
                "Inglés",0,null,opciones,opciones[0]
        );
*/
        if(entrada.equals(NivelIngles.C2) || entrada.equals(NivelIngles.NATIVO)){
            System.out.println("Tienes nivel de Inglés: " + entrada);
        } else {
            System.out.println("No hay nivel suficiente");
        }
        /*
        if(opciones.equals("C2") || opciones.equals("NATIVO")){
            System.out.println("Tienes nivel de Inglés: " + entrada);
        } else {
            System.out.println("No hay nivel suficiente");
        }

        */
    }
}
