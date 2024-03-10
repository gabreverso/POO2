package com.mycompany.lab5e2;

public class FachadaCarro {

    private Carro carro = new Carro();

    void iniciarCorrida() {
        carro.travarPorta();
        carro.trocarMarcha();
        carro.travarCinto();
        carro.ligarMotor();
        carro.acelerar();
        carro.ligarRadio();

    }

    void finalizarCorrida() {
        carro.desligarMotor();
        carro.desligarRadio();
        carro.destravarCinto();
        carro.destravarPorta();
    }
    
}
