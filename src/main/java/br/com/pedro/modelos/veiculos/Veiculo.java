package br.com.pedro.modelos.veiculos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Veiculo {
    private String marca;
    private String modelo;
    private String chassi;
    private int peso;

    public Veiculo(String marca, String modelo, String chassi, int peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.chassi = chassi;
        this.peso = peso;
    }

    public TipoVeiculo getTipo() {
        for (TipoVeiculo tipo : TipoVeiculo.listaTiposCrescente()) {
            if (this.peso <= tipo.pesoLimite)
                return tipo;
        }
        throw new VeiculoException("Tipo de veículo não encontrado");
    }

    public enum TipoVeiculo {
        SUV(2000),
        PEQUENO(1000),
        MEDIO(1500);

        private int pesoLimite;

        private TipoVeiculo(int pesoLimite) {
            this.pesoLimite = pesoLimite;
        }

        public static List<TipoVeiculo> listaTiposCrescente() {
            return Arrays.asList(TipoVeiculo.values())
                    .stream()
                    .sorted((t1, t2) -> t1.pesoLimite - t2.pesoLimite)
                    .collect(Collectors.toList());
        }
    }

    protected class VeiculoException extends RuntimeException {
        public VeiculoException(String mensagem) {
            super(mensagem);
        }
    }
}
