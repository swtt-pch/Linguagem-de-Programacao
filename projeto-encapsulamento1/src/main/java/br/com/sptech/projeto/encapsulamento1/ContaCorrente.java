
package br.com.sptech.projeto.encapsulamento1;

public class ContaCorrente {
    private String nome;
    private Double saldo;
    
    public ContaCorrente(String nome, Double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(Double a){
        saldo -= a;
    }
    
    public void depositar(Double a){
        saldo += a;
    }
}
