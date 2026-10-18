package com.dio.contratos.service;

import com.dio.contratos.strategy.CalculoDescontoStrategy;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.Map;

@Service
public class ContratoService {

    private final Map<String, CalculoDescontoStrategy> estrategias;

    public ContratoService(Map<String, CalculoDescontoStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    public BigDecimal calcularValorFinal(String tipoContrato, BigDecimal valorTotal) {
        CalculoDescontoStrategy estrategia = estrategias.get(tipoContrato.toUpperCase());
        if (estrategia == null) {
            return valorTotal;
        }
        BigDecimal desconto = estrategia.calcularDesconto(valorTotal);
        return valorTotal.subtract(desconto);
    }
}
