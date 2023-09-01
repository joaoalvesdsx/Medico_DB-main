package com.projeto.medicos2.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projeto.medicos2.test.entities.Funcionario;
import com.projeto.medicos2.test.entities.Medicos;
import com.projeto.medicos2.test.requests.CreateFuncionario;
import com.projeto.medicos2.test.requests.CreateMedicos;
import com.projeto.medicos2.test.services.FuncionarioService;
import com.projeto.medicos2.test.services.MedicoService;


@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("api")
public class MainController{

    @Autowired
    private FuncionarioService funcionarioService;

    @Autowired
    private MedicoService medicoService;

    @PostMapping("/cadastrar_funcionario")
    public Funcionario createFuncionario(@RequestBody CreateFuncionario request){
  return funcionarioService.create(
            getFuncionarioObject(request));
    }
    
    private Funcionario getFuncionarioObject(CreateFuncionario request){
        Funcionario funcionario = new Funcionario();
        funcionario.setRg(request.rg());
        funcionario.setCpf(request.cpf());
        funcionario.setNome(request.nome());
        funcionario.setTelefone(request.telefone());
        funcionario.setEstado(request.estado());
        funcionario.setCidade(request.cidade());
        funcionario.setEndereco(request.endereco());
        funcionario.setSalario(request.salario());
        funcionario.setCargo(request.cargo());
        return funcionario;
    }

    @PostMapping("/cadastrar_medico")
    public Medicos createMedicos(@RequestBody CreateMedicos request){

    return medicoService.create(
            getMedicoObject(request));
    }

    private Medicos getMedicoObject(CreateMedicos request){
        Medicos medico = new Medicos();
        medico.setRg(request.rg());
        medico.setCpf(request.cpf());
        medico.setNome(request.nome());
        medico.setTelefone(request.telefone());
        medico.setEstado(request.estado());
        medico.setCidade(request.cidade());
        medico.setEndereco(request.endereco());
        medico.setSalario(request.salario());
        medico.setCargo(request.cargo());
        medico.setCrm(request.crm());
        medico.setEspecialidade(request.especialidade());

        return medico;
    }

    @GetMapping("/funcionarios")
    public List<Funcionario> getFuncionarios(){
        return funcionarioService.list();
    }

    @GetMapping("/funcionarios/nome_completo/{nome}")
    public Funcionario getFuncionariosName(@PathVariable String nome){

        return funcionarioService.buscarPorNome(nome);

          }


    @GetMapping("/funcionarios/parte_nome/{nome}")
    public List<Funcionario> getFuncionariosParteName(@PathVariable String nome){
        
        return funcionarioService.buscarPorParteNome(nome);

          }

    
      
      
    @GetMapping("/funcionarios/parte_nome/medico/{nome}")
        public List<Funcionario> getMedicoParteName(@PathVariable String nome){
        return funcionarioService.buscarPorParteNome(nome);
      
                }          

    
    



    @PutMapping("/funcionarioAlterar/{nome}")
    public Funcionario updateFuncionarioNome(@PathVariable String nome, @RequestBody CreateFuncionario request){
        return funcionarioService.update(
            nome,
            getFuncionarioObjectSemCargo(request)
        );
    }
    private Funcionario getFuncionarioObjectSemCargo(CreateFuncionario request){
        Funcionario funcionario = new Funcionario();
        funcionario.setRg(request.rg());
        funcionario.setCpf(request.cpf());
        funcionario.setNome(request.nome());
        funcionario.setTelefone(request.telefone());
        funcionario.setEstado(request.estado());
        funcionario.setCidade(request.cidade());
        funcionario.setEndereco(request.endereco());
        funcionario.setSalario(request.salario());

        return funcionario;
    }

    @PutMapping("/medicoAlterar/{nome}")
    public Medicos updateMedicoNome(@PathVariable String nome, @RequestBody CreateMedicos request){
        return medicoService.update(
            nome,
            getMedicoObjectSemCargo(request)
        );}

     private Medicos getMedicoObjectSemCargo(CreateMedicos request){
        Medicos medico = new Medicos();
        medico.setRg(request.rg());
        medico.setCpf(request.cpf());
        medico.setNome(request.nome());
        medico.setTelefone(request.telefone());
        medico.setEstado(request.estado());
        medico.setCidade(request.cidade());
        medico.setEndereco(request.endereco());
        medico.setSalario(request.salario());
        medico.setCargo(request.cargo());
        medico.setCrm(request.crm());
        medico.setEspecialidade(request.especialidade());

        return medico;
    }
    
    @DeleteMapping("/funcionario/{id}")
    public void removeFuncionario(@PathVariable Long id) {
        funcionarioService.delete(id);
    }

    @DeleteMapping("/medicoDeletarCrm/{crm}")
    public void removeMedico(@PathVariable int crm) {
            medicoService.deleteMedico(crm);
    }

    @DeleteMapping("/funcionarioDeletarNome/{nome}")
    public void removeFuncionario(@PathVariable String nome) {
            funcionarioService.deleteFuncionarioNome(nome);
    }

    @DeleteMapping("/funcionarioDeletarCpf/{cpf}")
    public void removeFuncionarioporCpf(@PathVariable Long cpf) {
            funcionarioService.deleteFuncionarioCpf(cpf);
    }

    @GetMapping("/funcionarios/cargo/{cargo}")
    public double getSomaSalariosPorCargo(@PathVariable String cargo) {
    return funcionarioService.getSomaSalariosPorCargo(cargo);
    }

    @GetMapping("/medicos/especialidade/{especialidade}")
    public List<Medicos> getBuscaEspecialidade(@PathVariable String especialidade) {
    return medicoService.Buscarespecialidade(especialidade);
    }

    @GetMapping("/medicos/crm/{crm}")
    public Medicos getBuscaCRM(@PathVariable int crm) {
    return medicoService.Buscarcrm(crm);
    }
    
}