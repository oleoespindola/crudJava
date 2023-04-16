package view;

import models.PessoaFisicaModel;

public abstract class PessoaFisicaView extends PessoaView {

    PessoaFisicaModel pessoa;

    @Override
    public void entrar() {

        super.entrar();

        System.out.printf("Informe o CPF: ");
        pessoa.setCpf(leia.next());
        System.out.printf("Informe o RG: ");
        pessoa.setRg(leia.next());
        System.out.printf("Informe o orgão emissor: ");
        pessoa.setEmissor(leia.next());
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        super.imprimir();
    }
    
}
