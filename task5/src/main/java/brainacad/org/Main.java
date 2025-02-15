package brainacad.org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a weight value:");
        double value = scanner.nextDouble();

        System.out.println("Choose the unit of input (mg, g, kg, cwt, ton):");
        String fromUnit = scanner.next();

        System.out.println("Choose the unit of output (mg, g, kg, cwt, ton):");
        String toUnit = scanner.next();

        double result = convertWeight(value, fromUnit, toUnit);
        System.out.printf("%.3f %s = %.3f %s%n", value, fromUnit, result, toUnit);

        scanner.close();
    }

    private static double convertWeight(double value, String from, String to) {
        switch (from.toLowerCase()) {
            case "mg":
                switch (to.toLowerCase()) {
                    case "g": return WeightConverter.mgToG(value);
                    case "kg": return WeightConverter.mgToKg(value);
                    case "cwt": return WeightConverter.mgToCwt(value);
                    case "ton": return WeightConverter.mgToTon(value);
                }
                break;
            case "g":
                switch (to.toLowerCase()) {
                    case "mg": return WeightConverter.gToMg(value);
                    case "kg": return WeightConverter.gToKg(value);
                    case "cwt": return WeightConverter.gToCwt(value);
                    case "ton": return WeightConverter.gToTon(value);
                }
                break;
            case "kg":
                switch (to.toLowerCase()) {
                    case "mg": return WeightConverter.kgToMg(value);
                    case "g": return WeightConverter.kgToG(value);
                    case "cwt": return WeightConverter.kgToCwt(value);
                    case "ton": return WeightConverter.kgToTon(value);
                }
                break;
            case "cwt":
                switch (to.toLowerCase()) {
                    case "mg": return WeightConverter.cwtToMg(value);
                    case "g": return WeightConverter.cwtToG(value);
                    case "kg": return WeightConverter.cwtToKg(value);
                    case "ton": return WeightConverter.cwtToTon(value);
                }
                break;
            case "ton":
                switch (to.toLowerCase()) {
                    case "mg": return WeightConverter.tonToMg(value);
                    case "g": return WeightConverter.tonToG(value);
                    case "kg": return WeightConverter.tonToKg(value);
                    case "cwt": return WeightConverter.tonToCwt(value);
                }
                break;
        }
        throw new IllegalArgumentException("Invalid conversion units.");
    }
}
