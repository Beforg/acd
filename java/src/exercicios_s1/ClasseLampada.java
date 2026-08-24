package exercicios_s1;

public class ClasseLampada {
    private Boolean energizada;

    public ClasseLampada(Boolean energizada) {
        this.energizada = energizada;
    }

    public void energizar() {
        this.energizada = true;
    }

    public void desernegizar() {
        this.energizada = false;
    }

    public Boolean mostrarEstado() {
        return this.energizada;
    }

    public static void main(String[] args) {
        ClasseLampada lampada = new ClasseLampada(false); // começa desligada

        lampada.energizar();
        System.out.println("Lâmpada energizada: " + lampada.mostrarEstado()); // ativa
        lampada.desernegizar();
        System.out.println("Lâmpada desligada: " + lampada.mostrarEstado()); // desativa
    }
}
