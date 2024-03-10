/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5e3;

/**
 *
 * @author gabri
 */
public class Lab5E3 {

    public static void main(String[] args) {
        Arquivo arquivo = new ProxyArquivo("arquivo.txt");

        arquivo.exibirMetadados();

        System.out.println(" ");

        arquivo.exibirConteudo();
    }
}
