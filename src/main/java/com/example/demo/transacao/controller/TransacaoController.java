package com.example.demo.transacao.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.transacao.model.Transacao;
import com.example.demo.transacao.service.TransacaoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    private final TransacaoService transacaoService;

    public TransacaoController(TransacaoService transacaoService){
        this.transacaoService = transacaoService;
    }

    @PostMapping
    public ResponseEntity<Transacao> criarTransacao(@Valid @RequestBody Transacao transacao) {
        transacaoService.createTransacao(transacao);
        return ResponseEntity.status(201).body(transacao);
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarTransacao(){
        transacaoService.deleteTransacao();
        return ResponseEntity.status(200).build();
    }

    @GetMapping
    public ResponseEntity<List<Transacao>> listarTransacoes(){
        return ResponseEntity.ok(transacaoService.showAllTransactions());
    }
}
