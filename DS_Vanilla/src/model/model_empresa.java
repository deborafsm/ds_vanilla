/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DeboraDev
 */
public class model_empresa {
    private String id;
    private String razao_social;
    private String nome_fantasia ;
    private String cnpj ;
    private String rua ;
    private String greferencia ;
    private String primeiro_tel;
    private String segundo_tel;
    private String email;
    

    public model_empresa() {
    }

    public model_empresa(String razao_social, String nome_fantasia, String cnpj, String rua, String greferencia) {
        this.razao_social = razao_social;
        this.nome_fantasia = nome_fantasia;
        this.cnpj = cnpj;
        this.rua = rua;
        this.greferencia = greferencia;
    }

    public model_empresa(String razao_social, String nome_fantasia, String cnpj, String rua, String greferencia, String primeiro_tel, String segundo_tel, String email) {
        this.razao_social = razao_social;
        this.nome_fantasia = nome_fantasia;
        this.cnpj = cnpj;
        this.rua = rua;
        this.greferencia = greferencia;
        this.primeiro_tel = primeiro_tel;
        this.segundo_tel = segundo_tel;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    public String getPrimeiro_tel() {
        return primeiro_tel;
    }

    public void setPrimeiro_tel(String primeiro_tel) {
        this.primeiro_tel = primeiro_tel;
    }

    public String getSegundo_tel() {
        return segundo_tel;
    }

    public void setSegundo_tel(String segundo_tel) {
        this.segundo_tel = segundo_tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getGreferencia() {
        return greferencia;
    }

    public void setGreferencia(String greferencia) {
        this.greferencia = greferencia;
    }
    
    
}
