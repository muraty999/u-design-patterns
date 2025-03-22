package academy.learnprogramming.muchbetterexample;

public class Application {
    private GUIFactory factory;
    private Button button;
    private TextBox textBox;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = factory.createButton();
        this.textBox = factory.createTextBox();
    }

    public void renderUI() {
        button.render();
        textBox.render();
    }

    public static void main(String [] args) {
        // Choose the factory based on the OS
        String os = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;

        if (os.contains("win")) {
            factory = new WindowsFactory();
        } else if (os.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            // Default to Windows
            factory = new WindowsFactory();
        }

        Application app = new Application(factory);
        app.createUI();
        app.renderUI();
    }
}

