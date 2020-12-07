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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.model_usuario;
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

    public void insert(model_usuario user) {
        Connection con = dsVanilla_ConnectionFactory.getConnection();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO usuarios (login,senha)VALUES(?,?)");

            ps.setString(1, user.getLogin());
            ps.setString(2, user.getSenha());

            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con);
        }
    }

    public void remove(model_usuario user) {//remove salário
        PreparedStatement ps = null;
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Funcionario removido");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: ");
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con);
        }

    }

    public void update(model_usuario user) {//atualiza salario e status
        PreparedStatement ps = null;
        //update  titulo, descricao, nome_empregador, celular, telefone, email
        String sql = "UPDATE usuarios SET login = ?, senha = ?, WHERE id =?;";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getLogin());
            ps.setString(2, user.getSenha());
            ps.setString(3, user.getId());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados foram alterados com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps);
        }
    }

    public List<model_usuario> select() {

        String sql = "Select id, login , senha from usuarios";
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<model_usuario> listPessoa = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                model_usuario pessoa = new model_usuario();
                pessoa.setId(rs.getString("id"));
                pessoa.setLogin(rs.getString("login"));
                pessoa.setSenha(rs.getString("senha"));

                listPessoa.add(pessoa);
            }
        } catch (SQLException e) {
            System.out.println("Erro find all " + e);//mOSTRA o erro
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps, rs);
        }
        return listPessoa;
    }
}
