package Sistema_Biblioteca;
public abstract class Libros { 
    private String titulo;
    private String autor;

    public Libros(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public abstract void mostrarInformacion();

    public static class Libro extends Libros {
        public Libro(String titulo, String autor) {
            super(titulo, autor);
        }

        public void mostrarInformacion() {
            System.out.println("Libro: " + getTitulo() + ", Autor: " + getAutor());
        }
    }

    public static class Multimedia extends Libros {
        public Multimedia(String titulo, String autor) {
            super(titulo, autor);
        }

        public void mostrarInformacion() {
            System.out.println("Multimedia: " + getTitulo() + ", Autor: " + getAutor());
        }
    }
}
