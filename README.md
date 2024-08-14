# UserRegisterAPI
Este projeto é uma API construída utilizando Java, Spring Boot e MySQL como banco de dados.

## API endpoints:
Esta Api oferece os seguintes endpoints:

*POST USERS*
```markdown
POST /users - Registra um novo usuário no banco.
```
```json
[
    {
        "username": "Pedro"
        "email": "pedro@example.com",
        "password": "455",
    },
]
```
*GET USERS*
```markdown
GET /users - Retorna a lista com todos os usuários.
```
```json
[
    {
        "id": d72dadb6-48e4-4c75-923b-835381f8cf21,
        "username": "Igor"
        "email": "igor@example.com",
        "password": "123",
    },
    {
        "id": f5c7e1d2-9a3b-4674-967d-a90b4f8b7e9b,
        "username": "Pedro"
        "email": "pedro@example.com",
        "password": "455",
    }
]
```
*GET USER BY ID*
```markdown
GET /users/{id} - Retorna um usuário específico com base no ID fornecido.
```
```json
[
    {
        "username": "Igor",
        "email": "igor@gmail.com",
        "password": "123456",
        "id": "d72dadb6-48e4-4c75-923b-835381f8cf21"
    },
]
```
## Database
Este projeto utiliza o MySQL como o banco de dados. 

