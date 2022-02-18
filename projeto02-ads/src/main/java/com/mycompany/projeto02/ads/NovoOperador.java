
package com.mycompany.projeto02.ads;

public class NovoOperador {
    
    public static void main(String[] args) {
        
        /*boolean isStudent = true;
        
        String nome = isStudent == true? "Aluno Igor Gomes": "Igor Gomes";
        
        System.out.println(nome); */
        
        boolean isStudent = true;
        
        String resultado;
        
        if (isStudent) {
            resultado = "é aluno";
        } else {
            resultado = "não é aluno"; 
        }
        
        resultado = isStudent ? "sim" : "não";  
        
    }
    
}
