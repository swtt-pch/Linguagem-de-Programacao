
package lista1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero");
        double n1 = leitor.nextDouble();
        System.out.println("Digite outro numero");
        double n2 = leitor.nextDouble();
        System.out.println("Resultado da soma");
        System.out.println(n1 + n2);
        System.out.println("Resultado da subtração");
        System.out.println(n1 - n2);
        System.out.println("Resultado da multiplicação");
        System.out.println(n1 * n2);
        System.out.println("Resultado da divisão");
        System.out.println(n1 / n2);
    }
}
