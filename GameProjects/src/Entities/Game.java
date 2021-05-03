package Entities;

import Abstract.Entity;

public class Game  implements Entity {
    private int id;
    private String Name;
    private double Price;
    private String Details;

    public Game(int id, String name, double price, String details) {
        this.id = id;
        this.Name = name;
        this.Price = price;
        this.Details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        this.Details = details;
    }
}
