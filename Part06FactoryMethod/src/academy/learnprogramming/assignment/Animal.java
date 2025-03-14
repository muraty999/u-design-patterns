package academy.learnprogramming.assignment;

public interface Animal {
    void walk();
}

class Duck implements Animal {
    public void walk() {
        System.out.println("Inside Duck::walk() method.");
    }
}

class Tiger implements Animal {
    public void walk() {
        System.out.println("Inside Tiger::walk() method.");
    }
}
