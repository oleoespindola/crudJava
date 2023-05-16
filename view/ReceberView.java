package view;

// Bibliotecas do projeto
import interfaces.InterfaceView;
import models.*;

public class ReceberView implements InterfaceView {

    ReceberModel receber = new ReceberModel();
    ClienteView cliente = new ClienteView();

    public ReceberView() {}

    public ReceberView(ReceberModel receber /*ClienteModel cliente*/) {
        this.receber = receber;
        // this.cliente = new ClienteView(cliente);
    }

    public ReceberModel getReceber() {
        return receber;
    }

    public void entrar() {
        // Financeiro
        try {
            System.out.printf("\nInforme o ID da transação: ");
            this.receber.setId(faker.gerarId());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nInforme o número da transação: ");
            this.receber.setNumero(faker.gerarId());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nData da emissão: ");
            this.receber.setEmissao(faker.gerarData());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nData de vencimento: ");
            this.receber.setVencimento(faker.gerarData());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nData do pagamento: ");
            this.receber.setPagamento(faker.gerarData());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nValor: ");
            this.receber.setValor(faker.gerarValor());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nJuros: ");
            this.receber.setJuros(faker.gerarEncargos());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nMulta");
            this.receber.setMulta(faker.gerarEncargos());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nDesconto: ");
            this.receber.setDesconto(faker.gerarEncargos());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }     
        
        // Receitas try {
        try {  
            System.out.printf("\nInforme o número da NF: ");
            receber.setNota_fiscal(faker.gerarNf());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nInforme o ID do cliente: ");
            receber.setCliente(faker.gerarId()); // **IMPORTANTE** Registrar somente ID válidos
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
    }

    public void imprimir() {
        // Financeiro
        System.out.printf("\nID: %d", this.receber.getId());
        System.out.printf("\nNúmero: %d", this.receber.getNumero());
        System.out.printf("\nEmissao: ", this.receber.getEmissao());
        System.out.printf("\nDeta de Vencimento: ", this.receber.getVencimento());
        System.out.printf("\naPgamento: ", this.receber.getPagamento());
        System.out.printf("\nValor: ", this.receber.getValor());
        System.out.printf("\nJuros: ", this.receber.getJuros());
        System.out.printf("\nMulta: ", this.receber.getMulta());
        System.out.printf("\nDesconto: ", this.receber.getDesconto());
        System.out.printf("\nTOTAL = %2.f", this.receber.getTotal());

        // Receber 
        // System.out.printf("\n\n=== CLIENTE ===");
        // this.cliente.imprimir();
        System.out.printf("\n\nO numero da nota é: %s", receber.getNota_fiscal());
    }
}
