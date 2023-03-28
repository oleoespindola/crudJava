import java.util.Scanner;

public class Menu {

    // Atributos
    private boolean continuar_executando = true; // mantém o menu ativo
    private int opcao_menu; // Opção do menu principal
    private int opcao_submenu; // Opção do submenu
    // Obejtos do menu
    Funcionario funcionario;
    Fornecedor fornecedor;
    Cliente cliente;
    Receber receber;
    Pagar pagar;
    Scanner leia;

    // construtor
    public Menu() {
        setContinuar_executando(true);
        Scanner leia = new Scanner(System.in);
        setLeia(leia);
    }

    // Encapsulamento
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

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setReceber(Receber receber) {
        this.receber = receber;
    }

    public Receber getReceber() {
        return receber;
    }

    public void setPagar(Pagar pagar) {
        this.pagar = pagar;
    }

    public Pagar getPagar() {
        return pagar;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public Scanner getLeia() {
        return leia;
    }

    // Métodos
    private void menu() {
        System.out.printf(
                "\nEscolha uma das opcoes abaixo:\n1 - Funcionario\n2 - Forcenedor\n3 - Cliente\n4 - Valor a receber\n5 - Valor a pagar\n6 - Sair\n");
        setOpcao_menu(leia.nextInt());
    }

    private void submenu() {
        System.out.printf("\nEscolha uma das opcoes:\n1 - Cadastrar\n2 - Ler\n3 - Excluir\n4 - Voltar\n");
        setOpcao_submenu(leia.nextInt());
    }

    public void executar() {

        while (getContinuar_executando() == true) {

            menu();
            switch (getOpcao_menu()) {
                case 1:
                    submenu();
                    switch (getOpcao_submenu()) {
                        case 1:
                            Funcionario capturarFuncionario = new Funcionario();
                            setFuncionario(capturarFuncionario);
                            break;
                        case 2:
                            Funcionario funcionario = getFuncionario();
                            funcionario.imprimir();
                            break;
                        case 3:
                            setFuncionario(null);
                            break;
                        case 4:
                            menu();
                            break;
                        default:
                            System.out.printf("\nOpcao invalida ");
                            menu();
                            break;
                    }
                    break;
                case 2:
                    submenu();
                    switch (getOpcao_submenu()) {
                        case 1:
                            Fornecedor capturaFornecedor = new Fornecedor();
                            setFornecedor(capturaFornecedor);
                            break;
                        case 2:
                            Fornecedor fornecedor = getFornecedor();
                            fornecedor.imprimir();
                            break;
                        case 3:
                            setFornecedor(null);
                            break;
                        case 4:
                            menu();
                            break;
                        default:
                            System.out.printf("\nOpcao invalida ");
                            menu();
                            break;
                    }
                    break;
                case 3:
                    submenu();
                    switch (getOpcao_submenu()) {
                        case 1:
                            Cliente capturarCliente = new Cliente();
                            setCliente(capturarCliente);
                            submenu();
                        case 2:
                            Cliente cliente = getCliente();
                            cliente.imprimir();
                            submenu();
                        case 3:
                            setCliente(null);
                            submenu();
                        case 4:
                            menu();
                            break;
                        default:
                            System.out.printf("\nOpcao invalida ");
                            menu();
                            break;
                    }
                    break;
                case 4:
                    submenu();
                    switch (getOpcao_submenu()) {
                        case 1:
                            Receber capturarReceber = new Receber();
                            setReceber(capturarReceber);
                            submenu();
                        case 2:
                            Receber receber = getReceber();
                            receber.imprimir();
                            submenu();
                        case 3:
                            setReceber(null);
                            submenu();
                        case 4:
                            menu();
                            break;
                        default:
                            System.out.printf("\nOpcao invalida ");
                            menu();
                            break;
                    }
                    break;
                case 5:
                    submenu();
                    switch (getOpcao_submenu()) {
                        case 1:
                            Pagar capturarPagar = new Pagar();
                            setPagar(capturarPagar);
                            submenu();
                        case 2:
                            Pagar pagar = getPagar();
                            pagar.imprimir();
                            submenu();
                        case 3:
                            setPagar(null);
                            submenu();
                        case 4:
                            menu();
                            break;
                        default:
                            System.out.printf("\nOpcao invalida ");
                            menu();
                            break;
                    }
                    break;
                case 6:
                    setContinuar_executando(false);
                    break;

                default:
                    System.out.printf("\nOpcao Invalida");
                    menu();
                    break;
            }
            break;
        }
    }
}
