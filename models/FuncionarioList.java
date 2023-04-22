package models;

import java.util.ArrayList;

public class FuncionarioList {
    ArrayList<FuncionarioModel> Funcionarios = new ArrayList<FuncionarioModel>();

    public void incluir(FuncionarioModel Funcionario) {
        this.Funcionarios.add(Funcionario.getId(), Funcionario);
    }

    public void alterar(int id, FuncionarioModel Funcionario) {
        this.Funcionarios.set(id, Funcionario);
    }

    public FuncionarioModel consultarPosicao(int posicao) {
        return this.Funcionarios.get(posicao);
    }

    public FuncionarioModel consultarCPF(String CPF) {
        for(FuncionarioModel Funcionario : this.Funcionarios) {
            if(CPF == Funcionario.getCpf()) {
                return Funcionario;
            }
        }
        return null;
    }

    public FuncionarioModel consultarNome(String nome) {
        for(FuncionarioModel Funcionario : this.Funcionarios) {
            if(nome == Funcionario.getNome()) {
                return Funcionario;
            }
        }
        return null;
    }

    public void excluir(int id) {
        this.Funcionarios.remove(id);
    }
}
