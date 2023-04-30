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
        System.out.printf("\nInforme o ID da transação: ");
        this.pagar.setId(faker.gerarId());
        System.out.printf("\nInforme o número da transação: ");
        this.pagar.setNumero(faker.gerarId());
        System.out.printf("\nData da emissão: ");
        this.pagar.setEmissao(faker.gerarData());
        System.out.printf("\nData de vencimento: ");
        this.pagar.setVencimento(faker.gerarData());
        System.out.printf("\nData do pagamento: ");
        this.pagar.setPagamento(faker.gerarData());
        System.out.printf("\nValor: ");
        this.pagar.setValor(faker.gerarValor());
        System.out.printf("\nJuros: ");
        this.pagar.setJuros(faker.gerarEncargos());
        System.out.printf("\nMulta");
        this.pagar.setMulta(faker.gerarEncargos());
        System.out.printf("\nDesconto: ");
        this.pagar.setDesconto(faker.gerarEncargos());

        // Pagar
        System.out.printf("\nInforme o ID do fornecedor: ");
        pagar.setFornecedor(faker.gerarId()); // **IMPORTANTE** Registrar somente ID válidos
        System.out.printf("\nInforme o código de barras");
        pagar.setBoleto(faker.gerarBoleto());
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
