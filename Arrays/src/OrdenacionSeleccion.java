import java.util.Arrays;

public class OrdenacionSeleccion {

    private static void inserciónDirecta(char[] letras) {
        for (int i = 0; i < letras.length - 1; i++) {

            char minimo = letras[i];
            int posMin = i;

            for (int j = i + 1; j < letras.length; j++) {
                if (letras[j] < minimo) {
                    minimo = letras[j];
                    posMin = j;
                }
            }
            System.out.println(minimo);
            System.out.println(posMin);
            char temp = letras[i];
            letras[i] = letras[posMin];
            letras[posMin] = temp;

        }

    }

    public static void main(String[] args) {
        char[] letras = {
                'f', 'y', 'h', 'e', 'c', 'r', 'a', 'b'
        };
        inserciónDirecta(letras);

        System.out.println(Arrays.toString(letras));

        ordenaciónBurbuja(letras);
        System.out.println(Arrays.toString(letras));


    }

    private static void ordenaciónBurbuja(char[] letras) {
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras.length; j++) {
                if(letras[j]>letras[j+1]){
                    char temp = letras[j];
                    letras[j] = letras[j+1];
                    letras[j+1] = temp;
                }
            }
        }
    }
}
