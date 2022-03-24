
package sptech.introducaopoo;

public class Encomenda {
    Character tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;
    
    Encomenda(char a, String b, String c, Double d, Double e){
        tamanho = a;
        enderecoRemetente = b;
        enderecoDestinatario = c;
        distancia = d;
        valorEncomenda = e;
    }

    
    public double calcularTotal(){
        return (calcularFrete() + valorEncomenda);
    }
    
    public double calcularFrete(){
        return (valorEncomenda * getPorcentTamanho()) + getValorDistancia();
    }
    
    public double getPorcentTamanho(){
        if(tamanho.equals('P')|| tamanho.equals('p')) {
            return 0.01;
        } else if (tamanho.equals('M')|| tamanho.equals('m')){
            return 0.03;
        } else if (tamanho.equals('G')|| tamanho.equals('g')){
            return 0.05;
        }
        return 0;
    }
    
    public String getTamanhoString(){
        if(tamanho.equals('P')|| tamanho.equals('p')) {
            return "Pequeno";
        } else if (tamanho.equals('M')|| tamanho.equals('m')){
            return "Médio";
        } else if (tamanho.equals('G')|| tamanho.equals('g')){
            return "Grande";
        }
        return "Undefined";
    }
    
    public double getValorDistancia(){
        if(distancia<= 50.0){
            return 3.00;
        } else if(distancia <= 200.0){
            return 5.00;
        } else if (distancia> 200.0){
            return 7.00;
        }
        return 0;
    }
    
    public String getLinha(){
        return "-----------------------------------------";
    }
    
    public void emitirEtiqueta(){
        System.out.println(String.format("***** ETIQUETA PARA ENVIO *****\n"
                + "Endereço do remetente: %s\n"
                + "Endereço do destinatário: %s\n"
                + "Tamanho: %s\n"
                + "%s\n"
                + "Valor da encomenda: %.2f\n"
                + "Valor do frete: %.2f\n"
                + "%s\n"
                + "Valor total: %.2f", enderecoRemetente, enderecoDestinatario, getTamanhoString(), getLinha(), valorEncomenda, calcularFrete(), getLinha(), calcularTotal()));
    }
}
