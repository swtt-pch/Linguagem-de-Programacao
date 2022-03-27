/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.encapsulamento2;

/**
 *
 * @author igrey
 */
public class PetShop {
    private String nome;
    private Double faturamento;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamento = 0.0;
    }
    
    public Boolean verificarDesconto(Pet pet){
        return pet.getQtdVisitas() > 4 || pet.getValorGasto() > 99.99;
    }
    
    void darBanho(Pet pet, Double valor){
        System.out.println(String.format("Dando banho em %s, um pet de raça %s", pet.getNome(), pet.getRaca()));
        faturamento += valor;
        pet.setIncrementQtdVisitas();
        pet.setIncrementValorGasto(valor);
        
    }
    
    void darBanho(Pet pet, Double valor, Double desconto){
        System.out.println(String.format("Dando banho em %s, um pet de raça %s", pet.getNome(), pet.getRaca()));
        faturamento += valor-desconto;
        pet.setIncrementQtdVisitas();
        pet.setIncrementValorGasto(valor-desconto);
    }

    @Override
    public String toString() {
        return String.format("PetShop{\n"
                + " nome: %s, \n"
                + " faturamento: %.2f\n"
                + "}", nome, faturamento);
    }
    
    
}
