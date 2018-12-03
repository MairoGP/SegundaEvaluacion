import java.util.Arrays;

public class Pruebas {
    public static void main(String[] args) {
       Pelicula[] netflix;                    //                  int [] v = new int[5];
       netflix = new Pelicula[4];             //                  System.out.println(v);
       Pelicula[] HBO=new Pelicula[4];        //                  //Truco: imprimir un array: Array.toString(array);
       System.out.println(netflix);
       System.out.println(Arrays.toString(netflix));
    }
}
