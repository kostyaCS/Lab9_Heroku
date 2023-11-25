package ua.edu.ucu.apps.lab;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import ua.edu.ucu.apps.lab.decorators.BasketDecorator;
import ua.edu.ucu.apps.lab.decorators.PaperDecorator;
import ua.edu.ucu.apps.lab.decorators.RibbonDecorator;
import ua.edu.ucu.apps.lab.flowers.Flower;

public class DecoratorsTests {
    Flower flower = new Flower(1, "RED", 12.5, 23.4);
    BasketDecorator basketDecorator = new BasketDecorator(flower);
    PaperDecorator paperDecorator = new PaperDecorator(flower);
    RibbonDecorator ribbonDecorator = new RibbonDecorator(flower);

    @Test
    public void testPrice() {
        Assertions.assertEquals(basketDecorator.price(), 104);
        Assertions.assertEquals(paperDecorator.price(), 113);
        Assertions.assertEquals(ribbonDecorator.price(), 140);
    }
}
