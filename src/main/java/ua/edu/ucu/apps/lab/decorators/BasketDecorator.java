package ua.edu.ucu.apps.lab.decorators;

import ua.edu.ucu.apps.lab.flowers.Item;

public class BasketDecorator extends ItemDecorator {
    private Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double price() {
        return 4 + item.price();
    }

    @Override
    public String getDescription() {
        return "Basket decription.";
    }
}
