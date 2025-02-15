package brainacad.org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        try {
            System.out.println("Конвертація валют:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");
            System.out.println("4. JPY");

            System.out.print("Виберіть валюту для конвертації (1-4): ");
            int fromChoice = scanner.nextInt();
            System.out.print("Виберіть валюту в яку конвертуємо (1-4): ");
            int toChoice = scanner.nextInt();

            Currency from = getCurrencyByChoice(fromChoice);
            Currency to = getCurrencyByChoice(toChoice);

            System.out.print("Введіть суму для конвертації: ");
            double amount = scanner.nextDouble();

            double result = converter.convert(amount, from, to);
            System.out.printf("Результат: %.2f %s\n", result, to);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static Currency getCurrencyByChoice(int choice) {
        return switch (choice) {
            case 1 -> Currency.USD;
            case 2 -> Currency.EUR;
            case 3 -> Currency.GBP;
            case 4 -> Currency.JPY;
            default -> throw new IllegalArgumentException("Невірний вибір валюти.");
        };
    }
}