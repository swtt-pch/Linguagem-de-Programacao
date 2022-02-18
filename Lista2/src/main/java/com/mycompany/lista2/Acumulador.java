
package com.mycompany.lista2;

import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numeroInformado = leitor.nextInt();
        int numero = numeroInformado;
        while(numeroInformado != 0){
            System.out.println("Informe um numero: ");
            numeroInformado = leitor.nextInt();
            numero += numeroInformado;
        }
        System.out.println(String.format("A soma dos números informados da: %d",numero));
    }
}
