# Atividade Prática — API de Biblioteca

Atividade prática desenvolvida utilizando Java e Spring Boot, com o objetivo de implementar uma API REST para cadastro e consulta de livros.

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Funcionalidades implementadas

- Cadastro de livros (`POST /livros`)
- Listagem de livros (`GET /livros`)
- Consulta de livro por ID (`GET /livros/{id}`)
- Persistência de dados utilizando H2

## Execução

Para executar o projeto no Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

A API estará disponível em `http://localhost:8081/livros`.

## Testes

As requisições utilizadas para testar os endpoints estão disponíveis na Collection do Postman incluída no repositório.

---

**Finalidade:** Entrega da atividade prática de Spring Boot e H2.
