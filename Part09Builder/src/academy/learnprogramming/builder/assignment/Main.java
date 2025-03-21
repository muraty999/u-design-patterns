package academy.learnprogramming.builder.assignment;

public class Main {
    public static void main(String[] args) {
        IMealBuilder mealBuilder = new VegMealBuilder();
        mealBuilder.add(new Burger("Big", 350.0));
        mealBuilder.add(new Drink("Pınar", 35.0));
        Meal meal = mealBuilder.getMeal();
        System.out.println(meal.getName());
        meal.showItems();
        System.out.println(meal.getCost());

        System.out.println();
        mealBuilder = new NonVegMealBuilder();
        mealBuilder.add(new Burger("Child", 150.0));
        mealBuilder.add(new Drink("Lemonade", 35.0));
        meal = mealBuilder.getMeal();
        System.out.println(meal.getName());
        meal.showItems();
        System.out.println(meal.getCost());
    }
}
