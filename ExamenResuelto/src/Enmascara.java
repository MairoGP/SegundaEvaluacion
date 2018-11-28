public class Enmascara {
    public static String enmascara(String cadena){
        if(cadena.length()<=4){
            return cadena;
        }

        String salida="";

        for (int i = 0; i < cadena.length(); i++) {
            if(i<cadena.length()-4){
                salida+="#";
            } else {
                salida+=cadena.charAt(i);
            }
        }
        return salida;
    }

    public static void main(String[] args) {
        System.out.println(Enmascara.enmascara("cuidado radioactivoman"));
    }
}
