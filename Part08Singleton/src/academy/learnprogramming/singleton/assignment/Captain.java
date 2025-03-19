package academy.learnprogramming.singleton.assignment;

public class Captain {
    private Captain() {}
    private String name;

    private class CaptainHelper {
        private final static Captain instance = new Captain();
    }

    public static Captain getInstance() {
        return CaptainHelper.instance;
    }

    public String getCaptainName() {
        return name;
    }

    public void setCaptainName(String name) {
        this.name = name;
    }
}

