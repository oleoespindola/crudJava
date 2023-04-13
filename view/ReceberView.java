package view;

import financeiro.cadastro.pessoa.tiposPessoas.cliente.Cliente;

public class Receber extends FianceiroModel{

    // Atributos
    private ClienteModel cliente;
    private String nota_fiscal;


    // Construtor
    public Receber() {
        entrar();
    }

    // Encapsulamento
    public void setCliente() {
        ClienteModel coletaCliente = new ClienteModel();
        this.cliente = coletaCliente;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public String getNota_fiscal() {
        return nota_fiscal;
    }

    // Sobrecarga de métodos
    @Override
    public void entrar() {
        super.entrar();

        System.out.printf("\nInforme os dados do cliente");
        setCliente();

        System.out.printf("\nInforme o numero da nota fiscal: ");
        setNota_fiscal(nota_fiscal);

    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.printf("\n=== Dados do cliente ===");
        getCliente().imprimir();
        System.out.printf("\nO numero da nota e: %s", getNota_fiscal());
        
    }
    
}
