import javax.swing.*;

public class Steam {
    private static JuegoPC[] Biblioteca = new JuegoPC[10];
    public static int totalJuegosCreados=0;
    private static final String menu = "Bienvenido a la Biblioteca de Steam\n"+
            "1. Mostrar Biblioteca\n"+
            "2. Añadir Juego\n"+
            "3. Borrar  Juego\n"+
            "4. Buscar  Juego\n"+
            "Introduce opción: ";

    public static void mostrarBiblioteca(){
        for (int i = 0; i < Biblioteca.length; i++) {
            if(Biblioteca[i]==null){
                break;
            } else {
                JOptionPane.showMessageDialog(null,Biblioteca[i].mostrarJuego());
            }
        }
    }

    private static void añadirJuego() {
        String titulo,descripcion;
        String[] categorias = new String[JuegoPC.CATEGORIAS.length];

        titulo = JOptionPane.showInputDialog(null,"Título: ");
        descripcion = JOptionPane.showInputDialog(null,"Descripción: ");
        JOptionPane.showMessageDialog(null,"Introduce una o varias categorias: \n");
        int contador=0;
        do {
            categorias[contador] = JOptionPane.showInputDialog(null, "Categoria " + contador + ": ");
            if (categorias[contador].charAt(0) == 0) {
                continue;
            } else {
                boolean categoriaIncluida = false;
                for (int i = 0; i < JuegoPC.CATEGORIAS.length; i++) {
                    if (categorias[contador].equals(JuegoPC.CATEGORIAS[i])) {
                        categoriaIncluida = true;
                    }
                }
                if (categoriaIncluida == false && !categorias[contador].equals("0")) {
                    String respuesta = JOptionPane.showInputDialog(null, "La categoria a introducir no se encuentra guardada\n Desea guardar esta nueva?(Y/N)");
                    if (respuesta.charAt(0) == 'Y') {
                        JuegoPC.CATEGORIAS[JuegoPC.CATEGORIAS.length - 1] = new String(categorias[contador]);
                    } else if (respuesta.charAt(0) == 'N') {
                        JOptionPane.showMessageDialog(null, "No ha sido posible introducir la nueva categoria\n Asegurese de que la categoría esta definida");
                        break;
                    }
                }
                contador++;
            }
        }while (categorias[contador - 1].charAt(0) != '0');
            Biblioteca[totalJuegosCreados] = new JuegoPC(titulo, descripcion, categorias);
    }


    public static void main(String[] args) {
        String[] categoriasRDR2 ={"Aventuras","Acción","Oeste"};
        System.out.println(totalJuegosCreados);
        Biblioteca[totalJuegosCreados] = new JuegoPC("Red Dead Redemption 2","Un joven vaquero con su banda intentan huir de la ley alejandose de la civilización",categoriasRDR2);
        System.out.println(totalJuegosCreados);
        String[] categoriasLOL = {"MOBA","Fantasia","Accion"};
        Biblioteca[totalJuegosCreados] = new JuegoPC("League of Legends","Juego MOBA ultra popular sobre personajes dandose de ostias en la grieta",categoriasLOL);

        int respuesta;
        do {
            respuesta = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            switch (respuesta) {
                case 1:
                    mostrarBiblioteca();
                    break;
                case 2:
                    añadirJuego();
                    break;
            }
            System.out.println(respuesta);
        }while(respuesta!=0);
    }

}


/*public static int getTamanyoActualArray(String[] array){
        int tamanyo=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(null)){
                break;
            } else{
                tamanyo++;
            }
        }
        return tamanyo;
    }
*/