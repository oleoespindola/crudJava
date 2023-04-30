package controllers;

import java.util.*;

import models.ClienteModel;

public class ClienteList {

    Map<Integer, ClienteModel> clientes = new HashMap<Integer, ClienteModel>();

    public void incluir(ClienteModel cliente) {
        this.clientes.put(cliente.getId(), cliente);
    }

    public void alterar(int id, ClienteModel cliente) {
        this.clientes.put(id, cliente);
    }

    public ClienteModel consultarPosicao(int posicao) {
        return this.clientes.get(posicao);
    }

    public ClienteModel consultarCNPJ(String cnpj) {
        for(ClienteModel cliente : this.clientes.values()) {
            if(cnpj.equals(cliente.getCnpj())) {
                return cliente;
            }
        }
        return null;
    }

    public ClienteModel consultarId(int id) {
        return this.clientes.get(id);
    }

    public ClienteModel consutarNome(String nome) {
        for(ClienteModel cliente : this.clientes.values()) {
            if(nome.equals(cliente.getNome())) {
                return cliente;
            }
        }
        return null;
    }

    public void excluir(int id) {
        this.clientes.remove(id);
    }
}
