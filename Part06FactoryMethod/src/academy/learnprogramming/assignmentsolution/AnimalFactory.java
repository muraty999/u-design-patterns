package academy.learnprogramming.assignmentsolution;

public abstract class AnimalFactory {
    public abstract Animal GetAnimal(String type) throws Exception;
}

class ConcreteFactory extends AnimalFactory
{
    @Override
    public Animal GetAnimal (String type) throws Exception
    {
        return switch (type) {
            case "Duck" -> new Duck();
            case "Tiger" -> new Tiger();
            default -> throw new Exception("Animal type: " + type + " cannot be instantiated");
        };
    }
}
