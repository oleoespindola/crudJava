package view;

import interfaces.InterfaceView;
import models.FinanceiroModel;

public abstract class FinanceiroView implements InterfaceView {

    FinanceiroModel financeiro = new FinanceiroModel() {
        
    };

    @Override
    public void entrar() {
        System.out.printf("Informe o ID da transação: ");
        financeiro.setId(faker.gerarId());
        System.out.printf("Informe o número da transação: ");
        financeiro.setNumero(faker.gerarId());
        System.out.printf("Data da emissão: ");
        financeiro.setEmissao(faker.gerarData());
        System.out.printf("Data de vencimento: ");
        financeiro.setVencimento(faker.gerarData());
        System.out.printf("Data do pagamento: ");
        financeiro.setPagamento(faker.gerarData());
        System.out.printf("Valor: ");
        financeiro.setValor(faker.gerarValor());
        System.out.printf("Juros: ");
        financeiro.setJuros(faker.gerarValor()/10);
        System.out.printf("Multa");
        financeiro.setMulta(faker.gerarValor()/10);
        System.out.printf("Desconto: ");
        financeiro.setDesconto(faker.gerarValor()/80);
    }

    @Override
    public void imprimir() {
        System.out.println("ID: "+ financeiro.getId());
        System.out.println("Número: "+ financeiro.getNumero());
        System.out.println("Emissao: "+ financeiro.getEmissao());
        System.out.println("Deta de Vencimento: "+ financeiro.getVencimento());
        System.out.println("aPgamento: "+ financeiro.getPagamento());
        System.out.println("Valor: "+ financeiro.getValor());
        System.out.println("Juros: "+ financeiro.getJuros());
        System.out.println("Multa: "+ financeiro.getMulta());
        System.out.println("Desconto: "+ financeiro.getDesconto());
        System.out.printf("TOTAL = %2.f", financeiro.getTotal());
    }

}
