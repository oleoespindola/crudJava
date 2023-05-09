package controllers;

import models.*;

public class FuncionarioController {

    FuncionarioList funcionarios = new FuncionarioList();

    public void incluir(FuncionarioModel funcionario, int x) {
            for(int i = 0; i < x ; i++){
            this.funcionarios.incluir(funcionario);
        }
        }

    public void alterar(int id, FuncionarioModel funcionario) {
        this.funcionarios.alterar(id, funcionario);
    }

    public FuncionarioModel consultarPosicao(int posicao) {
        return this.funcionarios.consultarPosicao(posicao);
    }

    public FuncionarioModel consultarCPF(String cpf) {
        return this.funcionarios.consultarCPF(cpf);
    }

    public FuncionarioModel consutarNome(String nome) {
        return this.funcionarios.consultarNome(nome);
    }

    public void excluir (int id) {
        this.funcionarios.excluir(id);
    }
    
}
