package exercicios_aula.moodle;

public class Interruptor {
    private ClasseLampada lampada;

    public Interruptor(ClasseLampada lampada) {
        this.lampada = lampada;
    }

    public void fecharCircuito() {
        this.lampada.desernegizar();
    }

    public void abrirCircuito() {
        this.lampada.energizar();
    }

    public static void main(String[] args) {
        ClasseLampada lampada = new ClasseLampada(false); // começa desligada
        Interruptor interruptor = new Interruptor(lampada);

        interruptor.abrirCircuito();
        System.out.println("Estado da lâmpada: " + lampada.mostrarEstado());
        interruptor.fecharCircuito();
        System.out.println("Estado da lâmpada: " + lampada.mostrarEstado());

    }
}
