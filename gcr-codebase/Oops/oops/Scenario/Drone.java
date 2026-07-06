package gcr-codebase.oops.Scenario;

class Drone {
    String droneId;
    int batteryPercentage;

    static String companyName = "Sky Logistics";

    Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    void startDelivery() {
        if (batteryPercentage >= 20) {
            System.out.println(droneId + " started delivery.");
            batteryPercentage -= 20;
        } else {
            System.out.println(droneId + " has low battery. Cannot start delivery.");
        }
    }

    void displayStatus() {
        System.out.println("Drone ID: " + droneId);
        System.out.println("Battery: " + batteryPercentage + "%");
        System.out.println("Company: " + companyName);
        System.out.println();
    }

    public static void main(String[] args) {

        Drone d1 = new Drone("D101", 90);
        Drone d2 = new Drone("D102", 60);
        Drone d3 = new Drone("D103", 15);

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        System.out.println("\nDrone Status:");
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        System.out.println("All drones belong to: " + Drone.companyName);
    }
}
