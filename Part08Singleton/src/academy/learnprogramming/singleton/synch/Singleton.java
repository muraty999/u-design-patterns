package academy.learnprogramming.singleton.synch;

public class Singleton {

    private static Singleton uniqueInstance = null;
    private int data = 0;

    private Singleton() {}

    // by adding the synchronized keyword to getInstance(),
    // we force every thread to wait its turn before it can enter the method
    public static synchronized Singleton getInstance()
    {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();

        return uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }
}

