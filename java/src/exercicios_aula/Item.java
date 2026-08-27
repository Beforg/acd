package exercicios_aula;

public class Item {
    private String codProduto;
    private String descricao;
    private int quantidade;
    private double preco;

    public Item(String codProduto, String descricao, int quantidade, double preco) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double valorTotal() {
        return this.quantidade*this.preco;
    }

    @Override
    public String toString() {
        return "Item{" +
                "codProduto='" + codProduto + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
