﻿# Medico_DB-main
Sistema de Gerenciamento de Funcionários e Médicos.
Este é um sistema desenvolvido com Spring Boot que permite gerenciar funcionários com diferentes cargos, incluindo médicos com informações adicionais. O sistema também fornece recursos de busca e listagem de funcionários e médicos com base em seus cargos e especialidades.

Funcionalidades:
Cadastro de Funcionário
O sistema permite o cadastro de funcionários com os seguintes dados:
-RG.
-CPF.
-Nome.
-Telefone.
-Endereço.
-Cidade.
-Estado.
-Salário.
-Cargo (Opções: Serviços Gerais, Enfermeiro, Médico, Administrador, Maqueiro ou Vigilante).

Cadastro de Médico:
Se o cargo do funcionário for "Médico", o sistema exige informações adicionais:
-CRM (Conselho Regional de Medicina).
-Especialidade Médica.

Alteração de Dados do Funcionário:
Os dados de um funcionário podem ser alterados, exceto o cargo.

Busca de Funcionários por Cargo:
O sistema permite a busca de funcionários por cargo.

Exibe o somatório dos salários de todos os funcionários para cada cargo buscado.

Busca de Médicos por Especialidade:
O sistema permite a busca de médicos pela especialidade que possuem.
Busca de Enfermeiros por CRM,o sistema permite a busca de enfermeiros por CRM (Conselho Regional de Enfermagem), ou parte dele.

Integração de Módulos:
Todas as funcionalidades dos módulos de funcionários e médicos estão integradas em um único sistema.

Este projeto está licenciado sob a Licença MIT.

Desenvolvido como projeto avaliado para discplina de POO.
