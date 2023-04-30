package test;

import java.util.List;
import java.util.Random;

public class Faker {

    // Ramdom
    Random random = new Random();

    // Listas de nomes pré-definias
    List<String> listaDeNomes = List.of("Ana", "Pedro", "Gabriela", "Lucas", "Camila", "Rafael", "Carolina", "Felipe");

    List<String> listaDeSobrenomes = List.of("Silva", "Santos", "Oliveira", "Pereira", "Fernandes", "Costa",
            "Rodrigues", "Souza", "Almeida", "Santos");

    List<String> provedorEmail = List.of("@gmail.com", "@outlook.com", "@yahoo.com.br");

    List<String> listaDeCidades = List.of("Guarani", "Quilombo dos Orixás", "Ibirapitanga", "Juremá do Norte",
            "Maracajá-Açu", "Xangô do Sul", "Itapuíba", "Ojú Obá", "Anajá Mirim", "Ubirajara");

    List<String> listaDeEstados = List.of("São Paulo", "Bahia", "Paraná", "Rio de Janeiro", "Acre");

    List<String> sites = List.of("http://www.aldeiacultural.com/", "http://www.casadasartesindigenas.com/",
            "http://www.raizesculturais.com/", "http://www.belezasetnicasnaweb.com/");

    List<String> listaDeBairros = List.of("Jardim das Flores", "Parque do Sol", "Alvorada", "Primavera",
            "Parque do Sol");

    // Produtor de Dados
    public int gerarId() {
        int result = this.random.nextInt(900) + 99;
        System.out.printf("%d", result);
        return result;
    }

    public String gerarNome() {
        String result = this.listaDeNomes.get(this.random.nextInt(this.listaDeNomes.size())) + " "
                + this.listaDeSobrenomes.get(this.random.nextInt(this.listaDeSobrenomes.size()));
        System.out.printf("%s", result);
        return result;
    }

    public String gerarLogradouro() {
        String result = this.listaDeSobrenomes.get(this.random.nextInt(this.listaDeSobrenomes.size())) + " "
                + this.listaDeSobrenomes.get(this.random.nextInt(this.listaDeSobrenomes.size()));
        System.out.printf("%s", result);
        return result;
    }

    public int gerarNumero() {
        int result = this.random.nextInt(100);
        System.out.printf("%d", result);
        return result;
    }

    public String gerarComplemento() {
        String result = "";
        System.out.printf("%s", result);
        return result;
    }

    public String gerarBairro() {
        String result = this.listaDeBairros.get(this.random.nextInt(this.listaDeBairros.size()));
        System.out.printf("%s", result);
        return result;
    }

    public String gerarCidade() {
        String result = this.listaDeCidades.get(this.random.nextInt(this.listaDeCidades.size()));
        System.out.printf("%s", result);
        return result;
    }

    public String gerarEstado() {
        String result = this.listaDeEstados.get(this.random.nextInt(this.listaDeEstados.size()));
        System.out.printf("%s", result);
        return result;
    }

    public int gerarCep() {
        int result = (this.random.nextInt(90000000) + 999999);
        System.out.printf("%d", result);
        return result;
    }

    public String gerarCPF() {
        String result = (this.random.nextInt(900) + 99) + "." + (this.random.nextInt(900) + 99) + "."
                + (this.random.nextInt(900) + 99)
                + "-" + (this.random.nextInt(90) + 9);
        System.out.printf("%s", result);
        return result;
    }

    public String gerarRg() {
        String result = (this.random.nextInt(90) + 9) + "." + (this.random.nextInt(900) + 99) + "."
                + (this.random.nextInt(900) + 9)
                + "-" + this.random.nextInt(9);
        System.out.printf("%s", result);
        return result;
    }

    public String gerarEmissor() {
        String result = this.listaDeEstados.get(this.random.nextInt(this.listaDeEstados.size()));
        System.out.printf("%s", result);
        return result;
    }

    public String gerarCNPJ() {
        String result = (this.random.nextInt(90) + 9) + "." + (this.random.nextInt(900) + 99) + "."
                + (this.random.nextInt(900) + 9)
                + "/0001-" + (this.random.nextInt(90) + 9);
        System.out.printf("%s", result);
        return result;
    }

    public String gerarInscricaoEstadual() {
        String result = (this.random.nextInt(90) + 9) + "." + (this.random.nextInt(900000) + 99999) + "-" + this.random.nextInt(9);
        System.out.printf("%s", result);
        return result;
    }

    public double gerarValor() {
        double result = (this.random.nextDouble(9000) + 999);
        System.out.printf("%.2f", result);
        return result;
    }

    public String gerarData() {
        String result = this.random.nextInt(28) + "/" + this.random.nextInt(12) + "/2023";
        System.out.printf("%s", result);
        return result;
    }

    public String gerarNf() {
        String result = this.random.nextInt(90) + 9 + "-" + this.random.nextInt(900) + 99;
        System.out.printf("%s", result);
        return result;
    }

    public String gerarBoleto() {
        String result = this.random.nextInt(900) + 99 + ".";
        for (int i = 0; i < 5; i++) {
            result = result + "." + this.random.nextInt(900) + 99;
        }
        System.out.printf("%s", result);
        return result;
    }

    public String gerarEmail() {
        String result = this.listaDeNomes.get(this.random.nextInt(this.listaDeNomes.size())) + this.provedorEmail.get(this.random.nextInt(this.provedorEmail.size()));
        System.out.printf("%s", result);
        return result;
    }

    public String gerarSite() {
        String result = this.sites.get(this.random.nextInt(this.sites.size()));
        System.out.printf("%s", result);
        return result;
    }

    public int gerarDDD() {
        int ddd = (this.random.nextInt(90) + 9);
        System.out.printf("%d", ddd);
        return ddd;
    }

    public long gerarTelefone() {
        long telefone = (this.random.nextLong(900000000) + 99999999);
        System.out.printf("%d", telefone);
        return telefone;
    }

    public int gerarEncargos() {
        return this.random.nextInt(15);
    }

}