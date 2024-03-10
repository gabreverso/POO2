/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6e2;

/**
 *
 * @author gabri
 */
public class Lab6E2 {

    public static void main(String[] args) {
        Acao acao = new Acao();
        AcaoBroker acaoBroker = new AcaoBroker();
        Investidor investidor = new Investidor(100, acaoBroker);

        acao.registerObserver(investidor);

        acao.setPreco();

    }
}
