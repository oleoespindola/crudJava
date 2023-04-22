package controllers;

import models.*;

public class ReceberController {

    ReceberList receber;

    public void incluir(ReceberModel Receber) {
        this.receber.incluir(Receber);
    }

    public void alterarPeloNumero(int numero) {
        this.receber.alterarPeloNumero(numero);
    }

    public ReceberModel consultarPeloNome(String nome) {
        return this.receber.consultarPeloNome(nome);
    }

    public ReceberModel consultarPeloNumero(String numero)  {
        return this.receber.consultarPeloNumero( numero) ;
    }

    public ReceberModel ConsultarPeloValor(double valor) {
        return this.receber.ConsultarPeloValor(valor);
    }

    public ReceberModel consultarPelaNF(String nota_fiscal)  {
        return this.receber.consultarPelaNF(nota_fiscal) ;
    }

    public void excluirPeloId (int id) {
        this.receber.excluirPeloId(id);
    }
}
