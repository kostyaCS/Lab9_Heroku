package ua.edu.ucu.apps.lab.decorators;

import ua.edu.ucu.apps.lab.flowers.Item;

public class RibbonDecorator extends ItemDecorator {
    private Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double price() {
        return 40 + item.price();
    }

    @Override
    public String getDescription() {
        return "Ribbon description.";
    }
}
