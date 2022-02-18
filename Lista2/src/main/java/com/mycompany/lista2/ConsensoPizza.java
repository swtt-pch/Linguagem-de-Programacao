
package com.mycompany.lista2;

import java.util.Scanner;

public class ConsensoPizza {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int mussarela = 0, calabresa = 0, quatroQueijos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Vote 5 para Mussarela \n Vote 25 para Calabresa \n Vote 50 para Quatro Queijos");
            int voto = leitor.nextInt();
            if (voto == 5) {
                mussarela++;
            } else if(voto == 25){
                calabresa++;
            } else if(voto == 50){
                quatroQueijos++;
            }
        }
        System.out.println(String.format(
        "Mussarela teve: %d votos \n"+
        "Calabresa teve: %d votos \n"+
        "Quatro queijos teve: %d votos", mussarela, calabresa, quatroQueijos));
        
        if (mussarela > calabresa && mussarela > quatroQueijos) {
            System.out.println("O sabor favotito é Mussarela");
        } else if(calabresa > quatroQueijos){
            System.out.println("O sabor favotito é Calabresa");
        } else {
            System.out.println("O sabor favotito é Quatro Queijos");
        }
    }
}
