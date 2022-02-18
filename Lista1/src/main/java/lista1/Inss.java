
package lista1;

import java.util.Scanner;

public class Inss {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual seria o seu salário bruto? ");
        double salarioBruto = leitor.nextDouble();
        System.out.println("Quanto você gasta na ida a firma? ");
        double transporte = leitor.nextDouble();
        double inss = inss(salarioBruto);
        double ir = ir(salarioBruto);
        double vt = vt(salarioBruto);
        double descontos = inss + ir + vt;
        double salarioLiquido = salarioLiquido(salarioBruto, descontos);
        System.out.println(String.format("Seu salário bruto é R$%.2f, tem um total de R$%.2f em descontos e receberá um líquido de R$%.2f",salarioBruto, descontos, salarioLiquido));
    }
    
    static double inss(double a){
        return a * 0.10;
    }
    
    static double ir(double a){
        return a * 0.20;
    }
    
    static double vt(double a){
        return a * 2 * 0.22;
    }
    
    static double salarioLiquido(double a, double b){
        return a - (b);
    }
}
