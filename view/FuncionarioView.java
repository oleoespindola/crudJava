package view;

import models.FuncionarioModel;

public class FuncionarioView extends PessoaFisicaView {

    FuncionarioModel funcionario = new FuncionarioModel();

    public FuncionarioView() {}

    public FuncionarioView(FuncionarioModel funcionario) {
        this.funcionario = funcionario;
    }

    public FuncionarioModel getFuncionario() {
        return this.funcionario;
    }

    public void entrar() {
        System.out.printf("\nCADASTRO DE FUNCIONÁRIOS");

        super.entrar();

        System.out.printf("\nData de admissão: ");
        funcionario.setData_admissao(faker.gerarData());
        System.out.printf("\nData de demissão (se houver): ");
        funcionario.setData_demissao(faker.gerarData());
        System.out.printf("\nCTPS: ");
        funcionario.setCtps(faker.gerarInscricaoEstadual());
        System.out.printf("\nInforme o salário: ");
        funcionario.setSalario(faker.gerarValor());
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("\nData de admissao: "+ funcionario.getData_admissao());
        System.out.println("\nData de demissao: "+ funcionario.getData_demissao());
        System.out.println("\nCTPS: "+ funcionario.getCtps());
        System.out.println("\nSalário : R$"+ funcionario.getSalario());
    }

}
