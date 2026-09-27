package exercicios_aula.interruptor;

public class Bateria {
    private int carga;

    public Bateria(int carga) {
        this.carga = carga;
    }

    public boolean temEnergia() {
        return carga > 0;
    }

    public void consumir() {
        this.carga--;
    }
}
