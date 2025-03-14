package academy.learnprogramming.liskovsubstitutionprinciple;

abstract class Vehicle {
    abstract int getSpeed();
    abstract int getCubicCapacity();

    public static void main (String [] args) {

        Vehicle vehicle = new Bus();
        vehicle.getSpeed();
        vehicle = new Car();
        vehicle.getCubicCapacity();
    }
}

class Car extends Vehicle {
    int getSpeed() { return 0;}
    int getCubicCapacity() { return 0;}
    boolean sHatchBack() { return true; }
}

class Bus extends Vehicle
{
    int getSpeed() { return 0;}
    int getCubicCapacity() { return 0;}
    String getEmergencyExitLoc() { return "";}
}

