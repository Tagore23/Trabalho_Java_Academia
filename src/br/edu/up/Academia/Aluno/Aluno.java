package br.edu.up.Academia.Aluno;

public class Aluno {
  import java.util.Scanner;

public class Aluno {
    private String nome;
    private int idade;
    private String email;
    private double telefone;
    private double peso;

    public void CadastrarAluno() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome:");
        this.nome = scanner.nextLine();

        System.out.print("Idade:");
        this.idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("E-mail:");
        this.email = scanner.nextLine();

        System.out.print("Telefone:");
        this.telefone = scanner.nextDouble();

        System.out.print("Peso:");
        this.peso = scanner.nextDouble();

        System.out.printf("\nAluno cadastrado com sucesso:" +
         "\nNome: %s\nIdade: %d\nE-mail: %s\nTelefone:" + " %s\nPeso: %.2f\n",

            this.nome, this.idade, this.email, this.telefone, this.peso);
    }
}

