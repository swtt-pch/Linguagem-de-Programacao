
package sptech.introducaopoo;

public class Termometro {
    Double tempAtual;
    Double tempMax;
    Double tempMin;
    
    public void aumentarTemp(double temp) {
        tempAtual += temp;
        if(temp > tempMax){
            tempAtual = tempMax;
        }
    }
    
    public void diminuiTemp(double temp){
        tempAtual -= temp;
        if(tempAtual < tempMin){
            tempAtual = tempMin;
        }
    }
    
    public void exibirFahreinheit(){
        System.out.println("Celsius: "+ tempAtual +", Fahreinheit: "+ ((tempAtual * 9/5) + 32));
    }
}
