/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meuprojetotop;

/**
 *
 * @author Windows
 */
public class atividade6 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        System.out.println("Série de Fibonacci até passar de 100:");

        while (a <= 100) { // Continua enquanto o número atual 'a' não ultrapassar 100
            System.out.println(a);
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
    
}
