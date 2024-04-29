package br.edu.up.Academia;

import br.edu.up.Academia.Aluno.Aluno;
import br.edu.up.Academia.FileManager.FileManager;
import br.edu.up.Academia.Instrutor.Instrutor;
import br.edu.up.Academia.Treino.Treino;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("O que deseja fazer?");
        System.out.println("1 - Cadastrar aluno: ");
        System.out.println("2 - Cadastrar Instrutor: ");
        System.out.println("3 - Iniciar treino: ");
        System.out.println("4 - Verificar cadastros");
        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                Aluno aluno = new Aluno();
                break;
            case 2:
                Instrutor instrutor = new Instrutor();
                break;
            case 3:
                Treino treino = new Treino();
                treino.EscolherTreino();
                break;
            case 4:
                FileManager fileManager = new FileManager();
                break;
            default:

                break;
        }
    }
}
