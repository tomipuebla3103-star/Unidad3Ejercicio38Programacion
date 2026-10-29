public class TesisDoctoral extends PublicacionAcademica{
    private String nombreDirector;
    private String universidadOtorgante;

    public TesisDoctoral(String titulo, String fechaPublicacion, String autores,
                         String nombreDirector, String universidadOtorgante) {
        super(titulo, fechaPublicacion, autores);
        this.nombreDirector = nombreDirector;
        this.universidadOtorgante = universidadOtorgante;
    }

    @Override
    public String generarCita() {
        return autores + " (" + fechaPublicacion + "). " + titulo
                + " [Tesis doctoral]. " + universidadOtorgante + ". Director: "
                + nombreDirector + ".";
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Director: " + nombreDirector);
        System.out.println("Universidad: " + universidadOtorgante);
    }
}
