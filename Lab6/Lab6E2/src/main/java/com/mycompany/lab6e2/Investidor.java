package com.mycompany.lab6e2;

public class Investidor implements Observer{
    private final double precoMax;
    private final AcaoBroker acaoBroker;

    Investidor(double precoMax, AcaoBroker acaoBroker){
        this.precoMax = precoMax;
        this.acaoBroker = acaoBroker;
    }

    @Override
    public void update(double preco){
        if(preco > this.precoMax){
            acaoBroker.venderAcao(preco);
            System.out.printf("Preco da acao subiu para R$%.2f. Ação vendida.", preco);
        } else {
            acaoBroker.comprarAcao(preco);
            System.out.printf("Preco da acao caiu para R$%.2f. Ação comprada.\n", preco);
        }
    }
}
