package view;

import interfaces.InterfaceView;
import models.FuncionarioModel;

public class FuncionarioView implements InterfaceView {


    // Atributos 
    FuncionarioModel funcionario = new FuncionarioModel();
    EnderecoView endereco = new EnderecoView();
    TelefoneView telefone = new TelefoneView();

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
        // Pessoa
        try {
            System.out.printf("\nInforme o ID: ");
            this.funcionario.setId(faker.gerarId());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nNome: ");
            this.funcionario.setNome(faker.gerarNome());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        System.out.printf("\nENDEREÇO");
        this.endereco.entrar();
        this.funcionario.setEnderecoModel(this.endereco.getEndereco());
        System.out.printf("\nTELEFONE");
        this.telefone = new TelefoneView();
        this.telefone.entrar();
        this.funcionario.setTelefoneModel(this.telefone.getTelefone());
        try {
            System.out.printf("\nInforme o e-mail: ");
            this.funcionario.setEmail(faker.gerarEmail());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }

        // Pessoa Física 
        try {
            System.out.printf("\nInforme o CPF: ");
            funcionario.setCpf(faker.gerarCPF());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nInforme o RG: ");
            funcionario.setRg(faker.gerarRg());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nInforme o orgão emissor: ");
            funcionario.setEmissor(faker.gerarEmissor());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }

        // Funcionário
        try {
            System.out.printf("\nData de admissão: ");
            this.funcionario.setData_admissao(faker.gerarData());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nData de demissão (se houver): ");
            this.funcionario.setData_demissao(faker.gerarData());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nCTPS: ");
            this.funcionario.setCtps(faker.gerarInscricaoEstadual());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nInforme o salário: ");
            this.funcionario.setSalario(faker.gerarValor());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }  
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