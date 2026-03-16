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

> Projeto Java desktop desenvolvido como atividade prática do curso Técnico em Desenvolvimento de Sistemas, com foco em Swing, MySQL, arquitetura em camadas e versionamento com Git/GitHub.

---

## 🚧 Status do Projeto

**Em desenvolvimento.**

---

## 📌 Visão Geral

O **hr-auction-system** simula o funcionamento básico de uma casa de leilões, permitindo:

- cadastrar produtos;
- listar produtos disponíveis;
- marcar produtos como vendidos;
- consultar produtos vendidos em uma tela dedicada.

A interface foi construída em **Java Swing com formulários NetBeans (Java + Form)** e os dados são persistidos em **MySQL**.

---

## 🧠 Funcionalidades Implementadas

- Cadastro de produtos para leilão.
- Persistência de produtos no banco de dados.
- Listagem de produtos disponíveis.
- Venda de produto com atualização de status para **Vendido**.
- Tela de produtos vendidos com consulta dedicada.
- Navegação entre telas na mesma janela usando `CardLayout`.
- Alertas customizados com `JDialog` (com escurecimento da tela de fundo).
- Tabelas configuradas como somente leitura.

---

## 🏗️ Arquitetura do Projeto

```text
hr-auction-system/
├── nbproject/                   # configurações do projeto NetBeans
├── src/
│   ├── conectaDAO.java          # conexão JDBC com MySQL
│   ├── ProdutosDAO.java         # acesso a dados (cadastro, consulta e venda)
│   ├── ProdutosDTO.java         # objeto de transferência de dados (produto)
│   ├── cadastroVIEW.java/.form  # tela de cadastro (JFrame)
│   ├── listagemVIEW.java/.form  # tela de listagem (JPanel)
│   ├── vendasVIEW.java/.form    # tela de produtos vendidos (JPanel)
│   ├── AlertaDialog.java/.form  # modal de alerta customizado
│   └── AlertaUtil.java          # utilitário para exibição de alertas
├── sql/
│   └── init.sql                 # script de criação do banco e dados iniciais
├── README.md
└── build/                       # arquivos gerados pela IDE
```

---

## 🛠️ Tecnologias

- Java 18+
- Java Swing
- NetBeans IDE (Java + Form)
- MySQL
- JDBC
- Git e GitHub

---

## ⚙️ Requisitos

- JDK 18 ou superior
- MySQL instalado e em execução
- NetBeans IDE
- Git instalado

---

## 🔧 Instalação

```bash
git clone https://github.com/hrlucas/hr-auction-system
cd hr-auction-system
```

---

## 🗄️ Banco de Dados

Antes de executar o sistema, importe o script:

```sql
SOURCE sql/init.sql;
```

O script cria o schema `hr_auction_system`, a tabela `produtos` e registros iniciais.

Variáveis de ambiente suportadas para conexão:

- `DB_HOST` (padrão: `localhost`)
- `DB_PORT` (padrão: `3306`)
- `DB_NAME` (padrão: `hr_auction_system`)
- `DB_USER` (padrão: `root`)
- `DB_PASSWORD` (padrão: vazio)

A URL JDBC usa `useSSL=false` para ambiente local.

---

## ▶️ Execução

### NetBeans (recomendado)

1. Abra o NetBeans.
2. Acesse **File → Open Project**.
3. Selecione a pasta `hr-auction-system`.
4. Execute o projeto pela IDE.

---

## 🖥️ Telas Principais

| Tela | Objetivo |
|------|----------|
| Cadastro de Produtos | Cadastrar novos produtos para leilão |
| Lista de Produtos | Exibir produtos disponíveis e permitir venda |
| Produtos Vendidos | Exibir apenas itens com status `Vendido` |
| Alerta | Exibir validações e mensagens de atenção |

---

## 📋 Regras de Negócio (Estado Atual)

- Cada produto possui identificador único.
- Produto novo é cadastrado com status inicial **À Venda**.
- Venda altera status para **Vendido**.
- Produtos vendidos deixam de aparecer na listagem de disponíveis.
- Produtos vendidos aparecem na tela de consulta de vendas.

---

## 🌿 Versionamento

- Branch principal: `development`
- Branch de melhorias: `improvements`
- Commits seguem Conventional Commits em português.

---

## 🧪 Testes Locais Sugeridos

1. Executar `sql/init.sql` no MySQL.
2. Abrir o projeto no NetBeans e executar.
3. Cadastrar um novo produto.
4. Confirmar persistência no banco.
5. Vender produto na tela de listagem.
6. Confirmar remoção da lista de disponíveis.
7. Acessar **Consultar Vendas** e validar exibição do produto vendido.

> O projeto não possui suíte automatizada versionada até o momento.

---

## 📄 Licença

Licenciado sob MIT. Consulte `LICENCE.txt`.

---

## 👨‍💻 Autor

**Lucas Hochmann Rosa / hrlucas.dev**

- GitHub: https://github.com/hrlucas
- LinkedIn: https://www.linkedin.com/in/lucas-hochmann-rosa-456bb7339/
