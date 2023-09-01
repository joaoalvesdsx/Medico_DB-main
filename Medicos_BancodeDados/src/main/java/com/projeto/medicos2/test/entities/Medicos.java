package com.projeto.medicos2.test.entities;

import jakarta.persistence.Entity;

@Entity
public class Medicos extends Funcionario {

    private int crm;
    private String especialidade;

    public int getCrm() {
        return crm;
    }
    public void setCrm(int crm) {
        this.crm = crm;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
