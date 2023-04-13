package modviewel;
import InterfaceCadastro;

public abstract class FianceiroModel implements InterfaceCadastro {

    // Atributos
    private int id;
    private int numero;
    private String emissao;
    private String vencimento;
    private String pagamento;
    private double valor;
    private double juros;
    private double multa;
    private double desconto;
    private double total;

    // Construtor
    public FianceiroModel() {}

    // Encapsulamento
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    public String getEmissao() {
        return emissao;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getMulta() {
        return multa;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setTotal() {
        this.total = valor - ((valor * (juros/100)) + multa + (valor * (desconto/100)));
    }

    public double getTotal() {
        return total;
    }


    // sobrecarga de métodos
    @Override
    public void entrar() {

        System.out.printf("\nInforme o(a) ID: ");
        setId(leia.nextInt());
        System.out.printf("\nInforme o(a) numero: ");
        setNumero(leia.nextInt());
        System.out.printf("\nInforme o(a) emissao: ");
        setEmissao(leia.next());
        System.out.printf("\nInforme o(a) vencimento: ");
        setVencimento(leia.next());
        System.out.printf("\nInforme o(a) pagamento: ");
        setPagamento(leia.next());
        System.out.printf("\nInforme o(a) valor: ");
        setValor(leia.nextDouble());
        System.out.printf("\nInforme o(a) juros em porcentagem: (Ex: 5)");
        setJuros(leia.nextDouble());
        System.out.printf("\nInforme o(a) multa em R$: (Ex: 5)");
        setMulta(leia.nextDouble());
        System.out.printf("\nInforme o(a) desconto em porcentagem: (Ex: 5)");
        setDesconto(leia.nextDouble());
        setTotal();
    }

    @Override
    public void imprimir() {

        System.out.printf("\nO ID e: %d", getId());
        System.out.printf("\nO numero e: %d", getNumero());
        System.out.printf("\nA emissao e: %s", getEmissao());
        System.out.printf("\nO vencimento e: %s", getVencimento());
        System.out.printf("\nO pagamento e: %s", getPagamento());
        System.out.printf("\nO valor e: %2f", getValor());
        System.out.printf("\nO juros e: %2f", getJuros());
        System.out.printf("\nA multa e: %2f", getMulta());
        System.out.printf("\nO desconto e: %2f", getDesconto());
        System.out.printf("\nO total e: %2f", getTotal());
    }

}
