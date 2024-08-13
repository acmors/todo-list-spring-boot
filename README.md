<h1>TODO List API</h1>

Uma API para gerenciar tarefas (CRUD), um projeto simples, mas com várias tecnologias inclusas.

<h2>Tecnologias: </h2>
<ul>
  <li>Spring Boot</li>
  <li>Spring MVC</li>
  <li>Spring Data JPA</li>
  <li>SpringDoc OpenAPI 3</li>
  <li>Mysql</li>
  <li>Práticas adotadas</li>
  <li>SOLID, DRY, YAGNI, KISS</li>
  <li>API REST</li>
  <li>Consultas com Spring Data JPA</li>
  <li>Injeção de Dependências</li>
  <li>Tratamento de respostas de erro</li>
  <li>Geração automática do Swagger com a OpenAPI 3</li>
</ul>

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
    "description": "Desc Todo 1",
    "id": 1,
    "name": "Todo 1",
    "priority": 1,
    "completed": false
  }

<h2>Listar Tarefas (GET): </h2>
http://localhost:8080/todos


  {
    "description": "Desc Todo 1",
    "id": 1,
    "name": "Todo 1",
    "priority": 1,
    "completed": false
  }

<h2>Atualizar Tarefa (PUT)</h2>
http://localhost:8080/todos
  {
    "description": "Desc Todo 1,2",
    "id": 1,
    "name": "Todo 1,2",
    "priority": 2,
    "completed": false
  }

<h2>Remover Tarefa: </h2>
http://localhost:8080/todos/1
