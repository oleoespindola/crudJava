package view;

import interfaces.InterfaceView;
import models.*;

public abstract class PessoaView implements InterfaceView{

    PessoaModel pessoa = new PessoaModel() {
        
    };
    TelefoneView telefone = new TelefoneView();
    EnderecoView endereco = new EnderecoView();

    @Override
    public void entrar() {
        System.out.printf("\nInforme o ID: ");
        pessoa.setId(faker.gerarId());
        System.out.printf("\nInfome  o nome do Funcionário: ");
        pessoa.setNome(faker.gerarNome());
        System.out.printf("\nCADASTRO DE ENDEREÇO");
        this.endereco = new EnderecoView();
        pessoa.setEnderecoModel(this.endereco.getEndereco());
        System.out.printf("\nCADASTRO DO TELEFONE");
        this.telefone = new TelefoneView();
        pessoa.setTelefoneModel(this.telefone.getTelefone());
        System.out.printf("\nInforme o e-mail: ");
        pessoa.setEmail(faker.gerarEmail());       
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
