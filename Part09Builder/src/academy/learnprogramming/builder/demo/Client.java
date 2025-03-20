package academy.learnprogramming.builder.demo;

public class Client {
    public static void main(String [] args) {
        System.out.println("***Builder Pattern Demo***\n");

        Director director = new Director();

        // making a car
        BuilderInterface carBuilder = new CarBuilder();
        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        // making a motorcycle
        BuilderInterface motorBuilder = new MotorCycleBuilder();
        director.construct(motorBuilder);
        Product p2 = motorBuilder.getVehicle();
        p2.show();
    }
}

