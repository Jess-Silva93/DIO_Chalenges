package com.dio.contratos.controller;

import com.dio.contratos.service.ContratoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/contratos")
public class ContratoController {

    private final ContratoService contratoService;

    public ContratoController(ContratoService contratoService) {
        this.contratoService = contratoService;
    }

    @GetMapping("/calcular")
    public ResponseEntity<BigDecimal> calcularValorFinal(
            @RequestParam String tipo,
            @RequestParam BigDecimal valor) {
        BigDecimal valorFinal = contratoService.calcularValorFinal(tipo, valor);
        return ResponseEntity.ok(valorFinal);
    }
}
