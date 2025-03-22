package academy.learnprogramming.muchbetterexample;

public interface GUIFactory {
    Button createButton();
    TextBox createTextBox();
}

// Windows Factory
class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}

// macOS Factory
class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MacOSTextBox();
    }
}


