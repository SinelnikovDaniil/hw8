import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите Х и У координаты первой точки: ");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.print("Введите Х и У координаты второй точки: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int sideX1X2 = 0;
        if (x > x2) {
            sideX1X2 = x - x2;
        } else if (x2 > x) {
            sideX1X2 = x2 - x;
        }

        int sideY1Y2 = 0;
        if (y > y2) {
            sideY1Y2 = y - y2;
        } else if (y2 > y) {
            sideY1Y2 = y2 - y;
        }

        if (sideX1X2 == sideY1Y2) {
            System.out.println("Прямоугольник является квадратом");
        } else if (sideX1X2 > sideY1Y2) {
            System.out.println("Прямоугольник находится в альбомной ориентации");
        } else if (sideY1Y2 > sideX1X2) {
            System.out.println("Прямоугольник находится в книжной ориентации");
        }
    }
}
