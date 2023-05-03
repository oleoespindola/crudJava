package view;

import interfaces.InterfaceView;
import models.*;

public abstract class PessoaView implements InterfaceView{

    // Atributos
    PessoaModel pessoa = new PessoaModel();
    TelefoneView telefone;
    EnderecoView endereco;

    // Sobrecarga
    @Override
    public void entrar() {
        while(true){
            try {
                System.out.printf("\nInforme o ID: ");
                pessoa.setId(faker.gerarId());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nInfome  o nome do Funcionário: ");
                pessoa.setNome(faker.gerarNome());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nCADASTRO DE ENDEREÇO");
                this.endereco = new EnderecoView();
                this.endereco.entrar();
                pessoa.setEnderecoModel(this.endereco.getEndereco());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nCADASTRO DO TELEFONE");
                this.telefone = new TelefoneView();
                this.telefone.entrar();
                pessoa.setTelefoneModel(this.telefone.getTelefone());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nInforme o e-mail: ");
                pessoa.setEmail(faker.gerarEmail());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }          
    }

    @Override
    public void imprimir() {

        System.out.println("\nID: "+ pessoa.getId());
        System.out.println("\nNome: "+ pessoa.getNome());
        this.telefone = new TelefoneView(this.pessoa.getTelefoneModel());
        this.telefone.imprimir();
        this.endereco = new EnderecoView(this.pessoa.getEnderecoModel());
        this.endereco.imprimir();
        System.out.println("\nEmail: "+ pessoa.getEmail());
    } 
}
