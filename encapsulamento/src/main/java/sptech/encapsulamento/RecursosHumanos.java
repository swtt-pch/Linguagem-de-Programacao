
package sptech.encapsulamento;

public class RecursosHumanos {
    private Integer totalPromovidos = 0;
    private Integer totalSalariosReajustados = 0;
    
    public Integer getTotalPromovidos(){
        return totalPromovidos;
    }
    
    public Integer getTotalSalariosReajustados(){
        return totalSalariosReajustados;
    }
    
    public void reajustarSalario(Colaborador colab, Double reajuste){
        colab.setSalario(reajuste);
        totalSalariosReajustados++;
    }
    
    public void promoverColaborador(Colaborador colab, String cargo, Double salario){
        if (salario > colab.getSalario()) {
            colab.setCargo(cargo);
            colab.setSalario(salario);    
            totalPromovidos++;
        } else {
            System.out.println("Operação inválida.");
            System.out.println("O salario informado tem que ser maior que o salario atual do colaborador");
        }
    }
}
