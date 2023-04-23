package view;

import java.util.Scanner;

import controllers.*;

public class Menu {

    ClienteController clienteController;
    FornecedorController fornecedorController;
    FuncionarioController funcionarioController;
    ReceberController receberController;
    PagarController pagarController;

    ClienteView clienteView;
    FornecedorView fornecedorView;
    FuncionarioView funcionarioView;
    ReceberView receberView;
    PagarView pagarView;

    Scanner leia = new Scanner(System.in);

    public Menu () {
        menuPrincupal();
    }

    public void menuPrincupal() {
        String subMenu;
        int id;
        int posicao;

        System.out.printf("1 - Cadastro de Funcionarios\n2 - Cadastro de Clientes\n3 - Cadastro de Fornecedores\n4 - Contas a receber\n5 - Contas a pagar\n6 - Fluxo de Caixa\n7 - Sair");
        int opcao = leia.nextInt();
        switch(opcao) {
            case 1:
                System.out.printf("a. Incluir\nb. Alterar pelo ID\nc. Consultar pela posição na Lista\nd. Consultar pelo CPF\ne. Consultar pelo Nome\nf. Excluir pelo ID");
                subMenu = leia.next();
                switch(subMenu) {
                    case "a":
                        this.funcionarioView.entrar();
                        this.funcionarioController.incluir(this.funcionarioView.getFuncionario());
                        break;
                    case "b":
                        System.out.printf("Informe o ID");
                        id = leia.nextInt();
                        this.funcionarioView.entrar();
                        this.funcionarioController.alterar(id, this.funcionarioView.getFuncionario());
                        break;
                    case "c":
                        System.out.printf("Informe a Posição");
                        posicao = leia.nextInt();
                        this.funcionarioController.consultarPosicao(posicao);
                        break;
                    case "d":
                        System.out.printf("Informe o CPF");
                        String cpf = leia.next();
                        this.funcionarioController.consultarCPF(cpf);
                        break;
                    case "e":
                        System.out.printf("Informe o nome");
                        String nome = leia.next();
                        this.funcionarioController.consutarNome(nome);
                        break;
                    case "f": 
                        System.out.printf("Informe o ID");
                        id = leia.nextInt();
                        this.funcionarioController.excluir(id);
                        break;
                    default:
                        System.out.printf("Opção inválida");
                        break;
                }
                break;
            case 2:
                System.out.printf("a. Incluir\nb. Alterar pelo ID\nc. Consultar pela posição na Lista\nd. Consultar pelo ID\ne. Consultar pelo CNPJ\nf. Excluir pelo ID\n");
                subMenu = leia.next();
                switch(subMenu){
                    case "a":
                        this.clienteView.entrar();
                        this.clienteController.incluir(this.clienteView.getCliente());
                        break;
                    case "b":
                        System.out.printf("Informe o ID");
                        id = leia.nextInt();
                        this.clienteView.entrar();
                        this.clienteController.alterar(id, this.clienteView.getCliente());
                        break;
                    case "c":
                        System.out.printf("Informe a posicao na lista");
                        posicao = leia.nextInt();                 
                        this.clienteController.consultarPosicao(posicao);
                    case "d":
                        System.out.printf("Informe o ID");
                        id = leia.nextInt();
                        this.clienteController.consutarId(id);
                        break;
                    case "e":
                        System.out.printf("Informe o CNPJ");
                        String cnpj = leia.next();
                        this.clienteController.consultarCNPJ(cnpj);
                        break;
                    case "f": 
                        System.out.printf("Informe o ID ");
                        id = leia.nextInt();
                        this.clienteController.excluir(id);
                        break;
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                break;
        }
    }
}
