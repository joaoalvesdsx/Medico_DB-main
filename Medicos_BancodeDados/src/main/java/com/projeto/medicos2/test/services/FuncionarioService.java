package com.projeto.medicos2.test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.medicos2.test.entities.Funcionario;
import com.projeto.medicos2.test.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {


    @Autowired
    private FuncionarioRepository funcionarioRepository;
    

    public Funcionario create (Funcionario funcionario) {
        return funcionarioRepository.save (funcionario);
    }

    public List <Funcionario> list(){
        return funcionarioRepository.findAll();    
    }


    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public Funcionario buscarPorNome(String nome) {
        return funcionarioRepository.findBynome(nome);
    }

    public List<Funcionario> buscarPorParteNome(String nome) {
        return funcionarioRepository.findBynomeContaining(nome);
    }
    


    public Funcionario update(String nome, Funcionario medico){
        Funcionario resultadoFuncionario = funcionarioRepository.findBynome(nome);
        if(resultadoFuncionario != null){
            Funcionario funcionarioEncontrado = resultadoFuncionario;

        

            funcionarioRepository.save(funcionarioEncontrado);

            return funcionarioEncontrado;
        }
        return null;

    }

    public void delete(Long id) {
        Optional<Funcionario> resultadoFuncionario = funcionarioRepository.findById(id);
        if (resultadoFuncionario.isPresent()) {
            funcionarioRepository.delete(resultadoFuncionario.get());
        }

    }


    public double getSomaSalariosPorCargo(String cargo) {
        List<Funcionario> funcionarios = funcionarioRepository.findByCargo(cargo);
        double somaSalarios = 0.0;
        if (funcionarios != null){  
            for (Funcionario funcionario : funcionarios) {
            somaSalarios += funcionario.getSalario();
            return somaSalarios;
            }
        }
        
        return somaSalarios;

    }   


        
       

    public void deleteFuncionarioNome(String nome) {
        Funcionario resultadoFuncionario = funcionarioRepository.findBynome(nome);
        if (resultadoFuncionario != null) {
            funcionarioRepository.delete(resultadoFuncionario);
        }

    }

    public void deleteFuncionarioCpf(Long cpf) {
        Funcionario resultadoFuncionario = funcionarioRepository.findBycpf(cpf);
        if (resultadoFuncionario != null) {
            funcionarioRepository.delete(resultadoFuncionario);
        }

    }
}
