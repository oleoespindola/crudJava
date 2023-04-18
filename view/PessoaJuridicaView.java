package view;

import models.PessoaJuridicaModel;

public abstract class PessoaJuridicaView extends PessoaView {

    PessoaJuridicaModel pessoa;

    @Override
    public void entrar() {

        super.entrar();

        System.out.printf("Infome o CNPJ: ");
        pessoa.setCnpj(faker.gerarCNPJ());
        System.out.printf("Informe a inscrção estadual: ");
        pessoa.setInscricao_estadual(faker.gerarInscricaoEstadual());
        System.out.printf("Informe um contato: ");
        pessoa.setContato(faker.gerarNome());
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        super.imprimir();
    }
    
}
