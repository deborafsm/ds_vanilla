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

    model_pessoa model = new model_pessoa();

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public dao_pessoa_cadastro() {
        con = dsVanilla_ConnectionFactory.getConnection();
    }

    public void insert(model_pessoa pessoa) {
//# id_pessoa, nome, sexo, telefone, celular, email, data_nasc, rg, cpf, estado_civil,
//tipo_contrato, cep, cidade, estado, grau_esc, endereco, cargo, status, salario, admissao,
//carga_ini, carga_fim, num_dependentes
        Connection con = dsVanilla_ConnectionFactory.getConnection();

        PreparedStatement stmt = null;

        try {
            // nome_pai_mae,
            //nome_mae_pai, tipoPessoa, area

            stmt = con.prepareStatement("INSERT INTO pessoas ( nome, sexo, telefone, celular, "
                    + "email, data_nasc, rg, cpf, estado_civil, tipo_contrato, cep, cidade, estado, grau_esc, "
                    + "endereco, cargo, "
                    + "status, salario, admissao, carga_ini, carga_fim, num_dependentes,nome_pai_mae,nome_mae_pai,tipoPessoa,area)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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
            stmt.setString(16, pessoa.getCargo());
            stmt.setString(17, pessoa.getStatus());
            stmt.setString(18, pessoa.getSalario());
            stmt.setString(19, pessoa.getAdmissao());
            stmt.setString(20, pessoa.getCargaIni());
            stmt.setString(21, pessoa.getCargaFim());
            stmt.setString(22, pessoa.getNumDep());
            stmt.setString(23, pessoa.getNomeMaePai());
            stmt.setString(24, pessoa.getNomePaiMae());
            stmt.setString(25, pessoa.getTipoPessoa());
            stmt.setString(26, pessoa.getArea());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, stmt);
        }

    }

    //Select 
    public List<model_pessoa> select() {

        String sql = "Select id_pessoa,nome, sexo, telefone, celular, "
                + "email, data_nasc, rg, cpf, estado_civil, tipo_contrato, cep, cidade, estado, grau_esc, "
                + "endereco, cargo, "
                + "status, salario, admissao, carga_ini, carga_fim, num_dependentes,nome_pai_mae,nome_mae_pai,tipoPessoa,area from pessoas";
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
                pessoa.setCargo(rs.getString("cargo"));
                pessoa.setStatus(rs.getString("status"));
                pessoa.setSalario(rs.getString("salario"));
                pessoa.setAdmissao(rs.getString("admissao"));
                pessoa.setCargaIni(rs.getString("carga_ini"));
                pessoa.setCargaFim(rs.getString("carga_fim"));
                pessoa.setNumDep(rs.getString("num_dependentes"));
                pessoa.setNomePaiMae(rs.getString("nome_pai_mae"));
                pessoa.setNomeMaePai(rs.getString("nome_mae_pai"));
                pessoa.setTipoPessoa(rs.getString("tipoPessoa"));
                pessoa.setArea(rs.getString("area"));

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

    //Pesquisa
    public void update(model_pessoa pessoa) {
        PreparedStatement ps = null;
        String sql = "UPDATE pessoas SET  nome = ?, sexo = ?, telefone = ?, celular= ? , email= ?, rg= ?, cpf= ?"
                + ", estado_civil= ?, tipo_contrato= ?, cep= ?, endereco= ?, cidade= ?, estado= ?, grau_esc = ? WHERE id_pessoa = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getSexo());
            ps.setString(3, pessoa.getTelefone());
            ps.setString(4, pessoa.getCelular());
            ps.setString(5, pessoa.getEmail());
            ps.setString(6, pessoa.getRg());
            ps.setString(7, pessoa.getCpf());
            ps.setString(8, pessoa.getEstado_civil());
            ps.setString(9, pessoa.getTipo_contrato());
            ps.setString(10, pessoa.getCep());
            ps.setString(11, pessoa.getEndereco());
            ps.setString(12, pessoa.getCidade());
            ps.setString(13, pessoa.getEstado());
            ps.setString(14, pessoa.getGrau_esc());
            ps.setString(15, pessoa.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro:   " + e);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps);
        }
    }

    public List<model_pessoa> quadro() {

        String sql = "Select id_pessoa,nome, sexo, cargo,salario,status from pessoas";
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
                pessoa.setCargo(rs.getString("cargo"));
                pessoa.setSalario(rs.getString("salario"));
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

    public void updateQf(model_pessoa pessoa) {
        PreparedStatement ps = null;
        String sql = "UPDATE pessoas SET  nome = ?, sexo = ? , cargo = ?, salario = ?, status = ? WHERE id_pessoa = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getSexo());
            ps.setString(3, pessoa.getCargo());
            ps.setString(4, pessoa.getSalario());
            ps.setString(5, pessoa.getStatus());
            ps.setString(6, pessoa.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados Editados com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        } finally {
            dsVanilla_ConnectionFactory.closeConnection(con, ps);
        }
    }
}
