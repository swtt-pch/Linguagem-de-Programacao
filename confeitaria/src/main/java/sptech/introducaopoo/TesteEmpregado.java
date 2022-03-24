
package sptech.introducaopoo;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Analista de Sistemas", 5400.00);
        Empregado empregado2 = new Empregado("Maria", "Desenvolvedor jr.", 3000.00);
        empregado1.reajustarSalario(0.85);
        empregado2.reajustarSalario(0.95);
        System.out.println(String.format("Nome: %s\nCargo: %s\nSalário: %s", empregado1.getNome(), empregado1.getCargo(), empregado1.getSalario()));
        System.out.println(String.format("Nome: %s\nCargo: %s\nSalário: %s", empregado2.getNome(), empregado2.getCargo(), empregado2.getSalario()));
    }
}
