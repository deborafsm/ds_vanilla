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
import model.model_estoque;
import model.model_estoque;
import model.model_estoque;
import model.model_estoque;

/**
 *
 * @author DeboraDev
 */
public class dao_estoque {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public dao_estoque() {
        con = ds_vanilla.dsVanilla_ConnectionFactory.getConnection();
    }

    //# codigo, fornecedor, produto, valor, quantidade
    public void insert(model_estoque estoque) {

        Connection con = dsVanilla_ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO estoque (fornecedor, produto, valor, quantidade)VALUES(?,?,?,?)");
            stmt.setString(1, estoque.getFornecedor());
            stmt.setString(2, estoque.getProduto());
            stmt.setString(3, estoque.getValor());
            stmt.setString(4, estoque.getQuantidade());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar, verifique os campos");
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<model_estoque> select() {

        String sql = "Select codigo, fornecedor, produto, valor, quantidade from estoque";
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<model_estoque> listPessoa = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                model_estoque est = new model_estoque();
                est.setCodigo(rs.getString("codigo"));
                est.setFornecedor(rs.getString("fornecedor"));
                est.setProduto(rs.getString("produto"));
                est.setQuantidade(rs.getString("valor"));
                est.setValor(rs.getString("quantidade"));

                listPessoa.add(est);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Selecionar " + e);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps, rs);
        }
        return listPessoa;
    }

    public void remove(model_estoque est) {//remove salário
        PreparedStatement ps = null;
        String sql = "DELETE FROM estoque WHERE codigo = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, est.getCodigo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados removidos");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados. ");
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con);
        }

    }
    public void update(model_estoque est){//atualiza salario e status
        PreparedStatement ps = null;
        
        String sql = "UPDATE estoque set fornecedor = ?, produto = ?, valor = ?, quantidade = ? "
                + "WHERE codigo =?;";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, est.getFornecedor());
            ps.setString(2, est.getProduto());
            ps.setString(3, est.getValor());
            ps.setString(4, est.getQuantidade());
            ps.setString(5, est.getCodigo());
            

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados foram alterados com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar" + e);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps);
        }
    }
}
