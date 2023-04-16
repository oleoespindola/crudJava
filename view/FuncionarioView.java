package view;

import models.FuncionarioModel;

public class FuncionarioView extends PessoaFisicaView {

    FuncionarioModel funcionario;

    public void faker() {
        // TODO Auto-generated method stub

    }

    public void entrar() {
        System.out.printf("CADASTRO DE FUNCIONÁRIOS");

        super.entrar();

        System.out.printf("Data de admissão: ");
        funcionario.setData_admissao(leia.next());
        System.out.printf("Data de demissão (se houver): ");
        funcionario.setData_demissao(leia.next());
        System.out.printf("CTPS: ");
        funcionario.setCtps(leia.next());
        System.out.printf("Informe o salário: ");
        funcionario.setSalario(leia.nextDouble());
    }

    public void imprimir() {
        // TODO Auto-generated method stub

    }

}
