import javax.swing.*;

public class JuegoPC {
    private final String titulo;
    private final String descripcion;
    private String[] categoria;
    public static  String[] PLATAFORMAS = {
            "PC",
            "PS4",
            "XBOX",
            "SWITCH",
            "MOVIL"
    };
    private  String[] plataformasDisponibles = new String[PLATAFORMAS.length];
    public  static String[] CATEGORIAS = {
            "Accion",
            "Aventuras",
            "First Person Shooter",
            "Puzles",
            "Narrativo",
            "Fantasia",
            "MOBA"
    };

    JuegoPC(String titulo, String descripcion, String[] categorias) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria=categorias;
        this.plataformasDisponibles[0] = "PC";
        Steam.totalJuegosCreados++;
    }

    public String mostrarJuego(){
        String salida=" ";
        salida+="Título:\t"+getTitulo()+"\n"+
                "Descripción:\t"+getDescripcion()+"\n"+
                "Categorias:\t"+getCategoria()+"\n"+
                "Plataformas Disponibles:\t"+getPlataformasDisponibles();
        return salida;
    }

    public void setCategoria(String categoriasDisponibles) {
        boolean categoriaIncluida=false;
        for (int i = 0; i < JuegoPC.CATEGORIAS.length; i++) {
            if(categoriasDisponibles.equals(JuegoPC.CATEGORIAS[i])){
               categoriaIncluida=true;
            }
        }
        if(categoriaIncluida=false){
            String respuesta = JOptionPane.showInputDialog(null,"La categoria a introducir no se encuentra guardada\n Desea guardar esta nueva?(Y/N)");
            if(respuesta.charAt(0)=='Y'){
                this.categoria[categoriasDisponibles.length()]=categoriasDisponibles;
            } else {
                JOptionPane.showMessageDialog(null,"No ha sido posible introducir la nueva categoria\n Asegurese de que la categoría esta definida");
            }
        }
    }

    public String getCategoria() {
        String salida="";
        for (int i = 0; i < this.categoria.length; i++) {
            if(categoria[i]==null){
                break;
            } else {
                salida+="\t"+this.categoria[i]+"\n";
            }
        }
        return salida;
    }

    public String getPlataformasDisponibles() {
        String salida="";
        for (int i = 0; i < this.plataformasDisponibles.length; i++) {
            if(plataformasDisponibles[i]==null){
                break;
            } else {
                salida+="\t"+this.plataformasDisponibles[i]+"\n";
            }
        }
        return salida;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }


}