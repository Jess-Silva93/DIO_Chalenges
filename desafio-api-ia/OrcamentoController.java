package com.dio.orcamento.controller;

import com.dio.orcamento.service.OrcamentoAiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orcamento")
public class OrcamentoController {

    private final OrcamentoAiService aiService;

    public OrcamentoController(OrcamentoAiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/comando-voz")
    public ResponseEntity<String> processarComandoVoz(@RequestBody String transcricaoAudio) {
        String respostaInteligente = aiService.processarComandoInteligente(transcricaoAudio);
        return ResponseEntity.ok(respostaInteligente);
    }
}
