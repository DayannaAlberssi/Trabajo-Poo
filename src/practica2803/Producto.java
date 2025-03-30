
package practica2803;

public class Producto{
    
    private String nombre;
    private double precio;
    private int stock;
    
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: S/: " + precio);
        System.out.println("Stock disponible: " + stock);
    }
   
    public static void main(String[] args){
        Producto producto1 = new Producto("Teléfono",5650.50, 10);
        producto1.mostrarInfo();        
    }
}
