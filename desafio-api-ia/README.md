# API Inteligente de Orçamento Financeiro com Spring Boot e Spring AI

Projeto desenvolvido para o desafio avançado de Spring Boot e Spring AI da DIO. O sistema integra Inteligência Generativa a uma arquitetura backend robusta para processamento de comandos por voz, gestão financeira e automação de regras de negócio.

## Arquitetura e Tecnologias
- **Java 17+** & **Spring Boot 3.x**
- **Spring AI (ChatClient & Advisors)**: Abstração para comunicação com modelos de linguagem (LLMs).
- **Tool Calling (Function Calling)**: Capacidade da IA de acionar funções reais da aplicação (como registro de despesas e consulta de saldo).
- **Speech-to-Text & Text-to-Speech**: Pipeline de interpretação de comandos de voz e geração de respostas faladas.
- **Spring Data JPA & REST**: Persistência de dados financeiros e exposição de endpoints seguros.

## Principais Componentes Implementados
1. **Processamento de Áudio**: Recepção e conversão de áudio para texto utilizando provedores de IA integrados.
2. **Motor de Intenções (Tool Calling)**: Mapeamento automático de comandos em linguagem natural para métodos de serviço Java.
3. **Respostas Multimodais**: Retorno estruturado contendo tanto a resposta em texto quanto os parâmetros de síntese de voz para a pessoa usuária.

## Endpoints Principais
- `POST /api/orcamento/comando-voz`: Envia a transcrição do comando de áudio para o motor de IA interpretar e executar a ação correspondente no orçamento.
