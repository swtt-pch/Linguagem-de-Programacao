
package com.mycompany.lista2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Diga um número de 0 a 100");
        int numeroUsuario = leitor.nextInt();
        int posicao = 200;
        int numeroRandom, qtdImpares = 0, qtdPares = 0;
        for (int i = 0; i < 200; i++) {
            numeroRandom = ThreadLocalRandom.current().nextInt(0, 101);
            if (numeroUsuario == numeroRandom) {
                if (i<posicao) {
                    posicao = i;
                }
            }
            if (numeroRandom%2!=0) {
                qtdImpares++;
            }
            if (numeroRandom%2==0) {
                qtdPares++;
            }
        }
        System.out.println(String.format(
        "O seu número foi sorteado pela primeira vez no %dº sorteio. \n"+
        "Foram sorteados %d números pares. \n"+
        "Foram sorteados %d números impáres.", posicao, qtdPares, qtdImpares));
    }
}
