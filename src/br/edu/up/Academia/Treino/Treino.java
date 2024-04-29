package br.edu.up.Academia.Treino;

import br.edu.up.Academia.Equipamento.Equipamento;

import java.util.*;

public class Treino {

    private static final List<String> tiposDeTreino = Arrays.asList("Treino 1", "Treino 2", "Treino 3");

    private String tipoTreino;

    public Treino() {
        this.tipoTreino = tipoTreino;
    }

    public void EscolherTreino() {
        Equipamento equipamento = new Equipamento();
        Random random = new Random();

        // Embaralha a lista de tipos de treino para garantir a aleatoriedade
        Collections.shuffle(tiposDeTreino);

        // Loop para 5 dias
        for (int dia = 1; dia <= 5; dia++) {
            // Escolhe um tipo de treino aleatório
            tipoTreino = tiposDeTreino.get(random.nextInt(tiposDeTreino.size()));

            System.out.println("Dia " + dia + ":");
            System.out.println("Tipo de Treino: " + tipoTreino);
            System.out.println("Equipamentos: " + equipamento.getEquipamentosPorTreino(tipoTreino));
            System.out.println();
        }
    }
}
