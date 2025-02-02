# Library Book Web Flux

**Library Book Application** é uma aplicação baseada em Java e Spring WebFlux criada para gerenciamento de usuários e livros em uma biblioteca. A aplicação adota uma abordagem reativa para lidar com operações assíncronas e processamento eficiente.

## Funcionalidades

A aplicação oferece as seguintes funcionalidades relacionadas a usuários:

- **Criar usuários:** Endpoint para adicionar novos usuários.
- **Listar todos os usuários:** Endpoint para recuperar a lista completa de usuários registrados.
- **Atualizar usuários:** Endpoint para modificar as informações de um usuário existente.

### Endpoints Atuais

Os endpoints implementados no `UserController` atualmente incluem:

1. **Criar Usuário**
    - **Método:** `POST`
    - **Endpoint:** `/users`
    - **Descrição:** Cria um novo usuário na biblioteca.
    - **Resposta HTTP:** `201 CREATED`

2. **Listar Todos os Usuários**
    - **Método:** `GET`
    - **Endpoint:** `/users`
    - **Descrição:** Retorna uma lista de todos os usuários.
    - **Resposta HTTP:** `200 OK`

3. **Atualizar Usuário**
    - **Método:** `PUT`
    - **Endpoint:** `/users/{userId}`
    - **Descrição:** Atualiza a informação de um usuário pela sua identificação.
    - **Resposta HTTP:** `200 OK`

## Tecnologias Utilizadas

- **Java 17**:
  Linguagem principal do projeto.
- **Spring WebFlux**:
  Framework para construir aplicações reativas baseadas em banco de dados não bloqueantes.
- **Reactor Core**:
  Biblioteca para programação reativa.
- **Maven**:
  Gerenciador de dependências e ciclo de vida do projeto.

## Como Rodar o Projeto

### Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

1. [Java 17+](https://adoptium.net/)
2. [Maven](https://maven.apache.org/)
3. [IDE de sua preferência](https://www.jetbrains.com/idea/) ou qualquer editor de código.

---

### Passos para executar:

1. Clone este repositório:
   ```bash
   git clone <url-do-repositorio>
   cd library-book-application
   ```

2. Compile o projeto:
   ```bash
   ./gradle clean install
   ```

3. Execute a aplicação:
   ```bash
   ./gradle spring-boot:run
   ```

---

## Estrutura do Projeto

O projeto segue uma estrutura modular e bem organizada:

- **Controller:** Contém os endpoints da API REST.
- **Record:** Define estruturas imutáveis e DTOs (Data Transfer Objects, como o `UserResponse`).
- **Use Case:** Contém a lógica de negócios principal, abstraindo repositórios e outros serviços.

---

## Contribuindo

Contribuições são bem-vindas! Para contribuir com este projeto:

1. Faça um fork do projeto
2. Crie uma branch para sua funcionalidade ou correção: `git checkout -b minha-functionalidade`
3. Commit suas mudanças: `git commit -m "Minha nova funcionalidade"`
4. Faça um push para a branch: `git push origin minha-functionalidade`
5. Abra um Pull Request usando o GitHub

---

## Licença

O projeto está licenciado sob os termos fornecidos no arquivo LICENSE. Veja a próxima seção para detalhes.
