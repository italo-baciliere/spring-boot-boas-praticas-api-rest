## Aplicação desenvolvida no curso da Alura

Spring Boot 3:
aplique boas práticas e proteja uma API Rest
https://www.alura.com.br/curso-online-spring-boot-aplique-boas-praticas-proteja-api-rest

# Spring Boot - boas praticas em API Rest

Voll Med

Implementação do back-end da voll med com o CRUD de pacientes e médicos.
Projeto da API desenvolvida com padrão MVC.

# Tecnologias Utilizadas

* Spring Boot 3 
* Validações com Bean Validation
* Java 17
* Maven
* Desenvolvimento de API Rest
* Postman para utilizar as APIs
* CRUD
* Paginação e ordenação
* Container Docker


# Dependências usadas no projeto:

Spring web 

- Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

MySQL Driver SQL

- MySQL JDBC driver.

Lombok

- Java annotation library which helps to reduce boilerplate code.

Flyway Migration

- Version control for your database so you can migrate from any version (incl. an empty database) to the latest version of the schema.

Spring Data JPA

- Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.

Spring Boot DevTools

- Provides fast application restarts, LiveReload, and configurations for enhanced development experience.

Validation 

- Bean Validation with Hibernate validator.


# Conceitos aprendidos 

- Diferenças do Spring tradicional
- Novidadesdda versão 3.0.0
- Spring Initializr
- Estrutura de diretórios do Spring boot
- API Rest
- Módulos, como Web, Validação e Spring Data JPA.
- Bibliotecas como o driver do MySQL, o Flyway e o Lombok
- Realizar configurações do projeto
- Mapeamento das entidades com JPA
- Exclusão lógica
- Migrations para controle das alterções
* Utilizando códigos HTTP corretamente para cada ação do CRUD
* Aprendendo a tratar erros de requisição
* Padronizar os retornos dos controllers da API
* Adicionando módulo Spring Security no projeto
* Implementando mecanismo de autenticação da API
* Realizando o controle de acesso na API
* Utilizando Json Web Token para controlar o acesso na API


[] -> Como rodar o projeto

Inicie o docker com o banco de dados da aplicação:

'''bash
docker-compose up -d
'''

[] -> Inserir arquivo SQL para popular a tabela
[] -> Rodar o MySQL
[] -> Deixar o SQL automático com validação (IfNotExist)
[] -> Criar o crud do paciente
[] -> Estutura correta API
[] -> Criar testes automatizados com Spring

<!-- 
Bean
DTO
Interfaces Repository JpaRepository
 -->

 <!--
 Cada ação do CRUD utilizar o seu método HTTP corretamente.

 Tratamento do retorno da API nas requisições
    Retornar o código correte, dependendo da solicitação.
    Não devemos sempre retorna o método 200.
    Excuir -> Códgio 204 (Requisição processada e sem conteúdo)

    Quando criamos algo, retornamos o código 201.        
    Código 201 - Requisição processada e novo recurso criado.
        Porém o mesmo possui algumas regras.
        devolver no corpo da resposta os dados do novo recurso
        registrado.
        Devolver também um cabeçalho do protocolo HTTP (Location)    
        
    
Não podemos passar uma entidade JPA como retorno e como parametro recebido.
Não é recomendado devolver e receber entidades JPA no controller.
 -->



<!-- LINKS PESQUISADOS

https://johnfercher.medium.com/mysql-docker-7ff6d50d6cf1 (MySQL + Docker)
https://stackoverflow.com/questions/43322033/create-database-on-docker-compose-startup (Create database on docker-compose startup)
 -->