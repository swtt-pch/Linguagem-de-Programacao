
package lista1;

import java.util.Scanner;

public class CalculoMedia {
    double nota1;
    double nota2;
    double media;
    String nome;
    
    CalculoMedia(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = calcularMedia(nota1, nota2);
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = leitor.nextLine();
        System.out.println("Digite a nota um: ");
        Double nota1 = leitor.nextDouble();
        System.out.println("Digite a nota dois: ");
        Double nota2 = leitor.nextDouble();
        CalculoMedia media = new CalculoMedia(nome, nota1, nota2);
        media.mensagem();
    }
    
    private static double calcularMedia(double a, double b){
        return (a + b) / 2;
    }
    
    void mensagem(){
        System.out.println(String.format("Olá, %s. Sua média foi de %.1f", nome, media));
    }
}
