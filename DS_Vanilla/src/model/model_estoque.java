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
public class model_estoque {

    private String codigo;
    private String fornecedor;
    private String valor;
    private String quantidade;
    private String produto;

    public model_estoque(String codigo, String fornecedor, String valor, String quantidade, String produto) {
        this.codigo = codigo;
        this.fornecedor = fornecedor;
        this.valor = valor;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public model_estoque() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

}
