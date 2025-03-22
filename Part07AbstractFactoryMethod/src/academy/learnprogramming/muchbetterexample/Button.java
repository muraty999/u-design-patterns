package academy.learnprogramming.muchbetterexample;

// Abstract Button
public interface Button {
    void render();
}

// Windows Button
class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows button");
    }
}

// macOS Button
class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering macOS button");
    }
}

