# API de Gerenciamento de Funcionários e Médicos
 
Este é um projeto de API desenvolvido em Java com Spring Boot para gerenciar funcionários e médicos em um hospital. A API utiliza o banco de dados SQLite para armazenar os dados e permite o cadastro, consulta, atualização e exclusão de funcionários e médicos, bem como a busca por diferentes critérios.

Endpoints da API
A API possui os seguintes endpoints:

Funcionários:
POST /api/cadastrar_funcionario: Cadastra um novo funcionário.
PUT /api/funcionarioAlterar/{nome}: Atualiza os dados de um funcionário pelo nome.
DELETE /api/funcionario/{id}: Remove um funcionário pelo ID.
GET /api/funcionarios: Lista todos os funcionários.
GET /api/funcionarios/nome_completo/{nome}: Busca um funcionário pelo nome completo.
GET /api/funcionarios/parte_nome/{nome}: Lista funcionários cujo nome contém uma parte especificada.
GET /api/funcionarios/parte_nome/medico/{nome}: Lista funcionários cujo nome contém uma parte especificada e são médicos.
GET /api/funcionarios/cargo/{cargo}: Obtém o somatório dos salários de todos os funcionários de um cargo específico.
DELETE /api/funcionarioDeletarNome/{nome}: Remove um funcionário pelo nome.
DELETE /api/funcionarioDeletarCpf/{cpf}: Remove um funcionário pelo CPF.

Médicos:
POST /api/cadastrar_medico: Cadastra um novo médico.
PUT /api/medicoAlterar/{nome}: Atualiza os dados de um médico pelo nome.
DELETE /api/medicoDeletarCrm/{crm}: Remove um médico pelo CRM.
GET /api/medicos/especialidade/{especialidade}: Lista médicos por especialidade.
GET /api/medicos/crm/{crm}: Busca um médico pelo CRM.

Este projeto está licenciado sob a Licença MIT.

Desenvolvido como projeto avaliado para discplina de POO.
