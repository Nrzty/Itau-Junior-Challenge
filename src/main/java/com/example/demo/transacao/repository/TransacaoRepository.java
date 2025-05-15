package com.example.demo.transacao.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.transacao.model.Transacao;

@Repository
public class TransacaoRepository{

    List<Transacao> transacaoList = new ArrayList<>();

    public void salvar(Transacao transacao){
        transacaoList.add(transacao);
    }
    
    public void deletar(){
        transacaoList.clear();
    }

    public List<Transacao> listarTodos(){
        return transacaoList.stream().toList();
    }

    public List<Transacao> getTransacaoList() {
        return transacaoList;
    }
}
