package view;

import models.PagarModel;

public class PagarView extends FinanceiroView {

    PagarModel pagar = new PagarModel();
    FornecedorView fornecedor = new FornecedorView();

    public PagarView() {}

    public PagarView(PagarModel pagar) {
        this.pagar = pagar;
    }

    public PagarModel getPagar() {
        return pagar;
    }

    @Override
    public void entrar() {
        System.out.printf("\nREGISTRO DE PAGAMENTOS");
        super.entrar();
        while(true){
            try {
                System.out.printf("\nInforme o ID do fornecedor: ");
                pagar.setFornecedor(faker.gerarId());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        while(true){
            try {
                System.out.printf("\nInforme o código de barras");
                pagar.setBoleto(faker.gerarBoleto());
                break;
            } catch (Exception e) {
                // TODO: handle exception
            }
        } 
    }

    @Override
    public void imprimir() {
        super.imprimir();        
        System.out.printf("\n\n=== Dados do fornecedor ===");
        this.fornecedor.imprimir();
        System.out.println("\nNúmero do Boleto: " + pagar.getBoleto());
    }
}
