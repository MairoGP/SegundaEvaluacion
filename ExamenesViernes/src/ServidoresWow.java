public enum ServidoresWow {

    MINAHONDA("Minahonda",servidoresPaises.EUROPA),
    COLINAS_PARDAS("Colinas Pardas",servidoresPaises.EUROPA),
    C_THUN("C'Thun",servidoresPaises.EEUU),
    SANGUINO("Sanguino",servidoresPaises.ASIA);

    ServidoresWow(String nombre,servidoresPaises servidor){
    }

    private enum servidoresPaises{
        EUROPA,
        EEUU,
        ASIA,
        OCEANIA,
        AFRICA;
    }
    //Se añaden o retiran servidores

}
