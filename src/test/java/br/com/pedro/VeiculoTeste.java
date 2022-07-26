package br.com.pedro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.pedro.enums.TipoVeiculo;
import br.com.pedro.modelos.veiculos.Veiculo;

public class VeiculoTeste {
    
    @Test
    public void getTipoPequeno() {
        Veiculo v = new Veiculo("99555444", 1000);
        assertEquals(TipoVeiculo.PEQUENO, v.getTipo());

        Veiculo v2 = new Veiculo("99555444", 1);
        assertEquals(TipoVeiculo.PEQUENO, v2.getTipo());
    }

    @Test
    public void getTipoMedio() {
        Veiculo v = new Veiculo("965744", 1500);
        assertEquals(TipoVeiculo.MEDIO, v.getTipo());

        Veiculo v2 = new Veiculo("965744", 1001);
        assertEquals(TipoVeiculo.MEDIO, v2.getTipo());
    }

    @Test
    public void getTipoSUV() {
        Veiculo v = new Veiculo("676468", 2000);
        assertEquals(TipoVeiculo.SUV, v.getTipo());

        Veiculo v2 = new Veiculo("676468", 1501);
        assertEquals(TipoVeiculo.SUV, v2.getTipo());
    }
}
