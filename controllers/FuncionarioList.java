package controllers;

import java.util.*;

import models.FuncionarioModel;

public class FuncionarioList {
    Map<Integer, FuncionarioModel> funcionarios = new HashMap<Integer, FuncionarioModel>();

    public void incluir(FuncionarioModel funcionario) {
        this.funcionarios.put(funcionario.getId(), funcionario);
    }

    public void alterar(int id, FuncionarioModel funcionario) {
        this.funcionarios.put(id, funcionario);
    }

    public FuncionarioModel consultarPosicao(int posicao) {
        ArrayList<FuncionarioModel> listaFuncionarios = new ArrayList<>();
        for (FuncionarioModel funcionario : this.funcionarios.values()) {
            listaFuncionarios.add(funcionario);
        } 
        return listaFuncionarios.get(posicao);
    }

    public FuncionarioModel consultarCPF(String cpf) {
        for(FuncionarioModel funcionario : this.funcionarios.values()) {
            if(cpf.equals(funcionario.getCpf())) {
                return funcionario;
            }
        }
        return null;
    }

    public FuncionarioModel consultarNome(String nome) {
        for(FuncionarioModel funcionario : this.funcionarios.values()) {
            if(nome.equals(funcionario.getNome())) {
                return funcionario;
            }
        }
        return null;
    }

    public void excluir(int id) {
        this.funcionarios.remove(id);
    }
}
