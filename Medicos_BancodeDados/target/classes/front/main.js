function enviarCadastro() {
    var funcionario = {
    "rg": document.getElementById("rg").value,
    "cpf": document.getElementById("cpf").value,
    "nome": document.getElementById("nome").value,
    "telefone": document.getElementById("telefone").value,
    "estado": document.getElementById("estado").value,
    "cidade": document.getElementById("cidade").value,
    "endereco": document.getElementById("endereco").value,
    "salario": document.getElementById("salario").value,
    "cargo": document.getElementById("cargo").value
    };
      if (document.getElementById("cargo").value == "medico"){
          
            
            alert('Direcionado para página de cadastrar médicos');
            window.location.href = "http://127.0.0.1:5500/Medicos_BancodeDados/src/main/resources/front/Cadastrar_Medico.html?";

      }
      else if(document.getElementById("rg").value == 0 || 
              document.getElementById("nome").value == 0 ||
              document.getElementById("telefone").value == 0 ||
              document.getElementById("estado").value == 0 ||
              document.getElementById("cidade").value == 0 ||
              document.getElementById("endereco").value == 0 ||
              document.getElementById("salario").value == 0 ||
              document.getElementById("cargo").value == 0){
          console.log(error);
          alert('Erro ao cadastrar médico.');
        }
      
      else
      {
          axios.post('http://localhost:5555/api/cadastrar_funcionario', funcionario)
        .then(function (response) {
          console.log(response.data);
          alert('Cadastro realizado com sucesso!');
          document.getElementById("formCadastro").reset();
        })
        .catch(function (error) {
          console.log(error);
          alert('Erro ao cadastrar médico.');
        });
      }
    } 

    function enviarCadastro_medico() {
      var funcionario = {
      "rg": document.getElementById("rg").value,
      "cpf": document.getElementById("cpf").value,
      "nome": document.getElementById("nome").value,
      "telefone": document.getElementById("telefone").value,
      "estado": document.getElementById("estado").value,
      "cidade": document.getElementById("cidade").value,
      "endereco": document.getElementById("endereco").value,
      "salario": document.getElementById("salario").value,
      "cargo": document.getElementById("cargo").value,
      "crm": document.getElementById("crm").value,
      "especialidade": document.getElementById("especialidade").value
      };
      
      if(     document.getElementById("rg").value == 0 || 
              document.getElementById("nome").value == 0 ||
              document.getElementById("telefone").value == 0 ||
              document.getElementById("estado").value == 0 ||
              document.getElementById("cidade").value == 0 ||
              document.getElementById("endereco").value == 0 ||
              document.getElementById("salario").value == 0 ||
              document.getElementById("cargo").value == 0 ||    
              document.getElementById("crm").value == 0 ||
              document.getElementById("especialidade").value == 0 ){
          console.log(error);
          alert('Erro ao cadastrar médico.');
        }

      else{  
      axios.post('http://localhost:5555/api/cadastrar_medico', funcionario)
      .then(function (response) {
        console.log(response.data);
        alert('Cadastro realizado com sucesso!');
        document.getElementById("formCadastro").reset();
      })
      .catch(function (error) {
        console.log(error);
        alert('Erro ao cadastrar médico.' + '\n' + 'Tente Novamente');
      });}
      }
  




    function getFuncionario() {
        axios.get("http://localhost:5555/api/funcionarios")
          .then(response => {
            var data = response.data;
            var tabelaFuncionarios = document.getElementById("tabelaFuncionarios");
            var tbody = tabelaFuncionarios.querySelector("tbody");
      
           
            tbody.innerHTML = "";
      
            
            data.forEach(item => {
              
              var linha = document.createElement("tr");
      
              
              var rg = document.createElement("td");
              rg.textContent = item.rg;
              linha.appendChild(rg);
      
              var cpf = document.createElement("td");
              cpf.textContent = item.cpf;
              linha.appendChild(cpf);
      
              var nome = document.createElement("td");
              nome.textContent = item.nome;
              linha.appendChild(nome);
      
              var telefone = document.createElement("td");
              telefone.textContent = item.telefone;
              linha.appendChild(telefone);
      
              var estado = document.createElement("td");
              estado.textContent = item.estado;
              linha.appendChild(estado);
      
              var cidade = document.createElement("td");
              cidade.textContent = item.cidade;
              linha.appendChild(cidade);
      
              var endereco = document.createElement("td");
              endereco.textContent = item.endereco;
              linha.appendChild(endereco);
      
              var salario = document.createElement("td");
              salario.textContent = item.salario;
              linha.appendChild(salario);
      
              var cargo = document.createElement("td");
              cargo.textContent = item.cargo;
              linha.appendChild(cargo);

              if(item.crm != null){
              var crm = document.createElement("td");
              crm.textContent = item.crm;
              linha.appendChild(crm);

              var especialidade = document.createElement("td");
              especialidade.textContent = item.especialidade;
              linha.appendChild(especialidade);
            
         
            }

              
      
              tbody.appendChild(linha);
            });
          })
          .catch(error => console.log(error));
      }






      function getFuncionarioNome() {
        var busca = document.getElementById("busca").value;
        axios.get("http://localhost:5555/api/funcionarios/parte_nome/" + document.getElementById("busca").value)
          .then(response => {
            var data = response.data;
            var tabelaFuncionarios = document.getElementById("tabelaFuncionarios");
            var tbody = tabelaFuncionarios.querySelector("tbody");
            
            
            tbody.innerHTML = "";
      
            
            
            data.forEach(item => {
              
              
              var linha = document.createElement("tr");
      
              
              var rg = document.createElement("td");
              rg.textContent = item.rg;
              linha.appendChild(rg);
      
              var cpf = document.createElement("td");
              cpf.textContent = item.cpf;
              linha.appendChild(cpf);
      
              var nome = document.createElement("td");
              nome.textContent = item.nome;
              linha.appendChild(nome);
              if(busca == item.nome ){
      
              var telefone = document.createElement("td");
              telefone.textContent = item.telefone;
              linha.appendChild(telefone);
      
              var estado = document.createElement("td");
              estado.textContent = item.estado;
              linha.appendChild(estado);
      
              var cidade = document.createElement("td");
              cidade.textContent = item.cidade;
              linha.appendChild(cidade);
      
              var endereco = document.createElement("td");
              endereco.textContent = item.endereco;
              linha.appendChild(endereco);
      
              var salario = document.createElement("td");
              salario.textContent = item.salario;
              linha.appendChild(salario);
      
              var cargo = document.createElement("td");
              cargo.textContent = item.cargo;
              linha.appendChild(cargo);

              if(item.crm != null){
              var crm = document.createElement("td");
              crm.textContent = item.crm;
              linha.appendChild(crm);

              var especialidade = document.createElement("td");
              especialidade.textContent = item.especialidade;
              linha.appendChild(especialidade);
              alert('!!!!!!');
            
              }
            }

              
      
            tbody.appendChild(linha);})
    })
          .catch(function (error) {
            console.log(error);
            alert('Erro ao cadastrar médico.');
          })
      }