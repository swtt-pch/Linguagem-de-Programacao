/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.encapsulamento2;

/**
 *
 * @author igrey
 */
public class Pet {
    private String nome;
    private String raca;
    private Integer qtdVisitas;
    private Double valorGasto;

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.qtdVisitas = 0;
        this.valorGasto = 0.0;
    }

    public void setIncrementValorGasto(Double valorGasto) {
        this.valorGasto += valorGasto;
    }
    
    public void setIncrementQtdVisitas(){
        this.qtdVisitas++;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public Integer getQtdVisitas() {
        return qtdVisitas;
    }

    public Double getValorGasto() {
        return valorGasto;
    }

    @Override
    public String toString() {
        return String.format("Pet{ \n"
                + " nome: %s,\n"
                + " raca: %s,\n"
                + " qtdVisitas: %d,\n"
                + " valorGasto: %.2f\n"
                + "}", nome, raca, qtdVisitas, valorGasto);
    }
    
    
}
