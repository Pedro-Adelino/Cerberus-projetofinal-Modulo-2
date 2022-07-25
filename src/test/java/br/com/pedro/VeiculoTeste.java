package br.com.pedro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.pedro.modelos.veiculos.Veiculo;
import br.com.pedro.modelos.veiculos.Veiculo.TipoVeiculo;

public class VeiculoTeste {
    
    @Test
    public void getTipoPequeno() {
        Veiculo v = new Veiculo("Fiat", "Mob", "99555444", 1000);
        assertEquals(TipoVeiculo.PEQUENO, v.getTipo());

        Veiculo v2 = new Veiculo("Fiat", "Mob", "99555444", 1);
        assertEquals(TipoVeiculo.PEQUENO, v2.getTipo());
    }

    @Test
    public void getTipoMedio() {
        Veiculo v = new Veiculo("VolksWagen", "Gol Polo", "965744", 1500);
        assertEquals(TipoVeiculo.MEDIO, v.getTipo());

        Veiculo v2 = new Veiculo("VolksWagen", "Gol Polo", "965744", 1001);
        assertEquals(TipoVeiculo.MEDIO, v2.getTipo());
    }

    @Test
    public void getTipoSUV() {
        Veiculo v = new Veiculo("Jeep", "Compass", "676468", 2000);
        assertEquals(TipoVeiculo.SUV, v.getTipo());

        Veiculo v2 = new Veiculo("Jeep", "Compass", "676468", 1501);
        assertEquals(TipoVeiculo.SUV, v2.getTipo());
    }
}
