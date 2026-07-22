// 1.Build a fitness tracker: interfaces Trackable (logActivity()), Reportable
// (generateReport()), Notifiable (sendAlert()). Class FitnessDevice
// implements all three. Add a default method resetData() to Trackable.
// Demonstrate multiple interface implementation Java cannot do with
// classes.

import java.util.ArrayList;
import java.util.List;

interface Trackable {
    void logActivity(String activity);

    default void resetData() {
        System.out.println("Trackable data has been reset to default values.");
    }
}

interface Reportable {
    String generateReport();
}

interface Notifiable {
    void sendAlert(String message);
}

class FitnessDevice implements Trackable, Reportable, Notifiable {
    private final List<String> activityLog = new ArrayList<>();

    @Override
    public void logActivity(String activity) {
        activityLog.add(activity);
        System.out.println("Logged activity: " + activity);
    }

    @Override
    public String generateReport() {
        if (activityLog.isEmpty()) {
            return "No activities logged yet.";
        }
        StringBuilder report = new StringBuilder("Fitness device report:\n");
        for (int i = 0; i < activityLog.size(); i++) {
            report.append(i + 1).append(". ").append(activityLog.get(i)).append("\n");
        }
        return report.toString();
    }

    @Override
    public void sendAlert(String message) {
        System.out.println("Alert: " + message);
    }
}

public class FitnessTracker {
    public static void main(String[] args) {
        FitnessDevice device = new FitnessDevice();

        device.logActivity("Morning run - 5 km");
        device.logActivity("Cycling - 20 km");

        System.out.println(device.generateReport());

        device.sendAlert("Time to hydrate and rest!");
        device.resetData();

        System.out.println("=== After reset ===");
        System.out.println(device.generateReport());

        // Java allows a class to implement multiple interfaces,
        // but it cannot extend more than one class.
        // Example: `class FitnessDevice extends DeviceA, DeviceB {}` is invalid.
    }
}

