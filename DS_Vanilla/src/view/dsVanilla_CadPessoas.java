/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.dao_pessoa_cadastro;
import javax.swing.table.DefaultTableModel;
import model.model_pessoa;

/**
 *
 * @author Debora Freire
 */
public class dsVanilla_CadPessoas extends javax.swing.JInternalFrame {

    /**
     * Creates new form dsVanilla_CadPessoas
     */
    public dsVanilla_CadPessoas() {
        initComponents();
        readJtable(); // inicializa com a tabela apartir do banco de dados
    }
    //Table model mostra dados do banco de dados 
    public void readJtable() {
        //Tabela Padrão como modelo
        DefaultTableModel model = (DefaultTableModel) tblPessoa.getModel();
        model.setNumRows(0);//Começa com 0 de linha
        dao_pessoa_cadastro dao = new dao_pessoa_cadastro();//Inst para acesso select
        //seleciona pessoa 
        dao.select().forEach((pessoa) -> {
            //Oque vai selecionar dentro da tabela
            model.addRow(new Object[]{
                pessoa.getId(),
                pessoa.getNome(),
                pessoa.getTelefone(),
                pessoa.getCelular(),
                pessoa.getEmail(),
                pessoa.getEndereco(),
                pessoa.getCpf(),
                pessoa.getRg(),
                pessoa.getTipo_contrato(),
                pessoa.getCidade(),
                pessoa.getEstado(),
                pessoa.getCep(),
                pessoa.getGrau_esc(),
                pessoa.getEstado_civil()

            });
        });
    }
    //Pesquisa Candidato
    public void findCandidato(String nome) {//Apartir do nome 
        //Tabela padão
        DefaultTableModel model = (DefaultTableModel) tblPessoa.getModel();
        model.setNumRows(0);//num de linhas iniciais
        dao_pessoa_cadastro dao = new dao_pessoa_cadastro();//Inst de cadastro obj
        dao.findPessoas(nome).forEach((pessoa) -> {//ForEach para passar pelo dados
            //Oque será mostrado quando o candidato ser pesquisado
            model.addRow(new Object[]{
                pessoa.getId(),
                pessoa.getNome(),
                pessoa.getTelefone(),
                pessoa.getCelular(),
                pessoa.getEmail(),
                pessoa.getEndereco(),
                pessoa.getCpf(),
                pessoa.getRg(),
                pessoa.getTipo_contrato(),
                pessoa.getCidade(),
                pessoa.getEstado(),
                pessoa.getCep(),
                pessoa.getGrau_esc(),
                pessoa.getEstado_civil()
            });
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<String>();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPessoa = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboSexo = new javax.swing.JComboBox<String>();
        txtnome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttel = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtend = new javax.swing.JTextField();
        txtcel = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        cbocont = new javax.swing.JComboBox<String>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JFormattedTextField();
        txterg = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        cboestadocivil = new javax.swing.JComboBox<String>();
        jLabel13 = new javax.swing.JLabel();
        cbocidade = new javax.swing.JComboBox<String>();
        jLabel14 = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox<String>();
        jLabel15 = new javax.swing.JLabel();
        txtcep = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        cboEsco = new javax.swing.JComboBox<String>();
        jLabel17 = new javax.swing.JLabel();
        txtNomePesquisa = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        brnadd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(914, 721));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Profissionais"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/profissoes-e-empregos.png"))); // NOI18N
        jLabel1.setText("Adicionar profissional");

        tblPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Telefone", "Celular", "E-mail", "Endereço", "CPF", "RG", "Contrato", "Cidade", "Estado", "CEP", "Grau", "Est.Civil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPessoaMouseClicked(evt);
            }
        });
        tblPessoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPessoaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblPessoa);

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        jLabel2.setText("Nome Completo:");

        jLabel3.setText("Sexo:");

        jLabel4.setText("Endereço:");

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Feminino", "Masculino", "Não Especificado" }));

        jLabel6.setText("Telefone:");

        try {
            txttel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("Celular:");

        jLabel8.setText("E-mail:");

        try {
            txtcel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setText("Tipo de contrato:");

        cbocont.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aprendiz", "Estágiario", "CLT", "Temporário", "Home-Office", "Autonômo" }));

        jLabel10.setText("CPF:");

        jLabel11.setText("RG:");

        try {
            txtcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txterg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel12.setText("Estado Civil:");

        cboestadocivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Casado", "Solteiro" }));

        jLabel13.setText("Cidade:");

        cbocidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "São Paulo", "Rio de Janeiro", " " }));

        jLabel14.setText("Estado:");

        cboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "São Paulo", "Brasilia", " " }));

        jLabel15.setText("CEP:");

        try {
            txtcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel16.setText("Grau de Escolaridade:");

        cboEsco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ensino médio cursando", "Ensino médio completo", "Ensino técnico cursando", "Ensino técnico completo", "Ensino superior cursando", "Ensino superior completo" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(9, 9, 9)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtcpf, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txterg, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtend)
                                        .addGap(8, 8, 8)))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbocont, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cboestadocivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 31, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboEsco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txterg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(cbocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbocont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cboestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cboEsco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        jLabel17.setText("Nome Completo:");

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/frr.png"))); // NOI18N
        jButton1.setText("Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/draw.png"))); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        brnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/signs.png"))); // NOI18N
        brnadd.setText("Adicionar");
        brnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnaddActionPerformed(evt);
            }
        });

        jLabel5.setText("ID:");

        jButton4.setText("Limpar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(brnadd)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2)
                        .addGap(36, 36, 36)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel17)
                    .addComponent(txtNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel5)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnadd)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Adiciona Pesso
    private void brnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnaddActionPerformed
        model_pessoa pessoa = new model_pessoa();//inst de Candidato (atributos)
        dao_pessoa_cadastro dao = new dao_pessoa_cadastro();//Inst (CRUD)
        campos(pessoa);//Campos do formulário
        dao.insert(pessoa);//Insere Candidato
        readJtable();//Atualiza a tabela 
    }//GEN-LAST:event_brnaddActionPerformed
    //Botão para pesquisa de Candidatos
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Model para atributos do candidato
        model_pessoa pessoa = new model_pessoa();
        //Dao para o CRUD no banco de dados
        dao_pessoa_cadastro dao = new dao_pessoa_cadastro();
        //Método pesquisa Candidato
        dao.findPessoas(txtnome.getText());

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked


    }//GEN-LAST:event_jButton3MouseClicked
    //Comportamento da tabela
    private void tblPessoaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPessoaKeyReleased
        //Se a tabela não estiver selecionada
        if (tblPessoa.getSelectedRow() != -1) {
            //Mostra os seguintes dados
            txtID.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(),0).toString());
            txtnome.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 1).toString());
            txttel.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 2).toString());
            txtcel.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 3).toString());
            txtemail.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 4).toString());
            txtend.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 5).toString());
            txtcpf.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 6).toString());
            txterg.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 7).toString());
            cbocont.setSelectedItem(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 8).toString());
            cbocidade.setSelectedItem(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 9).toString());
            cboestado.setSelectedItem(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 10).toString());
            txtcep.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 11).toString());
            cboEsco.setSelectedItem(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 12).toString());
            cboestadocivil.setSelectedItem(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 13).toString());

        }
    }//GEN-LAST:event_tblPessoaKeyReleased
    //Quando o candidato é clicado
    private void tblPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPessoaMouseClicked
        //Se não estiver clicado 
        if (tblPessoa.getSelectedRow() != -1) {
            //Mostra dados obtidos dentro do campo de texto
            txtID.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(),0).toString());
            txtnome.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 1).toString());
            txttel.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 2).toString());
            txtcel.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 3).toString());
            txtemail.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 4).toString());
            txtend.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 5).toString());
            txtcpf.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 6).toString());
            txterg.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 7).toString());
            cbocont.setSelectedItem(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 8).toString());
            cbocidade.setSelectedItem(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 9).toString());
            cboestado.setSelectedItem(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 10).toString());
            txtcep.setText(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 11).toString());
            cboEsco.setSelectedItem(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 12).toString());
            cboestadocivil.setSelectedItem(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 13).toString());

        }
    }//GEN-LAST:event_tblPessoaMouseClicked
    //Update dados
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Inst pessoa 
        model_pessoa pessoa = new model_pessoa();
        //Inst Dao para CRUD
        dao_pessoa_cadastro dao = new dao_pessoa_cadastro();
        //Apartir do ID da pessoa a mesma é atualizada
        pessoa.setId(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 0).toString());
        //Atualiza todos os campos que foram alterados    
        campos(pessoa);
        //Chama metodo atualizar
        dao.update(pessoa);
        //Atualiza tabela 
        readJtable();
    }//GEN-LAST:event_jButton2ActionPerformed
    //Remove pessoa
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Inst de pessoa 
        model_pessoa pessoa = new model_pessoa();
        //dao do crud
        dao_pessoa_cadastro dao = new dao_pessoa_cadastro();
        //Apartir do ID se deleta uma pessoa
        pessoa.setId(tblPessoa.getValueAt(tblPessoa.getSelectedRow(), 0).toString());
        //Chama o metodo que remove pessoa
        dao.remove(pessoa);
        //Atualiza tabela 
        readJtable();
    }//GEN-LAST:event_jButton1ActionPerformed
    //Limpa Campos
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpar();//Chama função que limpa os dados do formulário
    }//GEN-LAST:event_jButton4ActionPerformed
    //Função que lista dos dos campo de candidato
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
        pessoa.setTipo_contrato(cbocont.getSelectedItem().toString());
        pessoa.setEstado_civil(cboestadocivil.getSelectedItem().toString());
        pessoa.setEstado(cboestado.getSelectedItem().toString());
        pessoa.setCidade(cbocidade.getSelectedItem().toString());
        pessoa.setGrau_esc(cboEsco.getSelectedItem().toString());
    }
    //Campo que limpa campos
    public void limpar() {
        txtnome.setText("");
        txtcel.setText("");
        txttel.setText("");
        txtcep.setText("");
        txtend.setText("");
        txtemail.setText("");
        txterg.setText("");

    }

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
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPessoa;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNomePesquisa;
    private javax.swing.JFormattedTextField txtcel;
    private javax.swing.JFormattedTextField txtcep;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtend;
    private javax.swing.JFormattedTextField txterg;
    private javax.swing.JTextField txtnome;
    private javax.swing.JFormattedTextField txttel;
    // End of variables declaration//GEN-END:variables
}
