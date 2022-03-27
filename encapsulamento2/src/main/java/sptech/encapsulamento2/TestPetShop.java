
package sptech.encapsulamento2;

public class TestPetShop {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Bilu", "Husk");
        Pet pet2 = new Pet("Clarinha", "Poodle");
        PetShop petshop = new PetShop("Casinha do Pet");
        
        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(petshop);
        
        for (int i = 0; i < 5; i++) {
            if(petshop.verificarDesconto(pet1)){
                petshop.darBanho(pet1, 25.00, 5.00);
            } else{
                petshop.darBanho(pet1, 25.00);
            }
        }
        
        for (int i = 0; i < 6; i++) {
            if(petshop.verificarDesconto(pet2)){
                petshop.darBanho(pet2, 25.00, 5.00);
            } else{
                petshop.darBanho(pet2, 25.00);
            }
        }
        
        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(petshop);
    }
}
