package ua.edu.ucu.apps.lab.decorators;

import ua.edu.ucu.apps.lab.flowers.Item;

public class PaperDecorator extends ItemDecorator {
    private Item item;

    @Override
    public double price() { return 13 + item.price(); }

    @Override
    public String getDescription() {
        return "Description of paper.";
    }

    public PaperDecorator(Item item) {
        this.item = item;
    }
}
