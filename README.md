# Swagger

```sh
Exemplo de melhores  práticas com Rest

api/user
id
name
```
 
## 1. Requisitos 

Instalar as seguintes ferramentas:

    1. JDK 1.8
    3. Maven
    
O projeto utiliza um banco embarcado (H2) para desenvolvimento.
 
## 2. Executando o Projeto
 
Após baixar o projeto, para executá-lo é necessário rodar os seguintes comandos dentro da pasta raiz.

```sh
$ mvn clean install
$ mvn spring-boot:run
```



## 3. Testando os serviços

Realizar a chamada dos serviços. 

GET /user - Lista todos os Users

```sh
$ curl http://localhost:8080/api/user
[
    {
        "id": 1,
        "name": "Eduardo"
    },
    {
        "id": 2,
        "name": "Luciana"
    },
    {
        "id": 3,
        "name": "Gian"
    },
    {
        "id": 4,
        "name": "Marcos"
    },
    {
        "id": 5,
        "name": "Daniel"
    }
    
]
```


POST api/user/ - Cria um novo Usuario

```sh
O Postman pode ser recomendado:

$ curl -H "Content-Type: application/json" -X POST -d '



http://localhost:8080/api/user
  

{
  
  "id": 6,
  "name": "Arnod"
  
}

```

GET /user - Buscar por id

```sh
$ curl http://localhost:8080/api/user/buscarId?id=5
[
    
    {
        "id": 5,
        "name": "Daniel"
    }
    
]
```

DELETE /user - Deletar por id

```sh
$ curl http://localhost:8080/api/user/deletarId?id=5

depois use o comando abaixo para verificar o id=5 se foi deletado

$ curl http://localhost:8080/api/user

[
    {
        "id": 1,
        "name": "Eduardo"
    },
    {
        "id": 2,
        "name": "Luciana"
    },
    {
        "id": 3,
        "name": "Gian"
    },
    {
        "id": 4,
        "name": "Marcos"
    }
    
    
]

```

## 4.Update
```sh
$ curl PUT  http://localhost:8080/api/user

[
    
    {
        "id": 4,
        "name": "Marcos Daniel"
    }
    
    
]

Depois acessar via get para confimar se o id =4 foi editado

$ curl GET  http://localhost:8080/api/user

[
    {
        "id": 1,
        "name": "Eduardo"
    },
    {
        "id": 2,
        "name": "Luciana"
    },
    {
        "id": 3,
        "name": "Gian"
    },
    {
        "id": 4,
        "name": "Marcos Daniel"
    }
    
    
]

```
## 5.Documentação

```sh
documentação dos serviços. URL http://localhost:8080/swagger-ui.html

```

## 6.Banco h2
```sh
É possível acessar o banco embarcado pela a URL: http://localhost:8080/h2-console/

* JDBC URL: jdbc:h2:file:./target/h2db/swagger-ui
* Username: root
* Password: 

```
