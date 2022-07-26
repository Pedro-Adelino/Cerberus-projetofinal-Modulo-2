package br.com.pedro.modelos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import br.com.pedro.modelos.clientes.Cliente;
import br.com.pedro.modelos.clientes.ClientePF;
import br.com.pedro.modelos.clientes.ClientePJ;
import br.com.pedro.modelos.veiculos.Veiculo;

public class Aluguel {
    private Veiculo veiculo;
    private Cliente cliente;
    private int diasAlugado;
    private final Map<Class<?>, Condicoes> DESCONTOS;

    {
        Map<Class<?>, Condicoes> descontos = new HashMap<>();
        descontos.put(
                ClientePF.class,
                new Condicoes(
                        5,
                        BigDecimal.valueOf(0.05)));
        descontos.put(
                ClientePJ.class,
                new Condicoes(
                        3,
                        BigDecimal.valueOf(0.1)));
        DESCONTOS = Collections.unmodifiableMap(descontos);
    }

    public Aluguel(Veiculo veiculo, Cliente cliente, int diasAlugado) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.diasAlugado = diasAlugado;
    }

    public BigDecimal valorAluguel() {
        Condicoes c = DESCONTOS.get(this.cliente.getClass());
        if (diasAlugado > c.getDias()) {
            return aluguelSemDesconto()
                    .multiply(BigDecimal.valueOf(1)
                    .subtract(c.getDesconto()))
                    .setScale(2, RoundingMode.HALF_UP);
        }
        return aluguelSemDesconto()
                .setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal aluguelSemDesconto() {
        return veiculo
                .getTipo()
                .getPrecoDiaria()
                .multiply(BigDecimal.valueOf(diasAlugado));
    }

    private class Condicoes {
        private int dias;
        private BigDecimal desconto;

        public Condicoes(int dias, BigDecimal desconto) {
            this.dias = dias;
            this.desconto = desconto;
        }

        public int getDias() {
            return dias;
        }

        public BigDecimal getDesconto() {
            return desconto;
        }
    }
}
