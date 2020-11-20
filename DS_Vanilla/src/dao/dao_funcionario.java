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
    
    public void insert(model_pessoa pessoa){
        Connection con = dsVanilla_ConnectionFactory.getConnection();
        PreparedStatement ps = null;
        try {                           //INSERT INTO vagas (data_vaga, nome_empregador, titulo, descricao, celular, telefone, email)VALUES(?,?,?,?,?,?,?)
            ps= con.prepareStatement("INSERT INTO funcionarios (nome, cpf, email, salario, cargo, admissao, demissao, status)VALUES(?,?,?,?,?,?,?,?)");
            
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getCpf());
            ps.setString(3, pessoa.getEmail());
            ps.setString(4, pessoa.getSalario());
            ps.setString(5, pessoa.getCargo());
            ps.setString(6, pessoa.getAdmissao());
            ps.setString(7, pessoa.getDemissao());
            ps.setString(8, pessoa.getStatus());
           
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro"+e);
        }finally{
            dsVanilla_ConnectionFactory.closeConnection(con);
        }
    }
    public void update(model_pessoa pessoa){//atualiza salario e status
        PreparedStatement ps = null;
        //update  titulo, descricao, nome_empregador, celular, telefone, email
        String sql = "UPDATE funcionarios SET nome = ?, cpf = ?,email = ?, salario = ?, cargo = ?, admissao = ?, demissao = ?, status = ? WHERE id =?;";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getCpf());
            ps.setString(3, pessoa.getEmail());
            ps.setString(4, pessoa.getSalario());
            ps.setString(5, pessoa.getCargo());
            ps.setString(6, pessoa.getAdmissao());
            ps.setString(7, pessoa.getDemissao());
            ps.setString(8, pessoa.getStatus());
            ps.setString(9, pessoa.getId());
           

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados foram alterados com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps);
        }
    }
    
    public void remove(model_pessoa pessoa){//remove salário
        PreparedStatement ps = null;
        String sql = "DELETE FROM funcionarios WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pessoa.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Funcionario removido");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: ");
        }finally{
            dsVanilla_ConnectionFactory.closeConnection(con);
        }
               
    }
    
     //Select 
    public List<model_pessoa> select() {

        String sql = "Select id, nome, cpf, email, salario, cargo, admissao, demissao, status from funcionarios";
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<model_pessoa> listPessoa = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                model_pessoa pessoa = new model_pessoa();
                pessoa.setId(rs.getString("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setCpf(rs.getString("cpf"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setSalario(rs.getString("salario"));
                pessoa.setCargo(rs.getString("cargo"));
                pessoa.setAdmissao(rs.getString("admissao"));
                pessoa.setDemissao(rs.getString("demissao"));
                pessoa.setStatus(rs.getString("status"));
                
                listPessoa.add(pessoa);
            }
        } catch (SQLException e) {
            System.out.println("Erro find all " + e);//mOSTRA o erro
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps, rs);
        }
        return listPessoa;
    }
    
    //Find
    public java.util.List<model_pessoa> findPessoas(String nome) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        //Array lista adicionada
        java.util.List<model_pessoa> findeEmpr = new ArrayList<>(); //Array de empresas
        try {   //seleciona por nome do empresa 
            ps = con.prepareStatement("SELECT id, nome, cpf, email, salario, cargo, admissao, demissao, status status from funcionarios WHERE nome like ?");
            ps.setString(1, "%" + nome + "%");// ? = nome
            rs = ps.executeQuery(); //Result set para se obter o resultado
            while (rs.next()) {//Enquando tiver resultado (linhas)
                model_pessoa pessoa = new model_pessoa();
                pessoa.setId(rs.getString("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setCpf(rs.getString("cpf"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setSalario(rs.getString("salario"));
                pessoa.setCargo(rs.getString("cargo"));
                pessoa.setAdmissao(rs.getString("admissao"));
                pessoa.setDemissao(rs.getString("demissao"));
                pessoa.setStatus(rs.getString("status"));
                findeEmpr.add(pessoa);
            }
        } catch (Exception e) {
            System.out.println("Erro ao pesquisar funcionario. " + e);//Mostra o erro da logica, ja que só mostra algum resultado
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps, rs);
        }
        //Retora o array 
        return findeEmpr;
    }


}
