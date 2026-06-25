package gcr-codebase.oops.Scenario;

class ChargingStation {
    static int totalStations = 0;
    static double electricityRate = 8.5;

    String stationId;
    int unitsConsumed;

    ChargingStation(String stationId, int unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Electricity Rate: ₹" + electricityRate);
        System.out.println("Bill Amount: ₹" + calculateBill());
        System.out.println();
    }

    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation("CS101", 100);
        ChargingStation s2 = new ChargingStation("CS102", 120);
        ChargingStation s3 = new ChargingStation("CS103", 90);
        ChargingStation s4 = new ChargingStation("CS104", 150);
        ChargingStation s5 = new ChargingStation("CS105", 110);

        System.out.println("Bills at Rate ₹" + electricityRate);
        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        // Change electricity rate
        electricityRate = 10.0;

        System.out.println("After Rate Change to ₹" + electricityRate);
        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations: " + totalStations);
    }
}