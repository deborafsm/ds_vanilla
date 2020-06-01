/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuário
 */
public class model_pessoa {
    
    //# id_pessoa, nome, sexo, telefone, celular, email, data_nasc, rg, cpf, estado_civil, 
    //tipo_contrato, cep, cidade, estado, grau_esc

    private String nome;
    private String sexo;
    private String telefone;
    private String celular;
    private String email;
    private String data_nasc;
    private String rg;
    private String cpf;
    private String estado_civil;
    private String tipo_contrato;
    private String cep;
    private String cidade;
    private String estado;
    private String grau_esc;
    private String endereco;

    public model_pessoa() {
    }

    
    public model_pessoa(String nome, String sexo, String telefone, String celular, String email, String data_nasc, String rg, String cpf, String estado_civil, String tipo_contrato, String cep, String cidade, String estado, String grau_esc) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.data_nasc = data_nasc;
        this.rg = rg;
        this.cpf = cpf;
        this.estado_civil = estado_civil;
        this.tipo_contrato = tipo_contrato;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.grau_esc = grau_esc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getTipo_contrato() {
        return tipo_contrato;
    }

    public void setTipo_contrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getGrau_esc() {
        return grau_esc;
    }

    public void setGrau_esc(String grau_esc) {
        this.grau_esc = grau_esc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
        
    
    
}
