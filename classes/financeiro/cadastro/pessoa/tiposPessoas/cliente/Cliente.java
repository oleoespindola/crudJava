package financeiro.cadastro.pessoa.tiposPessoas.cliente;

import financeiro.cadastro.pessoa.*;
import financeiro.cadastro.pessoa.tiposPessoas.*;

public class Cliente extends PessoaJuridica{

    private double limite_credito;
    private Endereco endereco_cobranca;

    public Cliente() {
        entrar();
    }

    public void setLimite_credito(double limite_credito) {
        this.limite_credito = limite_credito;
    }

    public double getLimite_credito() {
        return limite_credito;
    }

    public void setEndereco_cobranca(Endereco endereco_cobranca) {
        this.endereco_cobranca = endereco_cobranca;
    }

    public Endereco getEndereco_cobranca() {
        return endereco_cobranca;
    }

    @Override
    public void entrar() {
        
        super.entrar();

        System.out.printf("\nInforme o limite de credito: ");
        setLimite_credito(leia.nextDouble());

        System.out.printf("\n=== Endereço decobrença ===");
        Endereco capturarEndereco = new Endereco();
        setEndereco_cobranca(capturarEndereco);
    }

    @Override
    public void imprimir() {
        
        super.imprimir();

        System.out.printf("\nO limite de credito e: %s", getLimite_credito());
        System.out.printf("\n=== Endereco de cobranca ===");
        endereco_cobranca.imprimir();
    }
    
}
