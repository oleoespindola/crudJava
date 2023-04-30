package view;

import models.PessoaFisicaModel;

public abstract class PessoaFisicaView extends PessoaView {

    PessoaFisicaModel pessoa = new PessoaFisicaModel() {
        
    };

    public void entrar() {

        super.entrar();

        System.out.printf("\nInforme o CPF: ");
        pessoa.setCpf(faker.gerarCPF());
        System.out.printf("\nInforme o RG: ");
        pessoa.setRg(faker.gerarRg());
        System.out.printf("\nInforme o orgão emissor: ");
        pessoa.setEmissor(faker.gerarEmissor());
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("\nCPF: "+ pessoa.getCpf());
        System.out.println("\nRG: "+ pessoa.getRg());
        System.out.println("\nOrgão Expedidor: "+ pessoa.getEmissor());
    } 
}
