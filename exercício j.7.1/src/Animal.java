public class Animal {

    private String nome;
    private int idade;

    //Construtor
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println("Animal emitindo som!");
    }
}
