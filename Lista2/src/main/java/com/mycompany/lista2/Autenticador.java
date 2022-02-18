
package com.mycompany.lista2;

import java.util.Scanner;

public class Autenticador {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean validacao = false;
        String loginUsuario;
        String senhaUsuario;
        while(!validacao){
            System.out.println("Informe o login:");
            loginUsuario = leitor.nextLine();
            System.out.println("Informe a senha:");
            senhaUsuario = leitor.nextLine();
            if(loginUsuario.equals("admin") && senhaUsuario.equals("#Bandtec")){
                validacao = true;
                System.out.println("Login realizado com sucesso");
            } else{
                System.out.println("Login e/ou senha inválidos");
            }
        }
    }
}
