package controllers;

import models.*;

public class ClienteController {

    ClienteList clientes = new ClienteList();

   for(int i = 0; i < x ; i++){
        public void incluir(ClienteModel cliente, int x) {
            this.clientes.incluir(cliente);
        }
    }
    public void alterar(int id, ClienteModel cliente) {
        this.clientes.alterar(id, cliente);
    }

    public ClienteModel consultarPosicao(int posicao) {
        return this.clientes.consultarPosicao(posicao);
    }

    public ClienteModel consultarCNPJ(String CNPJ) {
        return this.clientes.consultarCNPJ(CNPJ);
    }

    public ClienteModel consutarId(int id) {
        return this.clientes.consultarId(id);
    }

    public ClienteModel consutarNome(String nome) {
        return this.clientes.consutarNome(nome);
    }

    public void excluir (int id) {
        this.clientes.excluir(id);
    }
}
