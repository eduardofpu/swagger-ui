# Swagger

```sh
Exemplo de melhores  pr�ticas com Rest

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
 
Ap�s baixar o projeto, para execut�-lo � necess�rio rodar os seguintes comandos dentro da pasta raiz.

```sh
$ mvn clean install
$ mvn spring-boot:run
```



## 3. Testando os servi�os

Realizar a chamada dos servi�os. 

GET /pois-interest - Lista todos os produtos de POIs 

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


POST api/pois-interest/ - Cria um novo POIs 

```sh
O Postman pode ser recomendado:

$ curl -H "Content-Type: application/json" -X POST -d '



http://localhost:8080/api/user
  

{
  
  "id": 6,
  "name": "Arnod"
  
}

```
## 4.Documenta��o

```sh
documenta��o dos servi�os. URL http://localhost:8080/swagger-ui.html

```

## 5.Banco h2
```sh
� poss�vel acessar o banco embarcado pela a URL: http://localhost:8080/h2-console/

* JDBC URL: jdbc:h2:file:./target/h2db/xy-inc
* Username: root
* Password: 

```
