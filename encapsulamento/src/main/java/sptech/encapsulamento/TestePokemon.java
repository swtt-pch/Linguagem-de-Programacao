
package sptech.encapsulamento;

public class TestePokemon {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Pikachu", "Elétrico", 100.5, 0);
        Pokemon pokemon2 = new Pokemon("Squirtle", "Água", 105.2, 0);
        System.out.println(pokemon1.toString());
        System.out.println(pokemon2.toString());
        
        TreinadorPokemon treinador = new TreinadorPokemon();
        treinador.setNome("Igor");
        for (int i = 0; i < 6; i++) {
            treinador.treinarPokemon(pokemon2);
        }
        System.out.println(pokemon2.toString());
        treinador.evoluirPokemon(pokemon2, "Wartortle");
        System.out.println(pokemon2.toString());
        
        for (int i = 0; i < 2; i++) {
            treinador.treinarPokemon(pokemon1);
        }
        System.out.println(pokemon1.toString());
        treinador.evoluirPokemon(pokemon2, "Raichu");
        
        System.out.println(treinador.toString());
    }
}
