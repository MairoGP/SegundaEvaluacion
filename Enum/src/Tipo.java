public enum Tipo {
    PEON("Peón","\u2659","\u265F"),
    CABALLO("Caballo","\u2658","\u265E"),
    ALFIL("Alfíl","\u2657","\u265D"),
    TORRE("Torre","\u2656","\u265C"),
    REINA("Reina","\u2655","\u265B"),
    REY("Rey","\u2654","\u265A");

    private final String nombre;
    public final String blanca;
    public final String negra;

    Tipo(String nombre, String blanco, String negro) {
        this.nombre = nombre;
        this.blanca = blanco;
        this.negra = negro;
    }
}
