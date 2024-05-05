import java.util.ArrayList;

public class Zoologico {
    ArrayList jaulas = new ArrayList();

    public void colocarNaJaula(Animal animal){
        jaulas.add(animal);
    }

    public void percorrerJaulas(){
        int i;

        for(i = 0; i < jaulas.size(); i++){
            if(jaulas.get(i) instanceof Cachorro){
                Cachorro dog = (Cachorro)jaulas.get(i);
                System.out.println("Jaula aberta!");
                dog.correr();
            }
            else if(jaulas.get(i) instanceof Cavalo){
                Cavalo horse = (Cavalo)jaulas.get(i);
                System.out.println("Jaula aberta!");
                horse.correr();
            }
            else{
                System.out.println("Jaula aberta!");
            }
        }
    }
}
