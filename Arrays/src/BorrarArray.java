public class BorrarArray {

    public static final int BASE = 30;

    private static void imprimePoesia(String[] poesia){
        for (String verso:poesia) {
            int espacios = BASE - verso.length()/2;
            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }
            System.out.println(verso);
        }
    }

    public static void main(String[] args) {
        String[] poesia = {
                "¿Qué es poesía?",
                "¿Y tu me lo preguntas?",
                "¿Es que no lo sabes?",
                "Poesia eres tu."
        };
        imprimePoesia(poesia);
        System.out.println("---------------------");
        poesia[poesia.length-2] = poesia[poesia.length-1];
        System.out.println("---------------------");
        imprimePoesia(poesia);
        String[] nuevaPoesia = new String[poesia.length-1];
        for (int i = 0; i < nuevaPoesia.length; i++) {
            nuevaPoesia[i] = poesia[i];
        }
        System.out.println("---------------------");
        imprimePoesia(nuevaPoesia);

    }
}
