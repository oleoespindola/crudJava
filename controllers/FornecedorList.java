package controllers;

import java.util.ArrayList;

import models.FornecedorModel;

public class FornecedorList {
    ArrayList<FornecedorModel> fornecedores = new ArrayList<FornecedorModel>();

    public void incluir(FornecedorModel fornecedor) {
        this.fornecedores.add(fornecedor.getId(), fornecedor);
    }

    public void alterar(int id, FornecedorModel fornecedor) {
        this.fornecedores.set(id, fornecedor);
    }

    public FornecedorModel consultarPosicao(int posicao) {
        return this.fornecedores.get(posicao);
    }

    public FornecedorModel consultarCNPJ(String CNPJ) {
        for(FornecedorModel fornecedor : this.fornecedores) {
            if(CNPJ == fornecedor.getCpf()) {
                return fornecedor;
            }
        }
        return null;
    }

    public FornecedorModel consultarId(int id) {
        for(FornecedorModel fornecedor : this.fornecedores) {
            if(id == fornecedor.getId()) {
                return fornecedor;
            }
        }
        return null;
    }

    public void excluir(int id) {
        this.fornecedores.remove(id);
    }
}
