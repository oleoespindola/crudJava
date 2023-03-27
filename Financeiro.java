public abstract class Financeiro implements interfaceCadastro {

    int id;
    int numero;
    String emissao;
    String vencimento;
    String pagamento;
    double valor;
    double juros;
    double multa;
    double desconto;
    double total;

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

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public void entrar() {
        System.out.printf("\nInforme o(a) ID");
        setId(leia.nextInt());

        System.out.printf("\nInforme o(a) numero");
        setNumero(leia.nextInt());

        System.out.printf("\nInforme o(a) emissao");
        setEmissao(leia.next());

        System.out.printf("\nInforme o(a) vencimento");
        setVencimento(leia.next());

        System.out.printf("\nInforme o(a) pagamento");
        setPagamento(leia.next());

        System.out.printf("\nInforme o(a) valor");
        setValor(leia.nextDouble());

        System.out.printf("\nInforme o(a) juros");
        setJuros(leia.nextDouble());

        System.out.printf("\nInforme o(a) multa");
        setMulta(leia.nextDouble());

        System.out.printf("\nInforme o(a) desconto");
        setDesconto(leia.nextDouble());

        System.out.printf("\nInforme o(a) total");
        setTotal(leia.nextDouble());
    }

    @Override
    public void imprimir() {

        System.out.printf("\nO ID e: ", getId());
        System.out.printf("\nO numero e: ", getNumero());
        System.out.printf("\nA emissao e: ", getEmissao());
        System.out.printf("\nO vencimento e: ", getVencimento());
        System.out.printf("\nO pagamento e: ", getPagamento());
        System.out.printf("\nO valor e: ", getValor());
        System.out.printf("\nO juros e: ", getJuros());
        System.out.printf("\nA multa e: ", getMulta());
        System.out.printf("\nO desconto e: ", getDesconto());
        System.out.printf("\nO total e: ", getTotal());
    }

}
