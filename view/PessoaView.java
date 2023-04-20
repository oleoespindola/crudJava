package view;

import interfaces.InterfaceView;
import models.*;

public abstract class PessoaView implements InterfaceView{

    PessoaModel pessoa;

    @Override
    public void entrar() {
        System.out.printf("Informe o ID: ");
        pessoa.setId(faker.gerarId());
        System.out.printf("Infome  o nome do Funcionário: ");
        pessoa.setNome(faker.gerarNome());
        System.out.printf("CADASTRO DE ENDEREÇO");
        pessoa.setEnderecoModel(new EnderecoView().getEndereco());
        System.out.printf("CADASTRO DO TELEFONE");
        pessoa.setTelefoneModel(new TelefoneView().getTelefone());
        System.out.printf("Informe o e-mail: ");
        pessoa.setEmail(faker.gerarEmail());       
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        System.out.println("ID: "+ pessoa.getId());
        System.out.println("Nome: "+ pessoa.getNome());
        view.TelefoneView.imprimir();
        EnderecoView.imprimir();
        System.out.println("Email: "+ pessoa.getEmail());
    } 
}
