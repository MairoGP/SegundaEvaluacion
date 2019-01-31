import java.util.Arrays;

public class OrdenacionString {
    public static void main(String[] args) {
        String[] palabras = {
                "bajo", "hasta",
                "so", "contra",
                "a", "ante",
                "con", "sin",
                "de", "para",
                "desde", "según",
                "sobre", "tras", "por"
        };

        System.out.println(Arrays.toString(palabras));


        for (int i = 0; i < palabras.length; i++) {
            String minimo = palabras[i];
            int posMinimo = i;
            for (int j = 0; j < palabras.length; j++) {
                if(palabras[j].compareTo(minimo)<0){
                    minimo = palabras[j];
                    posMinimo = j;
                }
            }
            String temp = palabras[i];
            palabras[i] = palabras[posMinimo];
            palabras[posMinimo] = temp;
        }
        System.out.println(Arrays.toString(palabras));
    }
}