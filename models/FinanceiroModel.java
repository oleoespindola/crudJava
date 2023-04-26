package models;

public class FinanceiroModel {

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

    // Constructo
    public FinanceiroModel() {}

            // Getters & Setters

    // ID
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Número
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    // Emissão
    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    public String getEmissao() {
        return emissao;
    }

    // Vencimento
    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getVencimento() {
        return vencimento;
    }

    // Pagamento
    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getPagamento() {
        return pagamento;
    }

    // Valor
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    // Juros
    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    // Multa
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

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

}
