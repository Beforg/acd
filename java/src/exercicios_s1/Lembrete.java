package exercicios_s1;

public class Lembrete {
    private String descricao;
    private Data data;

    public Lembrete(Data data, String descricao) {
        this.descricao = descricao;
        this.data = data;
    }

    //assumi que não vamos usar getter e setter ainda para esses exercicios

    public void ajustarLembrete(Data data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public String imprimirLembrete() {
        return "Data: " + this.data.mostrarData() + ", Descrição: " + this.descricao;
    }
}
