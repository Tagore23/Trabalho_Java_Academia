package br.edu.up.Academia.Instrutor;

import java.util.Scanner;
import java.util.TreeSet;

public class Instrutor {

    private static String nomeInstrutor;
    //Declarando o TreeSet
    private static final TreeSet<String> instrutores = new TreeSet<>();

    static {
        //Lista estática dos instrutores
        instrutores.add("Marcelo");
        instrutores.add("Rhafael");
        instrutores.add("Evandro");
        instrutores.add("Andre");
        instrutores.add("Xis");
    }
    //Mostar o instrutor escolhido no treino
    public static String getNomeInstrutor() {
        return nomeInstrutor;
    }
     //Método para escolher o instrutor
    public void escolherInstrutor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu instrutor:");
    //For para escolher o instrutor
        int i = 1;
        for (String instrutor : instrutores) {
            System.out.println(i + ". " + instrutor);
            i++;
        }
       //Método Do-While pra validar instrutor ou informar erro na escolha
        int opcao;
        do {i = scanner.nextInt();
            scanner.nextLine();

            if (i < 1 || i > 5) {
                System.out.println("Erro.");
            }
        } while (i < 1 || i > 5);
         //Apresenta qual instrutor foi escolhido
        this.nomeInstrutor = (String) instrutores.toArray()[i - 1];
        System.out.println("Seu Instrutor é: " + this.nomeInstrutor);

    }
}
