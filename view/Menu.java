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
    FluxoCaixaView fluxoCaixaView;

    Scanner leia = new Scanner(System.in);

    public Menu() {
        menuPrincupal();
    }

    public void menuPrincupal() {
        String subMenu;
        String cnpj;
        int id;
        int posicao;
        int numero;
        Double valor;

        System.out.printf(
                "1 - Cadastro de Funcionarios\n2 - Cadastro de Clientes\n3 - Cadastro de Fornecedores\n4 - Contas a receber\n5 - Contas a pagar\n6 - Fluxo de Caixa\n7 - Sair");
        int opcao = leia.nextInt();
        switch (opcao) {
            case 1:
                System.out.printf(
                        "a. Incluir\nb. Alterar pelo ID\nc. Consultar pela posição na Lista\nd. Consultar pelo CPF\ne. Consultar pelo Nome\nf. Excluir pelo ID");
                subMenu = leia.next();
                switch (subMenu) {
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
                        this.funcionarioView = new FuncionarioView(
                                this.funcionarioController.consultarPosicao(posicao));
                        this.funcionarioView.imprimir();
                        break;
                    case "d":
                        System.out.printf("Informe o CPF");
                        String cpf = leia.next();
                        this.funcionarioView = new FuncionarioView(this.funcionarioController.consultarCPF(cpf));
                        this.funcionarioView.imprimir();
                        break;
                    case "e":
                        System.out.printf("Informe o nome");
                        String nome = leia.next();
                        this.funcionarioView = new FuncionarioView(this.funcionarioController.consutarNome(nome));
                        this.funcionarioView.imprimir();
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
                System.out.printf(
                        "a. Incluir\nb. Alterar pelo ID\nc. Consultar pela posição na Lista\nd. Consultar pelo ID\ne. Consultar pelo CNPJ\nf. Excluir pelo ID\n");
                subMenu = leia.next();
                switch (subMenu) {
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
                        this.clienteView = new ClienteView(this.clienteController.consultarPosicao(posicao));
                        this.clienteView.imprimir();
                        break;
                    case "d":
                        System.out.printf("Informe o ID");
                        id = leia.nextInt();
                        this.clienteView = new ClienteView(this.clienteController.consutarId(id));
                        this.clienteView.imprimir();
                        break;
                    case "e":
                        System.out.printf("Informe o CNPJ");
                        cnpj = leia.next();
                        this.clienteView = new ClienteView(this.clienteController.consultarCNPJ(cnpj));
                        this.clienteView.imprimir();
                        break;
                    case "f":
                        System.out.printf("Informe o ID ");
                        id = leia.nextInt();
                        this.clienteController.excluir(id);
                        break;
                }
                break;
            case 3:
                System.out.printf(
                        "a. Incluir\nb. Alterar pelo ID\nc. Consultar pela posição na Lista\nd. Consultar pelo ID\ne. Consultar pelo CNPJ\nf. Excluir pelo ID");
                subMenu = leia.next();
                switch (subMenu) {
                    case "a":
                        this.fornecedorView.entrar();
                        this.fornecedorController.incluir(this.fornecedorView.getFornecedor());
                        break;
                    case "b":
                        System.out.printf("Informe o ID: ");
                        id = leia.nextInt();
                        this.fornecedorView.entrar();
                        this.fornecedorController.alterar(id, this.fornecedorView.getFornecedor());
                        break;
                    case "c":
                        System.out.printf("Informe a posição do fornecedor na lista: ");
                        posicao = leia.nextInt();
                        this.fornecedorView = new FornecedorView(this.fornecedorController.consultarPosicao(posicao));
                        this.fornecedorView.imprimir();
                        break;
                    case "d":
                        System.out.printf("Informe o ID: ");
                        id = leia.nextInt();
                        this.fornecedorView = new FornecedorView(this.fornecedorController.consutarNome(id));
                        this.fornecedorView.imprimir();
                        break;
                    case "e":
                        System.out.printf("Informe o CNPJ do fornecedor: ");
                        cnpj = leia.next();
                        this.fornecedorView = new FornecedorView(this.fornecedorController.consultarCNPJ(cnpj));
                        this.fornecedorView.imprimir();
                        break;
                    case "f":
                        System.out.printf("Informe o ID do cliente que deseja excluir: ");
                        id = leia.nextInt();
                        this.fornecedorController.excluir(id);
                        break;
                    default:
                        System.out.printf("Opção inválida");
                }
                break;
            case 4:
                System.out.printf(
                        "a. Incluir\nb. Alterar pelo número\nc. Consultar pelo Nome do Cliente\nd. Consultar pelo Número\ne. Consultar pelo Valor\nf. Consultar pela Nota Fiscal\ng. Excluir pelo ID");
                subMenu = leia.next();
                switch (subMenu) {
                    case "a":
                        this.receberView.entrar();
                        this.receberController.incluir(this.receberView.getReceber());
                        break;
                    case "b":
                        System.out.printf("Informe o número: ");
                        numero = leia.nextInt();
                        this.receberView.entrar();
                        this.receberController.alterarPeloNumero(numero);
                        break;
                    case "c":
                        System.out.printf("Informe o nome do cliente: ");
                        String nome = leia.next();
                        id = this.clienteController.consutarNome(nome).getId();
                        this.receberView = new ReceberView(this.receberController.consultarPeloCliente(id));
                        this.receberView.imprimir();
                        break;
                    case "d":
                        System.out.printf("Informe o número: ");
                        numero = leia.nextInt();
                        this.receberView = new ReceberView(this.receberController.consultarPeloNumero(numero));
                        this.receberView.imprimir();
                        break;
                    case "e":
                        System.out.printf("Informe o valor: ");
                        valor = leia.nextDouble();
                        this.receberView = new ReceberView(this.receberController.ConsultarPeloValor(valor));
                        this.receberView.imprimir();
                        break;
                    case "f":
                        System.out.printf("Informe a NF: ");
                        String nota_fiscal = leia.next();
                        this.receberView = new ReceberView(this.receberController.consultarPelaNF(nota_fiscal));
                        this.receberView.imprimir();
                    case "g":
                        System.out.printf("Informe o ID: ");
                        id = leia.nextInt();
                        this.receberController.excluirPeloId(id);
                        break;
                    default:
                        System.out.printf("Opção Inválida");
                }
                break;
            case 5:
                System.out.printf(
                        "a. Incluir\nb. Alterar pelo número\nc. Consultar pelo CNPJ do Fornecedor\nd. Consultar pelo Número\ne. Consultar pelo Valor\nf. Consultar pelo Boleto\ng. Excluir pelo ID");
                subMenu = leia.next();
                switch(subMenu) {
                    case "a":
                        this.pagarView.entrar();
                        this.pagarController.incluir(this.pagarView.getPagar());
                        break;
                    case "b":
                        System.out.printf("Informe o numero: ");
                        numero = leia.nextInt();
                        this.pagarView.entrar();
                        this.pagarController.alterarPeloNumero(numero, this.pagarView.getPagar());
                        break;
                    case "c": 
                        System.out.printf("Informe o CNPJ");
                        cnpj = leia.next();
                        id = this.fornecedorController.consultarCNPJ(cnpj).getId();
                        this.pagarView = new PagarView(this.pagarController.consultarPeloFornecedor(id));
                        this.pagarView.imprimir();;
                        break;
                    case "d":
                        System.out.printf("Informe o numero");
                        numero = leia.nextInt();
                        this.pagarView = new PagarView(this.pagarController.consultarPeloNumero(numero));
                        this.pagarView.imprimir();
                        break;
                    case "e": 
                        System.out.printf("Informe o valor");
                        valor = leia.nextDouble();
                        this.pagarView = new PagarView(this.pagarController.ConsultarPeloValor(valor));
                        this.pagarView.imprimir();
                        break;
                    case "f":
                        System.out.printf("Informe o boleto ");
                        String boleto = leia.next();
                        this.pagarView = new PagarView(this.pagarController.consultarPeloBoleto(boleto));
                        this.pagarView.imprimir();
                        break;
                    case "g":
                        System.out.printf("Informe o ID");
                        id = leia.nextInt();
                        this.pagarController.excluir(id);
                        break;
                    default: 
                        System.out.printf("Opção inválida");
                }
                break;
            case 6:
                this.fluxoCaixaView = new FluxoCaixaView(this.receberController.getReceitas(), this.pagarController.getPagamentos());
                break;
            case 7:
                break;
            default:
                System.out.printf("Opção inválida");
                break;
        }
    }
}
