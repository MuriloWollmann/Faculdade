/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastros;

/**
 *
 * @author user
 */
public class Pessoa {
    
    private static int countId = 0;
    
    private int id;
    private String nome;
    private String idade;
    private String cidade;
    
    public Pessoa (String nome, String idade, String cidade){
        this.id = countId++;
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }    
    
    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Getters
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }
    
    public String getCidade() {
        return cidade;
    }
}
