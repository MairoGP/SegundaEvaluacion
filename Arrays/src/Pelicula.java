public class Pelicula {
    private final String titulo;
    private int valoracion;

    private final String director="Josepe";
    //private final String[] casting;

    public Pelicula(String titulo, int valoracion) {
        this.titulo = titulo;
        this.valoracion=valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public int getValoracion() {
        return valoracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    /*public String[] getCasting() {
        return casting;
    }
*/
    @Override
    public String toString(){
        return this.titulo+" - "+this.valoracion;
    }
}
