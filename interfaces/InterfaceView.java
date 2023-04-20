package interfaces;

import java.util.Scanner;

public interface InterfaceView {

    Scanner leia = new Scanner(System.in);

    Faker faker = new Faker();

    public void entrar();
    public void imprimir();
}