package com.example.demo.estatistica.Service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;

import org.springframework.stereotype.Service;

import com.example.demo.estatistica.Dto.EstatisticasDTO;
import com.example.demo.transacao.repository.TransacaoRepository;

@Service
public class EstatisticaService {
    
    private final TransacaoRepository transacaoRepository;

    public EstatisticaService(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    public EstatisticasDTO getStatisticsPorSegundos(long segundos) {
        OffsetDateTime limite = OffsetDateTime.now().minusSeconds(segundos);
    
        DoubleSummaryStatistics stats = transacaoRepository.listarTodos()
            .stream()
            .filter(t -> t.getDataHora() != null && t.getDataHora().isAfter(limite))
            .mapToDouble(t -> t.getValor().doubleValue())
            .summaryStatistics();

        return new EstatisticasDTO(stats);
    }
}
