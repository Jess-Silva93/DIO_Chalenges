package com.dio.contratos.strategy;

import java.math.BigDecimal;

public interface CalculoDescontoStrategy {
    BigDecimal calcularDesconto(BigDecimal valorTotal);
}
