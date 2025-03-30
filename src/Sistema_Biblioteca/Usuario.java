package Sistema_Biblioteca;

public class Usuario {
    private String nombre;
    private String tipo;

    public Usuario(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Tipo: " + tipo);
    }
}

class Alumno extends Usuario {
    public Alumno(String nombre) {
        super(nombre, "Alumno");
    }

    public void mostrarInformacion() {
        System.out.println("Alumno: " + getNombre());
    }
}

class Docente extends Usuario {
    public Docente(String nombre) {
        super(nombre, "Docente");
    }

    public void mostrarInformacion() {
        System.out.println("Docente: " + getNombre());
    }
}


    
