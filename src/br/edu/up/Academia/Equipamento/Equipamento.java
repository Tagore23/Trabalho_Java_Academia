package br.edu.up.Academia.Equipamento;

import java.util.*;

public class Equipamento {


    private Map<String, List<String>> equipamentosPorTreino;
    //inicia um hashmap para que dentro de TREINO o treino 1 utilize o equipamento1
    public Equipamento() {
        this.equipamentosPorTreino = new HashMap<>();

        // Define os equipamentos para cada tipo de treino
        List<String> equipamentosTreino1 = Arrays.asList(
                "Supino Reto", "Supino Inclinado", "Supino Declinado", "Máquina de Pulôver", "Halteres"
        );
        equipamentosPorTreino.put("Treino 1", equipamentosTreino1);

        List<String> equipamentosTreino2 = Arrays.asList(
                "Barra Fixa", "Máquina de Puxada", "Remada Sentada", "Puxada Alta na Máquina", "Barra T"
        );
        equipamentosPorTreino.put("Treino 2", equipamentosTreino2);

        List<String> equipamentosTreino3 = Arrays.asList(
                "Leg Press", "Agachamento Smith Machine", "Cadeira Extensora", "Cadeira Flexora", "Hack Squat Machine"
        );
        equipamentosPorTreino.put("Treino 3", equipamentosTreino3);
    }
    // Retorna a lista de equipamentos correspondente ao tipo de treino ou uma lista vazia se o tipo de treino não existir
    public List<String> getEquipamentosPorTreino(String tipoTreino) {
        return equipamentosPorTreino.getOrDefault(tipoTreino, Collections.emptyList());
    }
}
