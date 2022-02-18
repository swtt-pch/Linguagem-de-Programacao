
package com.mycompany.lista2;

import java.util.Scanner;

public class CalculoPotencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor base:");
        int base = leitor.nextInt();
        System.out.println("Digite o expoente:");
        int expoente = leitor.nextInt();
        int resultado = base;
        for (int i = 1; i < expoente; i++) {
            resultado *= base;
        }
        System.out.println(resultado);
    }
}
