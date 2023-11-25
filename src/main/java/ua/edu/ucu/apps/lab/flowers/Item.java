package ua.edu.ucu.apps.lab.flowers;

public abstract class Item {
    private String description;
    
    public abstract double price();

    public String getDescription() {
        return description;
    }
}