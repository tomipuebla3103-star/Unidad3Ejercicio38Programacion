//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ArticuloIndexado articulo = new ArticuloIndexado(
            "Inteligencia artificial en educacion",
            "2025",
            "Juan Perez y Maria Lopez",
            3.5,
            "Q1"
    );

    ActaCongreso acta = new ActaCongreso(
            "Nuevas tecnologias",
            "2024",
            "Carlos Gomez",
            "Congreso Internacional de Informatica",
            "Buenos Aires"
    );

    TesisDoctoral tesis = new TesisDoctoral(
            "Sistemas inteligentes",
            "2023",
            "Ana Torres",
            "Dr. Roberto Diaz",
            "Universidad Nacional"
    );

    System.out.println("=== ARTICULO INDEXADO ===");
    articulo.mostrarDatos();
    System.out.println("Cita: " + articulo.generarCita());

    System.out.println("\n=== ACTA DE CONGRESO ===");
    acta.mostrarDatos();
    System.out.println("Cita: " + acta.generarCita());

    System.out.println("\n=== TESIS DOCTORAL ===");
    tesis.mostrarDatos();
    System.out.println("Cita: " + tesis.generarCita());
}
