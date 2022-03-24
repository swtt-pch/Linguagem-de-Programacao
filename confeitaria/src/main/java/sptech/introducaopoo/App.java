
package sptech.introducaopoo;

public class App {
    public static void main(String[] args) {
        Bolo boloMorango = new Bolo("Morango", 15.15);
        Bolo boloChocolate = new Bolo("Chocolate", 14.20);
        Bolo boloFuba = new Bolo("Fubá", 11.40);
        
        boloMorango.comprarBolo(20);
        boloMorango.comprarBolo(15);
        boloMorango.comprarBolo(10);
        boloMorango.comprarBolo(15);
        boloMorango.comprarBolo(5);
        
        boloChocolate.comprarBolo(30);
        boloChocolate.comprarBolo(20);
        boloChocolate.comprarBolo(15);
        boloChocolate.comprarBolo(20);
        boloChocolate.comprarBolo(30);
        
        boloFuba.comprarBolo(40);
        boloFuba.comprarBolo(10);
        boloFuba.comprarBolo(10);
        boloFuba.comprarBolo(10);
        boloFuba.comprarBolo(10);
        
        boloMorango.exibirRelatorio();
        boloChocolate.exibirRelatorio();
        boloFuba.exibirRelatorio();
        
    }
}
