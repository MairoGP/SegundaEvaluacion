import java.util.Arrays;

public class InicializacionArray {
    public static void main(String[] args) {
        int [] v = new int[4];
        v[0]=20;
        v[1]=15;
        v[2]=8;
        v[3]=-60;
        int[] a={30,70,12,65,76};
        int[] b;
        b=a;
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        Pelicula[] netflix;
        netflix=new Pelicula[3];
        netflix[0]=new Pelicula("Lalaland",2);
        netflix[1]=new Pelicula("Juntos",6);
        netflix[2]=new Pelicula("Spiderman",5);

        netflix[2]=netflix[0];
        netflix[2].setValoracion(60);
        System.out.println((netflix[2]));

        Pelicula[] HBO = {
          new Pelicula("GOT",9),
          new Pelicula("RompeRalph",2)
        };

        System.out.println(Arrays.toString(HBO));

        String[] listaClase={
                "ana",
                "bea",
                "clara",
                "delia",
                "elena"
        };

        System.out.println(listaClase.length);
        System.out.println("*******************");

        for (int i = 0; i < listaClase.length; i++) {
            System.out.println(listaClase[i]);
        }
        //EMPIEZAN POR VOCAL
        for (int i = 0; i < listaClase.length; i++) {
            String nombreActual=listaClase[i];
            if(nombreActual.charAt(0)=='a' || nombreActual.charAt(0)=='e' || nombreActual.charAt(0)=='i' || nombreActual.charAt(0)=='o' || nombreActual.charAt(0)=='u'){
                System.out.println(nombreActual);
            }
        }
    }
}
