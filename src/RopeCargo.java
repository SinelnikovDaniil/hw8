import java.util.Scanner;

public class RopeCargo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = 3;
        int m = 2;
        System.out.print("Введите скорость вращения: ");
        int v = input.nextInt();
        double t = (m * Math.pow(v,2)) / r;
        if (t > 60) {
            System.out.println("Большая скорость. Веревка порвалась");
        } else {
            System.out.println("Веревка не порвалась");
        }
    }
}
