package br.com.pedro;

import java.util.List;

import org.junit.Test;

import br.com.pedro.enums.TipoVeiculo;

public class TipoVeiculoTeste {
    
    @Test
    public void testaLista() {
        List<TipoVeiculo> lista = TipoVeiculo.listaTiposCrescente();
        for (TipoVeiculo tipoVeiculo : lista) {
            System.out.println(tipoVeiculo);
        }

        for (TipoVeiculo tipoVeiculo : TipoVeiculo.values()) {
            System.out.println(tipoVeiculo);
        }
    }
}
