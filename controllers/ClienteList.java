package controllers;

import java.util.ArrayList;

import models.ClienteModel;

public class ClienteList {
    ArrayList<ClienteModel> clientes;

    public void incluir(ClienteModel cliente) {
        this.clientes.add(cliente.getId(), cliente);
    }

    public void alterar(int id, ClienteModel cliente) {
        this.clientes.set(id, cliente);
    }

    public ClienteModel consultarPosicao(int posicao) {
        return this.clientes.get(posicao);
    }

    public ClienteModel consultarCNPJ(String cnpj) {
        for(ClienteModel cliente : this.clientes) {
            if(cnpj == cliente.getCnpj()) {
                return cliente;
            }
        }
        return null;
    }

    public ClienteModel consultarId(int id) {
        for(ClienteModel cliente : this.clientes) {
            if(id == cliente.getId()) {
                return cliente;
            }
        }
        return null;
    }

    public ClienteModel consutarNome(String nome) {
        for(ClienteModel cliente : this.clientes) {
            if(nome == cliente.getNome()) {
                return cliente;
            }
        }
        return null;
    }

    public void excluir(int id) {
        this.clientes.remove(id);
    }
}
