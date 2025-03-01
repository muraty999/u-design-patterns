package academy.learnprogramming;

// the "delegate"
class RealPrinter {

    void print() {
        System.out.println("The Delegate");
    }
}

// the "delegator"
class Printer {

    // create the delegate
    RealPrinter p = new RealPrinter();

    void print() {
        p.print();  // delegation
    }
}

public class DelegationTester {
    // To the outside world it looks like Printer actually prints
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}

