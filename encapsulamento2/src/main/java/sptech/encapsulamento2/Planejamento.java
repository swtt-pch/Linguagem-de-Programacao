
package sptech.encapsulamento2;

public class Planejamento {
    private String atividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    public Planejamento(String atividade, String responsavel, Integer diasEstimados) {
        this.atividade = atividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }
    
    void terminarAtividade(Integer diasUsados){
        this.diasUsados += diasUsados;
    }
    
    String calcularTempo(){
        if (this.diasUsados > this.diasEstimados) {
            return String.format("Você estimou %d dias, mas a tarefa foi feita em %d dias (%d dias a mais que o estimado). Melhore a estimativa", this.diasEstimados, this.diasUsados, (this.diasUsados - this.diasEstimados));
        } else if(this.diasUsados < this.diasEstimados){
            return String.format("Você estimou %d dias, mas a tarefa foi feita em %d dias (%d dias a menos que o estimado). Parabens!", this.diasEstimados, this.diasUsados, (this.diasEstimados - this.diasUsados));
        }
        
        return String.format("Você estimou %d dias, mas a tarefa foi feita em %d dias, atendendo a estimativa com precisão", this.diasEstimados, this.diasUsados);
    }

    @Override
    public String toString() {
        return String.format("Planejamento{\n"
                + " atividade: %s,\n"
                + " responsavel: %s,\n"
                + " diasEstimados: %d,\n"
                + " diasUsados: %d\n"
                + "}", atividade, responsavel, diasEstimados, diasUsados);
    }
    
}
