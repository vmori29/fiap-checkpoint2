# Ping

Aplicação Java com container para exemplo

## Pré-requisitos

- Java 17+
- Docker 
- Acesso a internet
- Acesso ao Docker Hub

## Instalação

#### Clone

```
https://github.com/vmori29/fiap-checkpoint2.git
```

## Execução


#### Docker

* Criar imagem

```
docker build -t checkpoint2 .
```

* Executar container

spring.profiles.active=<prd|dev|stg>

```
docker run -d -p 8080:8080 -e PROFILE=<prd|dev|stg> fiap-checkpoint2
```

## Container Registry


#### Docker Hub

* Login

```
docker login -u vmori29
```

* Criar imagem pronta para upload (método 1 - criando nova imagem)


```
docker build -t fiap-checkpoint2 .
```


* Criar imagem pronta para upload (método 2 - renomeando imagem existente)


```
docker tag checkpoint2 vmori29/fiap-checkpoint2
```


* Upload de imagem para o Docker Hub


```
docker push vmori29/fiap-checkpoint2 
```

*Comando docker para executar a aplicação a partir do docker hub com o profile "dev" (desenvolvimento) - H2

- Para acessar colocar as seguintes informações:
  
- Username: sa
- Password: password
- Url: jdbc:h2:mem:testdb

```
docker run -d -p 8080:8080 -e PROFILE=dev vmori29/fiap-checkpoint2
```

*Comando docker para executar a aplicação a partir do docker hub com o profile "prd" (produção) - Oracle SQL developer

- Para acessar colocar as seguintes informações:
  
- Username: rm93121
- Password: password
- Url: jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl

```
docker run -d -p 8080:8080 -e PROFILE=prd vmori29/fiap-checkpoint2 
```

*Comando docker para executar a aplicação a partir do docker hub com o profile "stg"(stagging - homologação) - MySQL

- Para acessar colocar as seguintes informações:
  
- Username: root
- Password: root_pwd
- Url: jdbc:mysql://localhost:3306/rh?createDatabaseIfNotExist=true

```
docker run -d -p 8080:8080 -e PROFILE=stg vmori29/fiap-checkpoint2 
```

#### Navegação

- Base

http://localhost:8080


## Features (Funcionalidades)

- Múltiplos profiles
- Banco de dados relacional

## Membros

- Victor Mori Kikuchi - vmk0411@gmail.com

## Referencias

Meu [GitHub](https://github.com/vmori29)

Meu [DockerHub](https://hub.docker.com/u/vmori29)
