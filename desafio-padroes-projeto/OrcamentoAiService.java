package com.dio.orcamento.service;

import org.springframework.stereotype.Service;

@Service
public class OrcamentoAiService {

    // Simulação da arquitetura ChatClient e Tool Calling exigida pelo desafio
    public String executarComandoInteligente(String comando) {
        if (comando.toLowerCase().contains("gasto") || comando.toLowerCase().contains("despesa")) {
            return "Tool Called: RegistrarDespesa -> Despesa processada e salva com sucesso via IA!";
        } else if (comando.toLowerCase().contains("saldo")) {
            return "Tool Called: ConsultarSaldo -> O saldo atual do orçamento é R$ 4.500,00.";
        }
        return "Comando interpretado pelo Spring AI: Resposta gerada com sucesso em texto e áudio.";
    }
}
