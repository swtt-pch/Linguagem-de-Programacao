
package lista1;

import java.util.Scanner;

public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor unitário do produto?");
        double vlrUnitario = leitor.nextDouble();
        System.out.println("Qual a quantidade vendida?");
        int qtd = leitor.nextInt();
        System.out.println("Quanto o cliente pagou?");
        double vlrPago = leitor.nextDouble();
        double vlrProduto = vlrUnitario * qtd;
        double resultado = calculo(vlrProduto, vlrPago);
        
        if(resultado < 0){
            System.out.println("Está faltando dinheiro ainda... ");
        } else {
            System.out.println(String.format("Seu troco será de R$ %.2f", resultado));
        }
    }
    
    static double calculo(double produto, double cliente){
        return cliente - produto;
    }
}
