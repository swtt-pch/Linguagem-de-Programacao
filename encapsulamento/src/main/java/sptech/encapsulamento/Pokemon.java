
package sptech.encapsulamento;

public class Pokemon {
   private String nome;
   private String tipo;
   private Double forca;
   private Integer doces;

    public Pokemon(String nome, String tipo, Double forca, Integer doces) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        this.doces = doces == null ? 0 : doces;
        
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getForca() {
        return forca;
    }

    public Integer getDoces() {
        return doces;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public void setDoces(Integer doces) {
        this.doces = doces;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nome=" + nome + ", tipo=" + tipo + ", forca=" + forca + ", doces=" + doces + '}';
    }
   
    public boolean canEvolve(){
        return doces >= 50;
    }
   
    public void evolve(String nomeEvolucao){
        System.out.println(String.format("Pokémon %s evoluiu para -> %s", nome, nomeEvolucao));
        nome = nomeEvolucao;
        doces -= 50;
    }
}
