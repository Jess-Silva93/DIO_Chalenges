package com.dio.orcamento.service;

import com.dio.orcamento.tools.OrcamentoTools;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class OrcamentoAiService {

    private final ChatClient chatClient;

    public OrcamentoAiService(ChatClient.Builder chatClientBuilder, OrcamentoTools orcamentoTools) {
        this.chatClient = chatClientBuilder
                .defaultSystem("Você é um assistente financeiro inteligente integrado a uma API de orçamento.")
                .defaultTools(orcamentoTools)
                .build();
    }

    public String processarComandoInteligente(String mensagemUsuario) {
        // Envia o prompt para a IA, que decide automaticamente se aciona as Tools
        return this.chatClient.prompt()
                .user(mensagemUsuario)
                .call()
                .content();
    }
}
