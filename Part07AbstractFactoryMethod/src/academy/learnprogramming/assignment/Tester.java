package academy.learnprogramming.assignment;

public class Tester {
    public static void main(String[] args) throws Exception {
        System.out.println("Action movies");
        System.out.println(new FactoryProducer().getFactory("Bollywood").getBollywoodMovie("Action").getName());
        System.out.println(new FactoryProducer().getFactory("Hollywood").getHollywoodMovie("Action").getName());

        System.out.println();
        System.out.println("Comedy movies");
        System.out.println(new FactoryProducer().getFactory("Bollywood").getBollywoodMovie("Comedy").getName());
        System.out.println(new FactoryProducer().getFactory("Hollywood").getHollywoodMovie("Comedy").getName());

    }
}

