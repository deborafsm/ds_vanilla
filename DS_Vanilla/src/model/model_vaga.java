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
public class model_vaga {

    private String tipoVaga;
    private float salario;
    private String cargo;
    private String horario;

    public model_vaga() {
    }

    public model_vaga(String tipoVaga, float salario, String cargo, String horario) {
        this.tipoVaga = tipoVaga;
        this.salario = salario;
        this.cargo = cargo;
        this.horario = horario;
    }

    public String getTipoVaga() {
        return tipoVaga;
    }

    public void setTipoVaga(String tipoVaga) {
        this.tipoVaga = tipoVaga;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

}
