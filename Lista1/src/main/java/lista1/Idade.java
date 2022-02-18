
package lista1;

import java.util.Scanner;

public class Idade {
    int idade;
    String nome;
    
    Idade(String nome, int idade){
        this.nome = nome;
        this.idade = calculo(idade);
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String nome = leitor.nextLine();
        System.out.println(String.format("Olá, %s!!", nome));
        System.out.println("Qual seu ano de nascimento? ");
        int nascimento = leitor.nextInt();
        Idade idade = new Idade(nome, nascimento);
        idade.msg();
    }
    
    private static int calculo(int a){
        return 2030 - a;
    }
    
    void msg(){
        System.out.println(String.format("Em 2030 você terá %d", idade));
    }
}
