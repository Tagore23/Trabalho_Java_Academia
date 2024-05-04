package br.edu.up.Academia.Aluno;

import br.edu.up.Academia.FileManager.FileManager;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private int idade;
    private String email;
    private double telefone;
    private double peso;
    private String sexo;

    public static void cadastrarAluno() {
        Scanner scanner = new Scanner(System.in);
        DadosAluno dados = new DadosAluno();
        dados.lerDados();

        System.out.println("Aluno cadastrado com sucesso:");
        System.out.println("Nome: " + dados.getNome());
        System.out.println("Sexo: " + dados.getSexo());
        System.out.println("Idade: " + dados.getIdade());
        System.out.println("E-mail: " + dados.getEmail());
        System.out.println("Telefone: " + dados.getTelefone());
        System.out.println("Peso: " + dados.getPeso());

        FileManager fileManager = new FileManager();
        fileManager.escreverDetalhes("cadastros.txt", "Cadastro de Aluno - Nome: " + dados.getNome() + ", Sexo: " + dados.getSexo() + ", Idade: " + dados.getIdade() + ", E-mail: " + dados.getEmail() + ", Telefone: " + dados.getTelefone() + ", Peso: " + dados.getPeso());
    }

    private static class DadosAluno {
        private String nome, email, sexo;
        private int idade, telefone;
        private double peso;

        public void lerDados() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nome: ");
            this.nome = scanner.nextLine();

            System.out.print("Sexo: ");
            this.sexo = scanner.nextLine();

            System.out.print("Idade: ");
            this.idade = scanner.nextInt();
            scanner.nextLine();

            System.out.print("E-mail: ");
            this.email = scanner.nextLine();

            System.out.print("Telefone: ");
            this.telefone = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Peso: ");
            this.peso = scanner.nextDouble();
            scanner.nextLine();
        }

        public String getNome() {
            return nome;
        }

        public String getSexo() {
            return sexo;
        }

        public int getIdade() {
            return idade;
        }

        public String getEmail() {
            return email;
        }

        public double getTelefone() {
            return telefone;
        }

        public double getPeso() {
            return peso;
        }
    }
}
