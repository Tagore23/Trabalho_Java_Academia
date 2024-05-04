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

    public void escolherInstrutor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu instrutor:");

        int i = 1;
        for (String instrutor : instrutores) {
            System.out.println(i + ". " + instrutor);
            i++;
        }

        int opcao;
        do {i = scanner.nextInt();
            scanner.nextLine();

            if (i < 1 || i > 5) {
                System.out.println("Erro.");
            }
        } while (i < 1 || i > 5);

        this.nome = (String) instrutores.toArray()[i - 1];
        System.out.println("Seu Instrutor é: " + this.nome);

        scanner.close();
    }
}
