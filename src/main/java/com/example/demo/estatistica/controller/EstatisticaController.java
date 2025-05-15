package com.example.demo.estatistica.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.estatistica.Dto.EstatisticasDTO;
import com.example.demo.estatistica.Service.EstatisticaService;

@RestController
@RequestMapping("/estatistica")
public class EstatisticaController {
    
    private final EstatisticaService estatisticaService;

    public EstatisticaController(EstatisticaService estatisticaService) {
        this.estatisticaService = estatisticaService;
    }

    @GetMapping
    public ResponseEntity<EstatisticasDTO> retornarEstatisticas(@RequestParam(value="segundos", defaultValue = "60") Long segundos) {
        return ResponseEntity.status(200).body(estatisticaService.getStatisticsPorSegundos(segundos));
    }
}
