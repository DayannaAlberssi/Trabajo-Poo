
package TareaP1;

    class Animal{
        void hacerSonido(){
            System.out.println("Sonido de animal");
        }
    }
    
    class Perro extends Animal{
        void hacerSonido(){
            System.out.println("Guau");
        }
    }
    
    class Gato extends Animal {
        void hacerSonido(){
            System.out.println("Miau");
        }
    }
public class Polimorfismo {    
    public static void main(String[] args){
        Animal miAnimal = new Perro();
        miAnimal.hacerSonido();
        
        miAnimal = new Gato();
        miAnimal.hacerSonido();
    }
}
