
package lista1;

import java.util.Scanner;

public class ExTres {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos minutos você passou se aquecendo? ");
        int aquecimento = leitor.nextInt();
        System.out.println("Quantos minutos você passou fazendo exercícios aeróbicos? ");
        int aerobicos = leitor.nextInt();
        System.out.println("Quantos minutos você passou fazendo exercícios de musculação? ");
        int musculacao = leitor.nextInt();
        int calorias = queimaCalorias(aquecimento, aerobicos, musculacao);
        int tempo = quantidadeMinutos(aquecimento, aerobicos, musculacao);
        System.out.println(String.format("Olá, Jorge. Você fez um total de %s minutos de exercícios e perdeu cerca de %s calorias", tempo, calorias));
    }
    
    public static int queimaCalorias(int a, int b, int c){
        int resultado = (a*12) + (b*20) + (c*25);
        return resultado;
    }
    
    public static int quantidadeMinutos(int a, int b, int c){
        return (a+b+c);
    }
}
