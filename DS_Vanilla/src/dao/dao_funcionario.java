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

/**
 *
 * @author DeboraDev
 */
public class dao_funcionario {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public dao_funcionario() {
        con = ds_vanilla.dsVanilla_ConnectionFactory.getConnection();
    }
    
    public void insert(model_pessoa pessoa){//adiciona salario 
        Connection con = dsVanilla_ConnectionFactory.getConnection();
        PreparedStatement ps = null;
        try {                           //INSERT INTO vagas (data_vaga, nome_empregador, titulo, descricao, celular, telefone, email)VALUES(?,?,?,?,?,?,?)
            ps= con.prepareStatement("INSERT INTO (nome, celular, email,tipo_contrato, endereco, cargo, salario, status_funcionario)VALUES(?,?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getCelular());
            ps.setString(3, pessoa.getEmail());
            ps.setString(4, pessoa.getTipo_contrato());
            ps.setString(5, pessoa.getEndereco());
            ps.setString(6, pessoa.getCargo());
            ps.setString(7, pessoa.getSalario());
            ps.setString(8, pessoa.getStatus());
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro"+e);
        }finally{
            dsVanilla_ConnectionFactory.closeConnection(con);
        }
    }
    public void update(model_pessoa pessoa){//atualiza salario e status
        try {
            
        } catch (Exception e) {
        }finally{
            
        }
    }
    public void remove(model_pessoa pessoa){//remove salário
        PreparedStatement ps = null;
        String sql = "";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pessoa.getId());
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
               
    }


}
