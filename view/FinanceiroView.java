package view;

import interfaces.InterfaceView;
import models.FinanceiroModel;

public abstract class FinanceiroView implements InterfaceView {

    // Atributo 
    FinanceiroModel financeiro = new FinanceiroModel();

    // Sobrecargas 
    @Override
    public void entrar() {
        System.out.printf("\nInforme o ID da transação: ");
        financeiro.setId(faker.gerarId());
        System.out.printf("\nInforme o número da transação: ");
        financeiro.setNumero(faker.gerarId());
        System.out.printf("\nData da emissão: ");
        financeiro.setEmissao(faker.gerarData());
        System.out.printf("\nData de vencimento: ");
        financeiro.setVencimento(faker.gerarData());
        System.out.printf("\nData do pagamento: ");
        financeiro.setPagamento(faker.gerarData());
        System.out.printf("\nValor: ");
        financeiro.setValor(faker.gerarValor());
        System.out.printf("\nJuros: ");
        financeiro.setJuros(faker.gerarValor()/10);
        System.out.printf("\nMulta");
        financeiro.setMulta(faker.gerarValor()/10);
        System.out.printf("\nDesconto: ");
        financeiro.setDesconto(faker.gerarValor()/80);
    }

    @Override
    public void imprimir() {
        System.out.println("\nID: "+ financeiro.getId());
        System.out.println("\nNúmero: "+ financeiro.getNumero());
        System.out.println("\nEmissao: "+ financeiro.getEmissao());
        System.out.println("\nDeta de Vencimento: "+ financeiro.getVencimento());
        System.out.println("\naPgamento: "+ financeiro.getPagamento());
        System.out.println("\nValor: "+ financeiro.getValor());
        System.out.println("\nJuros: "+ financeiro.getJuros());
        System.out.println("\nMulta: "+ financeiro.getMulta());
        System.out.println("\nDesconto: "+ financeiro.getDesconto());
        System.out.printf("\nTOTAL = %2.f", financeiro.getTotal());
    }

}
