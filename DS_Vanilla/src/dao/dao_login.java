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
import model.model_login;

/**
 *
 * @author Débora FSM
 */
public class dao_login {

    public boolean logar(String login, String senha) {

        Connection con = dsVanilla_ConnectionFactory.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        boolean logar = false;
        try {
            ps = con.prepareStatement("SELECT * FROM  usuarios WHERE login = ? AND senha = ?");
            ps.setString(1, login);
            ps.setString(2, senha);
            rs = ps.executeQuery();
            if (rs.next()) {
                logar = true;
            }
        } catch (SQLException e) {
            System.out.println("erro: " + e);
        } finally {
            dsVanilla_ConnectionFactory.closeConection(con, ps, rs);
        }
        return logar;
    }

    
}
