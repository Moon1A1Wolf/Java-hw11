package brainacad.org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value:");
        double value = scanner.nextDouble();

        System.out.println("Choose the unit of input (mm, cm, dm, m, km):");
        String fromUnit = scanner.next();

        System.out.println("Choose the unit of output (mm, cm, dm, m, km):");
        String toUnit = scanner.next();

        double result = convertLength(value, fromUnit, toUnit);
        System.out.printf("%.3f %s = %.3f %s%n", value, fromUnit, result, toUnit);

        scanner.close();
    }

    private static double convertLength(double value, String from, String to) {
        switch (from.toLowerCase()) {
            case "mm":
                switch (to.toLowerCase()) {
                    case "cm": return LengthConverter.mmToCm(value);
                    case "dm": return LengthConverter.mmToDm(value);
                    case "m": return LengthConverter.mmToM(value);
                    case "km": return LengthConverter.mmToKm(value);
                }
                break;
            case "cm":
                switch (to.toLowerCase()) {
                    case "mm": return LengthConverter.cmToMm(value);
                    case "dm": return LengthConverter.cmToDm(value);
                    case "m": return LengthConverter.cmToM(value);
                    case "km": return LengthConverter.cmToKm(value);
                }
                break;
            case "dm":
                switch (to.toLowerCase()) {
                    case "mm": return LengthConverter.dmToMm(value);
                    case "cm": return LengthConverter.dmToCm(value);
                    case "m": return LengthConverter.dmToM(value);
                    case "km": return LengthConverter.dmToKm(value);
                }
                break;
            case "m":
                switch (to.toLowerCase()) {
                    case "mm": return LengthConverter.mToMm(value);
                    case "cm": return LengthConverter.mToCm(value);
                    case "dm": return LengthConverter.mToDm(value);
                    case "km": return LengthConverter.mToKm(value);
                }
                break;
            case "km":
                switch (to.toLowerCase()) {
                    case "mm": return LengthConverter.kmToMm(value);
                    case "cm": return LengthConverter.kmToCm(value);
                    case "dm": return LengthConverter.kmToDm(value);
                    case "m": return LengthConverter.kmToM(value);
                }
                break;
        }
        throw new IllegalArgumentException("Invalid conversion units.");
    }
}