# crud-springboot-h2-restassured
Exemplo simples de um CRUD utilizando linguagem Java para o desenvolvimento e os frameworks Spring boot para a criação de api a ser testada, H2 como banco de dados em memória e Rest Assured para realização dos testes unitários

## Documentação da API

#### Cadastra produto

```http
  POST /produto
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `descricao` | `string` | Informe a descrição do produto|
| `marca` | `string` | Informe a marca do produto|
| `valor` | `number` | Informe o valor do produto|
| `validade` | `string` | Informe a validade do produto|

#### Retorna todos os produtos

```http
  GET /produto
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id` | `number` | Informe a descrição do produto|
| `descricao` | `string` | Informe a descrição do produto|
| `marca` | `string` | Informe a marca do produto|
| `valor` | `number` | Informe o valor do produto|
| `validade` | `string` | Informe a validade do produto|

## Screenshots

![Test Order 1](https://)
![Test Order 1](https://)

## Referências

 - [REST Assured](https://rest-assured.io/)
 - [Spring Boot](https://spring.io/projects/spring-boot/)
 - [Spring Initializr](https://start.spring.io/)
 - [H2 Database Engine](https://h2database.com/html/main.html)

