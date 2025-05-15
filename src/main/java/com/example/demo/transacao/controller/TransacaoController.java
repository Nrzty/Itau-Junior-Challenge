package com.example.demo.transacao.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.transacao.model.Transacao;

@RestController("/transacao")
public class TransacaoController {

    public ResponseEntity<Transacao> criarTransacao(@RequestParam Transacao transacao) {
        return ResponseEntity.status(201).body(transacao);
    }

    public ResponseEntity<Void> deletarTransacao(){
        return ResponseEntity.status(200).build();
    }
}
