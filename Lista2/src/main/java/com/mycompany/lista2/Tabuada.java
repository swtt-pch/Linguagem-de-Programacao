
package com.mycompany.lista2;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int base = leitor.nextInt();
        System.out.println(String.format("Tabuada do %d", base));
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d",base, i, (base*i)));
        }
    }
}
