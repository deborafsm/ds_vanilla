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
import javax.swing.JOptionPane;
import model.model_pessoa;
import model.model_usuario;

/**
 *
 * @author DeboraDev
 */
public class dao_usuarios {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    //# id, login, senha
    public dao_usuarios() {
        con = ds_vanilla.dsVanilla_ConnectionFactory.getConnection();
    }

    public void insert(model_usuario pessoa) {
        Connection con = dsVanilla_ConnectionFactory.getConnection();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO usuarios (login,senha)VALUES(?,?)");

            ps.setString(1, pessoa.getLogin());
            ps.setString(2, pessoa.getSenha());

            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con);
        }
    }

    public void remove(model_usuario pessoa) {//remove salário
        PreparedStatement ps = null;
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pessoa.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Funcionario removido");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: ");
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con);
        }

    }
    
    public void update(model_usuario pessoa){//atualiza salario e status
        PreparedStatement ps = null;
        //update  titulo, descricao, nome_empregador, celular, telefone, email
        String sql = "UPDATE funcionarios SET login = ?, senha = ?, WHERE id =?;";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pessoa.getLogin());
            ps.setString(2, pessoa.getSenha());
            
            ps.setString(3, pessoa.getId());
           

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados foram alterados com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps);
        }
    }
}
