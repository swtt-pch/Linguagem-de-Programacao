
package sptech.introducaopoo;

public class Empregado {
    private String nome;
    private String cargo;
    private Double salario;
    
    public Empregado (String nome, String cargo, Double salario) {
        this.cargo = cargo;
        this.nome = nome;
        this.salario = salario;
        System.out.println("Empregado criado!");
    }
    
    public void reajustarSalario(double reajustePorcent) {
        this.salario = this.salario * reajustePorcent;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSalario() {
        return salario;
    }
    
    
}
