/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meuprojetotop;

/**
 *
 * @author Windows
 */
public class atividade8 {
    public static void main(String[] args) {
        // Loop externo para controlar as linhas (de 1 a 5)
        for (int linha = 1; linha <= 5; linha++) {
            // Loop interno para imprimir os números em cada linha
            // Ele imprime o número da 'linha' atual, 'linha' vezes.
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(linha); // Imprime o número da linha
            }
            System.out.println(); // Pula para a próxima linha depois de imprimir todos os números da linha atual
        }
    }
}