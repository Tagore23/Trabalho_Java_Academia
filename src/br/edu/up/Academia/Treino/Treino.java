package br.edu.up.Academia.Treino;

import br.edu.up.Academia.Equipamento.Equipamento;
import br.edu.up.Academia.FileManager.FileManager;
import br.edu.up.Academia.Instrutor.Instrutor;

import java.util.*;

public class Treino {

    private static final List<String> tiposDeTreino = Arrays.asList("Treino 1", "Treino 2", "Treino 3");

    private String tipoTreino;

    public Treino() {
        this.tipoTreino = "Treino Padrão";;
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
            System.out.println("Instrutor: " + Instrutor.getNomeInstrutor());

            escreverDetalhesDoTreino(dia);
        }
    }
    private void escreverDetalhesDoTreino(int dia) {
        FileManager fileManager = new FileManager();
        Equipamento equipamento = new Equipamento(); // Criar uma instância de Equipamento
        List<String> equipamentos = equipamento.getEquipamentosPorTreino(tipoTreino); // Obter a lista de equipamentos

        // Converter a lista de equipamentos para um array de strings
        String[] equipamentosArray = equipamentos.toArray(new String[equipamentos.size()]);

        // Construir os detalhes do treino
        String detalhes = "Treino do dia " + dia + ":\n" +
                "Tipo de Treino: " + tipoTreino + "\n" +
                "Equipamentos: " + Arrays.toString(equipamentosArray) + "\n" +
                "Instrutor: " + Instrutor.getNomeInstrutor() + "\n\n";

        // Escrever os detalhes no arquivo
        fileManager.escreverDetalhes("treinos.txt", detalhes);
    }

}
