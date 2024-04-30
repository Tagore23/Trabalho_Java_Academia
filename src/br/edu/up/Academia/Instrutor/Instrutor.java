package br.edu.up.Academia.Instrutor;

import java.util.Scanner;
import java.util.TreeSet;

public class Instrutor {

    private String nome;
    private static final TreeSet<String> instrutores = new TreeSet<>();

    static {
        instrutores.add("Marcelo");
        instrutores.add("Rhafael");
        instrutores.add("Evandro");
        instrutores.add("Andre");
        instrutores.add("Xis");
    }

    public void Instrutores() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu instrutor:");

        int i = 1;
        for (String instrutor : instrutores) {
            System.out.printf("%d. %s\n", i++, instrutor);
        }

        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao >= 1 && opcao <= instrutores.size()) {
            this.nome = (String) instrutores.toArray()[opcao - 1];
            System.out.printf("Seu Instrutor é : %s\n", this.nome);
        } else {
            System.out.println("ERRO!!!");
        }
    }

    public String getNome() {
        return nome;
    }
}
