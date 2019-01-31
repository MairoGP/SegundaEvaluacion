public class Pieza {
    private final Tipo tipo;
    private final Color color;

    public Pieza(Tipo tipo, Color color) {
        this.tipo = tipo;
        this.color = color;

    }

    @Override
    public String toString() {
        if(this.color == Color.NEGRO){
            return this.tipo.negra;
        } else {
            return this.tipo.blanca;
        }
    }
}
