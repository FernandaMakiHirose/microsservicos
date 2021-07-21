# Construindo um projeto com arquitetura baseada em microsserviços usando Spring
Aprenda na prática como funciona uma arquitetura de software baseada em microsserviços, os seus benefícios e desafios e desenvolver um projeto em Java com Spring Cloud. 

## Microsserviços 
Microsserviços são uma abordagem de arquitetura para a criação de aplicações. O que diferencia a arquitetura de microsserviços das abordagens monolíticas tradicionais é como ela decompõe a aplicação por funções básicas. Cada função é denominada um serviço e pode ser criada e implantada de maneira independente. Isso significa que cada serviço individual pode funcionar ou falhar sem comprometer os demais.

## Microsserviços criados no projeto
- Product Catalog: Aplicação Spring, Elasticsearch (repositório de dados), API REST. A aplicação spring foi composta de: Gradle Project, Java, Spring Boot 2.2.6, Packaging: Jar, Java: 8, Dependencies: Spring Web, Spring Boot Actuator, Spring Data Elasticsearch (Access + Driver).
- Shopping Cart: Aplicação Spring, Redis, API REST. A aplicação spring foi composta de: Gradle Project, Java, Spring Boot 2.2.6, Packaging: Jar, Java: 8, Dependencies: Spring Web, Spring Boot Actuator, Config Server.
- Config Server: O Config Server é um serviço de configuração de aplicativo externalizado que fornece um servidor centralizado para fornecer propriedades de configuração externa para um aplicativo e uma fonte central para gerenciar essa configuração em ambientes de implantação. 
- Service Discovery: Tem o catálogo de serviços, sabe quais serviços estão respondendo, qual porta. A aplicação spring foi composta de: Gradle Project, Java, Spring Boot 2.2.6, Packaging: Jar, Java: 8, Dependencies: Eureka Server, Config Client.
- Gateway: Um Gateway, ou porta de ligação, é uma máquina intermediária geralmente destinada a interligar redes, separar domínios de colisão, ou mesmo traduzir protocolos. A aplicação spring foi composta de: Gradle Project, Java, Spring Boot 2.2.6, Packaging: Jar, Java: 8, Dependencies: Spring Boot Actuator, Gateway, Config Client. 

## Pré-requisitos
- Java Development Kit - JDK 1.8 ou superior.
- Gradle.
- IntelliJ Idea IDE.

## Para rodar o projeto:
>gradle bootRun
