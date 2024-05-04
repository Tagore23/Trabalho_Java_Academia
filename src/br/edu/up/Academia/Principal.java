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
                    cadastrarAluno();
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

    private static void cadastrarAluno() {
        Aluno aluno = new Aluno();
        aluno.cadastrarAluno();
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
