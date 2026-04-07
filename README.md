# 🏦 VaultBank — Sistema Bancário em Java

> Sistema bancário em Java puro — base de uma futura aplicação fullstack completa, com API REST, interface web e app mobile.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20desenvolvimento-yellow?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

---

## 📋 Índice

- [Sobre o Projeto](#-sobre-o-projeto)
- [Funcionalidades](#-funcionalidades)
- [Arquitetura](#-arquitetura)
- [Tecnologias](#-tecnologias)
- [Como Executar](#-como-executar)
- [Exemplo de Uso](#-exemplo-de-uso)
- [Roadmap](#-roadmap)
- [Autor](#-autor)

---

## 💡 Sobre o Projeto

O **VaultBank** é um sistema bancário de linha de comando desenvolvido em Java puro. O objetivo é aplicar conceitos fundamentais de orientação a objetos como encapsulamento, separação de responsabilidades e validação de regras de negócio, simulando operações reais de um banco.

---

## 🚀 Funcionalidades

- [ ] Criação de conta bancária com nome e CPF
- [ ] Depósito de valores
- [ ] Saque com validação de saldo insuficiente
- [ ] Consulta de saldo
- [ ] Extrato com histórico de movimentações
- [ ] Múltiplas contas simultâneas
- [ ] Transferência entre contas

---

## 🏗️ Arquitetura

O projeto segue uma arquitetura em camadas simples, separando a interface com o usuário das regras de negócio:

```text
src/
├── main/
│   └── BancoMain.java        
└── service/
    ├── Conta.java            
    └── BancoService.java     
```

| Classe | Responsabilidade |
|---|---|
| `BancoMain` | Captura entrada do usuário e exibe resultados |
| `Conta` | Armazena os dados de uma conta bancária |
| `BancoService` | Processa depósitos, saques e consultas |

---

## 🛠️ Tecnologias

- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

---

## ▶️ Como Executar

### Pré-requisitos

- Java 17 ou superior instalado

### Via terminal

```bash
# Clone o repositório
git clone https://github.com/alevir-dev/sistema-bancario-java.git

# Acesse a pasta do projeto
cd sistema-bancario-java

# Compile os arquivos
javac src/main/BancoMain.java src/service/Conta.java src/service/BancoService.java -d out

# Execute o programa
java -cp out main.BancoMain
```

### Via IDE

1. Abra o projeto no IntelliJ IDEA, Eclipse ou VS Code
2. Localize a classe `BancoMain.java`
3. Execute com o botão **Run** ou atalho `Shift + F10`

---

## 🖥️ Exemplo de Uso

```
========== VaultBank ==========
Bem-vindo(a), Alevir!

[1] Depositar
[2] Sacar
[3] Consultar saldo
[4] Ver extrato
[0] Sair

Escolha uma opção: 1
Informe o valor do depósito: 500.00
✔ Depósito de R$ 500,00 realizado com sucesso!

Saldo atual: R$ 500,00
```

---

## 🛣️ Roadmap

### Versão atual — v1.0
- [ ] Criação de conta bancária
- [ ] Depósito, saque e consulta de saldo
- [ ] Extrato com histórico de movimentações

### Próximas versões

**v1.1 — Múltiplas contas**
- [ ] Gerenciamento de múltiplas contas simultâneas
- [ ] Transferência entre contas
- [ ] Diferentes tipos de conta (corrente e poupança)
- [ ] Rendimento automático para poupança
- [ ] Limite de crédito

**v2.0 — Persistência e API**
- [ ] Persistência de dados com banco de dados (MySQL)
- [ ] API REST com Spring Boot
- [ ] Autenticação e controle de acesso

**v3.0 — Aplicação Fullstack**
- [ ] Interface web com React ou Angular
- [ ] App mobile com React Native
- [ ] Dashboard com extrato e gráficos
- [ ] Deploy em nuvem (AWS, Railway ou Render)

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## 👨‍💻 Autor

**Alevir Coelho Neto**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/alevir-coelho-neto)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/alevir-dev)
