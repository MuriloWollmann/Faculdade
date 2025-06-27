/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaprisao;

/**
 *
 * @author user
 */
public class FichaAcolhimento {
    public int id;

    // Seção de Atendimento
    public String responsavelAtendimento;
    public String dataEntrada;
    public String dataAtendimento;
    public boolean transferencia;
    public String transferenciaLocal;

    // Seção de Identificação
    public String nomeCompleto;
    public String nomeSocial;
    public String dataNascimento;
    public int idade;
    public String cpf;
    public String nacionalidade;
    public String nomeMae;
    public String estadoCivil;

    // Seção Raça/cor
    public String racaCor;
    public String etnia;

    // Seção Gênero
    public String sexoBiologico;
    public String identidadeGenero;
    public String orientacaoSexual;
    
    public FichaAcolhimento(){}
}
