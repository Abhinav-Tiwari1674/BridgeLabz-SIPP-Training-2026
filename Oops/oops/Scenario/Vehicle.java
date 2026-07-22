package gcr-codebase.oops.Scenario;

class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                System.out.println(v.vehicleNumber + " - " + v.ownerName);
            }
        }
    }

    static void displayBikes(Vehicle[] vehicles) {
        System.out.println("\nBikes:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                System.out.println(v.vehicleNumber + " - " + v.ownerName);
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP01A101", "Amit", "Car");
        vehicles[1] = new Vehicle("UP01A102", "Rahul", "Bike");
        vehicles[2] = new Vehicle("UP01A103", "Priya", "Car");
        vehicles[3] = new Vehicle("UP01A104", "Ankit", "Bike");
        vehicles[4] = new Vehicle("UP01A105", "Neha", "Car");
        vehicles[5] = new Vehicle("UP01A106", "Rohan", "Bike");
        vehicles[6] = new Vehicle("UP01A107", "Karan", "Car");
        vehicles[7] = new Vehicle("UP01A108", "Simran", "Bike");
        vehicles[8] = new Vehicle("UP01A109", "Vikas", "Car");
        vehicles[9] = new Vehicle("UP01A110", "Pooja", "Bike");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}