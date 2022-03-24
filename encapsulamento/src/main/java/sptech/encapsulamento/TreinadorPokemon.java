
package sptech.encapsulamento;

public class TreinadorPokemon {
    private String nome;
    private Integer nivel = 1;
    private Integer xpBar = 10;
    private Integer currentXp = 0;

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void treinarPokemon(Pokemon pokemon){
        pokemon.setForca(pokemon.getForca() + (pokemon.getForca() * 0.10));
        pokemon.setDoces(pokemon.getDoces() + 10);
        evolve(2);
    }
    
    public void evoluirPokemon(Pokemon pokemon, String nomeEvolucao){
        if (pokemon.canEvolve()) {
            pokemon.evolve(nomeEvolucao);
            currentXp += 10;
            evolve();
        } else {
            System.out.println("Não foi possivel realizar a operação");
        }
    }
    
    private void evolve(){
        if(currentXp == xpBar){
            xpBar *= 2;
            nivel++;
            currentXp = 0;
            System.out.println(String.format("%s evoluiu para o nível %d", nome, nivel));
        }
    }
    
    private void evolve(Integer xp){
        nivel += xp;
    }

    @Override
    public String toString() {
        return "TreinadorPokemon{" + "nome=" + nome + ", nivel=" + nivel + '}';
    }
}
