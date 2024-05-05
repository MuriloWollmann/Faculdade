import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cachorro dog = new Cachorro("Urso", 6);
        dog.emitirSom();

        Cavalo horse = new Cavalo("Pongo", 8);
        horse.emitirSom();

        Preguica sloth = new Preguica("Flash", 12);
        sloth.emitirSom();

        Veterinario vet = new Veterinario();
        vet.examinar(dog);
        vet.examinar(horse);
        vet.examinar(sloth);

        Zoologico zoo = new Zoologico();

        Random gerador = new Random();

        int i;
        for(i = 0; i < 10; i++){
            int numero = gerador.nextInt(3);

            if(numero == 0){
                zoo.colocarNaJaula(dog);
            }
            else if(numero == 1){
                zoo.colocarNaJaula(horse);
            }
            else{
                zoo.colocarNaJaula(sloth);
            }
        }
        zoo.percorrerJaulas();
    }
}