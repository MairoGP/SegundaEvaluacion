import javax.swing.*;

public class Aeropuerto {
    private final String nombre;
    private final String sobrenombre;
    private int pasajeros2017;
    private String tipo; //PRIVADO, PUBLICO, MILITAR
    public static final String[] VALORESTIPO={"PRIVADO","PÚBLICO","MILITAR","CONCERTADO"};
    public static final Icon ICONO = new ImageIcon("iconoavion.jpeg");

    public Aeropuerto(String nombre, String sobrenombre, int pasajeros2017, String tipo) {
        this.nombre = nombre;
        this.sobrenombre = sobrenombre;
        this.pasajeros2017 = pasajeros2017;
        this.tipo=tipo;
    }

    public Aeropuerto(String nombre, String sobrenombre, int pasajeros2017) {
        this(nombre,sobrenombre,pasajeros2017,"PUBLICO");
    }

    public Aeropuerto(String nombre, int pasajeros2017){
        this(nombre,nombre,pasajeros2017,"PUBLIC");
    }

    public void setPasajeros2017(int pasajeros2017) {
        this.pasajeros2017 = pasajeros2017;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSobrenombre() {
        return sobrenombre;
    }

    public int getPasajeros2017() {
        return pasajeros2017;
    }

    @Override
    public String toString(){
        return nombre+"("+tipo+" \'"+ sobrenombre +" \'"+ " " + pasajeros2017 + " en 2017";
    }
}
