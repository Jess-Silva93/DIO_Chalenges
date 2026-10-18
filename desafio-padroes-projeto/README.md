# Gestão de Contratos de TI - Padrões de Projeto com Spring Boot

Projeto desenvolvido para o desafio de Padrões de Projeto da DIO.

## Padrões Utilizados
- **Strategy Pattern**: Aplicação de diferentes regras de cálculo de desconto com base no tipo de contrato (`CLOUD`, `SUPORTE`).
- **Factory / Dependency Injection**: Gerenciamento e seleção dinâmica das estratégias pelo Spring Boot através de `Map<String, CalculoDescontoStrategy>`.

## Endpoints
- `GET /api/contratos/calcular?tipo=CLOUD&valor=1000`
