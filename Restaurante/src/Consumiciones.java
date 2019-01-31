public enum Consumiciones {
    REFRESCO("Refresco",1,200),
    CERVEZA("Cerveza",2,150),
    AGUAMINERAL("Agua Mineral",3,175),
    ENSALADA("Ensalada",4,200),
    SALCHICHAS("Salchichas",5,275),
    BOCADILLO("Bocadillo",6,200),
    SOPA("Sopa",7,260),
    PASTEL("Pastel",8,300),
    SALIR("Salir",0,0);

    private final String nombre;
    private final int cod;
    private int precio;


    Consumiciones(String nombre, int cod, int precio){
        this.nombre = nombre;
        this.cod = cod;
        this.precio = precio;
    }

    private double cambioEuros(int centimos){
        double euros = (double) centimos/100;
        return euros;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCod() {
        return cod;
    }

    public int getPrecio() {
        return precio;
    }

    public String  info(){
        return this.nombre + " - " + (double) this.precio/100 + "€";
    }

    @Override
    public String toString() {
        return nombre;
    }
}
