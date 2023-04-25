package controllers;

import java.util.ArrayList;

import models.FuncionarioModel;

public class FuncionarioList {
    ArrayList<FuncionarioModel> funcionarios = new ArrayList<FuncionarioModel>();

    public void incluir(FuncionarioModel funcionario) {
        this.funcionarios.add(funcionario.getId(), funcionario);
    }

    public void alterar(int id, FuncionarioModel funcionario) {
        this.funcionarios.set(id, funcionario);
    }

    public FuncionarioModel consultarPosicao(int posicao) {
        return this.funcionarios.get(posicao);
    }

    public FuncionarioModel consultarCPF(String CPF) {
        for(FuncionarioModel funcionario : this.funcionarios) {
            if(CPF == funcionario.getCpf()) {
                return funcionario;
            }
        }
        return null;
    }

    public FuncionarioModel consultarNome(String nome) {
        for(FuncionarioModel funcionario : this.funcionarios) {
            if(nome == funcionario.getNome()) {
                return funcionario;
            }
        }
        return null;
    }

    public void excluir(int id) {
        this.funcionarios.remove(id);
    }
}
