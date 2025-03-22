package academy.learnprogramming.muchbetterexample;

// Abstract TextBox
public interface TextBox {
    void render();
}

// Windows TextBox
class WindowsTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Rendering Windows text box");
    }
}

// macOS TextBox
class MacOSTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Rendering macOS text box");
    }
}

