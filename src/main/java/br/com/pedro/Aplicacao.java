package br.com.pedro;

import br.com.pedro.modelos.Aluguel;
import br.com.pedro.modelos.clientes.Cliente;
import br.com.pedro.modelos.clientes.ClientePF;
import br.com.pedro.modelos.clientes.ClientePJ;
import br.com.pedro.modelos.veiculos.Veiculo;

public class Aplicacao {
    public static void main(String[] args) {
        
        // Criação de clientes PF e PJ. Atenção ao uso de
        // polimorfismo
        Cliente maria = new ClientePF("Maria", 1);
        Cliente empresa = new ClientePJ("Empresa S.A.", 2);

        // O tipo do veículo é inferido a partir do peso:
        // pequeno até 1000 kg
        // médio de 1000 kg até 1500 kg
        // SUV de 1500 kg até 2000 kg
        Veiculo mobi = new Veiculo("9554", 1000); // veículo pequeno
        Veiculo polo = new Veiculo("5544", 1500); // veículo médio
        Veiculo compass = new Veiculo("3357", 2000); // veículo SUV

        // Combinações possíveis para cliente pessoa fisica
        Aluguel pf1 = new Aluguel(mobi, maria, 5);
        System.out.println(pf1.valorAluguel()); // valor esperado: 500.00

        Aluguel pf2 = new Aluguel(mobi, maria, 6);
        System.out.println(pf2.valorAluguel()); // valor esperado: 570.00

        Aluguel pf3 = new Aluguel(polo, maria, 4);
        System.out.println(pf3.valorAluguel()); // valor esperado: 600.00

        Aluguel pf4 = new Aluguel(polo, maria, 7);
        System.out.println(pf4.valorAluguel()); // valor esperado: 997.50

        Aluguel pf5 = new Aluguel(compass, maria, 3);
        System.out.println(pf5.valorAluguel()); // valor esperado: 600.00

        Aluguel pf6 = new Aluguel(compass, maria, 10);
        System.out.println(pf6.valorAluguel()); // valor esperado: 1900.00

        // Combinações possíveis para cliente pessoa jurídica
        Aluguel pj1 = new Aluguel(mobi, empresa, 3);
        System.out.println(pj1.valorAluguel()); // valor esperado: 300.00

        Aluguel pj2 = new Aluguel(mobi, empresa, 4);
        System.out.println(pj2.valorAluguel()); // valor esperado: 360.00

        Aluguel pj3 = new Aluguel(polo, empresa, 2);
        System.out.println(pj3.valorAluguel()); // valor esperado: 300.00

        Aluguel pj4 = new Aluguel(polo, empresa, 5);
        System.out.println(pj4.valorAluguel()); // valor esperado: 675.00

        Aluguel pj5 = new Aluguel(compass, empresa, 1);
        System.out.println(pj5.valorAluguel()); // valor esperado: 200.00

        Aluguel pj6 = new Aluguel(compass, empresa, 6);
        System.out.println(pj6.valorAluguel()); // valor esperado: 1080.00
    }
}
