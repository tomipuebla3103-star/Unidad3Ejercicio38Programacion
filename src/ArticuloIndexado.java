public class ArticuloIndexado extends PublicacionAcademica{
    private double factorImpacto;
    private String cuartil;

    public ArticuloIndexado(String titulo, String fechaPublicacion, String autores,
                            double factorImpacto, String cuartil) {
        super(titulo, fechaPublicacion, autores);
        this.factorImpacto = factorImpacto;
        this.cuartil = cuartil;
    }

    @Override
    public boolean validarIndexacion() {
        return factorImpacto > 0 &&
                (cuartil.equals("Q1") || cuartil.equals("Q2") ||
                        cuartil.equals("Q3") || cuartil.equals("Q4"));
    }

    @Override
    public String generarCita() {
        return autores + " (" + fechaPublicacion + "). " + titulo
                + ". Revista científica, factor de impacto: " + factorImpacto
                + ", " + cuartil + ".";
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Factor de impacto: " + factorImpacto);
        System.out.println("Cuartil: " + cuartil);
        System.out.println("Indexado: " + validarIndexacion());
    }
}
