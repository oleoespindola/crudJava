package view;

import interfaces.InterfaceCadastro;
import models.EnderecoModel;
import models.FuncionarioModel;

public class FuncionarioView implements InterfaceCadastro {

    FuncionarioModel funcionario = new FuncionarioModel();

    public void faker() {
        // TODO Auto-generated method stub

    }

    public void entrar() {
        System.out.printf("CADASTRO DE FUNCIONÁRIOS\nI - Informe o ID: ");
        funcionario.setId(leia.nextInt());
        System.out.printf("Infome  o nome do Funcionário: ");
        funcionario.setNome(leia.next());
        System.out.printf("Informe o endereço: ");
        funcionario.setEndereco(new EnderecoModel());
        System.out.printf("Informe o Telefone: ");
        System.out.printf("Informe o e-mail: ");
        System.out.printf("Informe o CPF: ");
        System.out.printf("Informe o RG: ");
        System.out.printf("Informe o orgão emissor: ");
        System.out.printf("Data de admissão: ");
        System.out.printf("Data de demissão (se houver): ");
        System.out.printf("CTPS: ");
        System.out.printf("Informe o salário: ");
    }

    public void imprimir() {
        // TODO Auto-generated method stub

    }

}
