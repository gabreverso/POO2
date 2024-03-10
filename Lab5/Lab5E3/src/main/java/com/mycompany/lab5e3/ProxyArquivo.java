package com.mycompany.lab5e3;

public class ProxyArquivo implements Arquivo { // classe proxy para o arquivo
    private String nome;
    private ArquivoReal arquivoReal;
    
    public ProxyArquivo(String nome){
        this.nome = nome;
    }
    
    @Override
    public void exibirMetadados(){
        if(arquivoReal == null){
            arquivoReal = new ArquivoReal(nome, "conteudo");
        }
        arquivoReal.exibirMetadados();
    }
    
    @Override
    public void exibirConteudo(){
        if(arquivoReal == null){
            arquivoReal = new ArquivoReal(nome, "conteudo");
        }
        arquivoReal.exibirConteudo();
    }
    
}
