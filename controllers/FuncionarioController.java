package controllers;

import models.*;

public class FuncionarioController {

    FuncionarioList funcionarios;

    public void incluir(FuncionarioModel Funcionario) {
        this.funcionarios.incluir(Funcionario);
    }

    public void alterar(int id, FuncionarioModel Funcionario) {
        this.funcionarios.alterar(id, Funcionario);
    }

    public FuncionarioModel consultarPosicao(int posicao) {
        return this.funcionarios.consultarPosicao(posicao);
    }

    public FuncionarioModel consultarCNPJ(String CNPJ) {
        return this.funcionarios.consultarCNPJ(CNPJ);
    }

    public FuncionarioModel consutarNome(String nome) {
        return this.funcionarios.consultarNome(nome);
    }

    public void excluir (int id) {
        this.funcionarios.excluir(id);
    }
}
