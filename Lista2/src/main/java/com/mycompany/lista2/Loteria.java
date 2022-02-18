
package com.mycompany.lista2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    
    int randomNumber;
    int userNumber;
    boolean won;
    
    void setUserNumber(int a){
        this.userNumber = a;
        this.randomNumber = ThreadLocalRandom.current().nextInt(0, 11);
        this.won = checkNumbers();
    }
    
    private boolean checkNumbers(){
        System.out.println(randomNumber);
        if (randomNumber == userNumber) {
            System.out.println("Acertou!");
            return true;
        } else {
            System.out.println("Errou, tente novamente...");
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Loteria game = new Loteria();
        boolean won = false;
        int count = 0;
        while(!won){
            System.out.println("Digite um numero de 0 a 10: ");
            int userNumber = leitor.nextInt();
            game.setUserNumber(userNumber);
            won = game.won;
            count++;
        }
        if(count<4){
            System.out.println("Você é MUITO sortudo");
        } else if(count<11){
            System.out.println("Você é sortudo");
        } else{
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}
