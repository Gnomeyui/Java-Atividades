/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meuprojetotop;

/**
 *
 * @author Windows
 */
public class atividade5 {
     public static void main(String[] args) {
        System.out.println("--- Fatoriais até 20 ---");
        for (int i = 1; i <= 20; i++) {
            System.out.println("Fatorial de " + i + " = " + calcularFatorialRecursivo(i));
        }

        System.out.println("\n--- Fatoriais até 30 ---");
        for (int i = 1; i <= 30; i++) {
            System.out.println("Fatorial de " + i + " = " + calcularFatorialRecursivo(i));
        }

        System.out.println("\n--- Fatoriais até 40 ---");
        for (int i = 1; i <= 40; i++) {
            System.out.println("Fatorial de " + i + " = " + calcularFatorialRecursivo(i));
        }
    }

    // Método recursivo para calcular o fatorial
    public static long calcularFatorialRecursivo(int numero) {
        if (numero == 0 || numero == 1) {
            return 1; // Caso base: fatorial de 0 ou 1 é 1
        } else {
            return numero * calcularFatorialRecursivo(numero - 1); // Passo recursivo
        }
    }
}

