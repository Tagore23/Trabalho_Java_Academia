package br.edu.up.Academia.Aluno;

import java.util.Scanner;

public class Aluno {
    private String nome, email, sexo;
    private Integer idade;
    private double telefone, peso;

    public void CadastrarAluno() {
        DadosAluno dados = new DadosAluno();
        dados.lerDados();

        this.nome = dados.getNome();
        this.sexo = dados.getSexo();
        this.idade = dados.getIdade();
        this.email = dados.getEmail();
        this.telefone = dados.getTelefone();
        this.peso = dados.getPeso();

        System.out.printf("\nAluno cadastrado com sucesso:" +
                "\nNome: %s\nSexo %s\nIdade: %d\nE-mail: %s\nTelefone:" + " %s\nPeso: %.2f\n",
                this.nome,this.sexo, this.idade, this.email, this.telefone, this.peso);
    }

    class DadosAluno {
        private String nome, email, sexo;
        private Integer idade;
        private double telefone, peso;

        public void lerDados() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nome:");
            this.nome = scanner.nextLine();

            System.out.println("Sexo:");
            this.sexo = scanner.nextLine();

            System.out.println("Idade:");
            this.idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Email:");
            this.email = scanner.nextLine();

            System.out.println("Telefone:");
            this.telefone = scanner.nextDouble();

            System.out.println("Peso:");
            this.peso = scanner.nextDouble();
        }

        public String getNome() {
            return nome;
        }
        public String getSexo() {
            return sexo;
        }

        public Integer getIdade() {
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
