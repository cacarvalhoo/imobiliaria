# Sistema de Imobiliária

Sistema de gestão de locação de imóveis desenvolvido em **Java** para a disciplina de **Programação Orientada a Objetos (POO)**, no curso de Análise e Desenvolvimento de Sistemas (SENAI).

Autora: Carolina Carvalho

## O que o sistema faz

[Descreva em 2 ou 3 linhas. Exemplo: permite cadastrar imóveis (casas e apartamentos), proprietários, locatários e corretores, registrar locações e enviar a cobrança do aluguel ao locatário.]


## Conceitos de POO aplicados

- **Herança:** `Casa` e `Apartamento` herdam de `Imovel`; `Proprietario`, `Locatario` e `Corretor` herdam de `Pessoa`
- **Encapsulamento:** atributos privados com acesso por getters e setters
- **Polimorfismo:** [confirme se há métodos sobrescritos]
- **Interface:** `ReceberValor` [confirme se é interface]

## Estrutura do projeto

    imobiliaria/
    ├── src/
    │   ├── Pessoa.java
    │   ├── Proprietario.java
    │   ├── Locatario.java
    │   ├── Corretor.java
    │   ├── Imovel.java
    │   ├── Casa.java
    │   ├── Apartamento.java
    │   ├── Locacao.java
    │   ├── ReceberValor.java
    │   └── Main.java
    ├── lib/
    └── README.md

## Como executar

Pré-requisito: JDK 17 ou superior.

Na pasta do projeto:

    javac -d bin src/*.java
    java -cp bin Main

Ou abra a pasta no VS Code com a extensão Java e rode o `Main.java`.

## Tecnologias

Java · Programação Orientada a Objetos · [Swing / JavaFX / outra, se houver]

## Contato

[LinkedIn](https://www.linkedin.com/in/carolina-carvalho-7a60711b9/) · [GitHub](https://github.com/cacarvalhoo)
