package br.edu.up.Academia;

import br.edu.up.Academia.Aluno.Aluno;
import br.edu.up.Academia.FileManager.FileManager;
import br.edu.up.Academia.Instrutor.Instrutor;
import br.edu.up.Academia.Treino.Treino;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        //Do while para que seja possivel voltar para continuar cadastros, como cadastrar o aluno e depois escolher o instrutor e depois iniciar o treino
        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Escolher Instrutor");
            System.out.println("3 - Iniciar treino");
            System.out.println("4 - Verificar cadastros");
            System.out.println("5 - Sair");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    cadastrarAluno(args);
                    break;
                case 2:
                    escolherInstrutor();
                    break;
                case 3:
                    iniciarTreino();
                    break;
                case 4:
                    verificarCadastros();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        } while (escolha != 5);
    }

   //Método para ler os dados do Aluno

    public static void cadastrarAluno(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Aluno");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Sexo: ");
        String sexo = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        System.out.print("Telefone: ");
        double telefone = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        Aluno aluno = new Aluno(nome, idade, email, telefone, peso, sexo);

        //Lista os dados do aluno
        System.out.println("Aluno cadastrado com sucesso:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Sexo: " + aluno.getSexo());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("E-mail: " + aluno.getEmail());
        System.out.println("Telefone: " + aluno.getTelefone());
        System.out.println("Peso: " + aluno.getPeso() + " Kg");

        FileManager fileManager = new FileManager();
        fileManager.escreverDetalhes("cadastros.txt", "Cadastro de Aluno - Nome: " + aluno.getNome() + ", Sexo: " + aluno.getSexo() + ", Idade: " + aluno.getIdade() + ", E-mail: " + aluno.getEmail() + ", Telefone: " + aluno.getTelefone() + ", Peso: " + aluno.getPeso());
    }

    private static void escolherInstrutor() {
        Instrutor instrutor = new Instrutor();
        instrutor.escolherInstrutor();
    }

    private static void iniciarTreino() {
        Treino treino = new Treino();
        treino.EscolherTreino();
    }

    private static void verificarCadastros() {
        FileManager fileManager = new FileManager();
        fileManager.verificarCadastros();
    }
}
