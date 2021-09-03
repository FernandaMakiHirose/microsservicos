# Construindo um projeto com arquitetura baseada em microsserviços usando Spring
Aprenda na prática como funciona uma arquitetura de software baseada em microsserviços, os seus benefícios e desafios e desenvolver um projeto em Java com Spring Cloud. 

## Requisitos
- Java Development Kit - JDK 1.8 ou superior.
- Gradle.
- IntelliJ Idea IDE.

## Licença
Distribuido sob a licença MIT License. Veja `LICENSE` para mais informações.

## Microsserviços 
Microsserviços são uma abordagem de arquitetura para a criação de aplicações. O que diferencia a arquitetura de microsserviços das abordagens monolíticas tradicionais é como ela decompõe a aplicação por funções básicas. Cada função é denominada um serviço e pode ser criada e implantada de maneira independente. Isso significa que cada serviço individual pode funcionar ou falhar sem comprometer os demais.

## Microsserviços criados no projeto
- Product Catalog: Aplicação Spring, Elasticsearch (repositório de dados), API REST. <br> A aplicação spring foi composta de: Gradle Project, Java, Spring Boot 2.2.6, Packaging: Jar, Java: 8, Dependencies: Spring Web, Spring Boot Actuator, Spring Data Elasticsearch (Access + Driver).
- Shopping Cart: Aplicação Spring, Redis, API REST. <br> A aplicação spring foi composta de: Gradle Project, Java, Spring Boot 2.2.6, Packaging: Jar, Java: 8, Dependencies: Spring Web, Spring Boot Actuator, Config Server.
- Config Server: O Config Server é um serviço de configuração de aplicativo externalizado que fornece um servidor centralizado para fornecer propriedades de configuração externa para um aplicativo e uma fonte central para gerenciar essa configuração em ambientes de implantação. <br> A aplicação spring foi composta de: Spring Boot Actuator, Spring Web, Config Server, Config Client.
- Service Discovery: Tem o catálogo de serviços, sabe quais serviços estão respondendo, qual porta. <br> A aplicação spring foi composta de: Gradle Project, Java, Spring Boot 2.2.6, Packaging: Jar, Java: 8, Dependencies: Eureka Server, Config Client.
- Gateway: Um Gateway, ou porta de ligação, é uma máquina intermediária geralmente destinada a interligar redes, separar domínios de colisão, ou mesmo traduzir protocolos. <br> A aplicação spring foi composta de: Gradle Project, Java, Spring Boot 2.2.6, Packaging: Jar, Java: 8, Dependencies: Spring Boot Actuator, Gateway, Config Client. 

## Para rodar o projeto:
>gradle bootRun

## Dicas
- O que é um Microsserviços? É uma arquitetura de software.
- Qual é a dependência do Spring Framework utilizada para prover abstrações de acesso a dados com Redis? Spring Data Redis.
- Qual é a função do Spring Boot Actuator? Inclui uma série de endpoints para o monitoramento de aplicações Spring Boot, como por exemplo o “/actuator/health” para operação de health check.
- Qual é a dependência do Spring Framework utilizada para prover abstrações de acesso a dados com Elasticsearch? Spring Data Elasticsearch.
- Qual das opções a seguir apresenta um conjunto de conceitos essenciais em arquiteturas baseadas em microsserviços? Config Server, Service Discover e Gateway
- Em que contextos a arquitetura baseada em microsserviços é adequada? Aplicações em que os domínios possam ser negocialmente isolados, criando assim microsserviços com responsabilidades bem definidas e individualmente escaláveis.
- Qual é a função de um Gateway em uma arquitetura baseada em microsserviços? Encapsular a(s) arquitetura(s) da solução e fornecer uma interface de uso para clientes externos. Nesse contexto, pode ter outras responsabilidades, como autenticação, monitoramento e balanceamento de carga.
- Qual é a finalidade do Spring Initializr? Prover uma interface Web para simplificar a configuração e criação de aplicações Spring Boot.
- Qual é a função de um Service Discovery em uma arquitetura baseada em microsserviços? Gerenciar o status e a localização dos microsserviços de um ecossistema. Para isso, os microsserviços devem se registrar individualmente no Service Discovery.
- Qual é a função de um Config Server em uma arquitetura baseada em microsserviços? Solução com a responsabilidade de centralizar e expor as configurações dos microsserviços de um ecossistema, as quais podem ser armazenadas em um repositório Git.
- Quais são as técnicas utilizadas para gerar casos de testes? Partição por Equivalência, Análise do Valor Limite, Tabela de Decisão, Teste por Transição de Estados.
- Quais itens deve ter em uma evidência de teste de sucesso? Print do resultado esperado, nome ou id do caso de teste, data da execução, versão do sistema realizado e ciclo de teste.
- O que é teste de software? É um processo que faz parte do ciclo de vida do software e tem como principal objetivo avaliar a qualidade e reduzir risco de falha no software em operação.
- Quanto pode custar um Bug (hipoteticamente)? Corrigir o defeito na fase de engenharia custa 1 e na fase de produção 100 vezes mais.
