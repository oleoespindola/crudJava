package controllers;

import models.*;

public class FornecedorController {

    FornecedorList Fornecedores = new FornecedorList();

    public void incluir(FornecedorModel Fornecedor, int x) {
            for(int i = 0; i < x ; i++){
            this.Fornecedores.incluir(Fornecedor);
        }
        }

    public void alterar(int id, FornecedorModel Fornecedor) {
        this.Fornecedores.alterar(id, Fornecedor);
    }

    public FornecedorModel consultarPosicao(int posicao) {
        return this.Fornecedores.consultarPosicao(posicao);
    }

    public FornecedorModel consultarCNPJ(String CNPJ) {
        return this.Fornecedores.consultarCNPJ(CNPJ);
    }

    public FornecedorModel consutarNome(int id) {
        return this.Fornecedores.consultarId(id);
    }

    public void excluir (int id) {
        this.Fornecedores.excluir(id);
    }
    
}
