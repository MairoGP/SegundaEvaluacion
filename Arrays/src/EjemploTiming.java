public class EjemploTiming {
    public static void main(String[] args) {
        int veces = 1000000;
        long startTime = System.nanoTime();
        for(int i=0; i< 10000;i++){
            int b=i*2+(int)Math.pow(i,0.5);
        }
        long endTime = System.nanoTime();

        long duration = (endTime - startTime)/1000000;
        System.out.println(veces + "-" + duration);
        veces+=1000000;
    }
}
