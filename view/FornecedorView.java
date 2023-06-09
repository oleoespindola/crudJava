package view;

import interfaces.InterfaceView;
import models.FornecedorModel;

public class FornecedorView implements InterfaceView {

    // Atributos
    FornecedorModel fornecedor = new FornecedorModel();
    EnderecoView endereco = new EnderecoView();
    TelefoneView telefone = new TelefoneView();

    // Construtores
    public FornecedorView() {}

    public FornecedorView(FornecedorModel fornecedor) {
        this.fornecedor = fornecedor;
    }

    // Método 
    public FornecedorModel getFornecedor() {
        return this.fornecedor;
    }
    
    // Sobrecarga
    @Override
    public void entrar() {
        // Pessoa
        try {
            System.out.printf("\nInforme o ID: ");
            this.fornecedor.setId(faker.gerarId());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nNome: ");
            this.fornecedor.setNome(faker.gerarNome());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        System.out.printf("\nENDEREÇO");
        this.endereco.entrar();
        this.fornecedor.setEnderecoModel(this.endereco.getEndereco());
        System.out.printf("\nTELEFONE");
        this.telefone = new TelefoneView();
        this.telefone.entrar();
        this.fornecedor.setTelefoneModel(this.telefone.getTelefone());
        try {
            System.out.printf("\nInforme o e-mail: ");
            this.fornecedor.setEmail(faker.gerarEmail());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }

        // Pessoa Jurídica
        try {
            System.out.printf("\nInforme o Cnpj: ");
            this.fornecedor.setCnpj(faker.gerarCNPJ());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nInforme a inscrção estadual: ");
            this.fornecedor.setInscricao_estadual(faker.gerarInscricaoEstadual());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nInforme um contato: ");
        this.fornecedor.setContato(faker.gerarNome());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }

        // Fornecedor
        try {
            System.out.printf("\nLimite de compra: ");
            this.fornecedor.setLimite_compra(faker.gerarValor());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nData do cadastro: ");
            this.fornecedor.setData_cadastro(faker.gerarData());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nSite: ");
            this.fornecedor.setSite(faker.gerarSite());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }  
    }

    @Override
    public void imprimir() {
        // Pessoa
        System.out.printf("\nID: %d", this.fornecedor.getId());
        System.out.printf("\nNome: %s", this.fornecedor.getNome());
        this.telefone = new TelefoneView(this.fornecedor.getTelefoneModel());
        this.telefone.imprimir();
        this.endereco = new EnderecoView(this.fornecedor.getEnderecoModel());
        this.endereco.imprimir();
        System.out.printf("\nEmail: %s", this.fornecedor.getEmail());

        // Pessoa Jurírica 
        System.out.printf("\nCNPJ: %s", this.fornecedor.getCnpj());
        System.out.printf("\nIncricao Estadual : %s", this.fornecedor.getInscricao_estadual());
        System.out.printf("\nContato: %s", this.fornecedor.getContato());

        // Fornecedor
        System.out.printf("\nLimite de Compra: ", this.fornecedor.getLimite_compra());
        System.out.printf("\nData de Cadastro: ", this.fornecedor.getData_cadastro());
        System.out.printf("\nSite: ", this.fornecedor.getSite());
    }
}