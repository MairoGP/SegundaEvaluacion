public class Boleto {
    public static void main(String[] args) {
        String salida="";
        for (int i = 0; i < 10; i++) {
            if(i==0) {
                salida+=" ";
            } else{
                for (int j = 0; j < 5; j++) {
                    if(j==0){
                        salida+=" "+i;
                    } else {
                        salida +=" "+ j + i + " ";
                    }
                }
            }
            salida+="\n";
        }
        System.out.println(salida);
    }
}
