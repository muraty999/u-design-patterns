package academy.learnprogramming.singleresponsibility;

interface DisplayModule {
    public void display();
}

class Monitor implements DisplayModule {
    public void display()
    {
        System.out.println("Display through Monitor");
    }
}

class Project implements DisplayModule {
    public void display()
    {
        System.out.println("Display through projector");
    }
}

public class Computer {
    DisplayModule dm;

    public void setDisplayModule(DisplayModule dm)
    {
        this.dm=dm;
    }

    public void display()
    {
        dm.display();
    }

    public static void main(String args[])
    {
        Computer cm = new Computer();
        DisplayModule dm = new Monitor();
        DisplayModule dm1 = new Project();

        cm. setDisplayModule(dm);
        cm. display();
        cm. setDisplayModule(dm1);
        cm. display();
    }
}