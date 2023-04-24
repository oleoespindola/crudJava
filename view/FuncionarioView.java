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
        System.out.printf("CADASTRO DE FUNCIONÁRIOS");

        super.entrar();

        System.out.printf("Data de admissão: ");
        funcionario.setData_admissao(faker.gerarData());
        System.out.printf("Data de demissão (se houver): ");
        funcionario.setData_demissao(faker.gerarData());
        System.out.printf("CTPS: ");
        funcionario.setCtps(faker.gerarInscricaoEstadual());
        System.out.printf("Informe o salário: ");
        funcionario.setSalario(faker.gerarValor());
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Data de admissao: "+ funcionario.getData_admissao());
        System.out.println("Data de demissao: "+ funcionario.getData_demissao());
        System.out.println("CTPS: "+ funcionario.getCtps());
        System.out.println("Salário : R$"+ funcionario.getSalario());
    }

}
