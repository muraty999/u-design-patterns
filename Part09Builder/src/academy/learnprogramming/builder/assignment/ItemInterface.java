package academy.learnprogramming.builder.assignment;

public interface ItemInterface {
    String getName();
    double getPrice();
    Packing getPacking();
}

class Burger implements ItemInterface {
    Packing packing = new Packing() { public String pack() { return "Wrapper"; }};
    private final String name;
    private final double price;

    public Burger(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public Packing getPacking() {
        return packing;
    }

    public String toString() {
        return "Item: " + this.getName()+ ", Packing: Wrapper, Cost: " + this.getPrice();
    }
}

class Drink implements ItemInterface {
    Packing packing = new Packing() { public String pack() { return "Drink"; }};
    private final String name;
    private final double price;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public Packing getPacking() {
        return packing;
    }

    public String toString() {
        return "Item: " + this.getName()+ ", Packing: Bottle, Cost: " + this.getPrice();
    }
}

