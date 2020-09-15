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
    public void insert(model_vagas vagas) {

        Connection con = dsVanilla_ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO vagas (data_vaga, nome_empregador, titulo, descricao, celular, telefone, email)VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1, vagas.getId());
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

    //Select
    public List<model_vagas> select() {
        String sql = "select  cod_vaga, titulo, descricao, nome_empregador, celular, telefone, email\n" +
" from vagas";
        List<model_vagas> listOp = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                model_vagas vagas = new model_vagas();
                vagas.setId(rs.getString("cod_vaga"));
                vagas.setTitulo(rs.getString("titulo"));
                vagas.setDescricao(rs.getString("descricao"));
                vagas.setNome(rs.getString("nome_empregador"));
                vagas.setCelular(rs.getString("celular"));
                vagas.setTelefone(rs.getString("telefone"));
                vagas.setEmail(rs.getString("email"));

                listOp.add(vagas);
            }
        } catch (SQLException e) {
            System.out.println("Erro" + e);//Erro
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps, rs);
        }
        return listOp;
    }
    
    //Remover
     public void delete(model_vagas op) {
        PreparedStatement ps = null;
        String sql = "DELETE FROM vagas WHERE cod_vaga = ?";

        try {//tenta fazer a logica abaixo
            ps = con.prepareStatement(sql);
            ps.setString(1, op.getId()); //pega o codigo do pc
            ps.executeUpdate();//Executa a query
            JOptionPane.showMessageDialog(null, "Vaga excluida com sucesso"); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps);
        }
    }
     //Edit
     public void update(model_vagas vagas) {
        PreparedStatement ps = null;
        //update  titulo, descricao, nome_empregador, celular, telefone, email
        String sql = "UPDATE vagas SET titulo =?, descricao =?, nome_empregador =?, celular =?, telefone =?,"
                + " email =? WHERE cod_vaga =?;";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, vagas.getId());
            ps.setString(2, vagas.getNome());
            ps.setString(3, vagas.getTitulo());
            ps.setString(4, vagas.getDescricao());
            ps.setString(5, vagas.getCelular());
            ps.setString(6, vagas.getTelefone());
            ps.setString(7, vagas.getEmail());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados foram alterados com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps);
        }
    }
}
