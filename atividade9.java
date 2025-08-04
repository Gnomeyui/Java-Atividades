/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows
 */
public class atividade9 {
    public static void main(String[] args) {
        int a = 0, b = 1;

        System.out.println("Série Fibonacci (curto) até passar de 100:");
        while (a <= 100) {
            System.out.println(a);
            b = a + b; // b se torna a soma dos dois anteriores
            a = b - a; // a se torna o antigo b
        }
    }
}
