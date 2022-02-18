

package com.mycompany.projeto02.ads;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {
    
    public static void main(String[] args) {
         
        // anteriormente = Math.random()
        // aqui também existe o Math.random()
        //System.out.println(Math.random());
        
        // através desse cara podemos gerar ints aleatórios
        //Random r = new Random(); // é se criado um objeto
        //System.out.println(r.nextInt());
       
        //System.out.println("The random number is: " + ThreadLocalRandom.current().nextInt(0, 3));
        
        int number = ThreadLocalRandom.current().nextInt(0, 3);
        //System.out.println(String.format("The random number is: %d", number));
        /*Interpolação de texto no java:
            %s -> para textos
            %d -> para integer
            %.xf -> para numeros reais ou com casas decimais onde x representa o numero de casas decimais desejadas
        */
        
        //Integer convertNumber = Integer.valueOf("123");
        //System.out.println(convertNumber);
        
    }
    
}
