package com.example.demo.transacao.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.transacao.model.Transacao;
import com.example.demo.transacao.repository.TransacaoRepository;

@Service
public class TransacaoService {
 
    private final TransacaoRepository transacaoRepository;
    
    public TransacaoService(TransacaoRepository transacaoRepository){
        this.transacaoRepository = transacaoRepository;
    }

    public void createTransacao(Transacao transacao){
        if (transacao != null){
            transacaoRepository.salvar(transacao);
        } else {
            throw new RuntimeException("Transação não pode ser nula!");
        }
    }

    public void deleteTransacao(){
        transacaoRepository.deletar();
    }

    public List<Transacao> showAllTransactions(){
        return transacaoRepository.listarTodos();
    }
}
