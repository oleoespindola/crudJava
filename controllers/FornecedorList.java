package controllers;

import java.util.*;

import models.FornecedorModel;

public class FornecedorList {
    Map<Integer, FornecedorModel> fornecedores = new HashMap<Integer, FornecedorModel>();

    public void incluir(FornecedorModel fornecedor) {
        this.fornecedores.put(fornecedor.getId(), fornecedor);
    }

    public void alterar(int id, FornecedorModel fornecedor) {
        this.fornecedores.put(id, fornecedor);
    }

    public FornecedorModel consultarPosicao(int posicao) {
        ArrayList<FornecedorModel> fornecedorList = new ArrayList<>();
        for (FornecedorModel fornecedor : this.fornecedores.values()) {
            fornecedorList.add(fornecedor);
        }
        return fornecedorList.get(posicao);
    }

    public FornecedorModel consultarCNPJ(String cnpj) {
        for(FornecedorModel fornecedor : this.fornecedores.values()) {
            if(cnpj.equals(fornecedor.getCnpj())) {
                return fornecedor;
            }
        }
        return null;
    }

    public FornecedorModel consultarId(int id) {
        for(FornecedorModel fornecedor : this.fornecedores.values()) {
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
