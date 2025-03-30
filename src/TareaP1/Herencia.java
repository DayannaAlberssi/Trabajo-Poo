package TareaP1;

    class Animal {
        void comer() {
            System.out.println("Este animal come");
        }
    }
    
    class Perro extends Animal {
        void ladrar(){
            System.out.println("Guau");
        }        
    }
public class Herencia {  
    public static void main(String[] args){
        Perro perro = new Perro();
        perro.comer();
        perro.ladrar();
        }
    
}
