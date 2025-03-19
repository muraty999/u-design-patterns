package academy.learnprogramming.singleton.eager;

public class Singleton {

    // the private reference to the one and only instance
    private static Singleton uniqueInstance = new Singleton();

    // an instance attribute
    private int data = 0;

    private Singleton() {
        System.out.println("Creating new instance of Singleton");
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }
}

