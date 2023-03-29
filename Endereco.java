public class Endereco implements InterfaceCadastro {

    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;

    public Endereco() {
        entrar();
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setComplement(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemeno() {
        return complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getCep() {
        return cep;
    }

    @Override
    public void entrar() {

        System.out.printf("\nInforme o logradouro: ");
        setLogradouro(leia.next());
        System.out.printf("\nInfome o numero: ");
        setNumero(leia.nextInt());
        System.out.printf("\nInforme o complemento :");
        setComplement(leia.next());
        System.out.printf("\nInforme o bairro: ");
        setBairro(leia.next());
        System.out.printf("\nInfome a cidade: ");
        setCidade(leia.next());
        System.out.printf("\nInforme o estado: ");
        setEstado(leia.next());
        System.out.printf("\nInforme o CEP: ");
        setCep(leia.nextInt());

    }

    @Override
    public void imprimir() {

        System.out.printf("\nLogradouro: %s", getLogradouro());
        System.out.printf("\nNumero: %s", getNumero());
        System.out.printf("\nComplemento: %s", getComplemeno());
        System.out.printf( "\nBairro: %s", getBairro());
        System.out.printf( "\nCidade: %s", getCidade());
        System.out.printf( "\nEstado: %s", getEstado());
        System.out.printf("\nCEP: %s", getCep());
    }

}
