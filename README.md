# 💰 hr-auction-system

<p align="center">
  <a href="https://github.com/hrlucas">
    <img src="https://img.shields.io/badge/GitHub-hrlucas-181717?style=for-the-badge&logo=github">
  </a>
  <a href="https://www.linkedin.com/in/lucas-hochmann-rosa-456bb7339/">
    <img src="https://img.shields.io/badge/LinkedIn-Lucas_Hochmann_Rosa-0A66C2?style=for-the-badge&logo=linkedin">
  </a>
  <a href="./LICENCE.txt">
    <img src="https://img.shields.io/badge/License-MIT-2ea44f?style=for-the-badge">
  </a>
</p>

> Desenvolvi o **hr-auction-system** como atividade prática do curso Técnico em Desenvolvimento de Sistemas, com o objetivo de demonstrar o uso de **versionamento de código com Git e GitHub** em um projeto Java. O sistema representa a base de um software para gerenciamento de produtos em uma casa de leilões.

---

## 🚧 Status do Projeto

**Em desenvolvimento.**

---

## 📌 Visão Geral

O **hr-auction-system** é uma aplicação Java que simula o funcionamento básico de um sistema de leilões, permitindo o cadastro, a listagem e a atualização de status dos produtos.

O projeto foi utilizado como base para prática de:

- controle de versão com Git
- integração com GitHub
- organização de código Java
- persistência de dados em banco MySQL
- desenvolvimento em ambiente NetBeans

---

## 🧠 Funcionalidades

- Cadastro de produtos para leilão
- Registro de informações essenciais dos produtos
- Persistência de dados em banco relacional
- Listagem de produtos cadastrados
- Marcação de produto como vendido
- Versionamento completo do projeto utilizando Git e GitHub

---

## 🏗️ Arquitetura

```text
hr-auction-system/
│
├── nbproject/                 # configurações do projeto NetBeans
├── src/
│   ├── conectaDAO.java        # conexão com banco de dados (JDBC)
│   ├── ProdutosDAO.java       # camada de acesso a dados
│   ├── ProdutosDTO.java       # entidade de produto
│   ├── cadastroVIEW.java      # tela de cadastro
│   └── listagemVIEW.java      # tela de listagem e venda
│
├── sql/
│   └── init.sql               # script de criação do banco de dados
├── README.md
└── build/                     # arquivos gerados pela IDE
```

### Organização

- **conectaDAO.java**: responsável pela configuração de conexão com o banco MySQL.
- **ProdutosDAO.java**: camada de acesso ao banco de dados (operações CRUD).
- **ProdutosDTO.java**: classe que representa os dados do sistema.
- **cadastroVIEW.java / listagemVIEW.java**: interface gráfica da aplicação.

---

## 🛠️ Tecnologias

- Java 18
- Java Swing
- MySQL
- NetBeans IDE
- Git
- GitHub

---

## ⚙️ Requisitos

- JDK 18+
- MySQL instalado e ativo
- NetBeans IDE
- Git instalado na máquina

---

## 🔧 Instalação

Clone o repositório:

```bash
git clone https://github.com/hrlucas/hr-auction-system
cd hr-auction-system
```

---

## 🗄️ Banco de Dados

Antes de executar o sistema, importe o script disponibilizado no projeto:

```sql
SOURCE sql/init.sql;
```

Esse script criará automaticamente o schema `hr_auction_system`, a tabela `produtos` e os registros iniciais.

A conexão do sistema utiliza variáveis de ambiente com valores padrão:

- `DB_HOST` (padrão: `localhost`)
- `DB_PORT` (padrão: `3306`)
- `DB_NAME` (padrão: `hr_auction_system`)
- `DB_USER` (padrão: `root`)
- `DB_PASSWORD` (padrão: vazio)

Para evitar os avisos de SSL no ambiente local, a URL JDBC está configurada com `useSSL=false`.

---

## ▶️ Execução

### Opção 1: NetBeans (recomendada)

1. Abra o NetBeans.
2. Vá em **File → Open Project**.
3. Selecione a pasta `hr-auction-system`.
4. Execute o projeto pela IDE.

---

## 🖥️ Telas Principais

| Tela | Objetivo |
|-----|----------|
| Cadastro de Produtos | Permitir registrar novos itens para leilão |
| Lista de Produtos | Visualizar produtos cadastrados |
| Gerenciamento | Manutenção e controle de dados do sistema |

---

## 📋 Regras de Negócio (Implementadas)

- Cada produto deve possuir um identificador único.
- O sistema permite cadastrar informações básicas de produtos.
- Os dados cadastrados são armazenados em banco de dados MySQL.
- O sistema permite atualizar o status de um produto para **Vendido**.

---

## 🔎 Adesão aos Requisitos (Estado Atual)

### Requisitos Funcionais

- **RF01**: Permitir cadastro de produtos para leilão.  
  **Status**: Implementado.

- **RF02**: Permitir visualização dos produtos cadastrados.  
  **Status**: Implementado.

- **RF03**: Persistir dados em banco de dados relacional.  
  **Status**: Implementado.

- **RF04**: Permitir gerenciamento básico dos registros cadastrados.  
  **Status**: Implementado.

---

### Requisitos Não Funcionais

- **RNF01**: O sistema deverá ser desenvolvido em Java.  
  **Status**: Implementado.

- **RNF02**: O banco de dados deverá ser MySQL.  
  **Status**: Implementado.

- **RNF03**: O sistema deverá utilizar versionamento de código com Git.  
  **Status**: Implementado.

- **RNF04**: O repositório deverá ser hospedado no GitHub.  
  **Status**: Implementado.

---

## 🧪 Testes Locais Rápidos

Fluxo manual sugerido:

1. Importar e executar o script `sql/init.sql`.
2. Executar o sistema pelo NetBeans.
3. Realizar cadastro de produtos.
4. Verificar persistência no banco de dados.
5. Validar exibição correta das informações cadastradas.
6. Marcar um produto como vendido e atualizar a listagem.

> Atualmente, não há suíte automatizada de testes versionada no projeto.

---

## ✨ Atualizações Recentes (UI e UX)

- O fluxo entre cadastro e listagem agora ocorre em janela única, com alternância de telas via `CardLayout`.
- A tabela de produtos foi configurada como somente leitura, bloqueando edição por duplo clique.
- Os alertas passaram a usar um diálogo Swing dedicado (`AlertaDialog`) no lugar de uso direto de `JOptionPane`.
- O modal de alerta recebeu padronização visual e foco na mensagem principal ao usuário.
- Ao exibir alertas, a tela de fundo é escurecida para reforçar a prioridade da ação.
- Foram adicionados os arquivos `AlertaDialog.java`, `AlertaDialog.form` e `AlertaUtil.java`.
- A pasta `test/` foi removida por não conter suíte de testes ativa.

---

## 📄 Licença

Licenciado sob MIT. Você pode usar, modificar e distribuir, mantendo o aviso de copyright e atribuindo crédito a **Lucas Hochmann Rosa / hrlucas.dev**.

Consulte o arquivo `LICENCE.txt`.

---

## 👨‍💻 Autor

**Lucas Hochmann Rosa / hrlucas.dev** - Desenvolvedor Full Stack

- GitHub: https://github.com/hrlucas  
- LinkedIn: https://www.linkedin.com/in/lucas-hochmann-rosa-456bb7339/
