
package com.mycompany.lista2;

public class ContadorVariado {
    public static void main(String[] args) {
        double contador = 0.15;
        while(contador <= 5){
            System.out.println(String.format("%.2f", contador));
            contador += 0.15;
        }
    }
}
