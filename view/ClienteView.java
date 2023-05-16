package view;

import models.ClienteModel;
import interfaces.InterfaceView;

public class ClienteView implements InterfaceView {

    // Atributos 
    ClienteModel cliente = new ClienteModel();
    EnderecoView endereco = new EnderecoView();
    TelefoneView telefone = new TelefoneView();

    // Construtores 
    public ClienteView() {}

    public ClienteView(ClienteModel cliente) {
        this.cliente = cliente;
    }

    // Método 
    public ClienteModel getCliente() {
        return cliente;
    }

    public void entrar() {
        // Pessoa
        try {
            System.out.printf("\nInforme o ID: ");
            this.cliente.setId(faker.gerarId());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nNome: ");
            this.cliente.setNome(faker.gerarNome());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        System.out.printf("\nENDEREÇO");
        this.endereco.entrar();
        this.cliente.setEnderecoModel(this.endereco.getEndereco());
        System.out.printf("\nTELEFONE");
        this.telefone = new TelefoneView();
        this.telefone.entrar();
        this.cliente.setTelefoneModel(this.telefone.getTelefone());
        try {
            System.out.printf("\nInforme o e-mail: ");
            this.cliente.setEmail(faker.gerarEmail());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        

        // Pessoa Jurídica
        }try {
            System.out.println("Informe o Cnpj:");
            this.cliente.setCnpj(faker.gerarCNPJ());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nInforme a inscrção estadual: ");
            this.cliente.setInscricao_estadual(faker.gerarInscricaoEstadual());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }try {
            System.out.printf("\nInforme um contato: ");
            this.cliente.setContato(faker.gerarNome());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }

        //Cliente
        try {
            System.out.printf("\nInforme o limite de crédito do cliente: ");
            this.cliente.setLimite_credito(faker.gerarValor());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        System.out.printf("\nENDEREÇO DE COBRANÇA");
        this.endereco.entrar();
        this.cliente.setEndereco_cobranca(this.endereco.getEndereco());
    }
    
    public void imprimir() {
        // Pessoa 
        System.out.printf("\nID: %d", this.cliente.getId());
        System.out.printf("\nNome: %s", this.cliente.getNome());
        this.telefone = new TelefoneView(this.cliente.getTelefoneModel());
        this.telefone.imprimir();
        this.endereco = new EnderecoView(this.cliente.getEnderecoModel());
        this.endereco.imprimir();
        System.out.printf("\nEmail: %s", this.cliente.getEmail());

        // Pessoa Jurírica 
        System.out.printf("\nCNPJ: %s", this.cliente.getCnpj());
        System.out.printf("\nIncricao Estadual : %s", this.cliente.getInscricao_estadual());
        System.out.printf("\nContato: %s", this.cliente.getContato());

        // Cliente
        System.out.printf("\nLimite de Credito: %.2f", this.cliente.getLimite_credito());
        this.endereco = new EnderecoView(this.cliente.getEndereco_cobranca());
        this.endereco.imprimir();
    }
}