package br.edu.up.Academia.Instrutor;

  import java.util.Scanner;

public class Instrutor {

    private String nome;

    public void Instrutores(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu instrutor:");
        System.out.println("1. Marcelo");
        System.out.println("2. Rhafael");
        System.out.println("3. Evandro");
        System.out.println("4. Andre");
        System.out.println("5. Xis");

        int opcao = scanner.nextInt();scanner.nextLine();

        switch (opcao) {
            case 1:
                this.nome = "Marcelo";
                break;
            case 2:
                this.nome = "Rhafael";
                break;
            case 3:
                this.nome = "Evandro";
                break;
            case 4:
                this.nome = "Andre";
                break;
            case 5:
                this.nome = "Xis";
                break;
            default:
                System.out.println("ERRO!!!");
                break;
        }

        if (this.nome != null) {
            System.out.printf("Seu Instrutor é : %s\n", this.nome);
        }
    }
}
