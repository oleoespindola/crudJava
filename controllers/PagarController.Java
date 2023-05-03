package controllers;

import java.util.ArrayList;

import models.*;

public class PagarController {

    PagarList pagamentos = new PagarList();

    public ArrayList<PagarModel> getPagamentos() {
        return this.pagamentos.getPagamentos();
    }

    for(int i = 0; i < x ; i++){
        public void incluir(PagarModel pagar, int x) {
            pagar.setTotal(pagar.getValor() - ((pagar.getJuros()/100 * pagar.getValor()) + pagar.getDesconto()));
            this.pagamentos.incluir(pagar);
        }
    }

    public void alterarPeloNumero(int numero, PagarModel pagar) {
        this.pagamentos.alterarPeloNumero(numero, pagar);
    }

    public PagarModel consultarPeloFornecedor(int id)  {
        return this.pagamentos.consultarPeloFornecedor(id);
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

    public void excluir(int id) {
        this.pagamentos.excluirPeloId(id);
    }
}