package brainacad.org;

public class LengthConverter {

    //millimeters
    public static double mmToCm(double mm) {
        return mm / 10.0;
    }

    public static double mmToDm(double mm) {
        return mm / 100.0;
    }

    public static double mmToM(double mm) {
        return mm / 1000.0;
    }

    public static double mmToKm(double mm) {
        return mm / 1_000_000.0;
    }

    //centimeters
    public static double cmToMm(double cm) {
        return cm * 10.0;
    }

    public static double cmToDm(double cm) {
        return cm / 10.0;
    }

    public static double cmToM(double cm) {
        return cm / 100.0;
    }

    public static double cmToKm(double cm) {
        return cm / 100_000.0;
    }

    //decimeters
    public static double dmToMm(double dm) {
        return dm * 100.0;
    }

    public static double dmToCm(double dm) {
        return dm * 10.0;
    }

    public static double dmToM(double dm) {
        return dm / 10.0;
    }

    public static double dmToKm(double dm) {
        return dm / 10_000.0;
    }

    //meters
    public static double mToMm(double m) {
        return m * 1000.0;
    }

    public static double mToCm(double m) {
        return m * 100.0;
    }

    public static double mToDm(double m) {
        return m * 10.0;
    }

    public static double mToKm(double m) {
        return m / 1000.0;
    }

    //kilometers
    public static double kmToMm(double km) {
        return km * 1_000_000.0;
    }

    public static double kmToCm(double km) {
        return km * 100_000.0;
    }

    public static double kmToDm(double km) {
        return km * 10_000.0;
    }

    public static double kmToM(double km) {
        return km * 1000.0;
    }
}
