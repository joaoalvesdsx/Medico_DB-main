package com.projeto.medicos2.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.medicos2.test.entities.Medicos;

@Repository
public interface MedicoRepository extends JpaRepository<Medicos, Long> {

    Medicos findBynome(String nome);
    List <Medicos> findBynomeContaining(String nome);
    List <Medicos> findByespecialidade(String nome);
    Medicos findBycrm(int crm);
    List <Medicos> findBycrmContaining(int crm);
    


}