package academy.learnprogramming.builder.assignment;

public interface IMealBuilder {
    void add(ItemInterface item);
    Meal getMeal();
}

class VegMealBuilder implements IMealBuilder {
    Meal meal = new Meal("Vegan Meal");

    public void add(ItemInterface item) {
        meal.addItem(item);
    }

    public Meal getMeal() {
        return meal;
    }
}

class NonVegMealBuilder implements IMealBuilder {
    Meal meal = new Meal("Non-Vegan Meal");

    public void add(ItemInterface item) {
        meal.addItem(item);
    }

    public Meal getMeal() {
        return meal;
    }
}


