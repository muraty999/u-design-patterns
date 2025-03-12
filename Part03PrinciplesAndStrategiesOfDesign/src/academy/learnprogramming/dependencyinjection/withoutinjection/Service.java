package academy.learnprogramming.dependencyinjection.withoutinjection;

class ServiceA {
    public void write(String message)
    {
        System.out.println("Hello World");
    }
}

class Client {
    private ServiceA myService;

    public Client () {
        this.myService = new ServiceA();
    }

    public void doSomething() {
        myService.write("This is a message");
    }

    public static void main(String [] args) {
        Client client = new Client(); // injects via the constructor
        client.doSomething();
    }
}

