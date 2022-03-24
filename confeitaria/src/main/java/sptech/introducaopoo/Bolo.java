
package sptech.introducaopoo;

public class Bolo {
    String sabor;
    Double valor;
    Integer qtdVendida = 0;
    
    public Bolo(String sabor, Double valor){
        this.sabor = sabor;
        this.valor = valor;
    }
    
    void comprarBolo(Integer qtd){
        qtdVendida += qtd;
        if(qtdVendida>100){
            System.out.println("Seu pedido ultrapassou nosso limite diário para o bolo de " + sabor);
            qtdVendida -= qtd;
        }
    }
    
    void exibirRelatorio(){
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f", sabor, qtdVendida, qtdVendida*valor));
    }
            
}
