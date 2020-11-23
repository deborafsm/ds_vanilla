/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.dao_findFuncionario;
import dao.dao_funcionario;
import dao.dao_pessoa_cadastro;
import ds_vanilla.ConexaoBD;
import ds_vanilla.dsVanilla_ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.model_pessoa;
import javax.swing.table.DefaultTableModel;
import model.model_pessoa;
import java.sql.SQLException;

/**
 *
 * @author DeboraDev
 */
public class ds_funcionarios extends javax.swing.JInternalFrame {

    model_pessoa mod = new model_pessoa();
    dao_findFuncionario control = new dao_findFuncionario();
    ConexaoBD conex = new ConexaoBD();

    /**
     * Creates new form ds_funcionarios
     */
    public ds_funcionarios() {
        initComponents();
//        readJtable();
//        Connection con = null;
//        con = dsVanilla_ConnectionFactory.getConnection();
//        showFind();
//        list.setVisible(true);
//        model = new DefaultListModel();
//        list.setModel(model);
    }

//    // Pesquisa Google
//    public void listFind() {
//        PreparedStatement ps = null;
//        ResultSet resultset = null;
//        Connection con = null;
//        con = dsVanilla_ConnectionFactory.getConnection();
//        String sql = ("SELECT * FROM pessoas where nome like '" + txtNomePesquisa.getText() + "%' ORDER BY nome");
//
//        try {
//            ps = con.prepareStatement(sql);
//            resultset = ps.executeQuery();
//
//            model.removeAllElements();
//            int v = 0;
//            cod = new String[40];
//            while (resultset.next() & v < 4) {
//                model.addElement(resultset.getString("nome"));
//                cod[v] = resultset.getString("cod");
//                v++;
//            }
//            if (v >= 1) {
//                list.setVisible(true);
//            } else {
//                list.setVisible(false);
//            }
//            resultFind();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Erro ao pesquisar" + e);
//        }
//    }
//
//    public void showFind() {
//        PreparedStatement ps = null;
//        ResultSet resultset = null;
//        Connection con = null;
//        con = dsVanilla_ConnectionFactory.getConnection();
//
//        int linha = list.getSelectedIndex();
//        if (linha > 0) {
//            String sql = ("SELECT * FROM pessoas where id = " + cod[linha] + "");
//            resultFind();
//        }
//    }

//    public void resultFind() {
//        PreparedStatement ps = null;
//        ResultSet resultset = null;
//        Connection con = null;
//        con = dsVanilla_ConnectionFactory.getConnection();
//        txtnome.setText(resultset.getString("nome"));
//    }

//    public void readJtable() {
//        //Tabela Padrão como modelo
//        DefaultTableModel model = (DefaultTableModel) tblPessoa.getModel();
//        model.setNumRows(0);//Começa com 0 de linha
//        dao_pessoa_cadastro dao = new dao_pessoa_cadastro();//Inst para acesso select
//        //seleciona pessoa 
//        dao.select().forEach((pessoa) -> {
//            //Oque vai selecionar dentro da tabela
//            model.addRow(new Object[]{
//                //# id_pessoa, nome, sexo, telefone, celular, email, data_nasc, rg, cpf, estado_civil, tipo_contrato, cep, cidade, estado, grau_esc, 
//                //endereco, cargo, status, salario, admissao, carga_ini, carga_fim, num_dependentes, nome_pai_mae, nome_mae_pai, tipoPessoa, area
//
//                pessoa.getId(),
//                pessoa.getNome(),
//                pessoa.getTelefone(),
//                pessoa.getCelular(),
//                pessoa.getEmail(),
//                pessoa.getEndereco(),
//                pessoa.getCpf(),
//                pessoa.getRg(),
//                pessoa.getTipo_contrato(),
//                pessoa.getCidade(),
//                pessoa.getEstado(),
//                pessoa.getCep(),
//                pessoa.getGrau_esc(),
//                pessoa.getEstado_civil(),
//                pessoa.getCargo(),
//                pessoa.getStatus(),
//                pessoa.getSalario(),
//                pessoa.getAdmissao(),
//                pessoa.getCargaIni(),
//                pessoa.getCargaFim(),
//                pessoa.getNumDep(),
//                pessoa.getNomePaiMae(),
//                pessoa.getNomeMaePai(),
//                pessoa.getTipoPessoa(),
//                pessoa.getArea()
//
//            });
//        });
//    }
    //Pesquisa Candidato
//    public void findCandidato(String nome) {//Apartir do nome 
//        //Tabela padão
//        DefaultTableModel model = (DefaultTableModel) tblPessoa.getModel();
//        model.setNumRows(0);//num de linhas iniciais
//        dao_pessoa_cadastro dao = new dao_pessoa_cadastro();//Inst de cadastro obj
//        dao.findPessoas(nome).forEach((pessoa) -> {//ForEach para passar pelo dados
//            //Oque será mostrado quando o candidato ser pesquisado
//            model.addRow(new Object[]{
//                pessoa.getId(),
//                pessoa.getNome(),
//                pessoa.getTelefone(),
//                pessoa.getCelular(),
//                pessoa.getEmail(),
//                pessoa.getEndereco(),
//                pessoa.getCpf(),
//                pessoa.getRg(),
//                pessoa.getTipo_contrato(),
//                pessoa.getCidade(),
//                pessoa.getEstado(),
//                pessoa.getCep(),
//                pessoa.getGrau_esc(),
//                pessoa.getEstado_civil(),
//                pessoa.getCargo(),
//                pessoa.getStatus(),
//                pessoa.getSalario(),
//                pessoa.getAdmissao(),
//                pessoa.getCargaIni(),
//                pessoa.getCargaFim(),
//                pessoa.getNumDep(),
//                pessoa.getNomePaiMae(),
//                pessoa.getNomeMaePai(),
//                pessoa.getTipoPessoa(),
//                pessoa.getArea()
//
//            });
//        });
//    }
    public void campos(model_pessoa pessoa) {
        pessoa.setNome(txtnome.getText());
        pessoa.setTelefone(txttel.getText());
        pessoa.setCelular(txtcel.getText());
        pessoa.setEmail(txtemail.getText());
        pessoa.setCpf(txtcpf.getText());
        pessoa.setRg(txterg.getText());
        pessoa.setCep(txtcep.getText());
        pessoa.setEndereco(txtend.getText());
        pessoa.setSexo(cboSexo.getSelectedItem().toString());
        pessoa.setData_nasc(txtDataNasc.getText());
        pessoa.setTipo_contrato(cbocont.getSelectedItem().toString());
        pessoa.setEstado_civil(cboestadocivil.getSelectedItem().toString());
        pessoa.setEstado(cboestado.getSelectedItem().toString());
        pessoa.setCidade(cbocidade.getSelectedItem().toString());
        pessoa.setGrau_esc(cboEsco.getSelectedItem().toString());
        pessoa.setArea(txtArea.getText());
        pessoa.setCargo(txtCargo.getText());
        pessoa.setSalario(txtSal.getText());
        pessoa.setAdmissao(txtAdmissao.getText());
        pessoa.setCargaIni(txtHoraIni.getText());
        pessoa.setCargaFim(txtHoraFim.getText());
        pessoa.setNumDep(txtnumDep.getText());
        pessoa.setStatus(txtStatus.getSelectedItem().toString());
        pessoa.setTipoPessoa(txtTipoPessoa.getSelectedItem().toString());
        pessoa.setNomeMaePai(txtmaePai.getText());
        pessoa.setNomePaiMae(txtNomepaiMae.getText());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        txtNomePesquisa = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTipoPessoa = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        txtNomepaiMae = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtmaePai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboSexo = new javax.swing.JComboBox<>();
        txtnome = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txttel = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcel = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        cbocont = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        cboEsco = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        txtHoraIni = new javax.swing.JFormattedTextField();
        jLabel30 = new javax.swing.JLabel();
        txtHoraFim = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtend = new javax.swing.JTextField();
        txtnumDep = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JComboBox<>();
        txtcep = new javax.swing.JFormattedTextField();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cboestadocivil = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        brnadd = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JFormattedTextField();
        txterg = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        cbocidade = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtSal = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtAdmissao = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNomePesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePesquisaActionPerformed(evt);
            }
        });

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel8.setText("E-mail:");

        jLabel18.setText("Tipo de Pessoa:");

        txtTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Pessoa Fisica", "Pessoa Juridica" }));
        txtTipoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoPessoaActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Basicos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel22))
        );

        jLabel19.setText("Nascimento:");

        try {
            txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascActionPerformed(evt);
            }
        });

        jLabel20.setText("Nome do Pai / Mãe:");

        txtNomepaiMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomepaiMaeActionPerformed(evt);
            }
        });

        jLabel21.setText("Nome do Pai / Mãe:");

        txtmaePai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaePaiActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Sexo/Gênero:");

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Heterosexual", "Homosexual", "Transexual / Transgênero", "Bissexual", "Pansexual", "Assexuado", " " }));
        cboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSexoActionPerformed(evt);
            }
        });

        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Complementares");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23)
        );

        jLabel6.setText("Telefone:");

        try {
            txttel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("Celular:");

        try {
            txtcel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo de contrato:");

        cbocont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprendiz", "Estágiario", "CLT", "Temporário", "Home-Office", "Autonômo" }));

        jLabel16.setText("Grau de Escolaridade:");

        cboEsco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ensino médio cursando", "Ensino médio completo", "Ensino técnico cursando", "Ensino técnico completo", "Ensino superior cursando", "Ensino superior completo" }));

        jLabel29.setText("Carga Horária");

        try {
            txtHoraIni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel30.setText("às");

        try {
            txtHoraFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("Endereço:");

        jLabel31.setText("Número de Dependentes");

        txtend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtendActionPerformed(evt);
            }
        });

        jLabel32.setText("Status");

        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Ativo", "Demitido", "Férias" }));
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        try {
            txtcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcepActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Limpar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel12.setText("Estado Civil:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/frr.png"))); // NOI18N
        jButton1.setText("Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cboestadocivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Casado", "Solteiro" }));
        cboestadocivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboestadocivilActionPerformed(evt);
            }
        });

        jLabel15.setText("CEP:");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/draw.png"))); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        brnadd.setBackground(new java.awt.Color(255, 255, 255));
        brnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/signs.png"))); // NOI18N
        brnadd.setText("Adicionar");
        brnadd.setBorderPainted(false);
        brnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnaddActionPerformed(evt);
            }
        });

        jLabel10.setText("CPF:");

        jLabel11.setText("RG:");

        try {
            txtcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpfActionPerformed(evt);
            }
        });

        try {
            txterg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txterg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtergActionPerformed(evt);
            }
        });

        jLabel13.setText("Cidade:");

        cbocidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "São Paulo", "Rio de Janeiro", " " }));

        jLabel14.setText("Estado:");

        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SP", "DF", "RJ", "BH", "MG" }));
        cboestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboestadoActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Dados do Colaborador");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel25.setText("Area de atuação");

        jLabel26.setText("Cargo");

        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });

        jLabel27.setText("Salário");

        txtSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalActionPerformed(evt);
            }
        });

        jLabel28.setText("Admissão");

        try {
            txtAdmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/profissoes-e-empregos.png"))); // NOI18N
        jLabel1.setText("Profissional");

        jLabel17.setText("Nome Completo:");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/encontrar.png"))); // NOI18N
        jButton3.setText("pesquisar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("ID:");

        jLayeredPane2.setLayer(txtNomePesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtemail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtTipoPessoa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtDataNasc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtNomepaiMae, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtmaePai, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cboSexo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtnome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txttel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtcel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cbocont, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cboEsco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtHoraIni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtHoraFim, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtend, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtnumDep, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtStatus, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtcep, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cboestadocivil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(brnadd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtcpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txterg, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cbocidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(cboestado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtArea, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtCargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtSal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtAdmissao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtID, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(365, 365, 365)
                        .addComponent(jLabel3)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel19)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel20)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel21))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(txtNomepaiMae, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtmaePai, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel7)
                        .addGap(124, 124, 124)
                        .addComponent(jLabel8)
                        .addGap(268, 268, 268)
                        .addComponent(jLabel16)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel9)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel18))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtcel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboEsco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(cbocont, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel10)
                        .addGap(198, 198, 198)
                        .addComponent(jLabel11)
                        .addGap(134, 134, 134)
                        .addComponent(jLabel4)
                        .addGap(242, 242, 242)
                        .addComponent(jLabel15)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel13)
                        .addGap(154, 154, 154)
                        .addComponent(jLabel14))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(cboestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txterg, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(cbocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel25)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel26)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel27)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel28)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel29)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel31)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel32))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtSal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(txtHoraIni, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel30)
                        .addGap(4, 4, 4)
                        .addComponent(txtHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtnumDep, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(brnadd)
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap())
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jLabel17)
                .addGap(6, 6, 6)
                .addComponent(txtNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jButton3)
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton3))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(6, 6, 6)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomepaiMae, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmaePai, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel16)
                    .addComponent(jLabel9)
                    .addComponent(jLabel18))
                .addGap(6, 6, 6)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cboEsco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cbocont, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4))))
                .addGap(6, 6, 6)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txterg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addGap(6, 6, 6)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraIni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel30))
                    .addComponent(txtHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumDep, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brnadd)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButton4)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtendActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void txtcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcepActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        limpar();//Chama função que limpa os dados do formulário
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Inst de pessoa
        model_pessoa pessoa = new model_pessoa();
        //dao do crud
        dao_pessoa_cadastro dao = new dao_pessoa_cadastro();
        //Apartir do ID se deleta uma pessoa
//        pessoa.setId(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 0).toString());
        //Chama o metodo que remove pessoa
        dao.remove(pessoa);
        //Atualiza tabela
//        readJtable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboestadocivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestadocivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboestadocivilActionPerformed

    private void txtTipoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoPessoaActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try {
            mod.setPesquisa(txtNomePesquisa.getText());
            model_pessoa model = control.findPessoas(mod);
            //chama os itens
            txtnome.setText(model.getNome());
//            cboSexo.getSelectedItem().toString();

        } catch (SQLException ex) {
            System.out.println("ERRO "+ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Inst pessoa
        model_pessoa pessoa = new model_pessoa();
        //Inst Dao para CRUD
        dao_pessoa_cadastro dao = new dao_pessoa_cadastro();
        //Apartir do ID da pessoa a mesma é atualizada
//        pessoa.setId(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 0).toString());
        //Atualiza todos os campos que foram alterados
        campos(pessoa);
        //Chama metodo atualizar
        dao.update(pessoa);
        //Atualiza tabela
//        readJtable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void brnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnaddActionPerformed
        model_pessoa pessoa = new model_pessoa();//inst de Candidato (atributos)
        dao_pessoa_cadastro dao = new dao_pessoa_cadastro();//Inst (CRUD)
        campos(pessoa);//Campos do formulário
        dao.insert(pessoa);//Insere Candidato
//        readJtable();//Atualiza a tabela
    }//GEN-LAST:event_brnaddActionPerformed

    private void txtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpfActionPerformed

    private void txtergActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtergActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtergActionPerformed

    private void cboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboestadoActionPerformed

    private void txtDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascActionPerformed

    private void txtNomepaiMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomepaiMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomepaiMaeActionPerformed

    private void txtmaePaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaePaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaePaiActionPerformed

    private void cboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSexoActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed

    private void txtSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalActionPerformed

    private void txtcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcelActionPerformed

    private void txtNomePesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnadd;
    private javax.swing.JComboBox<String> cboEsco;
    private javax.swing.JComboBox<String> cboSexo;
    private javax.swing.JComboBox<String> cbocidade;
    private javax.swing.JComboBox<String> cbocont;
    private javax.swing.JComboBox<String> cboestado;
    private javax.swing.JComboBox<String> cboestadocivil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JFormattedTextField txtAdmissao;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JFormattedTextField txtHoraFim;
    private javax.swing.JFormattedTextField txtHoraIni;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNomePesquisa;
    private javax.swing.JTextField txtNomepaiMae;
    private javax.swing.JTextField txtSal;
    private javax.swing.JComboBox<String> txtStatus;
    private javax.swing.JComboBox<String> txtTipoPessoa;
    private javax.swing.JFormattedTextField txtcel;
    private javax.swing.JFormattedTextField txtcep;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtend;
    private javax.swing.JFormattedTextField txterg;
    private javax.swing.JTextField txtmaePai;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnumDep;
    private javax.swing.JFormattedTextField txttel;
    // End of variables declaration//GEN-END:variables
}
