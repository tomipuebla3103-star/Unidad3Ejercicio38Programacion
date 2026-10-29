public class PublicacionAcademica {
    protected String titulo;
    protected String fechaPublicacion;
    protected String autores;

    public PublicacionAcademica(String titulo, String fechaPublicacion, String autores) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.autores = autores;
    }

    public boolean validarIndexacion() {
        return false;
    }

    public String generarCita() {
        return autores + " (" + fechaPublicacion + "). " + titulo + ".";
    }

    public void mostrarDatos() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Fecha: " + fechaPublicacion);
        System.out.println("Autores: " + autores);
    }
}
