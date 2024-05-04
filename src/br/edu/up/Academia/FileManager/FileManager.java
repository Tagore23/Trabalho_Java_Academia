package br.edu.up.Academia.FileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    private static final String DEFAULT_PATH = "C:\\Java\\Trabalho Java - Academia";

    public FileManager(){
        // Cria o diretório padrão se não existir
        criarDiretorio(DEFAULT_PATH);
    }

    // Método para criar o diretório se não existir
    private void criarDiretorio(String caminho){
        File diretorio = new File(caminho);
        if (!diretorio.exists())
            diretorio.mkdir();
    }

    // Método para verificar se um arquivo existe
    public boolean arquivoExiste(String nomeArquivo) {
        File arquivo = new File(DEFAULT_PATH + "\\" + nomeArquivo);
        return arquivo.exists();
    }

    // Método para escrever os detalhes em um arquivo
    public void escreverDetalhes(String nomeArquivo, String detalhes) {
        try {
            FileWriter writer = new FileWriter(DEFAULT_PATH + "\\" + nomeArquivo, true); // true para adicionar ao arquivo existente
            writer.write(detalhes + "\n");
            writer.close();
            System.out.println("Detalhes gravados em " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao escrever detalhes no arquivo.");
            e.printStackTrace();
        }
    }

    // Método para verificar cadastros de usuario
    public void verificarCadastros() {
        if (arquivoExiste("cadastros.txt")) {
            System.out.println("Arquivo de cadastros encontrado.");
        } else {
            System.out.println("Nenhum cadastro encontrado.");
        }
    }
}
