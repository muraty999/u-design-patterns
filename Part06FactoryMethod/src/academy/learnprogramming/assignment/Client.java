package academy.learnprogramming.assignment;

public class Client {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal tiger = animalFactory.getAnimal("Tiger");
        tiger.walk();

        Animal duck = animalFactory.getAnimal("Duck");
        duck.walk();
    }
}
