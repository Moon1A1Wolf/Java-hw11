package brainacad.org.geometryarea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Виберіть фігуру для обчислення площі:");
            System.out.println("1. Трикутник");
            System.out.println("2. Прямокутник");
            System.out.println("3. Квадрат");
            System.out.println("4. Ромб");
            System.out.print("Ваш вибір: ");
            int choice = scanner.nextInt();

            Shape shape = null;

            switch (choice) {
                case 1:
                    System.out.print("Введіть основу трикутника: ");
                    double base = scanner.nextDouble();
                    System.out.print("Введіть висоту трикутника: ");
                    double height = scanner.nextDouble();
                    shape = new Triangle(base, height);
                    break;

                case 2:
                    System.out.print("Введіть довжину прямокутника: ");
                    double length = scanner.nextDouble();
                    System.out.print("Введіть ширину прямокутника: ");
                    double width = scanner.nextDouble();
                    shape = new Rectangle(length, width);
                    break;

                case 3:
                    System.out.print("Введіть сторону квадрата: ");
                    double side = scanner.nextDouble();
                    shape = new Square(side);
                    break;

                case 4:
                    System.out.print("Введіть діагональ 1 ромба: ");
                    double diagonal1 = scanner.nextDouble();
                    System.out.print("Введіть діагональ 2 ромба: ");
                    double diagonal2 = scanner.nextDouble();
                    shape = new Rhombus(diagonal1, diagonal2);
                    break;

                default:
                    System.out.println("Невірний вибір.");
                    return;
            }

            System.out.println("Площа фігури: " + shape.calculateArea());

        } finally {
            scanner.close();
        }
    }
}

