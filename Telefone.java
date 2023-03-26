public class Telefone implements interfaceCadastro {
    
    //variáveis 
    private int ddd;
    private long numero;

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

    //métodos
    @Override
    public void entrar() {
        System.out.println("Informe o DDD: ");
        setDdd(leia.nextInt());
        
        System.out.println("Informe o numero do telefone: ");
        setNumero(leia.nextLong());
    }

    @Override
    public void imprimir() {
        System.out.printf("\nO número do Telefone e (", getDdd(), ") ", getNumero());
    }

    
}
