package view;

import interfaces.InterfaceCadastro;
import models.*;

public abstract class PessoaView implements InterfaceCadastro{

    PessoaModel pessoa;

    @Override
    public void entrar() {
        System.out.printf("Informe o ID: ");
        pessoa.setId(leia.nextInt());
        System.out.printf("Infome  o nome do Funcionário: ");
        pessoa.setNome(leia.next());
        System.out.printf("CADASTRO DE ENDEREÇO");
        pessoa.setEnderecoModel(new EnderecoView().getEndereco());
        System.out.printf("CADASTRO DO TELEFONE");
        pessoa.setTelefoneModel(new TelefoneView().getTelefone());
        System.out.printf("Informe o e-mail: ");
        pessoa.setEmail(leia.next());       
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        
    }
    
}
