# ☕ Java Fundamentals: Estruturas Repetitivas

Este repositório contém a resolução da trilha de desafios técnicos focada em **Estruturas Repetitivas** (`while`, `for`, `do-while`), desenvolvida como parte da minha consolidação em lógica de programação e arquitetura Back-End. O foco principal foi dominar o controle de fluxo de loops, processamento de streams de dados e otimização de algoritmos iterativos.

---

## 🚀 Tecnologias e Ferramentas
* **Linguagem:** Java 17+
* **IDE:** IntelliJ IDEA
* **Plataforma:** Beecrowd (Exercícios focados em estruturas iterativas)

---

## 🧠 Conceitos Técnicos Aplicados

Durante este módulo, foram consolidados os seguintes fundamentos de engenharia de software:

* **Gerenciamento de Estado:** Reset e isolamento de variáveis acumuladoras dentro de loops externos para garantir que múltiplas execuções (casos de teste) não herdem dados corrompidos de requisições anteriores.
* **Lógica de Agrupamento (Gatilhos de Formato):** Uso estratégico do operador de resto (`%`) combinado com loops de passo único para gerenciar quebras de linha e paginação de dados de forma dinâmica, evitando loops aninhados desnecessários.
* **Controle de Fluxo e Paridade:** Implementação de condições de contorno (como checagem e ajuste prévio de paridade de variáveis antes de laços de repetição) para otimizar o processamento de sequências numéricas.
* **Clean Code & Semântica:** Substituição de blocos condicionais extensos por métodos utilitários nativos como `Math.max()` e `Math.min()` para definir limites operacionais, reduzindo a carga cognitiva de leitura do código.
* **Gestão de Precisão:** Aplicação de *Casting* explícito para o tipo `double` em divisões inteiras antes da execução de operações matemáticas de porcentagem, prevenindo truncamento de dados e erros numéricos.

---

## 📋 Desafios Resolvidos (Beecrowd)

Abaixo estão listados todos os exercícios implementados, divididos pelo foco estrutural do aprendizado:

| Categoria | IDs dos Exercícios | Foco Principal |
| :--- | :--- | :--- |
| **Controle de Fluxo e Módulo** | 1157 | Identificação de divisores através do operador de resto. |
| **Geração de Sequências Lógicas** | 1142, 1143, 1144 | Manipulação de loops para saída formatada de potências e strings de controle. |
| **Busca de Máximos e Índices** | 1080 | Algoritmo de busca para identificação do maior valor e sua respectiva posição (1-based). |
| **Processamento de Acumuladores** | 1094 | Agrupamento de dados categorizados (char) por meio de `switch-case` e cálculo estatístico percentual. |
| **Ajuste de Paridade e Limites** | 1145, 1158 | Sequenciamento lógico dinâmico com controle de overflow e soma de ímpares consecutivos com restrição de quantidade. |

---

## 🛠️ Perspectiva de Engenharia Back-End

A resolução destes problemas simula diretamente cenários reais do ecossistema de desenvolvimento de APIs e infraestrutura Cloud (Node.js, C# e AWS):
* **Otimização de Algoritmos:** A eliminação de loops aninhados desnecessários reduz a complexidade de tempo de `O(X * Y)` para `O(Y)`. Em arquiteturas serverless (como AWS Lambda), isso se traduz diretamente em menor tempo de execução e redução de custos.
* **Resiliência e Idempotência:** Garantir que variáveis de escopo local limpem seu estado a cada iteração reflete o comportamento esperado de rotinas em microsserviços que processam payloads em lote (Batch Processing).
* **Paginação de Dados:** O uso de marcadores matemáticos para quebrar o fluxo de visualização mimetiza algoritmos reais de paginação de resultados vindos de bancos de dados relacionais ou NoSQL.

---

## 🔄 Próxima Etapa
Foco total na organização de dados com **Estruturas Homogêneas (Vetores e Matrizes)** e a transição para os conceitos fundamentais de **Programação Orientada a Objetos (POO)**.

---
*Desenvolvido por **Wagner Suzano Urivi**.*