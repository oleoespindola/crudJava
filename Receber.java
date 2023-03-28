public class Receber extends Financeiro{

    // Atributos
    private Cliente cliente;
    private String nota_fiscal;


    // Construtor
    public Receber() {
        entrar();
    }

    // Encapsulamento
    public void setCliente() {
        Cliente coletaCliente = new Cliente();
        this.cliente = coletaCliente;
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
        System.out.printf("\nO numero da nota e: ", getNota_fiscal());
        
    }
    
}
