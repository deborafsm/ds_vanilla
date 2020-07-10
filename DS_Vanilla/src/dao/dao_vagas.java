/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ds_vanilla.dsVanilla_ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.model_pessoa;
import model.model_vagas;

/**
 *
 * @author DeboraDev
 */
public class dao_vagas {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public dao_vagas() {
        con = ds_vanilla.dsVanilla_ConnectionFactory.getConnection();
    }

    //insert;
    public void create(model_vagas vagas) {

        Connection con = dsVanilla_ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO vagas (data_vaga, nome_empregador, titulo, descricao, celular, telefone, email)VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1, vagas.getDate());
            stmt.setString(2, vagas.getNome());
            stmt.setString(3, vagas.getTitulo());
            stmt.setString(4, vagas.getDescricao());
            stmt.setString(5, vagas.getCelular());
            stmt.setString(6, vagas.getTelefone());
            stmt.setString(7, vagas.getEmail());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, stmt);
        }

    }

    //update
    public void updateVagas(model_vagas id) {
        try {

        } catch (Exception e) {
        }
    }

    //remove
    public void removeVagas() {

    }

    //find
    public void find() {

    }
}
