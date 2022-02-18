
package lista1;

import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o limite de peso do elevador?");
        double pesoElevador = leitor.nextDouble();
        System.out.println("Qual o limite máximo de pessoas no elevador?");
        int limiteElevador = leitor.nextInt();
        System.out.println("Qual o peso da pessoa 1?");
        double pesoPessoas = leitor.nextDouble();
        System.out.println("Qual o peso da pessoa 2?");
        pesoPessoas += leitor.nextDouble();
        System.out.println("Qual o peso da pessoa 3?");
        pesoPessoas += leitor.nextDouble();
        System.out.println(String.format("Entraram 3 pessoas no elevador, no qual cabem %d pessoas.\n" +
"O peso total no elevador é de %.1f, sendo que ele suporta %.1f", limiteElevador, pesoPessoas, pesoElevador));
    }
 
}
