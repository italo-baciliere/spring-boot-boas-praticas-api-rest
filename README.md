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

- Version control for your database you can migrate from any version (incl. an empty database) to the latest version of the schema.

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

# Executando o Projeto

Inicie um containner com o banco de dados e uma interface web para manipular o banco.
Para isso, acesse a pasta docker e rode o comando:

'''bash
docker compose up -d
'''

Acesse a interface pelo endereço http://localhost:3000
e crie o banco de dados "vollmed_api"

Rode o projeto, para isso, abra o arquivo ApiApplication.java e execute o arquivo.

Caso aconteça algum erro na criação das migrations, acesse a base de dados da aplicação,
e execute o camando:

'''sql
-- delete from flyway_schema_history where success = 0;
'''


[] -> Deixar o SQL automático com validação (IfNotExist)
[] -> Criar o crud do paciente
[] -> Criar testes automatizados com Spring
[] -> Dividir o modulo de autenticacao em um ms
[] -> Aplicar o Elasticsearch (ECS)


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
https://trello.com/b/O0lGCsKb/api-voll-med
https://stackoverflow.com/questions/33349456/how-to-make-auto-reload-with-spring-boot-on-idea-intellij
https://www.4devs.com.br/
https://www.lastpass.com/pt/features/password-generator#generatorTool

Log4j
https://www.youtube.com/watch?v=tCErZHxaTxg&t=675s
https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core/2.20.0
https://www.alura.com.br/artigos/log4j-entenda-sobre-vulnerabilidade?gclid=Cj0KCQiAjbagBhD3ARIsANRrqEsahLCbY3a6FH9kmoFITThvQ0s4BINZKXIYfdDfHZT7j3Ur6ulYUrsaAk-sEALw_wcB
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto.logging
https://logging.apache.org/log4j/2.x/manual/layouts.html
https://www.baeldung.com/spring-boot-logging
https://www.baeldung.com/spring-boot-logback-log4j2

Elasticsearch
https://www.elastic.co/pt/what-is/elasticsearch
https://www.elastic.co/pt/what-is/ecs

Disable docker to start automatically
https://stackoverflow.com/questions/40513545/how-to-prevent-docker-from-starting-a-container-automatically-on-system-startup
https://stackoverflow.com/questions/37599128/docker-how-do-you-disable-auto-restart-on-a-container

-->

