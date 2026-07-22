package intefaces;
interface Trackable {
    void logActivity();
    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}// Interface 2
interface Reportable {
    void generateReport();
}// Interface 3
interface Notifiable {
    void sendAlert();
}

// Class implementing all three interfaces
class FitnessDevice implements Trackable, Reportable, Notifiable {

    public void logActivity() {
        System.out.println("Activity Logged: 5000 steps.");
    }

    public void generateReport() {
        System.out.println("Report: Calories Burned = 250");
    }
    public void sendAlert() {
        System.out.println("Alert: Time to drink water!");
    }
}

// Main class
public class Fitness {
    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();

        // Calling default method
        device.resetData();
    }
}