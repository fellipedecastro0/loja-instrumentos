#  Loja de Instrumentos - Sistema de Vendas em Java

Este projeto é uma simulação de um sistema de vendas para uma loja de instrumentos musicais, desenvolvido como parte da disciplina de Programação Orientada a Objetos. O objetivo é aplicar os conceitos fundamentais de POO, como encapsulamento, herança, polimorfismo e abstração, para criar um sistema coeso e funcional.

---

##  Tecnologias Utilizadas
* **Linguagem:** Java
* **IDE:** IntelliJ IDEA e VSCODE
* **Controle de Versão:** Git e GitHub

---

##  Funcionalidades Principais

O sistema implementa o fluxo completo de cadastro e venda de produtos, gerenciado por um funcionário. As principais funcionalidades são:

* **Cadastro de Produtos:**
    * Permite o cadastro de dois tipos de produtos: **Instrumentos** (com atributos como tipo e marca) e **Acessórios** (com atributo de material), utilizando uma estrutura de **herança** a partir de uma classe abstrata `Produto`.
    * Os produtos são organizados por uma `enum` **Categoria** (`CORDAS`, `PERCUSSAO`, etc.).

* **Gerenciamento de Vendas:**
    * Um `Funcionario` pode iniciar uma nova `Venda`.
    * É possível adicionar múltiplos `ItemVenda` a uma `Venda`, cada um com um `Produto` e uma `quantidade` específica.
    * O sistema calcula o `subtotal` para cada item e o `valorTotal` para a venda completa automaticamente.

* **Consulta de Dados:**
    * Permite consultar produtos cadastrados pelo código.
    * Permite consultar vendas realizadas pelo ID.
    * Exibe os detalhes completos de uma venda, incluindo todos os seus itens e o valor total formatado.

---



##  Estrutura do Projeto (Diagrama de Classes)

A arquitetura do sistema foi baseada no seguinte diagrama de classes UML:

* **`Funcionario`**: Gerencia as listas de produtos e vendas.
* **`Venda`**: Contém uma lista de `ItemVenda`.
* **`ItemVenda`**: Liga um `Produto` a uma `quantidade`.
* **`Produto` (Abstrata)**: A classe base para todos os produtos.
    * **`Instrumento` (Herda de Produto)**
    * **`Acessorio` (Herda de Produto)**
* **`Categoria` (Enum)**: Define os tipos de categoria dos produtos.
