package view;

import interfaces.InterfaceView;
import models.FuncionarioModel;

public class FuncionarioView implements InterfaceView {


    FuncionarioModel funcionario = new FuncionarioModel();
    EnderecoView endereco = new EnderecoView();
    TelefoneView telefone = new TelefoneView();

    public FuncionarioView() {}

    public FuncionarioView(FuncionarioModel funcionario) {
        this.funcionario = funcionario;
    }

    public FuncionarioModel getFuncionario() {
        return this.funcionario;
    }

    public void entrar() {
        // Pessoa
        System.out.printf("\nInforme o ID: ");
        this.funcionario.setId(faker.gerarId());
        System.out.printf("\nNome: ");
        this.funcionario.setNome(faker.gerarNome());
        System.out.printf("\nENDEREÇO");
        this.endereco = new EnderecoView();
        this.endereco.entrar();
        this.funcionario.setEnderecoModel(this.endereco.getEndereco());
        System.out.printf("\nTELEFONE");
        this.telefone = new TelefoneView();
        this.telefone.entrar();
        this.funcionario.setTelefoneModel(this.telefone.getTelefone());
        System.out.printf("\nInforme o e-mail: ");
        this.funcionario.setEmail(faker.gerarEmail());

        // Pessoa Física 
        System.out.printf("\nInforme o CPF: ");
        funcionario.setCpf(faker.gerarCPF());
        System.out.printf("\nInforme o RG: ");
        funcionario.setRg(faker.gerarRg());
        System.out.printf("\nInforme o orgão emissor: ");
        funcionario.setEmissor(faker.gerarEmissor());

        // Funcionário
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
        // Pessoa 
        System.out.printf("\nID: %d", this.funcionario.getId());
        System.out.printf("\nNome: %s", this.funcionario.getNome());
        this.telefone = new TelefoneView(this.funcionario.getTelefoneModel());
        this.telefone.imprimir();
        this.endereco = new EnderecoView(this.funcionario.getEnderecoModel());
        this.endereco.imprimir();
        System.out.printf("\nEmail: %s", this.funcionario.getEmail());

        // Pessoa Físisca
        System.out.printf("\nCPF: %s", this.funcionario.getCpf());
        System.out.printf("\nRG: %s", this.funcionario.getRg());
        System.out.printf("\nOrgão Expedidor: %s", this.funcionario.getEmissor());

        // Funcionário 
        System.out.printf("\nData de admissao: %s", this.funcionario.getData_admissao());
        System.out.printf("\nData de demissao: %s", this.funcionario.getData_demissao());
        System.out.printf("\nCTPS: %s", this.funcionario.getCtps());
        System.out.printf("\nSalário : R$ %.2f", this.funcionario.getSalario());
        
    }

}
