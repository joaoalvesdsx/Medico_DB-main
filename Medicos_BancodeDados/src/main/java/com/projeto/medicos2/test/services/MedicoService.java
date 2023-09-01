package com.projeto.medicos2.test.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.medicos2.test.entities.Medicos;
import com.projeto.medicos2.test.repositories.MedicoRepository;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public Medicos create(Medicos medico) {
        return medicoRepository.save(medico);
    }

    public List <Medicos> list(){
        return medicoRepository.findAll();    
    }
    
    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public Medicos buscarPorNome(String nome) {
        return medicoRepository.findBynome(nome);
    }

    public List<Medicos> buscarPorParteNome(String nome) {
        return medicoRepository.findBynomeContaining(nome);
    }

    
    public List<Medicos> Buscarespecialidade(String especialidade) {
        return medicoRepository.findByespecialidade(especialidade);
    }

    public Medicos Buscarcrm(int crm) {
        Medicos resultadoMedico = medicoRepository.findBycrm(crm);
        if(resultadoMedico != null){
            Medicos medicoEncontrado = resultadoMedico;

        

            medicoRepository.save(medicoEncontrado);

            return medicoEncontrado;
        }
        return null;
    }

    public void deleteMedico(int crm) {
        Medicos resultadoMedico = medicoRepository.findBycrm(crm);
        if (resultadoMedico != null) {
            medicoRepository.delete(resultadoMedico);
        }

    }

    public Medicos update(String nome, Medicos medico){
        Medicos resultadoMedico = medicoRepository.findBynome(nome);
        if(resultadoMedico != null){
            Medicos medicoEncontrado = resultadoMedico;

        

            medicoRepository.save(medicoEncontrado);

            return medicoEncontrado;
        }
        return null;
    }
}
