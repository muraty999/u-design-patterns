package academy.learnprogramming.interfacesegregation.firstexample.notsegretaged;

public interface ShapeInterface {
    public double area();
    public double volume();
    public double calculate();
}

class Cube implements ShapeInterface {
    public double area() {
        return 4.0;
    }
    public double volume() {
        return 2.0;
    }
    public double calculate() {
        return area() * volume();
    }
}
class Square implements ShapeInterface {
    public double area() {
        return 2.0;
    }
    public double volume() {
        return 0.0;
    }
    public double calculate() {
        return area();
    }
}

