public class Receber extends Financeiro{

    private Cliente cliente;
    private String nota_fiscal;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public String getNota_fiscal() {
        return nota_fiscal;
    }

    @Override
    public void entrar() {
        super.entrar();

        System.out.printf("\nInforme os dados do cliente");
        setCliente(cliente);

        System.out.printf("\nInforme o numero da nota fiscal: ");
        setNota_fiscal(nota_fiscal);

    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.print("\nOs dados do cliente sao");
        getCliente().imprimir();
        System.out.printf("\nO numero da nota e: ", getNota_fiscal());
        
    }
    
}
