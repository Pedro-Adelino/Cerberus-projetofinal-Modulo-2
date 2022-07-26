package br.com.pedro.enums;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum TipoVeiculo {
    PEQUENO(1000, BigDecimal.valueOf(100)),
    MEDIO(1500, BigDecimal.valueOf(150)),
    SUV(2000, BigDecimal.valueOf(200));

    private int pesoLimite;
    private BigDecimal precoDiaria;

    private TipoVeiculo(int pesoLimite, BigDecimal precoDiaria) {
        this.pesoLimite = pesoLimite;
        this.precoDiaria = precoDiaria;
    }

    public int getPesoLimite() {
        return pesoLimite;
    }

    public BigDecimal getPrecoDiaria() {
        return precoDiaria;
    }

    public static List<TipoVeiculo> listaTiposCrescente() {
        return Arrays.asList(TipoVeiculo.values())
                .stream()
                .sorted((t1, t2) -> t1.pesoLimite - t2.pesoLimite)
                .collect(Collectors.toList());
    }
}