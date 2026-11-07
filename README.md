# Sistema de Imobiliária

Sistema de gestão de locação de imóveis desenvolvido em **Java** para a disciplina de **Programação Orientada a Objetos (POO)**, no curso de Análise e Desenvolvimento de Sistemas (SENAI).

Autora: Carolina Carvalho

## O que o sistema faz

Sistema de console que modela a locação de imóveis. Uma locação relaciona um locatário, um proprietário, um corretor e um imóvel (casa ou apartamento). O sistema calcula o aluguel de cada tipo de imóvel, envia a cobrança ao locatário, divide o pagamento entre o proprietário e a comissão do corretor, e controla o saldo de comissões do corretor, com opção de saque.

## Conceitos de POO aplicados

- **Herança:** `Casa` e `Apartamento` herdam de `Imovel`; `Proprietario`, `Locatario` e `Corretor` herdam de `Pessoa`
- **Classes abstratas:** `Pessoa` e `Imovel`
- **Polimorfismo:** `calcularAluguel()` é sobrescrito em `Casa` e `Apartamento`, e `receber()` em `Proprietario` e `Corretor`
- **Interface:** `ReceberValor`, implementada por `Proprietario` e `Corretor`
- **Encapsulamento:** atributos privados com getters e setters
- **Associação:** `Locacao` relaciona locatário, corretor, proprietário e imóvel

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
