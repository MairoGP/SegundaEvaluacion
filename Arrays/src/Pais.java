public enum Pais {
    ES("España",40,1.1),
    FR("Francia",60,1.3),
    JP("Japón",400,0.9),
    CN("China",1200,0.8),
    UK("Reino Unido",70,5.0),
    AN("Andorra",2,0.3),
    VA("Vaticano",3,0)
    ;

    private final int poblacion;
    private final String nombre;
    private final double natalidad;

    Pais(String nombre, int i, double v) {
        this.nombre = nombre;
        this.poblacion = i;
        this.natalidad = v;
    }
}
