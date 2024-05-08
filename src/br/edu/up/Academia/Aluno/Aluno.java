package br.edu.up.Academia.Aluno;

import br.edu.up.Academia.FileManager.FileManager;
import java.util.Scanner;

//Mostra os dados que serão pedidos
public class Aluno {

    private String nome, email, sexo;
    private Integer idade;
    private double telefone, peso;

    //Método para cadastrar o aluno
    public Aluno(String nome, Integer idade, String email, double telefone, double peso, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.peso = peso;
        this.sexo = sexo;
    }

//Retorna os dados do aluno

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
