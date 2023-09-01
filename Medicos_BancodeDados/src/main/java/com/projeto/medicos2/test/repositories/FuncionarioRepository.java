package com.projeto.medicos2.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.medicos2.test.entities.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    Funcionario findBynome(String nome);
    Funcionario findBycpf(Long cpf);
    List <Funcionario> findBynomeContaining(String nome);
    List <Funcionario> findByCargo(String cargo);
    
}

