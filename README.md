# Como testar sua API Spring Boot com Rest Assured
Abaixo vamos ver como realizar testes unitários com Rest Assured.
Este exemplo é apenas para demonstrar como pode ser simples, rápido e prático utilizar Rest Assured para testar sua API. 
Neste exemplo foi criado um simples CRUD utilizando linguagem Java versão 17 para o desenvolvimento e os frameworks Spring boot 2.1.17 para a criação de api a ser testada, H2 como banco de dados em memória e finalmente Rest Assured para realização dos testes unitários.

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

![Test Order 1](https://raw.githubusercontent.com/guttomarttins/crud-springboot-h2-restassured/main/print01.png)
![Test Order 1](https://raw.githubusercontent.com/guttomarttins/crud-springboot-h2-restassured/main/print02.png)

## Melhorias

Após esse ponta pé inicial, apenas para demonstrar como é possível realizar seus testes unitários com a api `Rest Assured`, você pode evoluir esse simples exemplo para uma utilização mais elaborada.

## Outras informações

- Java 17
- Maven
- spring boot 2.1.17
- lombok
- H2
- spring boot data jpa
- spring boot devtools
- spring boot test
- Rest Assured 5.1.1
- hamcrest

## Dependências Maven

```javascript
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>io.rest-assured</groupId>
			<artifactId>spring-mock-mvc</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.hamcrest</groupId>
			<artifactId>hamcrest</artifactId>
		</dependency>
	</dependencies>
```

## Referências

 - [REST Assured](https://rest-assured.io/)
 - [Spring Boot](https://spring.io/projects/spring-boot/)
 - [Spring Initializr](https://start.spring.io/)
 - [H2 Database Engine](https://h2database.com/html/main.html)

