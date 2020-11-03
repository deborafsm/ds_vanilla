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
        try {
            ps= con.prepareStatement("insert into ()");
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getNome());
            ps.setString(3, pessoa.getNome());
            ps.setString(4, pessoa.getNome());
            ps.setString(5, pessoa.getNome());
            ps.setString(6, pessoa.getNome());
            
        } catch (Exception e) {
            
        }finally{
            
        }
    }
    public void update(model_pessoa pessoa){//atualiza salario e status
        
    }
    public void remove(model_pessoa pessoa){//remove salário
        
    }


}
