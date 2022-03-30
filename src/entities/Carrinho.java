package entities;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Item> items = new ArrayList<>();

    public Carrinho() {
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void nota() {
        var total = 0.0;
        var subTotal = 0.0;
        for (Item x : items) {
            System.out.println("Produto: " + x.getProduto().getNome());
            System.out.println("Preço R$: " + x.getProduto().getPreco());
            System.out.println("Quantidade: " + x.getQuantidade());
            subTotal += x.subTotal();
            System.out.println("Valor Pacial R$: " + String.format("%.2f", subTotal));
            total += x.subTotal();
            System.out.println("========================================================");
        }

        System.out.println("Total da compra R$: " + String.format("%.2f", total));
    }

}
