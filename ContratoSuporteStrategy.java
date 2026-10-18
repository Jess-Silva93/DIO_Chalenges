Java
package com.dio.contratos.strategy;

import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component("SUPORTE")
public class ContratoSuporteStrategy implements CalculoDescontoStrategy {
    @Override
    public BigDecimal calcularDesconto(BigDecimal valorTotal) {
        return valorTotal.multiply(new BigDecimal("0.05"));
    }
}
