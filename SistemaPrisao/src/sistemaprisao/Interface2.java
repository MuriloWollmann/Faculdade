/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaprisao;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.List;
import javax.swing.JCheckBox;

/**
 *
 * @author m143903
 */
public class Interface2 extends JFrame {
    
    public Interface2(){
        setTitle("Página de Cadastro");
        setSize(500, 550);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); 
        
        // Painel superior para todos os campos de entrada
        JPanel painelSuperior = new JPanel(new GridLayout(18, 2));
        painelSuperior.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        painelSuperior.add(new JLabel("Responsável:"));
        JTextField campoResponsavel = new JTextField();
        painelSuperior.add(campoResponsavel);
        
        painelSuperior.add(new JLabel("Data Entr. Unid. Prisional:"));
        JTextField campoDataEntrada = new JTextField();
        painelSuperior.add(campoDataEntrada);
        
        painelSuperior.add(new JLabel("Data:"));
        JTextField campoData = new JTextField();
        painelSuperior.add(campoData);
        
        // Painel para a opção de transferido: sim ou não
        // Adicionado ao painel superior (GridLayout)
        JPanel painelTransferido = new JPanel(new GridLayout(1, 3));
        painelTransferido.add(new JLabel("Transferido:"));

        JRadioButton sim = new JRadioButton("Sim");
        JRadioButton nao = new JRadioButton("Não");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(sim);
        grupo.add(nao);

        painelTransferido.add(sim);
        painelTransferido.add(nao);
        
        painelSuperior.add(painelTransferido);
        painelSuperior.add(new JLabel()); //Campo vazio
        
        painelSuperior.add(new JLabel("Onde:"));
        JTextField campoOnde = new JTextField();
        painelSuperior.add(campoOnde);
        
        painelSuperior.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        painelSuperior.add(new JLabel("Nome:"));
        JTextField campoNome = new JTextField();
        painelSuperior.add(campoNome);
        
        painelSuperior.add(new JLabel("Nome Social:"));
        JTextField campoNomeSocial = new JTextField();
        painelSuperior.add(campoNomeSocial);
        
        painelSuperior.add(new JLabel("Data Nasc:"));
        JTextField campoDataNasc = new JTextField();
        painelSuperior.add(campoDataNasc);
        
        painelSuperior.add(new JLabel("CPF:"));
        JTextField campocpf = new JTextField();
        painelSuperior.add(campocpf);
        
        painelSuperior.add(new JLabel("Idade:"));
        JTextField campoIdade = new JTextField();
        painelSuperior.add(campoIdade);
        
        painelSuperior.add(new JLabel("Nome da mãe:"));
        JTextField campoNomeMae = new JTextField();
        painelSuperior.add(campoNomeMae);
        
        painelSuperior.add(new JLabel("Nacionalidade:"));
        JComboBox comboNacionalidade = new JComboBox();
        painelSuperior.add(comboNacionalidade);
        
        // Popular ComboBox
        for (String nacionalidade : FichaDAO.buscarNacionalidade()) {
        comboNacionalidade.addItem(nacionalidade);
        }
        
        painelSuperior.add(new JLabel("Estado Civil:"));
        JComboBox comboEstadoCivil = new JComboBox();
        painelSuperior.add(comboEstadoCivil);
        
        // Popular ComboBox
        for (String estadoCivil : FichaDAO.buscarEstadoCivil()) {
        comboEstadoCivil.addItem(estadoCivil);
        }
        
        painelSuperior.add(new JLabel("Raça/Cor"));
        JComboBox comboRaca = new JComboBox();
        painelSuperior.add(comboRaca);
        
        // Popular ComboBox
        for (String raca : FichaDAO.buscarRaca()) {
        comboRaca.addItem(raca);
        }
        
        painelSuperior.add(new JLabel("Etnia"));
        JComboBox comboEtnia = new JComboBox();
        painelSuperior.add(comboEtnia);
        
        // Popular ComboBox
        for (String etnia : FichaDAO.buscarEtnia()) {
        comboEtnia.addItem(etnia);
        }
        
        painelSuperior.add(new JLabel("Sexo Bio:"));
        JComboBox comboSexo = new JComboBox();
        painelSuperior.add(comboSexo);
        
        // Popular ComboBox
        for (String sexo : FichaDAO.buscarSexoBiologico()) {
        comboSexo.addItem(sexo);
        }
        
        painelSuperior.add(new JLabel("Identidade Gênero:"));
        JComboBox comboIdentidadeGenero = new JComboBox();
        painelSuperior.add(comboIdentidadeGenero);
        
        // Popular ComboBox
        for (String identidadeGenero : FichaDAO.buscarIdentidadeGenero()) {
        comboIdentidadeGenero.addItem(identidadeGenero);
        }
        
        painelSuperior.add(new JLabel("Orientação Sexual:"));
        JComboBox comboOrientacaoSexual = new JComboBox();
        painelSuperior.add(comboOrientacaoSexual);
        
        // Popular ComboBox
        for (String orientacaoSexual : FichaDAO.buscarOrientacaoSexual()) {
        comboOrientacaoSexual.addItem(orientacaoSexual);
        }
        
        // Painel inferior para os botões salvar e cancelar
        JPanel painelInferior = new JPanel(new FlowLayout());
        
        JButton botaoCancelar = new JButton("Cancelar");
        JButton botaoSalvar = new JButton("Salvar");
        
        painelInferior.add(botaoSalvar);
        painelInferior.add(botaoCancelar);
        
        add(painelSuperior, BorderLayout.NORTH);
        add(painelInferior, BorderLayout.SOUTH);
        
        // ActionListener para os botões salvar e cancelar
        botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Trim() descarta espaços em branco no início e fim da string
                String responsavelAtendimento = campoResponsavel.getText().trim();
                String dataEntrada = campoDataEntrada.getText().trim();
                String dataAtendimento = campoData.getText().trim();

                boolean transferenciaSimSelecionado = sim.isSelected();
                boolean transferenciaNaoSelecionado = nao.isSelected();

                String transferenciaLocal = campoOnde.getText().trim();

                String nomeCompleto = campoNome.getText().trim();
                String nomeSocial = campoNomeSocial.getText().trim();
                String dataNascimento = campoDataNasc.getText().trim();

                String idadeTexto = campoIdade.getText().trim();
                int idade = 0;
                
                String nomeMae = campoNomeMae.getText().trim();
                String cpf = campocpf.getText().trim();
                // ? é uma maneira mais rápida de representar um if else (à direita do : é if, e à esquerda é else)
                String nacionalidade = comboNacionalidade.getSelectedItem() != null ? comboNacionalidade.getSelectedItem().toString().trim() : "";
                String estadoCivil = comboEstadoCivil.getSelectedItem() != null ? comboEstadoCivil.getSelectedItem().toString().trim() : "";
                String racaCor = comboRaca.getSelectedItem() != null ? comboRaca.getSelectedItem().toString().trim() : "";
                String etnia = comboEtnia.getSelectedItem() != null ? comboEtnia.getSelectedItem().toString().trim() : "";
                String sexoBiologico = comboSexo.getSelectedItem() != null ? comboSexo.getSelectedItem().toString().trim() : "";
                String identidadeGenero = comboIdentidadeGenero.getSelectedItem() != null ? comboIdentidadeGenero.getSelectedItem().toString().trim() : "";
                String orientacaoSexual = comboOrientacaoSexual.getSelectedItem() != null ? comboOrientacaoSexual.getSelectedItem().toString().trim() : "";

                // Valida se os radio buttons estão selecionados
                if (!transferenciaSimSelecionado && !transferenciaNaoSelecionado) {
                    JOptionPane.showMessageDialog(null, "Selecione se foi transferido: Sim ou Não.");
                    return;
                }   

                // Valida idade numérica
                try {
                    idade = Integer.parseInt(idadeTexto);
                    if (idade < 0) {
                        JOptionPane.showMessageDialog(null, "Idade deve ser um número positivo.");
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Idade inválida.");
                    return;
                }

                // Valida campos obrigatórios (todos, exceto 'onde' se transferencia for Não)
                if (responsavelAtendimento.isEmpty() ||
                    dataEntrada.isEmpty() ||
                    dataAtendimento.isEmpty() ||
                    nomeCompleto.isEmpty() ||
                    nomeSocial.isEmpty() ||
                    dataNascimento.isEmpty() ||
                    cpf.isEmpty() ||
                    nomeMae.isEmpty() ||
                    nacionalidade.isEmpty() ||
                    estadoCivil.isEmpty() ||
                    racaCor.isEmpty() ||
                    etnia.isEmpty() ||
                    sexoBiologico.isEmpty() ||
                    identidadeGenero.isEmpty() ||
                    orientacaoSexual.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios.");
                    return;
                }

                // Validação especial para campo "Onde" (transferenciaLocal)
                // Se transferencia for "Não", "onde" pode ficar em branco
                if (transferenciaSimSelecionado && transferenciaLocal.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Informe o local de transferência.");
                    return;
                }

                FichaAcolhimento ficha = new FichaAcolhimento();
                ficha.responsavelAtendimento = responsavelAtendimento;
                ficha.dataEntrada = dataEntrada;
                ficha.dataAtendimento = dataAtendimento;
                ficha.transferencia = transferenciaSimSelecionado;
                ficha.transferenciaLocal = transferenciaLocal;
                ficha.nomeCompleto = nomeCompleto;
                ficha.nomeSocial = nomeSocial;
                ficha.dataNascimento = dataNascimento;
                ficha.idade = idade;
                ficha.cpf = cpf;
                ficha.nacionalidade = nacionalidade;
                ficha.nomeMae = nomeMae;
                ficha.estadoCivil = estadoCivil;
                ficha.racaCor = racaCor;
                ficha.etnia = etnia;
                ficha.sexoBiologico = sexoBiologico;
                ficha.identidadeGenero = identidadeGenero;
                ficha.orientacaoSexual = orientacaoSexual;

                FichaDAO dao = new FichaDAO();
                boolean sucesso = dao.adicionar(ficha);

                if (sucesso) {
                    JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
                    campoResponsavel.setText("");
                    campoDataEntrada.setText("");
                    campoData.setText("");
                    sim.setSelected(false);
                    nao.setSelected(false);
                    campoOnde.setText("");
                    campoNome.setText("");
                    campoNomeSocial.setText("");
                    campoDataNasc.setText("");
                    campoIdade.setText("");
                    campocpf.setText("");
                    campoNomeMae.setText("");
                    comboNacionalidade.setSelectedIndex(0);
                    comboEstadoCivil.setSelectedIndex(0);
                    comboRaca.setSelectedIndex(0);
                    comboEtnia.setSelectedIndex(0);
                    comboSexo.setSelectedIndex(0);
                    comboIdentidadeGenero.setSelectedIndex(0);
                    comboOrientacaoSexual.setSelectedIndex(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao adicionar, tente novamente.");
                }
            }
        });
        
        botaoCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
                
        setVisible(true);
    }
}