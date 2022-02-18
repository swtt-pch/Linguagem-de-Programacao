package lista1;

import java.util.Scanner;

public class ExUm {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos filhos de 0 a 3 anos você possui?");
        int baby = leitor.nextInt();
        System.out.println("Quantos filhos de 4 a 16 anos você possui?");
        int kid = leitor.nextInt();
        System.out.println("Quantos filhos de 17 a 18 anos você possui?");
        int teen = leitor.nextInt();
        double valorBolsa = calculoBolsa(baby, kid, teen);
        int qtdFilhos = baby + kid + teen;
        System.out.println(String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa",qtdFilhos, valorBolsa));
    }
    
    public static double calculoBolsa(int a, int b, int c){
        double resultado = (a*25.12)+ (b*15.88) + (c*12.44);
        return resultado;
    }
}
