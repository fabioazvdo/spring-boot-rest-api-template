
```markdown
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
```

## Pré-requisitos

- **Java 11 ou superior**
- **Maven** instalado

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/fabioazvdo/spring-boot-rest-api-template.git
   cd spring-boot-rest-api-template
   ```

2. Configure o banco de dados no arquivo `src/main/resources/application.properties`.

3. Execute a aplicação:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse a documentação da API em `http://localhost:8080/swagger-ui.html`.

## Endpoints da API

### Exemplo de Endpoints

- **GET /api/v1/example**: Retorna uma lista de exemplos.
- **POST /api/v1/example**: Cria um novo exemplo.
- **GET /api/v1/example/{id}**: Retorna um exemplo específico por ID.
- **PUT /api/v1/example/{id}**: Atualiza um exemplo específico por ID.
- **DELETE /api/v1/example/{id}**: Deleta um exemplo específico por ID.

## Configuração do Banco de Dados

Certifique-se de configurar seu banco de dados no arquivo `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/db_name
spring.datasource.username=db_user
spring.datasource.password=db_password
spring.jpa.hibernate.ddl-auto=update
```

## Segurança

Este template inclui configuração básica de segurança usando Spring Security. Você pode customizar as regras de segurança no arquivo `SecurityConfig.java`.

## Documentação da API

A documentação da API é gerada automaticamente pelo Swagger. Após iniciar a aplicação, você pode acessar a documentação em `http://localhost:8080/swagger-ui.html`.

## Testes

Este projeto inclui exemplos de testes unitários e de integração. Para executar os testes, utilize o comando:
```bash
./mvnw test
```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contato

Para mais informações, entre em contato através do email: [fabio.carvalho@cs.unipe.edu.br](mailto:fabio.carvalho@cs.unipe.edu.br).
