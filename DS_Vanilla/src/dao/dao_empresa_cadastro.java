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
import model.model_empresa;

/**
 *
 * @author DeboraDev
 */
public class dao_empresa_cadastro {

    private Connection con = null;

    public dao_empresa_cadastro() {
        con = dsVanilla_ConnectionFactory.getConnection();
    }
    //Adiciona empresa no banco de dados

    public void create(model_empresa empresa) {

        Connection con = dsVanilla_ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO empresa (razao_social,nome_fantasia,cnpj,rua,referencia,primeiro_tel,segundo_tel,email)VALUES(?,?,?,?,?,?,?,?)");
            stmt.setString(1, empresa.getRazao_social());
            stmt.setString(2, empresa.getNome_fantasia());
            stmt.setString(3, empresa.getCnpj());
            stmt.setString(4, empresa.getRua());
            stmt.setString(5, empresa.getGreferencia());
            stmt.setString(6, empresa.getPrimeiro_tel());
            stmt.setString(7, empresa.getSegundo_tel());
            stmt.setString(8, empresa.getEmail());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, stmt);
        }

    }

    //Seleciona empresas
    public List<model_empresa> findAll() {
        String sql = "Select id, razao_social,rua,email,primeiro_tel,segundo_tel from empresa";
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<model_empresa> listEmpresa = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                model_empresa empresa = new model_empresa();

                empresa.setId(rs.getString("id"));
                empresa.setRazao_social(rs.getString("razao_social"));
                empresa.setRua(rs.getString("rua"));
                empresa.setEmail(rs.getString("email"));
                empresa.setPrimeiro_tel(rs.getString("primeiro_tel"));
                empresa.setSegundo_tel(rs.getString("segundo_tel"));

                listEmpresa.add(empresa);
            }
        } catch (SQLException e) {
            System.out.println("Erro find all " + e);//mOSTRA o erro
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps, rs);
        }
        return listEmpresa;
    }

    //Pesquisa empresa
    public java.util.List<model_empresa> findeEmpr(String nome) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        //Array lista adicionada
        java.util.List<model_empresa> findeEmpr = new ArrayList<>(); //Array de empresas
        try {   //seleciona por nome do empresa 
            ps = con.prepareStatement("SELECT * FROM empresa WHERE razao_social like ?"); //Seleciona tdo de empresas
            ps.setString(1, "%" + nome + "%");// ? = nome
            rs = ps.executeQuery(); //Result set para se obter o resultado
            while (rs.next()) {//Enquando tiver resultado (linhas)
                model_empresa empresa = new model_empresa();
                //Lista os componentes
                empresa.setRazao_social(rs.getString("razao_social"));

                //E adiciona no array list
                findeEmpr.add(empresa);
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar empresa. " + e);//Mostra o erro da logica, ja que só mostra algum resultado
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps, rs);
        }
        //Retora o array 
        return findeEmpr;
    }

    //Remove
    public void deleteEmpres(model_empresa empresa) {
        //query deleta cliente de acordo com o id
        PreparedStatement ps = null;
        String sql = "DELETE FROM empresa WHERE id = ?";

        try {//tenta fazer a logica abaixo
            ps = con.prepareStatement(sql);
            ps.setString(1, empresa.getId());

            ps.executeUpdate();//Executa a query
            JOptionPane.showMessageDialog(null, "Operador excluido com sucesso"); //mensagem informando sucesso
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);//mensagem informando falha e o erro causado
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps); //fecha as conexoes utilizadas
        }
    }

    //edit
    public void updateEmpresa(model_empresa empresa) {
        PreparedStatement ps = null;
        String sql = "UPDATE empresa SET razao_social =?, nome_fantasia=?, cnpj=?, rua=?,  "
                + "primeiro_tel=?, segundo_tel=?, email =? WHERE id =?;";
        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, empresa.getId());
            ps.setString(2, empresa.getRazao_social());
            ps.setString(3, empresa.getNome_fantasia());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Empresa alterado com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps);
        }
    }
}
