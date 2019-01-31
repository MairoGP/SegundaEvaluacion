import javax.swing.*;

public class MuchoPhone {
    public static void main(String[] args) {



    }

    public static Movil[] MovilesPredeterminador(){
        Movil[] predeterminados = new Movil[5];

        predeterminados[0] = new Movil(70,3,4);
        predeterminados[1] = new Movil("Samsung","X-70",270,8,16);
        predeterminados[2] = new Movil("Xiaomi","Redmi",119,17,32);
        predeterminados[3] = new Movil("OnePlus","6T",579,20,128);
        predeterminados[4] = new Movil("iPhone","X-Trim",1092,36,80);

        return predeterminados;
    }
}

