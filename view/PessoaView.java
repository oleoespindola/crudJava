package view;

import model.*;
import model.Endereco;

public abstract class PessoaView {

    PessoaModel pessoa = new PessoaModel() {
        
    };

        // Sobrecarga
        @Override
        public void entrar() {
    
            System.out.printf("\nInforme o ID: ");
            pessoa.setId(leia.next());
    
            System.out.printf("\nInforme o nome: ");
            setNome(leia.next());
    
            System.out.printf("\n=== Cadastro de nedereço ===");
            Endereco capturarEndereco = new Endereco();
            setEndereco(capturarEndereco);
    
            System.out.printf("\n=== Cadastro de Telefone ===");
            Telefone capturarTelefone = new Telefone();
            setTelefone(capturarTelefone);
    
            System.out.printf("\nInforme o email:");
            setEmail(leia.next());
    
        }

        @Override
        public void imprimir() {
            System.out.printf("\nO ID da pessoa e: %d", getId());
            System.out.printf("\nO nome da pessoa e: %s", getNome());
            telefone.imprimir();
            endereco.imprimir();
            System.out.printf("\nO email da pessoa e: %s", getEmail());
        }

}
