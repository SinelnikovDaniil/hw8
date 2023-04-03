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

        int xx2 = 0;
        if (x > x2) {
            xx2 = x - x2;
        } else if (x2 > x) {
            xx2 = x2 - x;
        }

        int yy2 = 0;
        if (y > y2) {
            yy2 = y - y2;
        } else if (y2 > y) {
            yy2 = y2 - y;
        }

        if (xx2 == yy2) {
            System.out.println("Прямоугольник является квадратом");
        } else if (xx2 > yy2) {
            System.out.println("Прямоугольник находится в альбомной ориентации");
        } else if (yy2 > xx2) {
            System.out.println("Прямоугольник находится в книжной ориентации");
        }
    }
}
