/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ds_vanilla.dsVanilla_ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.model_empresa;

/**
 *
 * @author DeboraDev
 */
public class dao_empresa_cadastro {

    public void create(model_empresa empresa) {

        Connection con = dsVanilla_ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO empresa (razao_social,nome_fantasia,cnpj,rua,referencia)VALUES(?,?,?,?,?)");
            stmt.setString(1, empresa.getRazao_social());
            stmt.setString(2, empresa.getNome_fantasia());
            stmt.setString(3, empresa.getCnpj());
            stmt.setString(4, empresa.getRua());
            stmt.setString(5, empresa.getGreferencia());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, stmt);
        }

    }

}
