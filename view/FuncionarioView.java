package view;

import models.FuncionarioModel;

public class FuncionarioView extends PessoaFisicaView {

    // Atributos 
    FuncionarioModel funcionario = new FuncionarioModel();

    // Construtor 
    public FuncionarioView() {}

    public FuncionarioView(FuncionarioModel funcionario) {
        this.funcionario = funcionario;
    }

    // Método 
    public FuncionarioModel getFuncionario() {
        return this.funcionario;
    }

    public void entrar() {
        System.out.printf("\nCADASTRO DE FUNCIONÁRIOS");

        super.entrar();

        System.out.printf("\nData de admissão: ");
        this.funcionario.setData_admissao(faker.gerarData());
        System.out.printf("\nData de demissão (se houver): ");
        this.funcionario.setData_demissao(faker.gerarData());
        System.out.printf("\nCTPS: ");
        this.funcionario.setCtps(faker.gerarInscricaoEstadual());
        System.out.printf("\nInforme o salário: ");
        this.funcionario.setSalario(faker.gerarValor());
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("\nData de admissao: "+ this.funcionario.getData_admissao());
        System.out.println("\nData de demissao: "+ this.funcionario.getData_demissao());
        System.out.println("\nCTPS: "+ this.funcionario.getCtps());
        System.out.println("\nSalário : R$"+ this.funcionario.getSalario());
    }

}
