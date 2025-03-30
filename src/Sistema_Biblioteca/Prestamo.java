package Sistema_Biblioteca;

public class Prestamo {
    private Usuario usuario;
    private Libros material; 

    public Prestamo(Usuario usuario, Libros material) {
        this.usuario = usuario;
        this.material = material;
    }

    public void mostrarDetalles() {
        System.out.println("------------------------Préstamo realizado por------------------------");
        usuario.mostrarInformacion();
        System.out.println("---------------------------Material prestado---------------------------"
                + "");
        material.mostrarInformacion();
    }
}