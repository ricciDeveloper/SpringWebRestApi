# SpringWebApi

## Descrição
Este é um projeto de API RESTful desenvolvido em Spring Boot para gerenciar usuários.

## Funcionalidades
- Listar todos os usuários
- Obter informações de um usuário pelo nome de usuário
- Adicionar um novo usuário
- Excluir um usuário existente

## Tecnologias Utilizadas
- Java
- Spring Boot
- Spring Data JPA
- Spring Web
- Swagger (Springdoc OpenAPI)
- Maven

## Estrutura do Projeto
- `src/main/java`: Contém os arquivos Java do projeto
    - `dio.SpringWebApi.Controllers`: Pacote para controladores REST
    - `dio.SpringWebApi.Repository`: Pacote para classes de repositório
    - `dio.SpringWebApi.Model`: Pacote para classes de modelo
    - `dio.SpringWebApi.handler`: Pacote para classes de tratamento de exceções
    - `dio.SpringWebApi.doc`: Pacote para configuração do Swagger
    - `dio.SpringWebApi.SpringWebApiApplication`: Classe principal do aplicativo Spring Boot
- `src/main/resources`: Contém arquivos de recursos
    - `application.properties`: Arquivo de configuração do Spring Boot
- `README.md`: Este arquivo, contendo informações sobre o projeto

## Como Executar
1. Certifique-se de ter o Java e o Maven instalados em sua máquina.
2. Clone este repositório.
3. Navegue até o diretório do projeto.
4. Execute o seguinte comando para compilar e executar o projeto:
    ```bash
    mvn spring-boot:run
    ```
5. Acesse a API em http://localhost:8080.

## Documentação da API
A documentação da API está disponível em http://localhost:8080/swagger-ui.html.

## Autor
- João Victor (joaovictor.ricci1999@gmail.com)


