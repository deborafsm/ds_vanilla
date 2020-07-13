/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ds_vanilla.dsVanilla_ConnectionFactory;
import java.awt.HeadlessException;
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
 * @author Usuário
 */
public class dao_pessoa_cadastro {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public dao_pessoa_cadastro() {
        con = dsVanilla_ConnectionFactory.getConnection();
    }

    public void create(model_pessoa pessoa) {

        Connection con = dsVanilla_ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO pessoas (nome, sexo, telefone, celular, email, data_nasc, rg, cpf, estado_civil, tipo_contrato, cep, cidade, estado,"
                    + " grau_esc,endereco)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getTelefone());
            stmt.setString(4, pessoa.getCelular());
            stmt.setString(5, pessoa.getEmail());
            stmt.setString(6, pessoa.getData_nasc());
            stmt.setString(7, pessoa.getRg());
            stmt.setString(8, pessoa.getCpf());
            stmt.setString(9, pessoa.getEstado_civil());
            stmt.setString(10, pessoa.getTipo_contrato());
            stmt.setString(11, pessoa.getCep());
            stmt.setString(12, pessoa.getCidade());
            stmt.setString(13, pessoa.getEstado());
            stmt.setString(14, pessoa.getGrau_esc());
            stmt.setString(15, pessoa.getEndereco());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, stmt);
        }

    }

    //Select 
    public List<model_pessoa> findAll() {

        String sql = "Select id_pessoa, nome, sexo, telefone, celular, email, data_nasc, rg, cpf, estado_civil, tipo_contrato, cep, endereco, cidade, estado, grau_esc from pessoas";
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<model_pessoa> listPessoa = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                model_pessoa pessoa = new model_pessoa();
                pessoa.setId(rs.getString("id_pessoa"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setSexo(rs.getString("sexo"));
                pessoa.setTelefone(rs.getString("telefone"));
                pessoa.setCelular(rs.getString("celular"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setData_nasc(rs.getString("data_nasc"));
                pessoa.setRg(rs.getString("rg"));
                pessoa.setCpf(rs.getString("cpf"));
                pessoa.setEstado_civil(rs.getString("estado_civil"));
                pessoa.setTipo_contrato(rs.getString("tipo_contrato"));
                pessoa.setCep(rs.getString("cep"));
                pessoa.setEndereco(rs.getString("endereco"));
                pessoa.setCidade(rs.getString("cidade"));
                pessoa.setEstado(rs.getString("estado"));
                pessoa.setGrau_esc(rs.getString("grau_esc"));

                listPessoa.add(pessoa);
            }
        } catch (SQLException e) {
            System.out.println("Erro find all " + e);//mOSTRA o erro
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps, rs);
        }
        return listPessoa;
    }

    //DROP
    public void remove(model_pessoa pessoa) {
        //query deleta cliente de acordo com o id
        PreparedStatement ps = null;
        String sql = "DELETE FROM pessoas WHERE id_pessoa = ?";

        try {//tenta fazer a logica abaixo
            ps = con.prepareStatement(sql);
            ps.setString(1, pessoa.getId()); //pega o codigo do pc
            ps.executeUpdate();//Executa a query
            JOptionPane.showMessageDialog(null, "Dados Excluidos"); //mensagem informando sucesso
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);//mensagem informando falha e o erro causado
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps); //fecha as conexoes utilizadas
        }
    }

    //fIND
}
