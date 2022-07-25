package br.com.pedro.modelos.clientes;

public class ClientePF extends Cliente {
    private String cpf;

    public ClientePF(String nome, int id, String cpf) {
        super(nome, id);
        this.cpf = cpf;
    }  
}
