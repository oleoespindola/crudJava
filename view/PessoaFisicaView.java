package view;

import models.PessoaFisicaModel;

public abstract class PessoaFisicaView extends PessoaView {

    PessoaFisicaModel pessoa;

    @Override
    public void entrar() {

        super.entrar();

        System.out.printf("Informe o CPF: ");
        pessoa.setCpf(faker.gerarCPF());
        System.out.printf("Informe o RG: ");
        pessoa.setRg(faker.gerarRg());
        System.out.printf("Informe o orgão emissor: ");
        pessoa.setEmissor(faker.gerarEmissor());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("CPF: "+ pessoa.getCpf());
        System.out.println("RG: "+ pessoa.getRg());
        System.out.println("Orgão Expedidor: "+ pessoa.getEmissor());
    } 
}
