# ☕ Java Fundamentals: Estrutura Sequencial

Este repositório contém a resolução da primeira fase de estudos em Java, focada em **Estrutura Sequencial**. O objetivo principal foi dominar o fluxo de dados (entrada, processamento e saída), aplicando conceitos de matemática computacional e boas práticas de Back-End [cite: 2025-05-30].

---

## 🚀 Tecnologias e Ferramentas
* **Linguagem:** Java 17+ 
* **IDE:** IntelliJ IDEA 
* **Plataforma:** Beecrowd (Exercícios 1001 a 1021 + Desafio 1061) 

---

## 🧠 Conceitos Dominados

Durante este módulo, foram aplicados os seguintes fundamentos técnicos:

* **Manipulação de I/O:** Uso da classe `Scanner` para leitura de tokens e `System.out.printf` para saídas formatadas com precisão decimal .
* **Gestão de Precisão:** Aplicação da técnica de **unidade mínima (centavos)** para cálculos financeiros, evitando erros de ponto flutuante binário .
* **Operadores e Lógica:** Uso intensivo do operador de resto (`%`) para algoritmos de decomposição (troco, conversão de tempo e idade) .
* **Biblioteca Math:** Implementação de métodos como `Math.pow()`, `Math.sqrt()` e `Math.abs()` .
* **Clean Code:** Nomenclatura de variáveis em **camelCase** e organização de pacotes .

---

## 📊 Lista de Exercícios (Beecrowd)

| Categoria | Exercícios (IDs) | Foco Principal |
| :--- | :--- | :--- |
| **Aritmética e I/O** | 1001 - 1004 | Operações básicas e entrada de dados. |
| **Cálculos de Negócio** | 1005 - 1010 | Média ponderada, salários e comissão de vendas. |
| **Geometria** | 1011 - 1015 | Fórmulas de volume, área e distância entre pontos. |
| **Conversão e Decomposição** | 1016 - 1021 | Tempo, idade em dias e algoritmo de cédulas/moedas. |
| **Desafio Final** | **1061** | Parsing de Strings complexas e normalização de tempo. |

---

## 🏆 Destaque Técnico: Problema 1061 (Tempo de um Evento)
O exercício 1061 representou o maior desafio técnico desta fase, exigindo a leitura de entradas com delimitadores específicos (Strings e inteiros misturados) e a normalização de datas em segundos totais para garantir a precisão no cálculo de duração de eventos .

---

## 📁 Como Executar
1. Clone o repositório.
2. Certifique-se de ter o JDK 17 ou superior instalado.
3. Importe como um projeto Maven/Java em sua IDE.
4. Execute as classes dentro do pacote `src/estrutura_sequencial`.