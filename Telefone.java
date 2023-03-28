public class Telefone implements interfaceCadastro {
    
    //variáveis 
    private int ddd;
    private long numero;

    //construtor
    public Telefone() {
        entrar();
    }

    //Entrada de saída de dados 
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getDdd() {
        return ddd;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public long getNumero() {
        return numero;
    }

    //Sobrecarga de métodos
    @Override
    public void entrar() {
        System.out.printf("\nInforme o DDD: ");
        setDdd(leia.nextInt());
        
        System.out.printf("\nInforme o numero do telefone: ");
        setNumero(leia.nextLong());
    }

    @Override
    public void imprimir() {
        System.out.printf("\nO número do Telefone e (", getDdd(), ") ", getNumero());
    }

    
}
