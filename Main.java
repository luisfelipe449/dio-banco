/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.auladio;

/**
 *
 * @author luis.santana
 */
public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();
        cc.depositar(100);
        cc.transferir(poupanca, 100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
