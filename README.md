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
https://github.com/TiagoAlcan/checkpoint2.git
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
docker run -d -p 8080:8080 -e PROFILE=<prd|dev|stg> checkpoint2
```

## Container Registry


#### Docker Hub

* Login

```
docker login -u tiagoalcan
```

* Criar imagem pronta para upload (método 1 - criando nova imagem)


```
docker build -t tiagoalcan/checkpoint2 .
```


* Criar imagem pronta para upload (método 2 - renomeando imagem existente)


```
docker tag checkpoint2 tiagoalcan/checkpoint2
```


* Upload de imagem para o Docker Hub


```
docker push tiagoalcan/checkpoint2 
```

*Comando docker para executar a aplicação a partir do docker hub com o profile "dev" (desenvolvimento) - H2

- Para acessar colocar as seguintes informções:
  
- Username: sa
- Password: password
- Url: jdbc:h2:mem:testdb

```
docker run -d -p 8080:8080 -e PROFILE=dev tiagoalcan/checkpoint2
```

*Comando docker para executar a aplicação a partir do docker hub com o profile "prd" (produção) - Oracle SQL developer

- Para acessar colocar as seguintes informções:
  
- Username: pf1524
- Password: password
- Url: jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl

```
docker run -d -p 8080:8080 -e PROFILE=prd tiagoalcan/checkpoint2 
```

*Comando docker para executar a aplicação a partir do docker hub com o profile "stg"(stagging - homologação) - MySQL

- Para acessar colocar as seguintes informções:
  
- Username: root
- Password: root_pwd
- Url: jdbc:mysql://localhost:3306/rh?createDatabaseIfNotExist=true

```
docker run -d -p 8080:8080 -e PROFILE=stg tiagoalcan/checkpoint2 
```

#### Navegação

- Base

http://localhost:8080


## Features (Funcionalidades)

- Múltiplos profiles
- Banco de dados relacional

## Contatos

- Tiago Gomes Alcântara - tiago.gomesalcan@email.com
- Guilherme Loureiro - guilhermelsba@email.com

## Referencias

Meu [GitHub](https://github.com/TiagoAlcan)

Meu [DockerHub](https://hub.docker.com/u/tiagoalcan)
