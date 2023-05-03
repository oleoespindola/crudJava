package view;

import models.PessoaJuridicaModel;

public abstract class PessoaJuridicaView extends PessoaView {

    // Atributos
    PessoaJuridicaModel pessoa = new PessoaJuridicaModel();

    // Sobrecarga
    @Override
    public void entrar() {
        super.entrar();
        while(true){
            try {
                System.out.printf("\nInfome o CNPJ: ");
                pessoa.setCnpj(faker.gerarCNPJ());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nInforme a inscrção estadual: ");
                pessoa.setInscricao_estadual(faker.gerarInscricaoEstadual());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nInforme um contato: ");
                pessoa.setContato(faker.gerarNome());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }  
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("\nCNPJ: "+ pessoa.getCnpj());
        System.out.println("\nIncricao Estadual : "+ pessoa.getInscricao_estadual());
        System.out.println("\nContato: "+ pessoa.getContato());
    } 
}
