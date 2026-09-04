# Pokedex API

API REST para cadastro e gerenciamento de Pokémons, desenvolvida com Spring Boot, Spring Data JPA e PostgreSQL.

## Tecnologias

- Java 21
- Spring Boot 4.0.6
- Spring Web MVC
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok

## Pré-requisitos

- JDK 21 ou superior
- PostgreSQL em execução
- Git, caso queira clonar o projeto

## Como executar

1. Clone o repositório e entre na pasta do projeto:

   ```bash
   git clone https://github.com/CassioPassosP/SpringCrudPokedex.git
   cd pokedex
   ```

2. Crie um banco de dados PostgreSQL:

   ```sql
   CREATE DATABASE springCrudPokedex;
   ```

3. Configure as credenciais do banco em `src/main/resources/application.properties`:

   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/springCrudPokedex
   spring.datasource.username=postgres
   spring.datasource.password=sua_senha
   ```

   Não publique credenciais reais no GitHub. Para ambientes compartilhados, prefira variáveis de ambiente ou um arquivo de configuração local ignorado pelo Git.

4. Inicie a aplicação:

   No Windows:

   ```powershell
   .\mvnw.cmd spring-boot:run
   ```

   No Linux ou macOS:

   ```bash
   ./mvnw spring-boot:run
   ```

   A API ficará disponível em `http://localhost:8080`.

## Endpoints

### Listar Pokémons

```http
GET /pokemon
```

### Cadastrar Pokémon

```http
POST /pokemon
Content-Type: application/json
```

Exemplo de requisição:

```json
{
  "name": "Charizard",
  "type": {
    "name": "FOGO"
  },
  "evolution": 3,
  "height": 1.7,
  "payload": 90.5
}
```

Os tipos disponíveis estão definidos no enum `pokemonTypes`, incluindo `NORMAL`, `FOGO`, `AGUA`, `GRAMA`, `ELETRICO`, `GELO`, `LUTADOR`, `VENENO`, `TERRA`, `VOADOR`, `PSIQUICO`, `INSETO`, `PEDRA`, `FANTASMA`, `DRAGAO`, `NOTURNO`, `ACOM` e `FADA`.

### Atualizar Pokémon

```http
PUT /pokemon/{id}
Content-Type: application/json
```

Exemplo:

```json
{
  "name": "Charizard atualizado",
  "height": 1.8
}
```

### Excluir Pokémon

```http
DELETE /pokemon/{id}
```

## Exemplos com cURL

```bash
curl http://localhost:8080/pokemon
```

```bash
curl -X POST http://localhost:8080/pokemon \
  -H "Content-Type: application/json" \
  -d '{"name":"Pikachu","type":{"name":"ELETRICO"},"evolution":1,"height":0.4,"payload":6.0}'
```

```bash
curl -X PUT http://localhost:8080/pokemon/1 \
  -H "Content-Type: application/json" \
  -d '{"name":"Pikachu atualizado"}'
```

```bash
curl -X DELETE http://localhost:8080/pokemon/1
```

## Estrutura do projeto

```text
src/main/java/com/spring/pokedex
├── config       # Configurações da aplicação
├── controller   # Endpoints REST
├── dto          # Objetos de transferência de dados
├── entity       # Entidades JPA
├── enums        # Tipos enumerados
├── repository   # Repositórios de persistência
└── service      # Regras de negócio
```

## Testes

Execute os testes com:

```bash
./mvnw test
```

No Windows PowerShell:

```powershell
.\mvnw.cmd test
```

## Observações

- O Hibernate está configurado com `spring.jpa.hibernate.ddl-auto=update`, portanto as tabelas são atualizadas automaticamente durante o desenvolvimento.
- A rota `GET /pokemon_type` está presente no projeto, mas ainda não possui implementação completa e atualmente retorna `null`.
- O campo `payload` representa o peso do Pokémon conforme o modelo atual da aplicação.

## Licença

Este projeto ainda não possui uma licença definida.