
package sptech.introducaopoo;

public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        
        termometro.tempMax = 30.0;
        termometro.tempMin = -5.0;
        termometro.tempAtual = 20.0;
        System.out.println(String.format("Temperatura atual: %.2f", termometro.tempAtual));
        termometro.aumentarTemp(32.2);
        System.out.println(String.format("Temperatura atual: %.2f", termometro.tempAtual));
        termometro.diminuiTemp(50.2);
        System.out.println(String.format("Temperatura atual: %.2f", termometro.tempAtual));
        termometro.aumentarTemp(22.6);
        termometro.exibirFahreinheit();
    }
}
