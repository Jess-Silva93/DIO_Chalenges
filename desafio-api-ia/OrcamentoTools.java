package com.dio.orcamento.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
public class OrcamentoTools {

    @Tool(description = "Registra uma nova despesa no orçamento financeiro")
    public String registrarDespesa(String descricao, BigDecimal valor) {
        // Lógica real simulada de persistência
        return "Sucesso: Despesa '" + descricao + "' no valor de R$ " + valor + " registrada com sucesso!";
    }

    @Tool(description = "Consulta o saldo atual disponivel no orçamento financeiro")
    public String consultarSaldo() {
        // Lógica real simulada de consulta ao banco
        return "O saldo atual disponível é de R$ 4.500,00.";
    }
}
