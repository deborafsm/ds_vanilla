/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.dao_estoque;
import dao.dao_vagas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.model_estoque;
import model.model_estoque;

/**
 *
 * @author DeboraDev
 */
public class dsVanilla_Estoque extends javax.swing.JInternalFrame {

    /**
     * Creates new form dsVanilla_Estoque
     */
    public dsVanilla_Estoque() {
        initComponents();
        readJtable();
    }
    
    public void readJtable() {
        DefaultTableModel model = (DefaultTableModel) tblEstoque.getModel();
        model.setNumRows(0);
        dao_estoque dao = new dao_estoque();
        dao.select().forEach((op) -> {
            
            model.addRow(new Object[]{
                op.getCodigo(),
                op.getFornecedor(),
                op.getProduto(),
                op.getValor(),
                op.getQuantidade()
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        txtQuant = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        txtProd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtAdd = new javax.swing.JButton();
        txtRemove = new javax.swing.JButton();
        txtEdit = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1298, 772));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estoque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod", "Fornecedor", "Produto", "Valor", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstoque.setSelectionBackground(new java.awt.Color(255, 63, 63));
        tblEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstoqueMouseClicked(evt);
            }
        });
        tblEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblEstoqueKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblEstoque);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Produto"));

        jLabel4.setText("Quantidade:");

        jLabel3.setText("Valor:");

        jLabel1.setText("Produto:");

        jLabel2.setText("Fornecedor:");

        jLabel5.setText("ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(201, 201, 201)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(294, 294, 294))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtFornecedor, txtId, txtProd, txtQuant, txtValor});

        txtAdd.setBackground(new java.awt.Color(255, 63, 63));
        txtAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtAdd.setForeground(new java.awt.Color(255, 255, 255));
        txtAdd.setText("Adicionar");
        txtAdd.setBorder(null);
        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });

        txtRemove.setBackground(new java.awt.Color(255, 63, 63));
        txtRemove.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtRemove.setForeground(new java.awt.Color(255, 255, 255));
        txtRemove.setText("Remover");
        txtRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemoveActionPerformed(evt);
            }
        });

        txtEdit.setBackground(new java.awt.Color(255, 63, 63));
        txtEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtEdit.setForeground(new java.awt.Color(255, 255, 255));
        txtEdit.setText("Editar");
        txtEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRemove)
                        .addComponent(txtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAdd, txtEdit, txtRemove});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditActionPerformed
        try {
            model_estoque estoque = new model_estoque();
            dao_estoque dao = new dao_estoque();
            campos(estoque);
            estoque.setCodigo(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 0).toString());
            dao.update(estoque);
            readJtable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Os dados não foram alterados");
        }
    }//GEN-LAST:event_txtEditActionPerformed

    private void txtRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemoveActionPerformed
        try {
            model_estoque estoque = new model_estoque();
            dao_estoque dao = new dao_estoque();
            estoque.setCodigo(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 0).toString());
            dao.remove(estoque);
            readJtable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel remover os dados.");
        }

    }//GEN-LAST:event_txtRemoveActionPerformed

    private void txtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddActionPerformed
        try {
            model_estoque estoque = new model_estoque();
            dao_estoque dao = new dao_estoque();
            campos(estoque);
            dao.insert(estoque);
            readJtable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar, verifique os campos.");
        }

    }//GEN-LAST:event_txtAddActionPerformed

    private void tblEstoqueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEstoqueKeyReleased
        if (tblEstoque.getSelectedRow() != -1) {
            txtId.setText(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 0).toString());
            txtFornecedor.setText(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 1).toString());
            txtProd.setText(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 2).toString());
            txtValor.setText(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 3).toString());
            txtQuant.setText(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_tblEstoqueKeyReleased

    private void tblEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstoqueMouseClicked
        if (tblEstoque.getSelectedRow() != -1) {
            txtId.setText(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 0).toString());
            txtFornecedor.setText(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 1).toString());
            txtProd.setText(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 2).toString());
            txtValor.setText(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 3).toString());
            txtQuant.setText(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_tblEstoqueMouseClicked
    
    public void campos(model_estoque estoque) {
        estoque.setFornecedor(txtFornecedor.getText());
        estoque.setProduto(txtProd.getText());
        estoque.setQuantidade(txtQuant.getText());
        estoque.setValor(txtValor.getText());
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEstoque;
    private javax.swing.JButton txtAdd;
    private javax.swing.JButton txtEdit;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtProd;
    private javax.swing.JTextField txtQuant;
    private javax.swing.JButton txtRemove;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
