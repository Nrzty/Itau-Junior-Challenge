package com.example.demo.transacao.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;

public class Transacao {
    
    @NotNull(message= "O valor da transação não pode ser nulo")
    @PositiveOrZero(message= "Valor da transação deve ser maior ou igual a zero")
    private BigDecimal valor;

    @PastOrPresent(message= "A data da transação deve ser no presente ou passado")
    private OffsetDateTime dataHora;

    public Transacao(){
        this.dataHora = OffsetDateTime.now();
    }

    public Transacao(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }
}

