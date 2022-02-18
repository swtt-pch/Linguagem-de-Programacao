
package lista1;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu login");
        String login = leitor.nextLine();
        System.out.println("Digite sua senha");
        String senha = leitor.nextLine();
        System.out.println("Digite a quantidade de tentativas de login");
        String tentativas = leitor.nextLine();
        System.out.println(String.format("Seu login é %s e sua senha é %s. Você tem %s tentativas antes de ser bloqueado", login, senha, tentativas));
    }
}
