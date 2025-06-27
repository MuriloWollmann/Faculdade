/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaprisao;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 *
 * @author m143903
 */
public class Interface1 extends JFrame {
    
    public Interface1(){
        setTitle("Página Inicial");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10)); 
        
        // Painel superior
        JPanel painelSuperior = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelSuperior.add(new JLabel("Nome:"));
        
        JTextField campoNome = new JTextField();
        JButton botaoBuscar = new JButton("Buscar");
        JButton botaoCadastrar = new JButton("Cadastrar");
        
        painelSuperior.add(campoNome);
        campoNome.setPreferredSize(new Dimension(150, 25));
        painelSuperior.add(botaoBuscar);
        painelSuperior.add(botaoCadastrar);
        
        add(painelSuperior, BorderLayout.NORTH);
        
        // Tabela
        String[] colunas = {"Id", "Nome", "CPF", "Idade", "Nome da mãe"};
        DefaultTableModel modeloTabela = new DefaultTableModel(colunas, 0);
        JTable tabela = new JTable(modeloTabela);
        JScrollPane scroll = new JScrollPane(tabela);
        add(scroll, BorderLayout.CENTER);
        
        
        botaoBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeSelecionado = campoNome.getText();
                List<FichaAcolhimento> resultados = FichaDAO.buscarNome(nomeSelecionado);

                DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
                modelo.setRowCount(0); // Limpa a tabela

                for (FichaAcolhimento f : resultados) {
                    modelo.addRow(new Object[]{
                        f.id,
                        f.nomeCompleto,
                        f.cpf,
                        f.idade,
                        f.nomeMae
                    });
                }
            }
        });
        
        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Novo registro
                Interface2 i = new Interface2();
            }
        });
        
        setVisible(true);
    }

}
