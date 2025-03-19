package academy.learnprogramming.singleton.doublechecked;

public class Singleton {

    // the private reference to the one and only instance
    private volatile static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    /**
     * Note Singleton Constructor it is private!
     * No client can instantiate a Singleton object!
     */
    private Singleton() {}

    public static Singleton getInstance()
    {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {  // we only synchronize the first time through
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }
}

