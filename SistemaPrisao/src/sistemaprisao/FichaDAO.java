/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaprisao;

import java.sql.*;
import java.util.*;

/**
 *
 * @author m143903
 */
public class FichaDAO {
    
    public static Connection conectar() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String user = "root";
        String senha = "admin";
        return DriverManager.getConnection("jdbc:mysql://localhost/ficha_acolhimento_prisional", user, senha);
    }
    

    public static List<String> buscarNacionalidade() {
        return Arrays.asList("Brasileiro", "Naturalizado", "Estrangeiro");
    }

    public static List<String> buscarEstadoCivil() {
        return Arrays.asList("Solteiro", "Casado", "União Estável");
    }
    
    public static List<String> buscarRaca() {
        return Arrays.asList("Branco", "Preto", "Pardo", "Amarelo", "Indígena");
    }
    
    public static List<String> buscarEtnia() {
        return Arrays.asList("Branco", "Preto", "Pardo", "Amarelo", "Indígena");
    }
    
    public static List<String> buscarSexoBiologico() {
        return Arrays.asList("Feminino", "Masculino");
    }
    
    public static List<String> buscarIdentidadeGenero() {
        return Arrays.asList("Homem", "Mulher", "Transexual", "Não binário");
    }
    
    public static List<String> buscarOrientacaoSexual() {
        return Arrays.asList("Heterossexual", "Homossexual(gay/lésbica)", "Bissexual", "Outra");
    }
    
    
    public static List<FichaAcolhimento> buscarNome(String nome) {
        List<FichaAcolhimento> lista = new ArrayList<>();
        try (Connection con = conectar()) {
            String sql = "SELECT * FROM ficha_acolhimento WHERE nome_completo LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + nome + "%"); // Permite buscar parte do nome
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                FichaAcolhimento f = new FichaAcolhimento();
                f.id = rs.getInt("id");
                f.responsavelAtendimento = rs.getString("responsavel_atendimento");
                f.dataEntrada = rs.getString("data_entrada");
                f.dataAtendimento = rs.getString("data_atendimento");
                f.transferencia = rs.getBoolean("transferencia");
                f.transferenciaLocal = rs.getString("transferencia_local");
                f.nomeCompleto = rs.getString("nome_completo");
                f.nomeSocial = rs.getString("nome_social");
                f.dataNascimento = rs.getString("data_nascimento");
                f.idade = rs.getInt("idade");
                f.cpf = rs.getString("cpf");
                f.nacionalidade = rs.getString("nacionalidade");
                f.nomeMae = rs.getString("nome_mae");
                f.estadoCivil = rs.getString("estado_civil");
                f.racaCor = rs.getString("raca_cor");
                f.etnia = rs.getString("etnia");
                f.sexoBiologico = rs.getString("sexo_biologico");
                f.identidadeGenero = rs.getString("identidade_genero");
                f.orientacaoSexual = rs.getString("orientacao_sexual");
                lista.add(f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public boolean adicionar(FichaAcolhimento f) {
        try (Connection con = conectar()) {
            String sql = "INSERT INTO ficha_acolhimento "
                    + "(responsavel_atendimento, data_entrada, data_atendimento, transferencia, "
                    + "transferencia_local, nome_completo, nome_social, data_nascimento, "
                    + "idade, cpf, nacionalidade, nome_mae, estado_civil, "
                    + "raca_cor, etnia, sexo_biologico, identidade_genero, orientacao_sexual) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, f.responsavelAtendimento);
            ps.setString(2, f.dataEntrada);
            ps.setString(3, f.dataAtendimento);
            ps.setBoolean(4, f.transferencia);
            ps.setString(5, f.transferenciaLocal);
            ps.setString(6, f.nomeCompleto);
            ps.setString(7, f.nomeSocial);
            ps.setString(8, f.dataNascimento);
            ps.setInt(9, f.idade);
            ps.setString(10, f.cpf);
            ps.setString(11, f.nacionalidade);
            ps.setString(12, f.nomeMae);
            ps.setString(13, f.estadoCivil);
            ps.setString(14, f.racaCor);
            ps.setString(15, f.etnia);
            ps.setString(16, f.sexoBiologico);
            ps.setString(17, f.identidadeGenero);
            ps.setString(18, f.orientacaoSexual);
            
            int linhasAfetadas = ps.executeUpdate();
            return linhasAfetadas > 0; // Retorna true se inseriu pelo menos 1 linha
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } 
    }
}
