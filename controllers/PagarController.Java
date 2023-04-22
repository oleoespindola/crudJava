package controler;

import models.*;

public class PagarControler {

    PagarList pagar;

    public void incluir(PagarModel Pagar) {
        this.pagar.incluir(Pagar);
    }

    public void alterarPeloNumero(int numero) {
        this.pagar.alterarPeloNumero(numero)
    }

    public PagarModel consultarPeloCNPJ(String CNPJ)  {
        return this.pagar.consultarPeloCNPJ(CNPJ) ;
    }

    public PagarModel consultarPeloNumero(int numero) {
        return this.pagar.consultarPeloNumero(numero);
    }

    public PagarModel ConsultarPeloValor(double valor) {
        return this.pagar.ConsultarPeloValor(valor);
    }


    public PagarModel consultarPeloBoleto(String boleto) {
        return this.pagar.consultarPeloBoleto(boleto);
    }

    public void excluir (int id) {
        this.pagar.excluir(id);
    }
}