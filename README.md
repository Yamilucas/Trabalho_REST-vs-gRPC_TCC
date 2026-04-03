# Comparação de Desempenho entre gRPC e API REST

Projeto desenvolvido como **Trabalho de Conclusão de Curso (TCC)** do curso de **Bacharelado em Ciência da Computação**.

## Autor

* Lucas Eufrásio Guimarães

## Orientador

* Prof. Me. Valter Ribeiro Lima Júnior

---

# Objetivos do Projeto

A seguir são apresentados o objetivo geral e os objetivos específicos deste projeto.

## Objetivo Geral

Comparar o desempenho das tecnologias **API REST** e **gRPC**, com o objetivo de identificar em quais situações cada abordagem se mostra mais adequada para diferentes tipos de projetos.

## Objetivos Específicos

* Desenvolver duas aplicações equivalentes utilizando a linguagem de programação **Java** e o **framework Spring Boot**, baseadas em arquitetura de **microsserviços**, empregando as tecnologias **API REST** e **gRPC**.

* Identificar as **vantagens e desvantagens** de cada tecnologia no contexto de aplicações baseadas em microsserviços.

* Auxiliar **desenvolvedores de software e empresas** na escolha da tecnologia mais adequada entre **REST** e **gRPC**, de acordo com suas necessidades.

---

# Tecnologias Utilizadas

* Java (JDK 21)
* Spring Boot
* Spring Data (JPA)
* Maven
* PostgreSQL (SQL)
* Hibernate
* REST API
* gRPC
* Protocol Buffers (Protobuf)
* Apache POI
* Postman

---

# Metodologia

A metodologia adotada consiste no desenvolvimento de **duas aplicações equivalentes**, uma baseada em **API REST** e outra baseada em **gRPC**, com o objetivo de realizar uma análise comparativa de desempenho.

Ambas as aplicações foram desenvolvidas utilizando **Java (JDK 21)** com o framework **Spring Boot** e utilizam **Maven** para o gerenciamento de dependências.

---

# Estrutura Geral das Aplicações

As duas aplicações compartilham uma estrutura tecnológica comum para garantir a equivalência dos testes.

## Banco de Dados

Os sistemas utilizam **PostgreSQL** como **SGBD** e **SQL** como linguagem para manipulação dos dados.

Banco utilizado:

```
produtos-tcc
```

A conexão é configurada no arquivo:

```
application.properties
```

---

## Acesso ao Banco de Dados

O acesso ao banco de dados utiliza:

* Spring Data (JPA)
* Hibernate

Essas tecnologias realizam o **mapeamento** entre a classe:

```
Produto
```

e a tabela:

```
TB_PRODUTO
```

---

## Estrutura da Tabela de Produtos

A tabela **TB_PRODUTO**, no banco de dados **SQL**, possui os seguintes campos:

| Campo      | Tipo         | Restrições                  |
| ---------- | ------------ | --------------------------- |
| id         | BIGINT       | PRIMARY KEY, AUTO INCREMENT |
| nome       | VARCHAR(100) | NOT NULL, UNIQUE            |
| quantidade | INT          | NOT NULL                    |
| valor      | DOUBLE       | NOT NULL                    |

---

## Camada de Serviço

A lógica de negócio está centralizada na classe:

```
ProdutoService
```

Essa classe implementa operações **CRUD**, individuais e em massa; na realização dos testes de desempenho, somente serão usadas operações em massa.

### Operações Individuais

* Criar produto
* Buscar produto por ID
* Atualizar produto
* Deletar produto

### Operações em Massa

* Listar todos os produtos
* Inserir múltiplos produtos
* Atualizar múltiplos produtos
* Deletar todos os produtos

---

# Coleta de Métricas de Desempenho

Para a análise comparativa, o sistema gera **arquivos Excel** utilizando a biblioteca **Apache POI**.

Esses arquivos registram três tipos de métricas.

## 1. Métricas Gerais de Requisição

Registram:

* Data e hora da requisição
* Método utilizado
* Endpoint acessado
* Tempo total da requisição

---

## 2. Métricas Individuais

Registram:

* Tempo de processamento de cada produto no banco de dados
* Tamanho de cada registro em bytes

---

## 3. Métricas Estatísticas

Realizam a análise dos dados das operações em massa, calculando e registrando:

* Média de tempo
* Tempo máximo
* Tempo mínimo
* Soma total do tempo
* Soma total do tamanho dos registros

---

# Implementação por Tecnologia

## API REST

A aplicação REST segue os princípios **RESTful**, utilizando métodos **HTTP**.

### Métodos Utilizados

* GET
* POST
* PUT
* DELETE

Os dados são retornados no formato:

```
JSON
```

### Tratamento de Erros

São utilizados **códigos de status HTTP**.

### Classe de Endpoint

```
ProdutoResource
```

---

## gRPC

A aplicação gRPC utiliza comunicação baseada no protocolo **HTTP/2** e **Protocol Buffers (protobuf)**.

### Comunicação

As chamadas são definidas por meio do arquivo:

```
produto-service.proto
```

### Tratamento de Erros

São utilizados **códigos de status próprios do protocolo gRPC**, equivalentes aos **códigos de status HTTP**.

### Classe de Controle

```
ProdutoController
```

---

# Procedimento de Teste

Os testes foram realizados utilizando o **Postman**, que envia requisições para ambas as aplicações.

Durante os testes, foram utilizados diferentes volumes de dados:

* 1.000 registros
* 5.000 registros
* 10.000 registros

Esses cenários permitem analisar **como cada tecnologia se comporta conforme o aumento da carga de dados**.

---

# Análise de Desempenho

## Cálculo de Desempenho

Para comparar as tecnologias de forma precisa, o estudo utilizou uma métrica de **variação percentual**, que permite identificar o quanto uma tecnologia é mais rápida ou mais lenta que a outra em termos percentuais.

Basicamente, para alcançar os resultados, o autor utilizou os dados armazenados no Excel durante a execução do programa no Postman e realizou o cálculo usando uma calculadora científica, com duas casas após a vírgula, para obter o resultado com base na equação e nos dados utilizados.

A variação percentual é calculada pela seguinte fórmula:

\text{Variação (%)} = \left(\frac{T_b - T_a}{T_b}\right) \times 100

Onde:

* **Ta** corresponde ao tempo total da requisição da aplicação mais rápida.
* **Tb** corresponde ao tempo total da requisição da aplicação mais lenta.

As principais métricas usadas para obter os resultados foram:

* duração total da requisição (ms)
* tempo de processamento no banco de dados
* tamanho dos dados em bytes

---

# Resultados dos Testes

Os testes foram realizados com cargas de **1.000**, **5.000** e **10.000** registros, permitindo avaliar o comportamento das tecnologias sob diferentes volumes de dados.

Os principais resultados observados foram:

### Superioridade do gRPC em Larga Escala

O **gRPC** demonstrou superioridade significativa em relação à **API REST**, principalmente em cenários com grandes volumes de dados. Isso ocorre devido ao uso do formato binário **Protocol Buffers (Protobuf)** e do protocolo **HTTP/2**, que reduzem o volume das mensagens e aumentam a eficiência da comunicação.

### Desempenho da API REST

A **API REST** mostrou-se competitiva e, em alguns casos, superior em cenários com **baixo volume de dados** ou em operações mais simples.

### Eficiência no Uso de Dados

O **gRPC** apresentou menor consumo de recursos de rede, pois utiliza serialização binária. Já o **JSON**, utilizado pela API REST, é baseado em texto e tende a gerar mensagens maiores.

---

# Conclusão

O estudo demonstrou que não existe uma única solução ideal para todos os cenários. Cada tecnologia apresenta vantagens dependendo do contexto de uso.

### Utilizar gRPC quando:

* o sistema exigir **alta performance**
* houver **comunicação intensa entre microsserviços**
* o sistema lidar com **grandes volumes de dados**

### Utilizar API REST quando:

* a prioridade for **simplicidade de implementação**
* houver necessidade de **integração direta com aplicações web**
* for importante contar com **maior suporte da comunidade e documentação**

De forma geral, os resultados indicam que o **gRPC apresenta maior eficiência em desempenho e uso de recursos**, enquanto a **API REST se destaca pela simplicidade, flexibilidade e ampla adoção no desenvolvimento de sistemas web**.
