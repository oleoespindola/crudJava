package view;

import interfaces.InterfaceView;

import models.EnderecoModel;

public class EnderecoView implements InterfaceView{

    // Atributo 
    EnderecoModel endereco = new EnderecoModel();

    // Contrutor 
    public EnderecoView () {}

    public EnderecoView (EnderecoModel endereco) {
        this.endereco = endereco;
    }

    // Método 
    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void entrar() {
        try {
            System.out.printf("\nInforme o logradouro: ");
            endereco.setLogradouro(faker.gerarLogradouro());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nInforme o numero: ");
            endereco.setNumero(faker.gerarNumero());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nInforme o complemento (se houver): ");
            endereco.setComplemento(faker.gerarComplemento());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nInforme o bairro: ");
            endereco.setBairro(faker.gerarBairro());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nInforme a cidade: ");
            endereco.setCidade(faker.gerarCidade());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nInforme o estado: ");
            endereco.setEstado(faker.gerarEstado());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nInfoeme o CEP: ");
            endereco.setCep(faker.gerarCep());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
    }

    public void imprimir() {
        System.out.printf("\nLogradouro: %s", this.endereco.getLogradouro());
        System.out.printf("\nNúmero: %d", this.endereco.getNumero());
        System.out.printf("\nComplemento: %s", this.endereco.getComplemento());
        System.out.printf("\nBairro: %s", this.endereco.getBairro());
        System.out.printf("\nCidade: %s", this.endereco.getCidade());
        System.out.printf("\nEstado: %s", this.endereco.getEstado());
        System.out.printf("\nCEP: %d", this.endereco.getCep());
    }
}
