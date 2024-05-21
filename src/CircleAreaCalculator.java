import java.util.Scanner;

public class CircleAreaCalculator {
    // Метод для обчислення площі кола
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть радіус кола:");
        double radius = scanner.nextDouble();

        double area = calculateCircleArea(radius);
        System.out.println("Площа кола: " + area);

        scanner.close();
    }
}
