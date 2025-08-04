/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meuprojetotop;

/**
 *
 * @author Windows
 */
public class atividade7 {
     public static void main(String[] args) {
        int x = 13; // Você pode mudar o valor inicial de 'x' aqui para testar outros números

        System.out.print("Sequência para x = " + x + ": ");

        while (x != 1) {
            System.out.print(x); // Imprime o valor atual de x

            if (x % 2 == 0) { // Se x é par
                x = x / 2;
            } else { // Se x é ímpar
                x = 3 * x + 1;
            }

            // Adiciona a seta de separação se o próximo valor não for 1
            if (x != 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println(x); // Imprime o valor final (1) e adiciona uma quebra de linha no final
    }
}
