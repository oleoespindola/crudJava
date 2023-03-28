public abstract class PessoaJuridica extends Pessoa {

    //Atributos
    private String cnpj;
    private String inscricao_estadual;
    private String contato;

    //Construtor
    public PessoaJuridica() {}

    // Encapsulamento
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getInscricao_estadual() {
        return inscricao_estadual;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getContato() {
        return contato;
    }

    // Sobrecarga de métodos
    @Override
    public void entrar() {
        super.entrar();
        
        System.out.printf("\nInforme o CNPJ: ");
        setCnpj(leia.next());
        System.out.printf("\nInforme a incricao estadual: ");
        setInscricao_estadual(leia.next());
        System.out.printf("\nInforme o contato: ");
        setContato(leia.next());

    }

    @Override
    public void imprimir() {

        super.imprimir();

        System.out.printf("\nSeu CNPJ e: %s", getCnpj());
        System.out.printf("\nSua incricao estadual e: %s", getInscricao_estadual());
        System.out.printf("\nSeu contato e: %s", getContato());

    }
}