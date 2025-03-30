package Sistema_Biblioteca;

public class Biblioteca {
    public static void main(String[] args){
        Usuario alumno = new Alumno("Mario Quiroz");
        
        Libros libro = new Libros.Libro("Don Quijote de la Marcha", "Miguel Cervantes");
        Libros multimedia = new Libros.Multimedia("Documental del universo","National Geographic");
        
        Prestamo prestamo1 = new Prestamo(alumno, libro);
        Prestamo prestamo2 = new Prestamo(alumno, multimedia);
        
        prestamo1.mostrarDetalles();
        prestamo2.mostrarDetalles();
    }
  
}