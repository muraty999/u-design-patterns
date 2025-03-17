package academy.learnprogramming.assignment;

public abstract class AbstractFactoryProducer {
    public abstract AbstractFactory getFactory(String type) throws Exception ;
}

class FactoryProducer extends AbstractFactoryProducer {
    public AbstractFactory getFactory(String type) throws Exception {
        AbstractFactory factoryProducer = null;

        factoryProducer = switch (type) {
            case "Bollywood" -> new BollywoodMovieFactory();
            case "Hollywood" -> new HollywoodMovieFactory();
            default -> throw new Exception("Unidentified factory type");
        };

        return factoryProducer;
    }
}

