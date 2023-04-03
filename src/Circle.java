import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите радиус окружности: ");
        int radius = input.nextInt();
        System.out.print("Введите значения Х и У: ");
        int x = input.nextInt();
        int y = input.nextInt();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (distance < radius) {
            System.out.println("Точка лежит внутри круга");
        } else if (distance == radius) {
            System.out.println("Точка лежит на окружности");
        } else if (distance > radius) {
            System.out.println("Точка лежит вне круга");
        }
    }
}
