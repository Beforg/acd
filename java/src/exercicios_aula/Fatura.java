package exercicios_aula;

import java.util.ArrayList;
import java.util.List;

public class Fatura {
    private Cliente cliente;
    private final List<Item> itens = new ArrayList<>();

    public Fatura(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItens() {
        return this.itens;
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
        System.out.println("Item adicionado: " + item.toString());
    }

    public double valorTotal() {
        double valor = 0;
        for (Item item : this.itens) {
            valor += item.valorTotal();
        }
        return valor;
    }
}
