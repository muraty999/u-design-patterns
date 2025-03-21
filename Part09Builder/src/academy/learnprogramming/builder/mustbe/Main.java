package academy.learnprogramming.builder.mustbe;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("Intel i7", "16GB", "1TB SSD")
                .graphicsCard("Nvidia RTX 3080")
                .hasWifi(true)
                .build();

        System.out.println("CPU: " + computer.getCpu());
        System.out.println("RAM: " + computer.getRam());
        System.out.println("Graphics Card: " + computer.getGraphicsCard());
        System.out.println("Has Wifi: " + computer.hasWifi());
    }
}
