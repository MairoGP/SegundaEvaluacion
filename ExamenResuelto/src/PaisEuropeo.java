public class PaisEuropeo {
    private final String nombre;
    private int poblacion;
    private final String dominio;
    private static int fondoComun=0;
    private int saldoAportado;

    PaisEuropeo(String nombre, int poblacion, String dominio) {
        this.nombre = nombre;
            this.poblacion = poblacion;
            this.dominio = dominio;
        }

    PaisEuropeo(String nombre, int poblacion) {
        this(nombre,poblacion,"es");
        String dominio=nombre.substring(0,2).toLowerCase();
    }

    public void aportar(int aportacion){
        this.saldoAportado+=aportacion;
        fondoComun+=aportacion;
    }
    public void retirar(int retiro){
        this.saldoAportado-=retiro;
        fondoComun-=retiro;
    }
    public int getPoblacion(){
        return this.poblacion;
    }

    public static double getMedia(PaisEuropeo A, PaisEuropeo B){
        return (A.getPoblacion()+B.getPoblacion())/2.0;
    }



}
