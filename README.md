Projeto desenvolvido como metodo avaliativo para disciplina de Programação Orientada a Objetos.

 
 # API de Gerenciamento de Funcionários e Médicos
 
Sistema de Gestão de Médicos e Funcionários Hospitalares
Este projeto é um sistema de gerenciamento hospitalar desenvolvido em Spring Boot com SQLite como banco de dados. Ele permite o cadastro, consulta, atualização e remoção de médicos e funcionários em um hospital. Além disso, inclui funcionalidades específicas para médicos, como consultas por CRM e especialidade.

Funcionalidades
1. Gerenciamento de Médicos
Cadastro de Médicos:

Permite o cadastro de médicos com as seguintes informações: RG, CPF, nome, CRM, telefone e especialidade.
Consulta de Médicos:

Consulta por RG: Solicita o RG e apresenta todas as informações do médico.
Consulta por CRM: Lista todos os RGs e nomes e permite a consulta detalhada por CRM.
Consulta por Nome: Solicita o nome e apresenta as informações correspondentes.
Consulta por Parte do Nome: Permite buscar médicos com base em parte do nome (ex.: "Ed" retorna "Eduardo", "Eduardo Almeida", "Edvaldo").
Remoção de Médicos:

Remoção por CRM: Lista todos os médicos, solicita o CRM para exclusão e pede confirmação.
Remoção por Nome: Solicita o nome (ou parte do nome) e, após exibir as informações, solicita confirmação antes de excluir.
Atualização de Médicos:

Permite a atualização dos dados de um médico após realizar uma consulta por RG, CRM, nome ou parte do nome.
2. Gerenciamento de Funcionários
Cadastro de Funcionários:

Cadastro de funcionários com os seguintes dados: RG, CPF, nome, telefone, endereço, cidade, estado, salário e cargo.
Se o cargo for médico, exige também o CRM e a especialidade.
Consulta de Funcionários:

Consulta por Cargo: Lista todos os funcionários de um determinado cargo e apresenta o somatório dos salários dos funcionários para o cargo buscado.
Consulta de Médicos:

Consulta por Especialidade: Lista médicos pela especialidade.
Consulta por CRM: Permite buscar enfermeiros de acordo com o CRM informado (ou parte dele).
Atualização de Funcionários:

Permite a atualização dos dados de um funcionário, exceto o cargo, que não pode ser modificado após o cadastro.
3. Integração das Funcionalidades
Todas as funcionalidades dos módulos de médicos e funcionários estão integradas em um único sistema.

Estrutura do Banco de Dados
Tabelas Principais
Medico
Campos: RG, CPF, nome, CRM, telefone, especialidade.
Funcionario
Campos: RG, CPF, nome, telefone, endereco, cidade, estado, salario, cargo.
Se o cargo for "médico", são incluídos CRM e especialidade.
Configuração do Projeto
Pré-requisitos
Java 8 ou superior
Maven
SQLite
Executando o Projeto

Clone o repositório:


O projeto está configurado para usar um banco de dados SQLite. Certifique-se de que o arquivo do banco de dados (hospital.db) esteja na pasta src/main/resources/.
Compile e execute o projeto:


Copiar código
mvn clean install
mvn spring-boot:run
Acesse o sistema:

O sistema estará disponível em http://localhost:8080.
Estrutura do Código
src/main/java/com/hospital/gestao: Contém as classes principais do sistema.
src/main/resources/application.properties: Configurações do banco de dados e outras propriedades do sistema.
src/main/resources/templates: Templates de páginas HTML (se aplicável).


