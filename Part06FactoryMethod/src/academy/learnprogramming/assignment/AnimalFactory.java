package academy.learnprogramming.assignment;

public class AnimalFactory {
    public Animal getAnimal(String animalType) {
        if (animalType==null)
            return null;

        if (animalType.equalsIgnoreCase("Tiger"))
            return new Tiger();
        else if (animalType.equalsIgnoreCase("Duck"))
            return new Duck();

        return null;
    }
}
