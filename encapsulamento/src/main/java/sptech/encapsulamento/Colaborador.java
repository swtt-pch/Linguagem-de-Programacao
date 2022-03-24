
package sptech.encapsulamento;

public class Colaborador {
    private String nome;
    private String cargo;
    private Double salario;
    
    public Colaborador(String a, String b, Double c){
        this.nome = a;
        this.cargo = b;
        this.salario = c;
    }

    public Double getSalario() {
        return salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public void showColaborador(){
        System.out.println(String.format("Nome: %s\n"
                + "Cargo: %s\n"
                + "Salario: R$%.2f", nome, cargo, salario));
    }
}
