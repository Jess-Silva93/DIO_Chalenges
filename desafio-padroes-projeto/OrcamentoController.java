package com.dio.orcamento.controller;

import com.dio.orcamento.service.OrcamentoAiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orcamento")
public class OrcamentoController {

    private final OrcamentoAiService orcamentoAiService;

    public OrcamentoController(OrcamentoAiService orcamentoAiService) {
        this.orcamentoAiService = orcamentoAiService;
    }

    @PostMapping("/comando-voz")
    public ResponseEntity<String> processarComandoVoz(@RequestBody String transcricaoAudio) {
        // Integração simulada/estruturada com Spring AI e Tool Calling
        String resposta = orcamentoAiService.executarComandoInteligente(transcricaoAudio);
        return ResponseEntity.ok(resposta);
    }
}
