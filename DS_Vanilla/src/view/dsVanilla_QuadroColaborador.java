/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.dao_pessoa_cadastro;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.model_pessoa;

/**
 *
 * @author DeboraDev
 */
public class dsVanilla_QuadroColaborador extends javax.swing.JInternalFrame {

    /**
     * Creates new form dsVanilla_QuadroColaborador
     */
    public dsVanilla_QuadroColaborador() {
        initComponents();
        readJtable();

    }

    public void readJtable() {
        //Tabela Padrão como modelo
        DefaultTableModel model = (DefaultTableModel) tblQf.getModel();
        model.setNumRows(0);//Começa com 0 de linha
        dao_pessoa_cadastro dao = new dao_pessoa_cadastro();//Inst para acesso select
        //seleciona pessoa 
        dao.quadro().forEach((pessoa) -> {
            //Oque vai selecionar dentro da tabela
            model.addRow(new Object[]{
                pessoa.getId(),
                pessoa.getNome(),
                pessoa.getSexo(),
                pessoa.getCargo(),
                pessoa.getSalario(),
                pessoa.getStatus()
            });
        });
    }
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQf = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboSexo = new javax.swing.JComboBox<>();
        txtCargo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtSal = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cboStatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);

        jp1.setBackground(new java.awt.Color(255, 255, 255));

        tblQf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Nome", "Sexo", "Cargo", "Salario", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQf.setGridColor(new java.awt.Color(255, 255, 255));
        tblQf.setRowHeight(25);
        tblQf.setSelectionBackground(new java.awt.Color(255, 63, 63));
        tblQf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQfMouseClicked(evt);
            }
        });
        tblQf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblQfKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblQfKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblQf);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Basicos"));

        jLabel2.setText("Nome Completo");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Sexo");

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Masculino", "Feminino" }));
        cboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSexoActionPerformed(evt);
            }
        });

        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });

        jLabel26.setText("Cargo");

        txtSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalActionPerformed(evt);
            }
        });

        jLabel27.setText("Salário");

        jLabel32.setText("Status");

        cboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Ativo", "Demitido", "Férias" }));
        cboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboStatusActionPerformed(evt);
            }
        });

        jLabel1.setText("Código funcionário");

        jButton1.setBackground(new java.awt.Color(255, 63, 63));
        jButton1.setText("Editar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 63, 63));
        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(txtSal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(103, 103, 103))
                            .addComponent(cboStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel26))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed

    private void cboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboStatusActionPerformed

    private void cboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSexoActionPerformed

    private void tblQfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblQfKeyReleased
        if (tblQf.getSelectedRow() != -1) {
            //Preenche os campos ao clicar dentro de um dado na tabela
            txtCod.setText(tblQf.getValueAt(tblQf.getSelectedRow(), 0).toString());
            txtNome.setText(tblQf.getValueAt(tblQf.getSelectedRow(), 1).toString());
            cboSexo.setSelectedItem(tblQf.getValueAt(tblQf.getSelectedRow(), 2).toString());
            txtCargo.setText(tblQf.getValueAt(tblQf.getSelectedRow(), 3).toString());
            txtSal.setText(tblQf.getValueAt(tblQf.getSelectedRow(), 4).toString());
            cboStatus.setSelectedItem(tblQf.getValueAt(tblQf.getSelectedRow(), 5).toString());

        }
    }//GEN-LAST:event_tblQfKeyReleased
    public void campos(model_pessoa pessoa) {
        pessoa.setId(txtCod.getText());
        pessoa.setNome(txtNome.getText());
        pessoa.setSexo(cboSexo.getSelectedItem().toString());
        pessoa.setCargo(txtCargo.getText());
        pessoa.setSalario(txtSal.getText());
        pessoa.setStatus(cboStatus.getSelectedItem().toString());

    }
    private void tblQfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblQfKeyPressed

    }//GEN-LAST:event_tblQfKeyPressed

    private void tblQfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQfMouseClicked
        if (tblQf.getSelectedRow() != -1) {
            //Preenche os campos ao clicar dentro de um dado na tabela
            txtCod.setText(tblQf.getValueAt(tblQf.getSelectedRow(), 0).toString());
            txtNome.setText(tblQf.getValueAt(tblQf.getSelectedRow(), 1).toString());
            cboSexo.setSelectedItem(tblQf.getValueAt(tblQf.getSelectedRow(), 2).toString());
            txtCargo.setText(tblQf.getValueAt(tblQf.getSelectedRow(), 3).toString());
            txtSal.setText(tblQf.getValueAt(tblQf.getSelectedRow(), 4).toString());
            cboStatus.setSelectedItem(tblQf.getValueAt(tblQf.getSelectedRow(), 5).toString());

        }

    }//GEN-LAST:event_tblQfMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            model_pessoa pessoa = new model_pessoa();
            dao_pessoa_cadastro dao = new dao_pessoa_cadastro();
            campos(pessoa);
            dao.updateQf(pessoa);
            readJtable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar");
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       txtNome.setText("");
       txtCod.setText("");
       txtSal.setText("");
       txtCargo.setText("");
       cboSexo.setSelectedItem("Selecione:");
       cboStatus.setSelectedItem("Selecione:");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboSexo;
    private javax.swing.JComboBox<String> cboStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp1;
    private javax.swing.JTable tblQf;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSal;
    // End of variables declaration//GEN-END:variables
}
