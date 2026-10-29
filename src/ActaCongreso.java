public class ActaCongreso extends PublicacionAcademica{
    private String nombreSimposio;
    private String ciudadSede;

    public ActaCongreso(String titulo, String fechaPublicacion, String autores,
                        String nombreSimposio, String ciudadSede) {
        super(titulo, fechaPublicacion, autores);
        this.nombreSimposio = nombreSimposio;
        this.ciudadSede = ciudadSede;
    }

    @Override
    public String generarCita() {
        return autores + " (" + fechaPublicacion + "). " + titulo
                + ". Actas del congreso " + nombreSimposio
                + ", " + ciudadSede + ".";
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Simposio: " + nombreSimposio);
        System.out.println("Ciudad sede: " + ciudadSede);
    }
}
