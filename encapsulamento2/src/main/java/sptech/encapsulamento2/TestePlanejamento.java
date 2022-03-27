/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.encapsulamento2;

/**
 *
 * @author igrey
 */
public class TestePlanejamento {
    public static void main(String[] args) {
        Planejamento plan = new Planejamento("Entrega de trabalho", "Igor Gomes", 5);
        plan.terminarAtividade(5);
        System.out.println(plan.calcularTempo());
        System.out.println(plan);
    }
}
