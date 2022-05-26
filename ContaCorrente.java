/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.auladio;

/**
 *
 * @author luis.santana
 */
public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato conta corrente ***");
        imprimirInfosComuns();
    }

}
