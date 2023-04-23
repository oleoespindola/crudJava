package view;

import interfaces.InterfaceView;
import models.*;

public abstract class PessoaView implements InterfaceView{

    PessoaModel pessoa;
    TelefoneView telefone;
    EnderecoView endereco;

    @Override
    public void entrar() {
        System.out.printf("Informe o ID: ");
        pessoa.setId(faker.gerarId());
        System.out.printf("Infome  o nome do Funcionário: ");
        pessoa.setNome(faker.gerarNome());
        System.out.printf("CADASTRO DE ENDEREÇO");
        this.endereco = new EnderecoView();
        pessoa.setEnderecoModel(this.endereco.getEndereco());
        System.out.printf("CADASTRO DO TELEFONE");
        this.telefone = new TelefoneView();
        pessoa.setTelefoneModel(this.telefone.getTelefone());
        System.out.printf("Informe o e-mail: ");
        pessoa.setEmail(faker.gerarEmail());       
    }

    @Override
    public void imprimir() {

        System.out.println("ID: "+ pessoa.getId());
        System.out.println("Nome: "+ pessoa.getNome());
        this.telefone = new TelefoneView(this.pessoa.getTelefoneModel());
        this.telefone.imprimir();
        this.endereco = new EnderecoView(this.pessoa.getEnderecoModel());
        this.endereco.imprimir();
        System.out.println("Email: "+ pessoa.getEmail());
    } 
}
