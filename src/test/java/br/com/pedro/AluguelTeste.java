package br.com.pedro;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.pedro.modelos.Aluguel;
import br.com.pedro.modelos.clientes.Cliente;
import br.com.pedro.modelos.clientes.ClientePF;
import br.com.pedro.modelos.clientes.ClientePJ;
import br.com.pedro.modelos.veiculos.Veiculo;

public class AluguelTeste {
    
    @Test
    public void aluguelClientePFVeiculoPequenoSemDesconto(){
        Veiculo v = new Veiculo("5465465", 1000);
        Cliente c = new ClientePF("Pedro", 45);
        Aluguel a = new Aluguel(v, c, 4);

        assertEquals(BigDecimal.valueOf(400).setScale(2), a.valorAluguel());
    }

    @Test
    public void aluguelClientePFVeiculoPequenoComDesconto(){
        Veiculo v = new Veiculo("5465465", 1000);
        Cliente c = new ClientePF("Pedro", 45);
        Aluguel a = new Aluguel(v, c, 6);

        assertEquals(BigDecimal.valueOf(570).setScale(2), a.valorAluguel());
    }

    @Test
    public void aluguelClientePFVeiculoMedioSemDesconto(){
        Veiculo v = new Veiculo("5465465", 1500);
        Cliente c = new ClientePF("Pedro", 45);
        Aluguel a = new Aluguel(v, c, 3);

        assertEquals(BigDecimal.valueOf(450).setScale(2), a.valorAluguel());
    }

    @Test
    public void aluguelClientePFVeiculoMedioComDesconto(){
        Veiculo v = new Veiculo("5465465", 1500);
        Cliente c = new ClientePF("Pedro", 45);
        Aluguel a = new Aluguel(v, c, 10);

        assertEquals(BigDecimal.valueOf(1425).setScale(2), a.valorAluguel());
    }

    @Test
    public void aluguelClientePFVeiculoSUVSemDesconto(){
        Veiculo v = new Veiculo("5465465", 2000);
        Cliente c = new ClientePF("Pedro", 45);
        Aluguel a = new Aluguel(v, c, 2);

        assertEquals(BigDecimal.valueOf(400).setScale(2), a.valorAluguel());
    }

    @Test
    public void aluguelClientePFVeiculoSUVComDesconto(){
        Veiculo v = new Veiculo("5465465", 2000);
        Cliente c = new ClientePF("Pedro", 45);
        Aluguel a = new Aluguel(v, c, 15);

        assertEquals(BigDecimal.valueOf(2850).setScale(2), a.valorAluguel());
    }

    @Test
    public void aluguelClientePJVeiculoPequenoSemDesconto(){
        Veiculo v = new Veiculo("5465465", 1000);
        Cliente c = new ClientePJ("Minha Empresa", 2);
        Aluguel a = new Aluguel(v, c, 3);

        assertEquals(BigDecimal.valueOf(300).setScale(2), a.valorAluguel());
    }

    @Test
    public void aluguelClientePJVeiculoPequenoComDesconto(){
        Veiculo v = new Veiculo("5465465", 1000);
        Cliente c = new ClientePJ("Minha Empresa", 2);
        Aluguel a = new Aluguel(v, c, 4);

        assertEquals(BigDecimal.valueOf(360).setScale(2), a.valorAluguel());
    }

    @Test
    public void aluguelClientePJVeiculoMedioSemDesconto(){
        Veiculo v = new Veiculo("5465465", 1500);
        Cliente c = new ClientePJ("Minha Empresa", 2);
        Aluguel a = new Aluguel(v, c, 2);

        assertEquals(BigDecimal.valueOf(300).setScale(2), a.valorAluguel());
    }

    @Test
    public void aluguelClientePJVeiculoMedioComDesconto(){
        Veiculo v = new Veiculo("5465465", 1500);
        Cliente c = new ClientePJ("Minha Empresa", 2);
        Aluguel a = new Aluguel(v, c, 10);

        assertEquals(BigDecimal.valueOf(1350).setScale(2), a.valorAluguel());
    }

    @Test
    public void aluguelClientePJVeiculoSUVSemDesconto(){
        Veiculo v = new Veiculo("5465465", 2000);
        Cliente c = new ClientePJ("Minha Empresa", 2);
        Aluguel a = new Aluguel(v, c, 1);

        assertEquals(BigDecimal.valueOf(200).setScale(2), a.valorAluguel());
    }

    @Test
    public void aluguelClientePJVeiculoSUVComDesconto(){
        Veiculo v = new Veiculo("5465465", 2000);
        Cliente c = new ClientePJ("Minha Empresa", 2);
        Aluguel a = new Aluguel(v, c, 15);

        assertEquals(BigDecimal.valueOf(2700).setScale(2), a.valorAluguel());
    }
}
