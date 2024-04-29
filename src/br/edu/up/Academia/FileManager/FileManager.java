package br.edu.up.Academia.FileManager;

import java.io.File;
import java.io.IOException;

public class FileManager {
    //define um diretorio padrão
    private static final String DEFAULT_PATH = "C:\\Java\\Trabalho Java - Academia";


    //cria o diretorio se não existir:
    private File CriaDiretorio(String caminho){
        File diretorio = new File(caminho);
        if (!diretorio.exists())
            diretorio.mkdir();

        return diretorio;
    }
    //Lê os arquivos escritos:
    private File LerArquivos(File ler)throws IOException {
        return ler;
    }
    //Escreve os arquivos:
    private File EscreverArquivos(File escrever)throws IOException {
        return escrever;
    }

}
