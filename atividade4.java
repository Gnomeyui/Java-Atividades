/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.meuprojetotop;

/**
 *
 * @author Windows
 */
public class atividade4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Fatorial de " + i + " = " + calcularFatorialRecursivo(i));
        }
    }

    // Recursive method to calculate factorial
    public static long calcularFatorialRecursivo(int numero) {
        if (numero == 0 || numero == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            return numero * calcularFatorialRecursivo(numero - 1); // Recursive step
        }
    }
}
