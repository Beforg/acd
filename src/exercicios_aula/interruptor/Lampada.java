package exercicios_aula.interruptor;

public class Lampada {
    private boolean acesa;
    private Bateria bateria;

    public Lampada(boolean acesa, Bateria bateria) {
        this.acesa = acesa;
        this.bateria = bateria;
    }

    public void atualizarEstado(boolean ligado) {
        this.acesa = ligado;
    }
}
