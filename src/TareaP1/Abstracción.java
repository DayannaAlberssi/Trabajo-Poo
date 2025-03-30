package TareaP1;
    abstract class Animal {
            abstract void hacerSonido(); 

    }
        class Perro extends Animal {
            void hacerSonido(){
                System.out.println("Guau");
            }
        }

        class Gato extends Animal{ 
            void hacerSonido(){
                System.out.println("Miau");
            }
        }
public class Abstracción {
    public static void main(String[] args){
        Animal perro = new Perro();
        Animal gato = new Gato();
        perro.hacerSonido();
        gato.hacerSonido(); 
    }
}
