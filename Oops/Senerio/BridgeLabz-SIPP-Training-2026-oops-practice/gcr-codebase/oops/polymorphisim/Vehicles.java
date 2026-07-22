package gcr-codebase.polymorphisim;

// Parent class
class Vehicle {

    void fuelCost(int km) {
        System.out.println("Fuel Cost");
    }
}

// Child class 1
class Car extends Vehicle {

    void fuelCost(int km) {
        System.out.println("Car Fuel Cost = " + (km * 8));
    }
}

// Child class 2
class Bus extends Vehicle {

    void fuelCost(int km) {
        System.out.println("Bus Fuel Cost = " + (km * 15));
    }
}

// Child class 3
class Bike extends Vehicle {

    void fuelCost(int km) {
        System.out.println("Bike Fuel Cost = " + (km * 3));
    }
}

// New class (Open/Closed Principle)
class ElectricCar extends Vehicle {

    void fuelCost(int km) {
        System.out.println("Electric Car Charging Cost = " + (km * 2));
    }
}

// Main class
public class Vehicles {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car(),
            new Bus(),
            new Bike(),
            new ElectricCar()
        };

        int km = 10;

        for (Vehicle v : vehicles) {

            if (v instanceof Car) {
                ((Car) v).fuelCost(km);
            }
            else if (v instanceof Bus) {
                ((Bus) v).fuelCost(km);
            }
            else if (v instanceof Bike) {
                ((Bike) v).fuelCost(km);
            }
            else if (v instanceof ElectricCar) {
                ((ElectricCar) v).fuelCost(km);
            }
        }
    }
}