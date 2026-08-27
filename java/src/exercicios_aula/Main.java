package exercicios_aula;

import exercicios_aula.fatura.Cliente;
import exercicios_aula.fatura.Fatura;
import exercicios_aula.fatura.Item;

public class Main {
    static void main(String[] args) {

        Cliente cliente = new Cliente("Jose", "10242398765");
        Item item = new Item("1", "Notebook", 1, 2500.0);
        Item item2 = new Item(
                "2",
                "Caneta",
                2, 10);
        Fatura fatura = new Fatura(cliente);
        fatura.adicionarItem(item);
        fatura.adicionarItem(item2);

        System.out.printf("Valor total da fatura: %.2f%n", fatura.valorTotal());

    }


}
