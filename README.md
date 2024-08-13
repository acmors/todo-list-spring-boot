<h1>TODO List API</h1>

Uma API para gerenciar tarefas (CRUD), um projeto simples, mas com várias tecnologias inclusas.

<h2>Tecnologias: </h2>
Spring Boot
Spring MVC
Spring Data JPA
SpringDoc OpenAPI 3
Mysql
Práticas adotadas
SOLID, DRY, YAGNI, KISS
API REST
Consultas com Spring Data JPA
Injeção de Dependências
Tratamento de respostas de erro
Geração automática do Swagger com a OpenAPI 3

<h2>Como Executar</h2>
Clonar repositório git
Construir o projeto:
$ ./mvnw clean package
Executar a aplicação:
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
A API poderá ser acessada em localhost:8080. O Swagger poderá ser visualizado em localhost:8080/swagger-ui.html

<h2>API Endpoints</h2>
Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta Insomnia:

<h2>Criar Tarefa (POST): </h2>
http://localhost:8080/todos

  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }

<h2>Listar Tarefas (GET): </h2>
http://localhost:8080/todos


  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }

<h2>Atualizar Tarefa (PUT)</h2>
http://localhost:8080/todos
  {
    "descricao": "Desc Todo 1 Up",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }

<h2>Remover Tarefa: </h2>
http://localhost:8080/todos/1
