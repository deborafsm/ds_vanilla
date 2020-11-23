/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ds_vanilla.ConexaoBD;
import java.sql.SQLException;
import model.model_pessoa;

/**
 *
 * @author DeboraDev
 */
public class dao_findFuncionario {

    ds_vanilla.ConexaoBD conex = new ConexaoBD();
    model_pessoa model = new model_pessoa();

    public model_pessoa findPessoas(model_pessoa pessoa) throws SQLException {
        conex.conexao();
        conex.executaSql("select * from pessoas where nome like '%" + pessoa.getPesquisa() + "%'");
        conex.rs.first();
        pessoa.setId(conex.rs.getString("id_pessoa"));
        pessoa.setNome(conex.rs.getString("nome"));
        pessoa.setSexo(conex.rs.getString("sexo"));
        pessoa.setTelefone(conex.rs.getString("telefone"));
        pessoa.setCelular(conex.rs.getString("celular"));
        pessoa.setEmail(conex.rs.getString("email"));
        pessoa.setData_nasc(conex.rs.getString("data_nasc"));
        pessoa.setRg(conex.rs.getString("rg"));
        pessoa.setCpf(conex.rs.getString("cpf"));
        pessoa.setEstado_civil(conex.rs.getString("estado_civil"));
        pessoa.setTipo_contrato(conex.rs.getString("tipo_contrato"));
        pessoa.setCep(conex.rs.getString("cep"));
        pessoa.setEndereco(conex.rs.getString("endereco"));
        pessoa.setCidade(conex.rs.getString("cidade"));
        pessoa.setEstado(conex.rs.getString("estado"));
        pessoa.setGrau_esc(conex.rs.getString("grau_esc"));
        pessoa.setCargo(conex.rs.getString("cargo"));
        pessoa.setStatus(conex.rs.getString("status"));
        pessoa.setSalario(conex.rs.getString("salario"));
        pessoa.setAdmissao(conex.rs.getString("admissao"));
        pessoa.setCargaIni(conex.rs.getString("carga_ini"));
        pessoa.setCargaFim(conex.rs.getString("carga_fim"));
        pessoa.setNumDep(conex.rs.getString("num_dependentes"));
        pessoa.setNomePaiMae(conex.rs.getString("nome_pai_mae"));
        pessoa.setNomeMaePai(conex.rs.getString("nome_mae_pai"));
        pessoa.setTipoPessoa(conex.rs.getString("tipoPessoa"));
        pessoa.setArea(conex.rs.getString("area"));

        conex.desconecta();
        return pessoa;       
    }
}
