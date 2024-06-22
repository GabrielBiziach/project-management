# Project Management

Este é um sistema de gerenciamento de projetos desenvolvido em Java utilizando Spring MVC, Hibernate, e PostgreSQL. O projeto segue o padrão de arquitetura MVC (Model-View-Controller).

## Pré-requisitos

- JDK 11 ou superior
- Maven 3.6.3 ou superior
- PostgreSQL 12 ou superior
- Apache Tomcat 9 ou superior
- Visual Studio Code com as extensões Java Extension Pack e Tomcat for Java

## Configuração do Ambiente

### 1. Banco de Dados PostgreSQL

1. Crie um banco de dados chamado `project_management`.
2. Configure as credenciais de acesso ao banco de dados no arquivo `application.properties` localizado em `src/main/resources`:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/project_management
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

### 2. Apache Tomcat

1. Baixe e instale o Apache Tomcat 9 ou superior de [tomcat.apache.org](https://tomcat.apache.org/download-90.cgi).
2. Extraia o arquivo baixado para um diretório de sua escolha.
3. Adicione o Tomcat ao Visual Studio Code:
    - Clique no ícone do Tomcat na barra lateral esquerda do VSCode.
    - Clique no botão "Add Tomcat Server" (ícone de "+" verde).
    - Navegue até o diretório onde você extraiu o Tomcat e selecione a pasta raiz do Tomcat.

## Compilação e Deploy

### 1. Compilar o Projeto

No terminal integrado do VSCode, navegue até o diretório raiz do seu projeto e execute o comando Maven para limpar, compilar e empacotar o projeto:

```sh
mvn clean package
