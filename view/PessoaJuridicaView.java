package view;

import models.PessoaJuridicaModel;

public abstract class PessoaJuridicaView extends PessoaView {

    PessoaJuridicaModel pessoa = new PessoaJuridicaModel() {
        
    };

    @Override
    public void entrar() {

        super.entrar();

        System.out.printf("\nInfome o CNPJ: ");
        pessoa.setCnpj(faker.gerarCNPJ());
        System.out.printf("\nInforme a inscrção estadual: ");
        pessoa.setInscricao_estadual(faker.gerarInscricaoEstadual());
        System.out.printf("\nInforme um contato: ");
        pessoa.setContato(faker.gerarNome());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("\nCNPJ: "+ pessoa.getCnpj());
        System.out.println("\nIncricao Estadual : "+ pessoa.getInscricao_estadual());
        System.out.println("\nContato: "+ pessoa.getContato());
    } 
}
