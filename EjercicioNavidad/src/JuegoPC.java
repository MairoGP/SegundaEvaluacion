public class JuegoPC {
    private final String titulo;
    private final String descripcion;
    private final String[] categoria;

    private final String[] PLATAFORMAS = {
            "PC",
            "PS4",
            "XBOX",
            "SWITCH",
            "MOVIL"
    };

    private  String[] plataformasDisponibles = new String[PLATAFORMAS.length];

    private  String[] CATEGORIAS = {
            "Acción",
            "Aventuras",
            "First Person Shooter",
            "Puzles",
            "Narrativo",
    };



    public JuegoPC(String titulo, String descripcion, String[] categoria) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }
}