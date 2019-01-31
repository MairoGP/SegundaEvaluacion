import javax.swing.*;

public class Movil {
    private final String modelo;
    private final String marca;

    private int precio;
    private final int megaPixels;
    private final int gigasMemoria;
    public static int totalMoviles = 0;


    Movil(String marca,String modelo , int precio, int megaPixels, int gigasMemoria){
        this.modelo = modelo;
        this.marca = marca;

        this.precio = precio;
        this.megaPixels = megaPixels;
        this.gigasMemoria = gigasMemoria;
        totalMoviles++;
    }

    Movil(int precio, int megaPixels, int gigasMemoria){
        this("Standar","MarcaBlanca",precio,megaPixels,gigasMemoria);
        totalMoviles++;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getPrecio(){
        return precio;
    }

    public int getMegaPixels() {
        return megaPixels;
    }

    public int getGigasMemoria() {
        return gigasMemoria;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String info(){
        return  "\tMovil = " + marca + " " + modelo +
                "\n\tPrecio = " + precio + "€" +
                "\n\tCamaraTrasera = " + megaPixels +" MP"+
                "\n\tMemoria = " + gigasMemoria +" GB\n";
    }

    @Override
    public String toString() {
        return "Movil{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", megaPixels=" + megaPixels +
                ", gigasMemoria=" + gigasMemoria +
                '}';
    }
}
