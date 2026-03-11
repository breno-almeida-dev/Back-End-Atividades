# API de Exercícios - Spring Boot (Método GET)

Este projeto foi desenvolvido em **Java utilizando Spring Boot**, com o objetivo de praticar a criação de **endpoints REST utilizando o método GET**.  

A aplicação contém diversos endpoints que recebem parâmetros pela URL utilizando **@PathVariable** e **@RequestParam**, realizando cálculos matemáticos e retornando os resultados ao usuário.

Este projeto faz parte das atividades práticas da disciplina de **Back-End**, com foco em compreender como funciona a comunicação HTTP em APIs REST construídas com Spring Boot.

---

# 🚀 Começando

O objetivo deste projeto é demonstrar, na prática, como criar **endpoints REST simples utilizando Spring Boot** e como receber parâmetros enviados pela URL através de duas abordagens:

- **PathVariable** → parâmetros embutidos na rota da URL  
- **RequestParam** → parâmetros enviados após o `?` na URL  

A aplicação expõe endpoints que realizam cálculos matemáticos básicos e retornam os resultados ao usuário.

---

# 📌 Funcionalidades Implementadas

A API possui os seguintes endpoints:

### 1️⃣ Soma de dois números (PathVariable)

Recebe dois números pela URL e retorna a soma.

GET /calculadora/soma/{a}/{b}

Exemplo:

http://localhost:8080/calculadora/soma/5/3

Resultado esperado:

Soma: 8

---

### 2️⃣ Subtração de dois números (RequestParam)

Recebe dois números como parâmetros na URL e retorna a subtração.

GET /calculadora/subtrair?a=10&b=4

Resultado esperado:

Subtração: 6

---

### 3️⃣ Multiplicação de dois números (PathVariable)

GET /calculadora/multiplicar/{a}/{b}

Exemplo:

http://localhost:8080/calculadora/multiplicar/6/7

Resultado:

Multiplicação: 42

---

### 4️⃣ Divisão de dois números (RequestParam)

GET /calculadora/dividir?a=20&b=5

Resultado:

Divisão: 4

O endpoint também possui tratamento para **divisão por zero**.

---

### 5️⃣ Quadrado de um número

Recebe um número e retorna seu quadrado.

GET /calculadora/quadrado/{numero}

Exemplo:

http://localhost:8080/calculadora/quadrado/8

Resultado:

Quadrado de 8: 64

---

### 6️⃣ Conversão de Celsius para Fahrenheit

Recebe a temperatura em Celsius e converte para Fahrenheit.

Fórmula utilizada:

F = (C × 9/5) + 32

Endpoint:

GET /calculadora/celsius-para-fahrenheit?celsius=30

---

### 7️⃣ Cálculo de IMC

Recebe peso e altura e retorna o cálculo do Índice de Massa Corporal.

Fórmula utilizada:

IMC = peso / (altura * altura)

Endpoint:

GET /calculadora/imc?peso=70&altura=1.75

---

### 8️⃣ Antecessor e sucessor

Recebe um número e retorna seu antecessor e sucessor.

GET /calculadora/antecessor-sucessor/{numero}

---

### 9️⃣ Cálculo de desconto

Recebe um valor e um percentual de desconto.

Fórmula utilizada:

valorFinal = valor - (valor * percentual / 100)

Endpoint:

GET /calculadora/desconto?valor=200&percentual=15

---

### 🔟 Tabuada de um número

Retorna a tabuada de um número de 1 a 10.

GET /calculadora/tabuada/{numero}

Exemplo:

http://localhost:8080/calculadora/tabuada/7

---

# 📋 Pré-requisitos

Para executar este projeto em sua máquina, você precisará ter instalado:

- **Java JDK 21 ou superior**
- **Maven**
- **Eclipse IDE** ou outra IDE Java
- **Git** para versionamento
- Conta no **GitHub**

---

# 🔧 Instalação

Clone este repositório:

git clone https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git

Entre na pasta do projeto:

cd NOME_DO_REPOSITORIO

Abra o projeto na sua IDE (recomendado Eclipse IDE).

Execute a aplicação através da classe:

AulaApplication.java

Após iniciar o projeto, a API ficará disponível em:

http://localhost:8080

---

# 🛠️ Construído com

Tecnologias utilizadas neste projeto:

- Java SE
- Spring Boot
- Spring Web
- Maven
- Eclipse IDE
- Git
- GitHub

---

# 📌 Versão

Versão atual do projeto:

Versão 1.0

Primeira implementação da API contendo exercícios de **endpoints GET em Spring Boot**.

---

# 📚 Conceitos praticados

Este projeto explora os seguintes conceitos de desenvolvimento Back-End:

- Criação de APIs REST
- Método HTTP **GET**
- Uso de **@RestController**
- Uso de **@GetMapping**
- Uso de **@PathVariable**
- Uso de **@RequestParam**
- Manipulação de parâmetros da URL
- Estrutura básica de um projeto **Spring Boot**

---

# ✒️ Autor

**Breno Gustavo Rocha de Almeida**

Projeto desenvolvido como atividade da disciplina de **Back-End**, com foco no aprendizado de **Spring Boot e desenvolvimento de APIs REST em Java**.
