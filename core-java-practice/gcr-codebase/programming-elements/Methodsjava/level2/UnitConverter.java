package JavaMethods.level2;

public class UnitConverter {
      public static double kmToMiles(double km) { return km * 0.621371; }
    public static double milesToKm(double m) { return m * 1.60934; }
    public static double mToFeet(double m) { return m * 3.28084; }
    public static double feetToM(double f) { return f * 0.3048; }
    public static double yardsToFeet(double y) { return y * 3; }
    public static double feetToYards(double f) { return f * 0.333333; }
    public static double mToInch(double m) { return m * 39.3701; }
    public static double inchToM(double i) { return i * 0.0254; }
    public static double inchToCm(double i) { return i * 2.54; }
    public static double fToC(double f) { return (f - 32) * 5.0 / 9; }
    public static double cToF(double c) { return (c * 9.0 / 5) + 32; }
    public static double lbToKg(double lb) { return lb * 0.453592; }
    public static double kgToLb(double kg) { return kg * 2.20462; }
    public static double galToL(double g) { return g * 3.78541; }
    public static double lToGal(double l) { return l * 0.264172; }

    public static void main(String[] a) {
        System.out.println("10 km in miles=" + kmToMiles(10));
        System.out.println("5 gal in liters=" + galToL(5));
    }
}
