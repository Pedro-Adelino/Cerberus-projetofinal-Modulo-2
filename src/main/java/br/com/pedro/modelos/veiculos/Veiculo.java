package br.com.pedro.modelos.veiculos;

import br.com.pedro.enums.TipoVeiculo;

public class Veiculo {
    private String chassi;
    private int peso;

    public Veiculo(String chassi, int peso) {
        this.chassi = chassi;
        this.peso = peso;
    }

    public TipoVeiculo getTipo() {
        for (TipoVeiculo tipo : TipoVeiculo.listaTiposCrescente()) {
            if (this.peso <= tipo.getPesoLimite())
                return tipo;
        }
        throw new VeiculoException("Tipo de veículo não encontrado");
    }

    protected class VeiculoException extends RuntimeException {
        public VeiculoException(String mensagem) {
            super(mensagem);
        }
    }
}
