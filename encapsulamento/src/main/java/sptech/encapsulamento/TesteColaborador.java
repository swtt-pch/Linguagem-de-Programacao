
package sptech.encapsulamento;

public class TesteColaborador {
    public static void main(String[] args) {
        Colaborador colab1 = new Colaborador("Marcio", "Analista", 3000.00);
        Colaborador colab2 = new Colaborador("Carla", "Estagiario", 900.00);
        RecursosHumanos recHum = new RecursosHumanos();
        colab1.showColaborador();
        colab2.showColaborador();
        recHum.promoverColaborador(colab2, "Analista", 3000.00);
        recHum.promoverColaborador(colab1, "Senior", 2500.00);
        recHum.reajustarSalario(colab1, 2900.00);
        colab1.showColaborador();
        colab2.showColaborador();
        System.out.println(recHum.getTotalPromovidos());
        System.out.println(recHum.getTotalSalariosReajustados());
    }
}
