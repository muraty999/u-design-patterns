package academy.learnprogramming.assignmentsolution;

public class Client {
    public static void main(String [] args) throws Exception
    {
        System.out.println("***Factory Pattern Demo***\n");
        AnimalFactory animalFactory = new ConcreteFactory();

        Animal duckType = animalFactory.GetAnimal("Duck");
        duckType.Speak();

        Animal tigerType = animalFactory.GetAnimal("Tiger");
        tigerType.Speak();

        Animal lionType = animalFactory.GetAnimal("Lion");
        lionType.Speak();
    }
}
