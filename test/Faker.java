package test;

import java.util.List;
import java.util.Random;

public class Faker {

    //Ramdom
    Random random = new Random();

    // Listas de nomes pré-definias
    List<String> listaDeNomes = List.of("Ana", "Pedro", "Gabriela", "Lucas ", "Camila", "Rafael", "Carolina", "Felipe");

    List<String> listaDeSobrenomes = List.of("Silva", "Santos", "Oliveira", "Pereira", "Fernandes", "Costa", "Rodrigues", "Souza", "Almeida", "Santos");

    List<String> provedorEmail = List.of("gmail.com", "outlook.com", "yahoo.com.br");

    List<String> listaDeCidades = List.of("Guarani", "Quilombo dos Orixás", "Ibirapitanga", "Juremá do Norte", "Maracajá-Açu", "Xangô do Sul", "Itapuíba", "Ojú Obá", "Anajá Mirim", "Ubirajara");

    List<String> listaDeEstados = List.of("São Paulo", "Bahia", "Paraná", "Rio de Janeiro", "Acre");

    List<String> sites = List.of("http://www.aldeiacultural.com/", "http://www.casadasartesindigenas.com/", "http://www.raizesculturais.com/", "http://www.belezasetnicasnaweb.com/");

    List<String> listaDeBairros = List.of("Jardim das Flores", "Parque do Sol", "Alvorada", "Primavera", "Parque do Sol");

    // Produtor de Dados 
    public int gerarId() {
        return this.random.nextInt(900) + 99;
    }

    public String gerarNome() {
        return this.listaDeNomes.get(this.random.nextInt(this.listaDeNomes.size())) + " " + this.listaDeSobrenomes.get(this.random.nextInt(this.listaDeSobrenomes.size()));
    }

    public String gerarLogradouro() {
        return this.listaDeSobrenomes.get(this.random.nextInt(this.listaDeSobrenomes.size())) + " " + this.listaDeSobrenomes.get(this.random.nextInt(this.listaDeSobrenomes.size()));
    }

    public int gerarNumero() {
        return this.random.nextInt(100);
    }

    public String gerarComplemento() {
        return "";
    }

    public String gerarBairro() {
        return this.listaDeBairros.get(this.random.nextInt(this.listaDeBairros.size()));
    }

    public String gerarCidade() {
        return this.listaDeCidades.get(this.random.nextInt(this.listaDeCidades.size()));
    }

    public String gerarEstado() {
        return this.listaDeEstados.get(this.random.nextInt(this.listaDeEstados.size()));
    }

    public int gerarCep() {
        return (this.random.nextInt(90000000) + 999999);
    }

    public String gerarCPF() {
        return "";
    }

}