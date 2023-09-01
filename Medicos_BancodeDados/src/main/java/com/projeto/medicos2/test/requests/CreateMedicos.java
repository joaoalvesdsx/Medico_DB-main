package com.projeto.medicos2.test.requests;

public record CreateMedicos(long rg, long cpf, String nome, Long telefone, String estado, String cidade, String endereco, double salario, String cargo, int crm, String especialidade) {
    
}