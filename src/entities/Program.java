package entities;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        var item1 = new Item(12, new Produto("Cerveja", 2.99));
        var item2 = new Item(5, new Produto("Leite", 3.89));
        var item3 = new Item(1, new Produto("Sorvete", 18.50));
        var item4 = new Item(1, new Produto("Frango", 29.00));

        Carrinho carrinho = new Carrinho();
        carrinho.addItem(item1);
        carrinho.addItem(item2);
        carrinho.addItem(item3);
        carrinho.addItem(item4);

        carrinho.nota();

    }
}
