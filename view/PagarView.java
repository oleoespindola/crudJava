package view;

import models.*;

public class PagarView extends FinanceiroView {

    PagarModel pagar = new PagarModel();
    FornecedorView fornecedor = new FornecedorView();

    public PagarView() {
    }

    public PagarView(PagarModel pagar /*FornecedorModel fornecedor*/) {
        this.pagar = pagar;
        // this.fornecedor = new FornecedorView(fornecedor);
    }

    public PagarModel getPagar() {
        return pagar;
    }

    public void entrar() {
        // Financeiro
        try {
            System.out.printf("\nInforme o ID da transação: ");
        this.pagar.setId(faker.gerarId());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nInforme o número da transação: ");
        this.pagar.setNumero(faker.gerarId());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nData da emissão: ");
        this.pagar.setEmissao(faker.gerarData());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nData de vencimento: ");
        this.pagar.setVencimento(faker.gerarData());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nData do pagamento: ");
        this.pagar.setPagamento(faker.gerarData());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nValor: ");
        this.pagar.setValor(faker.gerarValor());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nJuros: ");
        this.pagar.setJuros(faker.gerarEncargos());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nMulta");
        this.pagar.setMulta(faker.gerarEncargos());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nDesconto: ");
        this.pagar.setDesconto(faker.gerarEncargos());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        } 

        // Pagar
        try {
            System.out.printf("\nInforme o ID do fornecedor: "); // **IMPORTANTE** Registrar somente ID válidos
        pagar.setFornecedor(faker.gerarId());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
        try {
            System.out.printf("\nInforme o código de barras");
        pagar.setBoleto(faker.gerarBoleto());
            break;
        } catch (Exception e) {
            System.out.print("erro");
            leia.next();
        }
    }

    public void imprimir() {
        // Financeiro
        System.out.printf("\nID: %d", this.pagar.getId());
        System.out.printf("\nNúmero: %d", this.pagar.getNumero());
        System.out.printf("\nEmissao: ", this.pagar.getEmissao());
        System.out.printf("\nDeta de Vencimento: ", this.pagar.getVencimento());
        System.out.printf("\naPgamento: ", this.pagar.getPagamento());
        System.out.printf("\nValor: ", this.pagar.getValor());
        System.out.printf("\nJuros: ", this.pagar.getJuros());
        System.out.printf("\nMulta: ", this.pagar.getMulta());
        System.out.printf("\nDesconto: ", this.pagar.getDesconto());
        System.out.printf("\nTOTAL = %2.f", this.pagar.getTotal());

        super.imprimir();
        // System.out.printf("\n\n=== FORNECEDOR ===");
        // this.fornecedor.imprimir();
        System.out.println("\nNúmero do Boleto: " + pagar.getBoleto());
    }
}
