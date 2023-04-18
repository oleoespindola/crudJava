package view;

import interfaces.InterfaceView;
import models.FinanceiroModel;

public abstract class FinanceiroView implements InterfaceView {

    FinanceiroModel financeiro;

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

        financeiro.setTotal();
        System.out.printf("TOTAL = %2.f", financeiro.getTotal());

    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub

    }

}
