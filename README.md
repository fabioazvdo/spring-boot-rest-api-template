# Spring Boot REST API Template

Este repositório é um template para a criação de APIs RESTful usando Spring Boot. Ele fornece uma estrutura básica para iniciar o desenvolvimento de APIs com práticas recomendadas e componentes comuns.

## Funcionalidades

- **Estrutura de projeto organizada**: Um layout claro e modular para facilitar a manutenção e escalabilidade.
- **Configuração básica do Spring Boot**: Configuração inicial para uma aplicação Spring Boot.
- **Exemplo de controlador REST**: Exemplo de controlador para demonstrar a criação de endpoints RESTful.
- **Integração com banco de dados usando Spring Data JPA**: Configuração para acessar bancos de dados relacionais.
- **Configuração de segurança com Spring Security**: Exemplo de configuração de segurança para proteger sua API.
- **Documentação da API com Swagger/OpenAPI**: Ferramentas para documentar e testar sua API.
- **Testes unitários e de integração**: Exemplo de testes para garantir a qualidade do código.

## Tecnologias Utilizadas

- **Java 11+**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Security**
- **Swagger/OpenAPI**
- **JUnit e Mockito**

## Estrutura do Projeto

```plaintext
spring-boot-rest-api-template
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── api
│   │   │               ├── controller
│   │   │               ├── model
│   │   │               ├── repository
│   │   │               ├── service
│   │   │               └── SpringBootRestApiTemplateApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── schema.sql
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── api
│                       └── SpringBootRestApiTemplateApplicationTests.java
