package exercicios_aula.moodle;

public class Compromisso {
    private String descricao;
    private Data data;
    private Hora hora;

    public Compromisso(String descricao, Data data, Hora hora) {
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
    }

    public void ajustarCompromisso(String descricao, Data data, Hora hora) {
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
    }

    public String imprimirCompromisso() {
        return this.data.mostrarData() + " " + this.hora.imprimirHora() + " - " + this.descricao;
    }
}
