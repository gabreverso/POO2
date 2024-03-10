package com.mycompany.lab5e3;

public class ArquivoReal implements Arquivo{ // classe para o arquivo, representando arquivo grande
    private String nome;
    private String conteudo;
    
    public ArquivoReal(String nome, String conteudo){
        this.nome = nome;
        this.conteudo = conteudo;

        carregarArquivo();
    }

    void carregarArquivo(){
        System.out.println("Carregando arquivo " + nome); //simulando carregamento de arquivo muito grande

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void exibirMetadados(){
        System.out.println("Nome: " + nome + " - Tamanho: " + conteudo.length() + " bytes");
    }
    
    @Override
    public void exibirConteudo(){
        System.out.println(conteudo);
    }

}
