# API Inteligente de Orçamento Financeiro com Spring Boot e Spring AI

Projeto avançado desenvolvido para a DIO, integrando Inteligência Artificial Generativa com fluxos reais de backend corporativo.

## Arquitetura e Conceitos Aplicados
- **Spring AI ChatClient**: Abstração moderna para comunicação fluida com provedores de LLM.
- **Tool Calling (Function Calling)**: Uso da anotação `@Tool` para permitir que o modelo de IA acione métodos Java nativos (como registro de despesas e consulta de saldo) com base em comandos em linguagem natural.
- **Pipeline de Voz (Speech-to-Text & Text-to-Speech)**: Arquitetura preparada para receber transcrições de áudio e retornar respostas estruturadas.
- **Separação de Responsabilidades**: Arquitetura em camadas (Controller, Service, Tools).

## Endpoints
- `POST /api/orcamento/comando-voz`: Processa a string transcrita do comando de voz do usuário, interpreta a intenção via IA e executa a função correspondente.
