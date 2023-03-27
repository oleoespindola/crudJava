import java.util.Scanner;

public class Menu {

    private boolean continuar_executando = true;
    private int opcao_menu;
    private int opcao_submenu;
    int id;

    Scanner leia = new Scanner(System.in);

    public void setContinuar_executando(boolean continuar_executando) {
        this.continuar_executando = continuar_executando;
    }

    public boolean getContinuar_executando() {
        return continuar_executando;
    }

    public void setOpcao_menu(int opcao_menu) {
        this.opcao_menu = opcao_menu;
    }

    public int getOpcao_menu() {
        return opcao_menu;
    }

    public void setOpcao_submenu(int opcao_submenu) {
        this.opcao_submenu = opcao_submenu;
    }
    
    public int getOpcao_submenu() {
        return opcao_submenu;
    }

    private void menu() {
        System.out.printf("\nEscolha uma das opcoes abaixo:\n1 - Funcionario\n2- Forcenedor\n3 - Cliente\n4- Valor a receber\n5 - Valor a pagar\n6 - Sair");
        setOpcao_menu(leia.nextInt());
    }

    private void submenu() {
        System.out.print("\nEscolha uma das opcoes:\n1- Cadastrar\n2 - Ler\n3 - Imprimir");
        setOpcao_submenu(leia.nextInt());
    }


    public void executar() {

        while(getContinuar_executando() == true) {

            menu();

            switch (getOpcao_menu()) {
                case 1:
                    Funcionario funcionario = new Funcionario();
                    submenu();
                    switch (getOpcao_submenu()) {
                        case 1:
                            funcionario.entrar();
                            break;
                        case 2:
                            funcionario.imprimir();
                            break;
                        case 3:
                            funcionario = null;
                        default:
                            System.out.printf("Opcao invalida ");
                            break;
                    }
                case 2:
                    Fornecedor fornecedor = new Fornecedor();
                    submenu();
                    switch (getOpcao_submenu()) {
                        case 1:
                            fornecedor.entrar();
                            break;
                        case 2:
                            fornecedor.imprimir();
                            break;
                        case 3:
                            fornecedor = null;
                        default:
                            System.out.printf("Opcao invalida ");
                            break;
                    }
                case 3:
                    Cliente cliente = new Cliente();
                    submenu();
                    switch (getOpcao_submenu()) {
                        case 1:
                            cliente.entrar();
                            break;
                        case 2:
                            cliente.imprimir();
                            break;
                        case 3:
                            cliente = null;
                        default:
                            System.out.printf("Opcao invalida ");
                            break;
                    }
                case 4:
                    Receber receber = new Receber();
                    submenu();
                    switch (getOpcao_submenu()) {
                        case 1:
                            receber.entrar();
                            break;
                        case 2:
                            receber.imprimir();
                            break;
                        case 3:
                            receber = null;
                        default:
                            System.out.printf("Opcao invalida ");
                            break;
                    }
                case 5:
                    Pagar pagar = new Pagar();
                    submenu();
                    switch (getOpcao_submenu()) {
                        case 1:
                            pagar.entrar();
                            break;
                        case 2:
                            pagar.imprimir();
                            break;
                        case 3:
                            pagar = null;
                        default:
                            System.out.printf("Opcao invalida ");
                            break;
                    }
                case 6:
                    setContinuar_executando(false);
                    break;
                default:
                    System.out.printf("Opcao Invalida");
                    break;
            }
                
                

        }

    }

}
