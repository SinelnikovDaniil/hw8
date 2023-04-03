import java.util.Scanner;

public class RopeCargo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = 3;
        int t = 60;
        System.out.print("Введите значение массы: ");
        double m = input.nextDouble();
        double v = Math.sqrt((t * r) / m);

        if (v < 1) {
            System.out.println("Веревка не будет вращаться");
        } else if (v >= 1 && v < 10) {
            System.out.println("Наибольшая скорость с которой можно вращать веревку = 1");
        } else if (v >= 10 && v < 20) {
            System.out.println("Наибольшая скорость с которой можно вращать веревку = 10");
        } else if (v >= 20 && v < 40) {
            System.out.println("Наибольшая скорость с которой можно вращать веревку = 20");
        } else if (v >= 40) {
            System.out.println("Наибольшая скорость с которой можно вращать веревку = 40");
        }
    }
}
