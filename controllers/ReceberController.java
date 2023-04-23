package controllers;

import java.util.ArrayList;

import models.*;
public class ReceberController {

    ReceberList receitas;

    public ArrayList<ReceberModel> getReceitas() {
        return this.receitas.getReceitas();
    }

    public void incluir(ReceberModel receber) {
        receber.setTotal(receber.getValor() - ((receber.getJuros() / 100) + receber.getDesconto()));
        this.receitas.incluir(receber);
    }

    public void alterarPeloNumero(int numero) {
        this.receitas.alterarPeloNumero(numero);
    }

    public ReceberModel consultarPeloCliente(int id) {
        return this.receitas.consultarPeloCliente(id);
    }

    public ReceberModel consultarPeloNumero(int numero)  {
        return this.receitas.consultarPeloNumero( numero) ;
    }

    public ReceberModel ConsultarPeloValor(double valor) {
        return this.receitas.ConsultarPeloValor(valor);
    }

    public ReceberModel consultarPelaNF(String nota_fiscal)  {
        return this.receitas.consultarPelaNF(nota_fiscal) ;
    }

    public void excluirPeloId (int id) {
        this.receitas.excluirPeloId(id);
    }
}
