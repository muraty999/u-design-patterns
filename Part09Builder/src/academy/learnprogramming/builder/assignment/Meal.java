package academy.learnprogramming.builder.assignment;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private final List<ItemInterface> list = new ArrayList<ItemInterface>();
    private String name = "";

    public Meal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addItem(ItemInterface item) {
        list.addLast(item);
    }

    public void showItems() {
        list.forEach(System.out::println);
    }

    public double getCost() {
        double cost = 0.0;
        for (ItemInterface item : list) {
            cost += item.getPrice();
        }
        return cost;
    }
}
