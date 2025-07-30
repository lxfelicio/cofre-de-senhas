# 🔐 Gerenciador de Senhas em Java (POO + Design Patterns)

Projeto prático em Java que simula um **gerenciador de senhas seguro**, com entrada via terminal, criptografia, autenticação simples e aplicação de **padrões de projeto** como Singleton, Strategy e Factory.

---

## 💡 Sobre o Projeto

Este projeto foi desenvolvido como parte de um **desafio prático de Design Patterns em Java**, com o objetivo de aplicar conceitos de segurança da informação e organização de código orientado a objetos.

Ao executar, o sistema:

- Gera um **código de acesso aleatório** (válido apenas durante a execução).
- Solicita uma **senha mestre definida pelo usuário**.
- Realiza uma **autenticação combinada (senha + código)**.
- Permite cadastrar senhas de serviços, criptografadas com **Base64** ou **SHA-256**.
- Exibe a lista de senhas criptografadas no cofre.

---

## 🔧 Funcionalidades

✔️ Entrada via terminal (Scanner)  
✔️ Geração de código de acesso aleatório a cada execução  
✔️ Autenticação com senha + código  
✔️ Escolha entre criptografia Base64 ou SHA-256  
✔️ Exibição do cofre de senhas criptografadas  
✔️ Aplicação de 3 padrões de projeto:

- **Singleton:** garante uma única instância do cofre.
- **Strategy:** permite alternar entre algoritmos de criptografia.
- **Factory:** cria objetos `Senha` com a criptografia aplicada.

---

## 🗂️ Estrutura do Projeto

gerenciador-senhas/
├── Main.java
├── model/
│   └── Senha.java
├── singleton/
│   └── PasswordManager.java
├── factory/
│   └── SenhaFactory.java
├── strategy/
│   ├── CriptografiaStrategy.java
│   ├── Base64Criptografia.java
│   └── Sha256Criptografia.java

---

## 🔐 Criptografia

Base64: usada para codificação simples e reversível.

SHA-256: algoritmo de hash não reversível, ideal para proteger senhas.


> ⚠️ Base64 não é segura para proteger senhas reais. Este projeto é apenas para fins didáticos.

---

## 🧠 Aprendizados

✔️ Padrões de projeto (Factory, Strategy, Singleton)
✔️ Entrada de dados via terminal com Scanner
✔️ Aplicação básica de criptografia em Java
✔️ Uso de listas e boas práticas de estruturação de código

---

👨‍💻 Autoria

Projeto desenvolvido por [Seu Nome Aqui] como parte dos estudos de POO, segurança básica e padrões de projeto em Java.
Contribuições, melhorias e feedbacks são bem-vindos!

> ✉️ linkedin.com/in/seu-perfil
🧑‍💻 github.com/seu-usuario
