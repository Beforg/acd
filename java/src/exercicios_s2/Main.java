package exercicios_s2;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("123", "Produto A", 5, 10.0);
        System.out.println(invoice);
        System.out.println("Valor da fatura: " + invoice.getInvoice());
        Invoice invoice1 = new Invoice("456", "Produto B", 3, -2); // testando negativo
        System.out.println(invoice1.getInvoice());
        System.out.println(invoice1);
    }
}