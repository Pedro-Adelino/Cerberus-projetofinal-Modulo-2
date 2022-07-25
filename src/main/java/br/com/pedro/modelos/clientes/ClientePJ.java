package br.com.pedro.modelos.clientes;

public class ClientePJ extends Cliente {
    private String cnpj;

    public ClientePJ(String nome, int id, String cnpj) {
        super(nome, id);
        this.cnpj = cnpj;
    }
}
