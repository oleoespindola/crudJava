package view;

import models.PessoaFisicaModel;

public abstract class PessoaFisicaView extends PessoaView {

    // Atributos
    PessoaFisicaModel pessoa = new PessoaFisicaModel();

    // Sobrecarga
    @Override
    public void entrar() {
        super.entrar();
        while(true){
            try {
                System.out.printf("\nInforme o CPF: ");
                pessoa.setCpf(faker.gerarCPF());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nInforme o RG: ");
                pessoa.setRg(faker.gerarRg());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nInforme o orgão emissor: ");
                pessoa.setEmissor(faker.gerarEmissor());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }    
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("\nCPF: "+ pessoa.getCpf());
        System.out.println("\nRG: "+ pessoa.getRg());
        System.out.println("\nOrgão Expedidor: "+ pessoa.getEmissor());
    } 
}
