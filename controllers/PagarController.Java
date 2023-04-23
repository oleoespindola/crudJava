package controler;

import models.*;

public class PagarControler {

    PagarList pagamentos;

    public void incluir(PagarModel pagar) {
        pagar.setTotal(pagar.getValor() - ((pagar.getJuros()/100 * pagar.getValor()) + pagar.getDesconto()));
        this.pagamentos.incluir(pagar);
    }

    public void alterarPeloNumero(int numero, PagarModel pagar) {
        this.pagamentos.alterarPeloNumero(numero, pagar)
    }

    public PagarModel consultarPeloCNPJ(String CNPJ)  {
        return this.pagamentos.consultarPeloCNPJ();
    }

    public PagarModel consultarPeloNumero(int numero) {
        return this.pagamentos.consultarPeloNumero(numero);
    }

    public PagarModel ConsultarPeloValor(double valor) {
        return this.pagamentos.ConsultarPeloValor(valor);
    }


    public PagarModel consultarPeloBoleto(String boleto) {
        return this.pagamentos.consultarPeloBoleto(boleto);
    }

    public void excluir (int id) {
        this.pagamentos.excluir(id);
    }
}