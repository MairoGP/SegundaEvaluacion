import java.util.Arrays;

public class CapicuaArray {
    public static void main(String[] args) {
        int[] a={1,2,3,2,1};
        devuelveCapicua(10);
    }

    public static int[] devuelveCapicua(int n){
        int salida[] = new int[n];
        int puntoInsercion = 0;
        for (int i = 0; i < n/2; i++) {
            salida[puntoInsercion++]=i*3;
        }
        if(n%2!=0){
            salida[puntoInsercion++]=42;
        }
        for (int i = 0; i < n/2; i++) {
            salida[puntoInsercion++]=n/2-i;
        }
        System.out.println(Arrays.toString(salida));
        return salida;
    }


    private static boolean capicua1(int[] a) {
        String tempora1="";
        for (int valor:
            a){

        }
        return false;
    }
}
