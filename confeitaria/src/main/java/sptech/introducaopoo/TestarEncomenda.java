
package sptech.introducaopoo;

public class TestarEncomenda {
    public static void main(String[] args) {
        Encomenda encomenda = new Encomenda('M', "Rua dos Palmares, 257", "Rua Divino Amaral, 77", 156.9, 70.50);
        
        encomenda.emitirEtiqueta();
    }
}   
